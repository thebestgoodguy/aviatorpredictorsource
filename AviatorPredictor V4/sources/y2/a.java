package y2;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import r2.i;
import r2.j;
import y2.b;

/* loaded from: classes.dex */
final class a implements j.c {

    /* renamed from: a, reason: collision with root package name */
    private final b f8312a;

    /* renamed from: b, reason: collision with root package name */
    private j f8313b;

    a(b bVar) {
        this.f8312a = bVar;
    }

    private static Bundle b(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    private void c(j.d dVar, String str) {
        dVar.a(Boolean.valueOf(this.f8312a.a(str)));
    }

    private void d(j.d dVar) {
        this.f8312a.b();
        dVar.a(null);
    }

    private void e(i iVar, j.d dVar, String str) {
        b.a c5 = this.f8312a.c(str, b((Map) iVar.a("headers")), ((Boolean) iVar.a("useWebView")).booleanValue(), ((Boolean) iVar.a("enableJavaScript")).booleanValue(), ((Boolean) iVar.a("enableDomStorage")).booleanValue());
        if (c5 == b.a.NO_ACTIVITY) {
            dVar.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        } else if (c5 == b.a.ACTIVITY_NOT_FOUND) {
            dVar.b("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", str), null);
        } else {
            dVar.a(Boolean.TRUE);
        }
    }

    @Override // r2.j.c
    public void a(i iVar, j.d dVar) {
        String str;
        str = (String) iVar.a("url");
        String str2 = iVar.f7455a;
        str2.hashCode();
        switch (str2) {
            case "launch":
                e(iVar, dVar, str);
                break;
            case "canLaunch":
                c(dVar, str);
                break;
            case "closeWebView":
                d(dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    void f(r2.b bVar) {
        if (this.f8313b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            g();
        }
        j jVar = new j(bVar, "plugins.flutter.io/url_launcher_android");
        this.f8313b = jVar;
        jVar.e(this);
    }

    void g() {
        j jVar = this.f8313b;
        if (jVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            jVar.e(null);
            this.f8313b = null;
        }
    }
}
