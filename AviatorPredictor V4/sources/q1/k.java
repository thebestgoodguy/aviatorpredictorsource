package q1;

/* loaded from: classes.dex */
public interface k {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: e, reason: collision with root package name */
        private final int f7186e;

        a(int r32) {
            this.f7186e = r32;
        }

        public int d() {
            return this.f7186e;
        }
    }

    a b(String str);
}
