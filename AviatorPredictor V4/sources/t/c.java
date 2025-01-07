package t;

import android.text.TextUtils;
import java.util.ArrayList;
import w.r;

/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final e.a<u.b<?>, s.a> f7547e;

    public c(e.a<u.b<?>, s.a> aVar) {
        this.f7547e = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (u.b<?> bVar : this.f7547e.keySet()) {
            s.a aVar = (s.a) r.i(this.f7547e.get(bVar));
            z4 &= !aVar.n0();
            String b5 = bVar.b();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b5).length() + 2 + valueOf.length());
            sb.append(b5);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z4 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
