package o1;

import b3.f1;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s0 {

    public static final class b extends s0 {

        /* renamed from: a, reason: collision with root package name */
        private final List<Integer> f6905a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Integer> f6906b;

        /* renamed from: c, reason: collision with root package name */
        private final l1.l f6907c;

        /* renamed from: d, reason: collision with root package name */
        private final l1.s f6908d;

        public b(List<Integer> list, List<Integer> list2, l1.l lVar, l1.s sVar) {
            super();
            this.f6905a = list;
            this.f6906b = list2;
            this.f6907c = lVar;
            this.f6908d = sVar;
        }

        public l1.l a() {
            return this.f6907c;
        }

        public l1.s b() {
            return this.f6908d;
        }

        public List<Integer> c() {
            return this.f6906b;
        }

        public List<Integer> d() {
            return this.f6905a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f6905a.equals(bVar.f6905a) || !this.f6906b.equals(bVar.f6906b) || !this.f6907c.equals(bVar.f6907c)) {
                return false;
            }
            l1.s sVar = this.f6908d;
            l1.s sVar2 = bVar.f6908d;
            return sVar != null ? sVar.equals(sVar2) : sVar2 == null;
        }

        public int hashCode() {
            int hashCode = ((((this.f6905a.hashCode() * 31) + this.f6906b.hashCode()) * 31) + this.f6907c.hashCode()) * 31;
            l1.s sVar = this.f6908d;
            return hashCode + (sVar != null ? sVar.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f6905a + ", removedTargetIds=" + this.f6906b + ", key=" + this.f6907c + ", newDocument=" + this.f6908d + '}';
        }
    }

    public static final class c extends s0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f6909a;

        /* renamed from: b, reason: collision with root package name */
        private final n f6910b;

        public c(int r22, n nVar) {
            super();
            this.f6909a = r22;
            this.f6910b = nVar;
        }

        public n a() {
            return this.f6910b;
        }

        public int b() {
            return this.f6909a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f6909a + ", existenceFilter=" + this.f6910b + '}';
        }
    }

    public static final class d extends s0 {

        /* renamed from: a, reason: collision with root package name */
        private final e f6911a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Integer> f6912b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.protobuf.j f6913c;

        /* renamed from: d, reason: collision with root package name */
        private final f1 f6914d;

        public d(e eVar, List<Integer> list, com.google.protobuf.j jVar, f1 f1Var) {
            super();
            p1.b.d(f1Var == null || eVar == e.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f6911a = eVar;
            this.f6912b = list;
            this.f6913c = jVar;
            if (f1Var == null || f1Var.o()) {
                this.f6914d = null;
            } else {
                this.f6914d = f1Var;
            }
        }

        public f1 a() {
            return this.f6914d;
        }

        public e b() {
            return this.f6911a;
        }

        public com.google.protobuf.j c() {
            return this.f6913c;
        }

        public List<Integer> d() {
            return this.f6912b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f6911a != dVar.f6911a || !this.f6912b.equals(dVar.f6912b) || !this.f6913c.equals(dVar.f6913c)) {
                return false;
            }
            f1 f1Var = this.f6914d;
            return f1Var != null ? dVar.f6914d != null && f1Var.m().equals(dVar.f6914d.m()) : dVar.f6914d == null;
        }

        public int hashCode() {
            int hashCode = ((((this.f6911a.hashCode() * 31) + this.f6912b.hashCode()) * 31) + this.f6913c.hashCode()) * 31;
            f1 f1Var = this.f6914d;
            return hashCode + (f1Var != null ? f1Var.m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f6911a + ", targetIds=" + this.f6912b + '}';
        }
    }

    public enum e {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private s0() {
    }
}
