package q2;

import org.json.JSONArray;
import org.json.JSONException;
import r2.j;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final r2.j f7315a;

    /* renamed from: b, reason: collision with root package name */
    private b f7316b;

    /* renamed from: c, reason: collision with root package name */
    public final j.c f7317c;

    class a implements j.c {
        a() {
        }

        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            if (n.this.f7316b == null) {
                e2.b.e("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = iVar.f7455a;
            Object obj = iVar.f7456b;
            e2.b.e("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                JSONArray jSONArray = (JSONArray) obj;
                n.this.f7316b.a(jSONArray.getString(0), jSONArray.getString(1), dVar);
            } catch (JSONException e5) {
                dVar.b("error", e5.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, j.d dVar);
    }

    public n(f2.a aVar) {
        a aVar2 = new a();
        this.f7317c = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/spellcheck", r2.f.f7454a);
        this.f7315a = jVar;
        jVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f7316b = bVar;
    }
}
