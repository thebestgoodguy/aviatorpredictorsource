package a1;

import com.google.android.gms.internal.p000firebaseauthapi.np;

/* loaded from: classes.dex */
public final class d1 implements com.google.firebase.auth.d {

    /* renamed from: a, reason: collision with root package name */
    private final int f30a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.auth.b f33d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public d1(np npVar) {
        char c5;
        this.f31b = npVar.p0() ? npVar.l0() : npVar.k0();
        this.f32c = npVar.k0();
        com.google.firebase.auth.b bVar = null;
        if (!npVar.q0()) {
            this.f30a = 3;
            this.f33d = null;
            return;
        }
        String m02 = npVar.m0();
        switch (m02.hashCode()) {
            case -1874510116:
                if (m02.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -1452371317:
                if (m02.equals("PASSWORD_RESET")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1341836234:
                if (m02.equals("VERIFY_EMAIL")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1099157829:
                if (m02.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 870738373:
                if (m02.equals("EMAIL_SIGNIN")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 970484929:
                if (m02.equals("RECOVER_EMAIL")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        int r4 = c5 != 0 ? c5 != 1 ? c5 != 2 ? c5 != 3 ? c5 != 4 ? c5 != 5 ? 3 : 6 : 2 : 5 : 4 : 1 : 0;
        this.f30a = r4;
        if (r4 == 4 || r4 == 3) {
            this.f33d = null;
            return;
        }
        if (npVar.o0()) {
            bVar = new c1(npVar.k0(), e0.a(npVar.j0()));
        } else if (npVar.p0()) {
            bVar = new a1(npVar.l0(), npVar.k0());
        } else if (npVar.n0()) {
            bVar = new b1(npVar.k0());
        }
        this.f33d = bVar;
    }

    @Override // com.google.firebase.auth.d
    public final int a() {
        return this.f30a;
    }

    @Override // com.google.firebase.auth.d
    public final com.google.firebase.auth.b b() {
        return this.f33d;
    }
}
