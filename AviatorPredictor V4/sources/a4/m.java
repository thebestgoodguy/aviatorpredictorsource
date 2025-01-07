package a4;

import java.util.Collection;
import java.util.Iterator;
import l3.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m extends l {
    public static final boolean j(String str, String str2, boolean z4) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "suffix");
        return !z4 ? str.endsWith(str2) : m(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z4, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            z4 = false;
        }
        return j(str, str2, z4);
    }

    public static boolean l(CharSequence charSequence) {
        boolean z4;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable t4 = n.t(charSequence);
            if (!(t4 instanceof Collection) || !((Collection) t4).isEmpty()) {
                Iterator it = t4.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((v) it).c()))) {
                        z4 = false;
                        break;
                    }
                }
            }
            z4 = true;
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(String str, int r7, String str2, int r9, int r10, boolean z4) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "other");
        return !z4 ? str.regionMatches(r7, str2, r9, r10) : str.regionMatches(z4, r7, str2, r9, r10);
    }

    public static final boolean n(String str, String str2, boolean z4) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "prefix");
        return !z4 ? str.startsWith(str2) : m(str, 0, str2, 0, str2.length(), z4);
    }

    public static /* synthetic */ boolean o(String str, String str2, boolean z4, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            z4 = false;
        }
        return n(str, str2, z4);
    }
}
