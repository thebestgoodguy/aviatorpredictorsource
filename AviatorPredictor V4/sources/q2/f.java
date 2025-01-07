package q2;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import r2.j;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final r2.j f7203a;

    /* renamed from: b, reason: collision with root package name */
    private b f7204b;

    /* renamed from: c, reason: collision with root package name */
    public final j.c f7205c;

    class a implements j.c {
        a() {
        }

        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            if (f.this.f7204b == null) {
                return;
            }
            String str = iVar.f7455a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) iVar.b();
            try {
                dVar.a(f.this.f7204b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e5) {
                dVar.b("error", e5.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public f(f2.a aVar) {
        a aVar2 = new a();
        this.f7205c = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/localization", r2.f.f7454a);
        this.f7203a = jVar;
        jVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        e2.b.e("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            e2.b.e("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.f7203a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f7204b = bVar;
    }
}
