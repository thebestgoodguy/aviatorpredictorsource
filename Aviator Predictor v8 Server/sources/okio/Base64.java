package okio;

import java.io.UnsupportedEncodingException;

/* loaded from: classes60.dex */
final class Base64 {
    private static final byte[] MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private Base64() {
    }

    public static byte[] decode(String in) {
        int outCount;
        int bits;
        int outCount2;
        int limit = in.length();
        while (limit > 0) {
            char c = in.charAt(limit - 1);
            if (c != '=' && c != '\n' && c != '\r' && c != ' ' && c != '\t') {
                break;
            }
            limit--;
        }
        byte[] out = new byte[(int) ((limit * 6) / 8)];
        int inCount = 0;
        int word = 0;
        int pos = 0;
        int outCount3 = 0;
        while (pos < limit) {
            char c2 = in.charAt(pos);
            if (c2 >= 'A' && c2 <= 'Z') {
                bits = c2 - 'A';
            } else if (c2 >= 'a' && c2 <= 'z') {
                bits = c2 - 'G';
            } else if (c2 >= '0' && c2 <= '9') {
                bits = c2 + 4;
            } else if (c2 == '+' || c2 == '-') {
                bits = 62;
            } else if (c2 == '/' || c2 == '_') {
                bits = 63;
            } else {
                if (c2 != '\n' && c2 != '\r' && c2 != ' ') {
                    if (c2 == '\t') {
                        outCount2 = outCount3;
                        pos++;
                        outCount3 = outCount2;
                    } else {
                        return null;
                    }
                }
                outCount2 = outCount3;
                pos++;
                outCount3 = outCount2;
            }
            word = (word << 6) | ((byte) bits);
            inCount++;
            if (inCount % 4 == 0) {
                int outCount4 = outCount3 + 1;
                out[outCount3] = (byte) (word >> 16);
                int outCount5 = outCount4 + 1;
                out[outCount4] = (byte) (word >> 8);
                outCount2 = outCount5 + 1;
                out[outCount5] = (byte) word;
                pos++;
                outCount3 = outCount2;
            }
            outCount2 = outCount3;
            pos++;
            outCount3 = outCount2;
        }
        int lastWordChars = inCount % 4;
        if (lastWordChars == 1) {
            return null;
        }
        if (lastWordChars == 2) {
            outCount = outCount3 + 1;
            out[outCount3] = (byte) ((word << 12) >> 16);
        } else {
            if (lastWordChars == 3) {
                int word2 = word << 6;
                int outCount6 = outCount3 + 1;
                out[outCount3] = (byte) (word2 >> 16);
                outCount3 = outCount6 + 1;
                out[outCount6] = (byte) (word2 >> 8);
            }
            outCount = outCount3;
        }
        if (outCount != out.length) {
            byte[] prefix = new byte[outCount];
            System.arraycopy(out, 0, prefix, 0, outCount);
            return prefix;
        }
        return out;
    }

    public static String encode(byte[] in) {
        return encode(in, MAP);
    }

    public static String encodeUrl(byte[] in) {
        return encode(in, URL_MAP);
    }

    private static String encode(byte[] in, byte[] map) {
        int length = ((in.length + 2) / 3) * 4;
        byte[] out = new byte[length];
        int end = in.length - (in.length % 3);
        int index = 0;
        for (int i = 0; i < end; i += 3) {
            int index2 = index + 1;
            out[index] = map[(in[i] & 255) >> 2];
            int index3 = index2 + 1;
            out[index2] = map[((in[i] & 3) << 4) | ((in[i + 1] & 255) >> 4)];
            int index4 = index3 + 1;
            out[index3] = map[((in[i + 1] & 15) << 2) | ((in[i + 2] & 255) >> 6)];
            index = index4 + 1;
            out[index4] = map[in[i + 2] & 63];
        }
        switch (in.length % 3) {
            case 1:
                int index5 = index + 1;
                out[index] = map[(in[end] & 255) >> 2];
                int index6 = index5 + 1;
                out[index5] = map[(in[end] & 3) << 4];
                int index7 = index6 + 1;
                out[index6] = 61;
                int r4 = index7 + 1;
                out[index7] = 61;
                break;
            case 2:
                int index8 = index + 1;
                out[index] = map[(in[end] & 255) >> 2];
                int index9 = index8 + 1;
                out[index8] = map[((in[end] & 3) << 4) | ((in[end + 1] & 255) >> 4)];
                int index10 = index9 + 1;
                out[index9] = map[(in[end + 1] & 15) << 2];
                index = index10 + 1;
                out[index10] = 61;
        }
        try {
            return new String(out, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
