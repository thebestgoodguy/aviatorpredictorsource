package q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r2.j;
import r2.q;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final r2.j f7193a;

    /* renamed from: b, reason: collision with root package name */
    private g2.a f7194b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<j.d>> f7195c;

    /* renamed from: d, reason: collision with root package name */
    final j.c f7196d;

    class a implements j.c {
        a() {
        }

        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            int intValue;
            String str;
            String str2;
            if (b.this.f7194b == null) {
                return;
            }
            String str3 = iVar.f7455a;
            Map map = (Map) iVar.b();
            e2.b.e("DeferredComponentChannel", "Received '" + str3 + "' message.");
            intValue = ((Integer) map.get("loadingUnitId")).intValue();
            str = (String) map.get("componentName");
            str3.hashCode();
            switch (str3) {
                case "uninstallDeferredComponent":
                    b.this.f7194b.e(intValue, str);
                    str2 = null;
                    break;
                case "getDeferredComponentInstallState":
                    str2 = b.this.f7194b.b(intValue, str);
                    break;
                case "installDeferredComponent":
                    b.this.f7194b.d(intValue, str);
                    if (!b.this.f7195c.containsKey(str)) {
                        b.this.f7195c.put(str, new ArrayList());
                    }
                    ((List) b.this.f7195c.get(str)).add(dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(str2);
        }
    }

    public b(f2.a aVar) {
        a aVar2 = new a();
        this.f7196d = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/deferredcomponent", q.f7470b);
        this.f7193a = jVar;
        jVar.e(aVar2);
        this.f7194b = e2.a.e().a();
        this.f7195c = new HashMap();
    }

    public void c(g2.a aVar) {
        this.f7194b = aVar;
    }
}
