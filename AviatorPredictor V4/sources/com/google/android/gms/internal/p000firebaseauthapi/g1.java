package com.google.android.gms.internal.p000firebaseauthapi;

import x1.x;

/* loaded from: classes.dex */
final class g1 {
    static String a(hr hrVar) {
        String str;
        StringBuilder sb = new StringBuilder(hrVar.q());
        for (int r12 = 0; r12 < hrVar.q(); r12++) {
            int i4 = hrVar.i(r12);
            if (i4 == 34) {
                str = "\\\"";
            } else if (i4 == 39) {
                str = "\\'";
            } else if (i4 != 92) {
                switch (i4) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        str = "\\t";
                        break;
                    case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
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
                        if (i4 < 32 || i4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((i4 >>> 6) & 3) + 48));
                            sb.append((char) (((i4 >>> 3) & 7) + 48));
                            i4 = (i4 & 7) + 48;
                        }
                        sb.append((char) i4);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
