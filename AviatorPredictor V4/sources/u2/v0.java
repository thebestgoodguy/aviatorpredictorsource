package u2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r2.a;
import u2.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 {

    class a implements t0.i<Map<String, Object>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f7808a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f7809b;

        a(Map map, a.e eVar) {
            this.f7808a = map;
            this.f7809b = eVar;
        }

        @Override // u2.t0.i
        public void b(Throwable th) {
            Map b5;
            Map map = this.f7808a;
            b5 = t0.b(th);
            map.put("error", b5);
            this.f7809b.a(this.f7808a);
        }

        @Override // u2.t0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Object> map) {
            this.f7808a.put("result", map);
            this.f7809b.a(this.f7808a);
        }
    }

    public static r2.h<Object> b() {
        return t0.c.f7785d;
    }

    public static /* synthetic */ void c(t0.b bVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("resolverIdArg unexpectedly null.");
            }
            t0.h hVar = (t0.h) arrayList.get(1);
            if (hVar == null) {
                throw new NullPointerException("assertionArg unexpectedly null.");
            }
            bVar.h(str, hVar, new a(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = t0.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static void d(r2.b bVar, final t0.b bVar2) {
        new r2.a(bVar, "dev.flutter.pigeon.MultiFactoResolverHostApi.resolveSignIn", b()).e(bVar2 != null ? new a.d() { // from class: u2.u0
            @Override // r2.a.d
            public final void a(Object obj, a.e eVar) {
                v0.c(t0.b.this, obj, eVar);
            }
        } : null);
    }
}
