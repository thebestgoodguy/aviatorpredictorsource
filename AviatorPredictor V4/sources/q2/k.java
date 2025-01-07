package q2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q2.k;
import r2.j;
import r2.q;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final r2.j f7265a;

    /* renamed from: b, reason: collision with root package name */
    private g f7266b;

    /* renamed from: c, reason: collision with root package name */
    private final j.c f7267c;

    class a implements j.c {
        a() {
        }

        private void c(r2.i iVar, j.d dVar) {
            try {
                k.this.f7266b.a(((Integer) iVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        private void d(r2.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            boolean z4 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z4) {
                    k.this.f7266b.i(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), wrap));
                    dVar.a(null);
                } else {
                    dVar.a(Long.valueOf(k.this.f7266b.g(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), wrap))));
                }
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        private void e(r2.i iVar, j.d dVar) {
            try {
                k.this.f7266b.f(((Integer) ((Map) iVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(j.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f7269a));
            hashMap.put("height", Double.valueOf(cVar.f7270b));
            dVar.a(hashMap);
        }

        private void g(r2.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                k.this.f7266b.c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        private void h(r2.i iVar, final j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                k.this.f7266b.h(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: q2.j
                    @Override // q2.k.b
                    public final void a(k.c cVar) {
                        k.a.f(j.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        private void i(r2.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                k.this.f7266b.d(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        private void j(r2.i iVar, j.d dVar) {
            try {
                k.this.f7266b.b(((Boolean) iVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e5) {
                dVar.b("error", k.c(e5), null);
            }
        }

        private void k(r2.i iVar, j.d dVar) {
            j.d dVar2;
            List list = (List) iVar.b();
            try {
                k.this.f7266b.e(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e5) {
                e = e5;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e6) {
                e = e6;
                dVar2.b("error", k.c(e), null);
            }
        }

        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            if (k.this.f7266b == null) {
            }
            e2.b.e("PlatformViewsChannel", "Received '" + iVar.f7455a + "' message.");
            String str = iVar.f7455a;
            str.hashCode();
            switch (str) {
                case "create":
                    d(iVar, dVar);
                    break;
                case "offset":
                    g(iVar, dVar);
                    break;
                case "resize":
                    h(iVar, dVar);
                    break;
                case "clearFocus":
                    c(iVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    j(iVar, dVar);
                    break;
                case "touch":
                    k(iVar, dVar);
                    break;
                case "setDirection":
                    i(iVar, dVar);
                    break;
                case "dispose":
                    e(iVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7269a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7270b;

        public c(int r12, int r22) {
            this.f7269a = r12;
            this.f7270b = r22;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f7271a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7272b;

        /* renamed from: c, reason: collision with root package name */
        public final double f7273c;

        /* renamed from: d, reason: collision with root package name */
        public final double f7274d;

        /* renamed from: e, reason: collision with root package name */
        public final double f7275e;

        /* renamed from: f, reason: collision with root package name */
        public final double f7276f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7277g;

        /* renamed from: h, reason: collision with root package name */
        public final ByteBuffer f7278h;

        public d(int r12, String str, double d5, double d6, double d7, double d8, int r11, ByteBuffer byteBuffer) {
            this.f7271a = r12;
            this.f7272b = str;
            this.f7275e = d5;
            this.f7276f = d6;
            this.f7273c = d7;
            this.f7274d = d8;
            this.f7277g = r11;
            this.f7278h = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f7279a;

        /* renamed from: b, reason: collision with root package name */
        public final double f7280b;

        /* renamed from: c, reason: collision with root package name */
        public final double f7281c;

        public e(int r12, double d5, double d6) {
            this.f7279a = r12;
            this.f7280b = d5;
            this.f7281c = d6;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f7282a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f7283b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f7284c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7285d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7286e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f7287f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f7288g;

        /* renamed from: h, reason: collision with root package name */
        public final int f7289h;

        /* renamed from: i, reason: collision with root package name */
        public final int f7290i;

        /* renamed from: j, reason: collision with root package name */
        public final float f7291j;

        /* renamed from: k, reason: collision with root package name */
        public final float f7292k;

        /* renamed from: l, reason: collision with root package name */
        public final int f7293l;

        /* renamed from: m, reason: collision with root package name */
        public final int f7294m;

        /* renamed from: n, reason: collision with root package name */
        public final int f7295n;

        /* renamed from: o, reason: collision with root package name */
        public final int f7296o;

        /* renamed from: p, reason: collision with root package name */
        public final long f7297p;

        public f(int r4, Number number, Number number2, int r7, int r8, Object obj, Object obj2, int r11, int r12, float f5, float f6, int r15, int r16, int r17, int r18, long j4) {
            this.f7282a = r4;
            this.f7283b = number;
            this.f7284c = number2;
            this.f7285d = r7;
            this.f7286e = r8;
            this.f7287f = obj;
            this.f7288g = obj2;
            this.f7289h = r11;
            this.f7290i = r12;
            this.f7291j = f5;
            this.f7292k = f6;
            this.f7293l = r15;
            this.f7294m = r16;
            this.f7295n = r17;
            this.f7296o = r18;
            this.f7297p = j4;
        }
    }

    public interface g {
        void a(int r12);

        void b(boolean z4);

        void c(int r12, double d5, double d6);

        void d(int r12, int r22);

        void e(f fVar);

        void f(int r12);

        long g(d dVar);

        void h(e eVar, b bVar);

        void i(d dVar);
    }

    public k(f2.a aVar) {
        a aVar2 = new a();
        this.f7267c = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/platform_views", q.f7470b);
        this.f7265a = jVar;
        jVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void d(int r32) {
        r2.j jVar = this.f7265a;
        if (jVar == null) {
            return;
        }
        jVar.c("viewFocused", Integer.valueOf(r32));
    }

    public void e(g gVar) {
        this.f7266b = gVar;
    }
}
