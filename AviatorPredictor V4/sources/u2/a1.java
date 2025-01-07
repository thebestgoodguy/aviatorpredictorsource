package u2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r2.a;
import u2.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 {

    class a implements t0.i<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f7661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f7662b;

        a(Map map, a.e eVar) {
            this.f7661a = map;
            this.f7662b = eVar;
        }

        @Override // u2.t0.i
        public void b(Throwable th) {
            Map b5;
            Map map = this.f7661a;
            b5 = t0.b(th);
            map.put("error", b5);
            this.f7662b.a(this.f7661a);
        }

        @Override // u2.t0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f7661a.put("result", null);
            this.f7662b.a(this.f7661a);
        }
    }

    class b implements t0.i<t0.g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f7663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f7664b;

        b(Map map, a.e eVar) {
            this.f7663a = map;
            this.f7664b = eVar;
        }

        @Override // u2.t0.i
        public void b(Throwable th) {
            Map b5;
            Map map = this.f7663a;
            b5 = t0.b(th);
            map.put("error", b5);
            this.f7664b.a(this.f7663a);
        }

        @Override // u2.t0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(t0.g gVar) {
            this.f7663a.put("result", gVar);
            this.f7664b.a(this.f7663a);
        }
    }

    class c implements t0.i<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f7665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f7666b;

        c(Map map, a.e eVar) {
            this.f7665a = map;
            this.f7666b = eVar;
        }

        @Override // u2.t0.i
        public void b(Throwable th) {
            Map b5;
            Map map = this.f7665a;
            b5 = t0.b(th);
            map.put("error", b5);
            this.f7666b.a(this.f7665a);
        }

        @Override // u2.t0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f7665a.put("result", null);
            this.f7666b.a(this.f7665a);
        }
    }

    class d implements t0.i<List<t0.f>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f7667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f7668b;

        d(Map map, a.e eVar) {
            this.f7667a = map;
            this.f7668b = eVar;
        }

        @Override // u2.t0.i
        public void b(Throwable th) {
            Map b5;
            Map map = this.f7667a;
            b5 = t0.b(th);
            map.put("error", b5);
            this.f7668b.a(this.f7667a);
        }

        @Override // u2.t0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List<t0.f> list) {
            this.f7667a.put("result", list);
            this.f7668b.a(this.f7667a);
        }
    }

    public static r2.h<Object> e() {
        return t0.e.f7786d;
    }

    public static /* synthetic */ void f(t0.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            t0.h hVar = (t0.h) arrayList.get(1);
            if (hVar == null) {
                throw new NullPointerException("assertionArg unexpectedly null.");
            }
            dVar.j(str, hVar, (String) arrayList.get(2), new a(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = t0.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void g(t0.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            dVar.b(str, new b(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = t0.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void h(t0.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            dVar.l(str, (String) arrayList.get(1), new c(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = t0.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void i(t0.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            dVar.e(str, new d(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = t0.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static void j(r2.b bVar, final t0.d dVar) {
        r2.a aVar = new r2.a(bVar, "dev.flutter.pigeon.MultiFactorUserHostApi.enrollPhone", e());
        if (dVar != null) {
            aVar.e(new a.d() { // from class: u2.z0
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    a1.f(t0.d.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r2.a aVar2 = new r2.a(bVar, "dev.flutter.pigeon.MultiFactorUserHostApi.getSession", e());
        if (dVar != null) {
            aVar2.e(new a.d() { // from class: u2.x0
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    a1.g(t0.d.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r2.a aVar3 = new r2.a(bVar, "dev.flutter.pigeon.MultiFactorUserHostApi.unenroll", e());
        if (dVar != null) {
            aVar3.e(new a.d() { // from class: u2.y0
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    a1.h(t0.d.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
        r2.a aVar4 = new r2.a(bVar, "dev.flutter.pigeon.MultiFactorUserHostApi.getEnrolledFactors", e());
        if (dVar != null) {
            aVar4.e(new a.d() { // from class: u2.w0
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    a1.i(t0.d.this, obj, eVar);
                }
            });
        } else {
            aVar4.e(null);
        }
    }
}
