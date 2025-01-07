package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d2 {
    public static String a(String str) {
        if (lp.c(str)) {
            return null;
        }
        return str;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int r02 = 0;
        int r12 = 0;
        while (true) {
            length = objArr.length;
            if (r12 >= length) {
                break;
            }
            Object obj = objArr[r12];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e5) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e5);
                    str2 = "<" + str3 + " threw " + e5.getClass().getName() + ">";
                }
            }
            objArr[r12] = str2;
            r12++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int r22 = 0;
        while (true) {
            length2 = objArr.length;
            if (r02 >= length2 || (indexOf = str.indexOf("%s", r22)) == -1) {
                break;
            }
            sb.append((CharSequence) str, r22, indexOf);
            sb.append(objArr[r02]);
            r22 = indexOf + 2;
            r02++;
        }
        sb.append((CharSequence) str, r22, str.length());
        if (r02 < length2) {
            sb.append(" [");
            sb.append(objArr[r02]);
            for (int r11 = r02 + 1; r11 < objArr.length; r11++) {
                sb.append(", ");
                sb.append(objArr[r11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String c(String str) {
        return lp.b(str);
    }

    public static boolean d(String str) {
        return lp.c(str);
    }
}
