package q0;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class o {
    public static boolean a(String str) {
        return k.c(str);
    }

    public static String b(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int r02 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int r12 = 0; r12 < objArr.length; r12++) {
                objArr[r12] = c(objArr[r12]);
            }
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int r22 = 0;
        while (r02 < objArr.length && (indexOf = valueOf.indexOf("%s", r22)) != -1) {
            sb.append((CharSequence) valueOf, r22, indexOf);
            sb.append(objArr[r02]);
            r22 = indexOf + 2;
            r02++;
        }
        sb.append((CharSequence) valueOf, r22, valueOf.length());
        if (r02 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[r02]);
            for (int r6 = r02 + 1; r6 < objArr.length; r6++) {
                sb.append(", ");
                sb.append(objArr[r6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e5) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e5);
            String name2 = e5.getClass().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }
}
