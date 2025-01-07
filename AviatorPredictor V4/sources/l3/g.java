package l3;

/* loaded from: classes.dex */
public final class g extends q {
    public static /* bridge */ /* synthetic */ Appendable j(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int r5, CharSequence charSequence4, u3.l lVar, int r8, Object obj) {
        Appendable i4;
        i4 = q.i(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : r5, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return i4;
    }
}
