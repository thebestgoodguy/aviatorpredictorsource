package okhttp3.internal.http2;

import android.net.http.Headers;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes59.dex */
final class Hpack {
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final Header[] STATIC_HEADER_TABLE = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, HttpGet.METHOD_NAME), new Header(Header.TARGET_METHOD, HttpPost.METHOD_NAME), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, HttpHost.DEFAULT_SCHEME_NAME), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header(Headers.ACCEPT_RANGES, ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header(Headers.CACHE_CONTROL, ""), new Header(Headers.CONTENT_DISPOSITION, ""), new Header(Headers.CONTENT_ENCODING, ""), new Header("content-language", ""), new Header(Headers.CONTENT_LEN, ""), new Header("content-location", ""), new Header("content-range", ""), new Header(Headers.CONTENT_TYPE, ""), new Header("cookie", ""), new Header("date", ""), new Header(Headers.ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header(TypedValues.Transition.S_FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header(Headers.LAST_MODIFIED, ""), new Header("link", ""), new Header(Headers.LOCATION, ""), new Header("max-forwards", ""), new Header(Headers.PROXY_AUTHENTICATE, ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header(Headers.REFRESH, ""), new Header("retry-after", ""), new Header("server", ""), new Header(Headers.SET_COOKIE, ""), new Header("strict-transport-security", ""), new Header(Headers.TRANSFER_ENCODING, ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header(Headers.WWW_AUTHENTICATE, "")};
    static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX = nameToFirstIndex();

    private Hpack() {
    }

    static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final BufferedSource source;

        Reader(int headerTableSizeSetting, Source source) {
            this(headerTableSizeSetting, headerTableSizeSetting, source);
        }

        Reader(int headerTableSizeSetting, int maxDynamicTableByteCount, Source source) {
            this.headerList = new ArrayList();
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = headerTableSizeSetting;
            this.maxDynamicTableByteCount = maxDynamicTableByteCount;
            this.source = Okio.buffer(source);
        }

        int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private void adjustDynamicTableByteCount() {
            if (this.maxDynamicTableByteCount < this.dynamicTableByteCount) {
                if (this.maxDynamicTableByteCount == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(this.dynamicTableByteCount - this.maxDynamicTableByteCount);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                for (int j = this.dynamicTable.length - 1; j >= this.nextHeaderIndex && bytesToRecover > 0; j--) {
                    bytesToRecover -= this.dynamicTable[j].hpackSize;
                    this.dynamicTableByteCount -= this.dynamicTable[j].hpackSize;
                    this.headerCount--;
                    entriesToEvict++;
                }
                System.arraycopy(this.dynamicTable, this.nextHeaderIndex + 1, this.dynamicTable, this.nextHeaderIndex + 1 + entriesToEvict, this.headerCount);
                this.nextHeaderIndex += entriesToEvict;
            }
            return entriesToEvict;
        }

        void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int b = this.source.readByte() & 255;
                if (b == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & 128) == 128) {
                    int index = readInt(b, Hpack.PREFIX_7_BITS);
                    readIndexedHeader(index - 1);
                } else if (b == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((b & 64) == 64) {
                    int index2 = readInt(b, 63);
                    readLiteralHeaderWithIncrementalIndexingIndexedName(index2 - 1);
                } else if ((b & 32) == 32) {
                    this.maxDynamicTableByteCount = readInt(b, 31);
                    if (this.maxDynamicTableByteCount < 0 || this.maxDynamicTableByteCount > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (b == 16 || b == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    int index3 = readInt(b, 15);
                    readLiteralHeaderWithoutIndexingIndexedName(index3 - 1);
                }
            }
        }

        public List<Header> getAndResetHeaderList() {
            List<Header> result = new ArrayList<>(this.headerList);
            this.headerList.clear();
            return result;
        }

        private void readIndexedHeader(int index) throws IOException {
            if (isStaticHeader(index)) {
                Header staticEntry = Hpack.STATIC_HEADER_TABLE[index];
                this.headerList.add(staticEntry);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(index - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex < 0 || dynamicTableIndex > this.dynamicTable.length - 1) {
                throw new IOException("Header index too large " + (index + 1));
            }
            this.headerList.add(this.dynamicTable[dynamicTableIndex]);
        }

        private int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int index) throws IOException {
            ByteString name = getName(index);
            ByteString value = readByteString();
            this.headerList.add(new Header(name, value));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            ByteString name = Hpack.checkLowercase(readByteString());
            ByteString value = readByteString();
            this.headerList.add(new Header(name, value));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws IOException {
            ByteString name = getName(nameIndex);
            ByteString value = readByteString();
            insertIntoDynamicTable(-1, new Header(name, value));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            ByteString name = Hpack.checkLowercase(readByteString());
            ByteString value = readByteString();
            insertIntoDynamicTable(-1, new Header(name, value));
        }

        private ByteString getName(int index) {
            return isStaticHeader(index) ? Hpack.STATIC_HEADER_TABLE[index].name : this.dynamicTable[dynamicTableIndex(index - Hpack.STATIC_HEADER_TABLE.length)].name;
        }

        private boolean isStaticHeader(int index) {
            return index >= 0 && index <= Hpack.STATIC_HEADER_TABLE.length + (-1);
        }

        private void insertIntoDynamicTable(int index, Header entry) {
            this.headerList.add(entry);
            int delta = entry.hpackSize;
            if (index != -1) {
                delta -= this.dynamicTable[dynamicTableIndex(index)].hpackSize;
            }
            if (delta > this.maxDynamicTableByteCount) {
                clearDynamicTable();
                return;
            }
            int bytesToRecover = (this.dynamicTableByteCount + delta) - this.maxDynamicTableByteCount;
            int entriesEvicted = evictToRecoverBytes(bytesToRecover);
            if (index == -1) {
                if (this.headerCount + 1 > this.dynamicTable.length) {
                    Header[] doubled = new Header[this.dynamicTable.length * 2];
                    System.arraycopy(this.dynamicTable, 0, doubled, this.dynamicTable.length, this.dynamicTable.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = doubled;
                }
                int index2 = this.nextHeaderIndex;
                this.nextHeaderIndex = index2 - 1;
                this.dynamicTable[index2] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + dynamicTableIndex(index) + entriesEvicted] = entry;
            }
            this.dynamicTableByteCount += delta;
        }

        private int readByte() throws IOException {
            return this.source.readByte() & 255;
        }

        int readInt(int firstByte, int prefixMask) throws IOException {
            int prefix = firstByte & prefixMask;
            if (prefix >= prefixMask) {
                int result = prefixMask;
                int shift = 0;
                while (true) {
                    int b = readByte();
                    if ((b & 128) != 0) {
                        result += (b & Hpack.PREFIX_7_BITS) << shift;
                        shift += 7;
                    } else {
                        return result + (b << shift);
                    }
                }
            } else {
                return prefix;
            }
        }

        ByteString readByteString() throws IOException {
            int firstByte = readByte();
            boolean huffmanDecode = (firstByte & 128) == 128;
            int length = readInt(firstByte, Hpack.PREFIX_7_BITS);
            if (huffmanDecode) {
                return ByteString.of(Huffman.get().decode(this.source.readByteArray(length)));
            }
            return this.source.readByteString(length);
        }
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        Map<ByteString, Integer> result = new LinkedHashMap<>(STATIC_HEADER_TABLE.length);
        for (int i = 0; i < STATIC_HEADER_TABLE.length; i++) {
            if (!result.containsKey(STATIC_HEADER_TABLE[i].name)) {
                result.put(STATIC_HEADER_TABLE[i].name, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(result);
    }

    static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        Writer(Buffer out) {
            this(4096, true, out);
        }

        Writer(int headerTableSizeSetting, boolean useCompression, Buffer out) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = headerTableSizeSetting;
            this.maxDynamicTableByteCount = headerTableSizeSetting;
            this.useCompression = useCompression;
            this.out = out;
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                for (int j = this.dynamicTable.length - 1; j >= this.nextHeaderIndex && bytesToRecover > 0; j--) {
                    bytesToRecover -= this.dynamicTable[j].hpackSize;
                    this.dynamicTableByteCount -= this.dynamicTable[j].hpackSize;
                    this.headerCount--;
                    entriesToEvict++;
                }
                System.arraycopy(this.dynamicTable, this.nextHeaderIndex + 1, this.dynamicTable, this.nextHeaderIndex + 1 + entriesToEvict, this.headerCount);
                Arrays.fill(this.dynamicTable, this.nextHeaderIndex + 1, this.nextHeaderIndex + 1 + entriesToEvict, (Object) null);
                this.nextHeaderIndex += entriesToEvict;
            }
            return entriesToEvict;
        }

        private void insertIntoDynamicTable(Header entry) {
            int delta = entry.hpackSize;
            if (delta > this.maxDynamicTableByteCount) {
                clearDynamicTable();
                return;
            }
            int bytesToRecover = (this.dynamicTableByteCount + delta) - this.maxDynamicTableByteCount;
            evictToRecoverBytes(bytesToRecover);
            if (this.headerCount + 1 > this.dynamicTable.length) {
                Header[] doubled = new Header[this.dynamicTable.length * 2];
                System.arraycopy(this.dynamicTable, 0, doubled, this.dynamicTable.length, this.dynamicTable.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = doubled;
            }
            int index = this.nextHeaderIndex;
            this.nextHeaderIndex = index - 1;
            this.dynamicTable[index] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += delta;
        }

        void writeHeaders(List<Header> headerBlock) throws IOException {
            if (this.emitDynamicTableSizeUpdate) {
                if (this.smallestHeaderTableSizeSetting < this.maxDynamicTableByteCount) {
                    writeInt(this.smallestHeaderTableSizeSetting, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i = 0; i < size; i++) {
                Header header = headerBlock.get(i);
                ByteString name = header.name.toAsciiLowercase();
                ByteString value = header.value;
                int headerIndex = -1;
                int headerNameIndex = -1;
                Integer staticIndex = Hpack.NAME_TO_FIRST_INDEX.get(name);
                if (staticIndex != null && (headerNameIndex = staticIndex.intValue() + 1) > 1 && headerNameIndex < 8) {
                    if (Util.equal(Hpack.STATIC_HEADER_TABLE[headerNameIndex - 1].value, value)) {
                        headerIndex = headerNameIndex;
                    } else if (Util.equal(Hpack.STATIC_HEADER_TABLE[headerNameIndex].value, value)) {
                        headerIndex = headerNameIndex + 1;
                    }
                }
                if (headerIndex == -1) {
                    int j = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (j >= length) {
                            break;
                        }
                        if (Util.equal(this.dynamicTable[j].name, name)) {
                            if (Util.equal(this.dynamicTable[j].value, value)) {
                                headerIndex = (j - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                                break;
                            } else if (headerNameIndex == -1) {
                                headerNameIndex = (j - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                        j++;
                    }
                }
                if (headerIndex != -1) {
                    writeInt(headerIndex, Hpack.PREFIX_7_BITS, 128);
                } else if (headerNameIndex == -1) {
                    this.out.writeByte(64);
                    writeByteString(name);
                    writeByteString(value);
                    insertIntoDynamicTable(header);
                } else if (name.startsWith(Header.PSEUDO_PREFIX) && !Header.TARGET_AUTHORITY.equals(name)) {
                    writeInt(headerNameIndex, 15, 0);
                    writeByteString(value);
                } else {
                    writeInt(headerNameIndex, 63, 64);
                    writeByteString(value);
                    insertIntoDynamicTable(header);
                }
            }
        }

        void writeInt(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(bits | value);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int value2 = value - prefixMask;
            while (value2 >= 128) {
                int b = value2 & Hpack.PREFIX_7_BITS;
                this.out.writeByte(b | 128);
                value2 >>>= 7;
            }
            this.out.writeByte(value2);
        }

        void writeByteString(ByteString data) throws IOException {
            if (this.useCompression && Huffman.get().encodedLength(data) < data.size()) {
                Buffer huffmanBuffer = new Buffer();
                Huffman.get().encode(data, huffmanBuffer);
                ByteString huffmanBytes = huffmanBuffer.readByteString();
                writeInt(huffmanBytes.size(), Hpack.PREFIX_7_BITS, 128);
                this.out.write(huffmanBytes);
                return;
            }
            writeInt(data.size(), Hpack.PREFIX_7_BITS, 0);
            this.out.write(data);
        }

        void setHeaderTableSizeSetting(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int effectiveHeaderTableSize = Math.min(headerTableSizeSetting, 16384);
            if (this.maxDynamicTableByteCount != effectiveHeaderTableSize) {
                if (effectiveHeaderTableSize < this.maxDynamicTableByteCount) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, effectiveHeaderTableSize);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = effectiveHeaderTableSize;
                adjustDynamicTableByteCount();
            }
        }

        private void adjustDynamicTableByteCount() {
            if (this.maxDynamicTableByteCount < this.dynamicTableByteCount) {
                if (this.maxDynamicTableByteCount == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(this.dynamicTableByteCount - this.maxDynamicTableByteCount);
                }
            }
        }
    }

    static ByteString checkLowercase(ByteString name) throws IOException {
        int length = name.size();
        for (int i = 0; i < length; i++) {
            byte c = name.getByte(i);
            if (c >= 65 && c <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }
}
