package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b f484a;

    /* renamed from: b, reason: collision with root package name */
    private final e f485b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f486a;

        static {
            int[] r02 = new int[d.a.values().length];
            f486a = r02;
            try {
                r02[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f486a[d.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f486a[d.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f486a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f486a[d.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f486a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f486a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f484a = bVar;
        this.f485b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) {
        switch (a.f486a[aVar.ordinal()]) {
            case 1:
                this.f484a.c(gVar);
                break;
            case 2:
                this.f484a.g(gVar);
                break;
            case 3:
                this.f484a.a(gVar);
                break;
            case 4:
                this.f484a.e(gVar);
                break;
            case 5:
                this.f484a.f(gVar);
                break;
            case 6:
                this.f484a.b(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f485b;
        if (eVar != null) {
            eVar.d(gVar, aVar);
        }
    }
}
