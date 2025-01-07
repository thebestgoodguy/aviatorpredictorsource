package okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes60.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    final ByteString[] byteStrings;
    final int[] trie;

    private Options(ByteString[] byteStrings, int[] trie) {
        this.byteStrings = byteStrings;
        this.trie = trie;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okio.Options of(okio.ByteString... r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Options.of(okio.ByteString[]):okio.Options");
    }

    private static void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
        int rangeEnd;
        if (fromIndex >= toIndex) {
            throw new AssertionError();
        }
        for (int i = fromIndex; i < toIndex; i++) {
            if (byteStrings.get(i).size() < byteStringOffset) {
                throw new AssertionError();
            }
        }
        ByteString from = byteStrings.get(fromIndex);
        ByteString to = byteStrings.get(toIndex - 1);
        int prefixIndex = -1;
        if (byteStringOffset == from.size()) {
            prefixIndex = indexes.get(fromIndex).intValue();
            fromIndex++;
            from = byteStrings.get(fromIndex);
        }
        if (from.getByte(byteStringOffset) != to.getByte(byteStringOffset)) {
            int selectChoiceCount = 1;
            for (int i2 = fromIndex + 1; i2 < toIndex; i2++) {
                if (byteStrings.get(i2 - 1).getByte(byteStringOffset) != byteStrings.get(i2).getByte(byteStringOffset)) {
                    selectChoiceCount++;
                }
            }
            long childNodesOffset = intCount(node) + nodeOffset + 2 + (selectChoiceCount * 2);
            node.writeInt(selectChoiceCount);
            node.writeInt(prefixIndex);
            for (int i3 = fromIndex; i3 < toIndex; i3++) {
                byte rangeByte = byteStrings.get(i3).getByte(byteStringOffset);
                if (i3 == fromIndex || rangeByte != byteStrings.get(i3 - 1).getByte(byteStringOffset)) {
                    node.writeInt(rangeByte & 255);
                }
            }
            Buffer childNodes = new Buffer();
            for (int rangeStart = fromIndex; rangeStart < toIndex; rangeStart = rangeEnd) {
                byte rangeByte2 = byteStrings.get(rangeStart).getByte(byteStringOffset);
                rangeEnd = toIndex;
                int i4 = rangeStart + 1;
                while (true) {
                    if (i4 >= toIndex) {
                        break;
                    }
                    if (rangeByte2 == byteStrings.get(i4).getByte(byteStringOffset)) {
                        i4++;
                    } else {
                        rangeEnd = i4;
                        break;
                    }
                }
                if (rangeStart + 1 == rangeEnd && byteStringOffset + 1 == byteStrings.get(rangeStart).size()) {
                    node.writeInt(indexes.get(rangeStart).intValue());
                } else {
                    node.writeInt((int) ((-1) * (intCount(childNodes) + childNodesOffset)));
                    buildTrieRecursive(childNodesOffset, childNodes, byteStringOffset + 1, byteStrings, rangeStart, rangeEnd, indexes);
                }
            }
            node.write(childNodes, childNodes.size());
            return;
        }
        int scanByteCount = 0;
        int max = Math.min(from.size(), to.size());
        for (int i5 = byteStringOffset; i5 < max && from.getByte(i5) == to.getByte(i5); i5++) {
            scanByteCount++;
        }
        long childNodesOffset2 = intCount(node) + nodeOffset + 2 + scanByteCount + 1;
        node.writeInt(-scanByteCount);
        node.writeInt(prefixIndex);
        for (int i6 = byteStringOffset; i6 < byteStringOffset + scanByteCount; i6++) {
            node.writeInt(from.getByte(i6) & 255);
        }
        if (fromIndex + 1 == toIndex) {
            if (byteStringOffset + scanByteCount != byteStrings.get(fromIndex).size()) {
                throw new AssertionError();
            }
            node.writeInt(indexes.get(fromIndex).intValue());
        } else {
            Buffer childNodes2 = new Buffer();
            node.writeInt((int) ((-1) * (intCount(childNodes2) + childNodesOffset2)));
            buildTrieRecursive(childNodesOffset2, childNodes2, byteStringOffset + scanByteCount, byteStrings, fromIndex, toIndex, indexes);
            node.write(childNodes2, childNodes2.size());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString get(int i) {
        return this.byteStrings[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.byteStrings.length;
    }

    private static int intCount(Buffer trieBytes) {
        return (int) (trieBytes.size() / 4);
    }
}
