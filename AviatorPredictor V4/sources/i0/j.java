package i0;

import com.google.android.gms.common.api.Status;
import k0.d;

/* loaded from: classes.dex */
public class j implements k0.d {

    static class a implements d.b {

        /* renamed from: e, reason: collision with root package name */
        private final Status f4025e;

        /* renamed from: f, reason: collision with root package name */
        private final k0.f f4026f;

        public a(Status status, k0.f fVar) {
            this.f4025e = status;
            this.f4026f = fVar;
        }

        @Override // t.k
        public final Status i0() {
            return this.f4025e;
        }

        @Override // k0.d.b
        public final String v() {
            k0.f fVar = this.f4026f;
            if (fVar == null) {
                return null;
            }
            return fVar.v();
        }
    }

    static abstract class b extends e<d.b> {

        /* renamed from: s, reason: collision with root package name */
        protected f f4027s;

        public b(t.f fVar) {
            super(fVar);
            this.f4027s = new l(this);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        protected /* synthetic */ t.k c(Status status) {
            return new a(status, null);
        }
    }

    public static t.g<d.b> a(t.f fVar, byte[] bArr, String str) {
        return fVar.a(new k(fVar, bArr, str));
    }
}
