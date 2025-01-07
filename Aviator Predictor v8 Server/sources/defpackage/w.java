package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
public final class w {
    public static String a(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int r0 = 0;
        int r1 = 0;
        while (true) {
            length = objArr.length;
            if (r1 >= length) {
                break;
            }
            Object obj = objArr[r1];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[r1] = str2;
            r1++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int r2 = 0;
        while (true) {
            length2 = objArr.length;
            if (r0 >= length2 || (indexOf = str.indexOf("%s", r2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, r2, indexOf);
            sb.append(objArr[r0]);
            r2 = indexOf + 2;
            r0++;
        }
        sb.append((CharSequence) str, r2, str.length());
        if (r0 < length2) {
            sb.append(" [");
            sb.append(objArr[r0]);
            for (int r11 = r0 + 1; r11 < objArr.length; r11++) {
                sb.append(", ");
                sb.append(objArr[r11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
