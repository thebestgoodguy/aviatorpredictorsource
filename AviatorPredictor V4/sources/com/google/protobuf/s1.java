package com.google.protobuf;

/* loaded from: classes.dex */
final class s1 {

    static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f3077a;

        a(j jVar) {
            this.f3077a = jVar;
        }

        @Override // com.google.protobuf.s1.b
        public byte a(int r22) {
            return this.f3077a.r(r22);
        }

        @Override // com.google.protobuf.s1.b
        public int size() {
            return this.f3077a.size();
        }
    }

    private interface b {
        byte a(int r12);

        int size();
    }

    static String a(j jVar) {
        return b(new a(jVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int r12 = 0; r12 < bVar.size(); r12++) {
            int a5 = bVar.a(r12);
            if (a5 == 34) {
                str = "\\\"";
            } else if (a5 == 39) {
                str = "\\'";
            } else if (a5 != 92) {
                switch (a5) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        str = "\\t";
                        break;
                    case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a5 < 32 || a5 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a5 >>> 6) & 3) + 48));
                            sb.append((char) (((a5 >>> 3) & 7) + 48));
                            a5 = (a5 & 7) + 48;
                        }
                        sb.append((char) a5);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(j.y(str));
    }
}
