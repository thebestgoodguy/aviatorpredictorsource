package a4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t4, u3.l<? super T, ? extends CharSequence> lVar) {
        CharSequence valueOf;
        kotlin.jvm.internal.i.d(appendable, "<this>");
        if (lVar != null) {
            t4 = (T) lVar.invoke(t4);
        } else {
            if (!(t4 == 0 ? true : t4 instanceof CharSequence)) {
                if (t4 instanceof Character) {
                    appendable.append(((Character) t4).charValue());
                    return;
                } else {
                    valueOf = String.valueOf((Object) t4);
                    appendable.append(valueOf);
                }
            }
        }
        valueOf = (CharSequence) t4;
        appendable.append(valueOf);
    }
}
