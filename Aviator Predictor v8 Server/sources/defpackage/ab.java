package defpackage;

/* loaded from: classes61.dex */
final class ab extends x {
    private final ad a;

    ab(ad adVar, int r3) {
        super(adVar.size(), r3);
        this.a = adVar;
    }

    @Override // defpackage.x
    protected final Object a(int r2) {
        return this.a.get(r2);
    }
}
