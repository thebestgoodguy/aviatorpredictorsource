package q2;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
import r2.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a<Object> f7188a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f7189b;

    /* renamed from: c, reason: collision with root package name */
    private b f7190c;

    /* renamed from: d, reason: collision with root package name */
    final a.d<Object> f7191d;

    /* renamed from: q2.a$a, reason: collision with other inner class name */
    class C0077a implements a.d<Object> {
        C0077a() {
        }

        @Override // r2.a.d
        public void a(Object obj, a.e<Object> eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (a.this.f7190c == null) {
                eVar.a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            e2.b.e("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f7190c.c(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f7190c.e(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f7190c.f(num.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f7190c.d(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void c(String str);

        void d(int r12);

        void e(String str);

        void f(int r12);
    }

    public a(f2.a aVar, FlutterJNI flutterJNI) {
        C0077a c0077a = new C0077a();
        this.f7191d = c0077a;
        r2.a<Object> aVar2 = new r2.a<>(aVar, "flutter/accessibility", r2.p.f7467a);
        this.f7188a = aVar2;
        aVar2.e(c0077a);
        this.f7189b = flutterJNI;
    }

    public void b(int r22, c.g gVar) {
        this.f7189b.dispatchSemanticsAction(r22, gVar);
    }

    public void c(int r22, c.g gVar, Object obj) {
        this.f7189b.dispatchSemanticsAction(r22, gVar, obj);
    }

    public void d() {
        this.f7189b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f7189b.setSemanticsEnabled(true);
    }

    public void f(int r22) {
        this.f7189b.setAccessibilityFeatures(r22);
    }

    public void g(b bVar) {
        this.f7190c = bVar;
        this.f7189b.setAccessibilityDelegate(bVar);
    }
}
