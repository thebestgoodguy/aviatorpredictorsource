package u1;

import android.content.Context;
import b1.q;

/* loaded from: classes.dex */
public class h {

    public interface a<T> {
        String a(T t4);
    }

    public static b1.d<?> b(String str, String str2) {
        return b1.d.i(f.a(str, str2), f.class);
    }

    public static b1.d<?> c(final String str, final a<Context> aVar) {
        return b1.d.j(f.class).b(q.j(Context.class)).e(new b1.h() { // from class: u1.g
            @Override // b1.h
            public final Object a(b1.e eVar) {
                f d5;
                d5 = h.d(str, aVar, eVar);
                return d5;
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, b1.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
