package t;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import t.a.d;
import t.f;
import w.c;
import w.r;

/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0089a<?, O> f7543a;

    /* renamed from: b, reason: collision with root package name */
    private final g<?> f7544b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7545c;

    /* renamed from: t.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0089a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, w.d dVar, O o4, f.a aVar, f.b bVar) {
            return b(context, looper, dVar, o4, aVar, bVar);
        }

        public T b(Context context, Looper looper, w.d dVar, O o4, u.c cVar, u.h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: t.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0090a extends d {
            Account a();
        }

        public interface b extends d {
            GoogleSignInAccount b();
        }

        public static final class c implements d {
            private c() {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(c.e eVar);

        boolean b();

        s.c[] c();

        boolean d();

        String e();

        void f(w.j jVar, Set<Scope> set);

        void g(c.InterfaceC0100c interfaceC0100c);

        String h();

        Set<Scope> i();

        void k();

        void l(String str);

        boolean m();

        boolean o();

        int p();
    }

    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0089a<C, O> abstractC0089a, g<C> gVar) {
        r.j(abstractC0089a, "Cannot construct an Api with a null ClientBuilder");
        r.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f7545c = str;
        this.f7543a = abstractC0089a;
        this.f7544b = gVar;
    }

    public final AbstractC0089a<?, O> a() {
        return this.f7543a;
    }

    public final c<?> b() {
        return this.f7544b;
    }

    public final String c() {
        return this.f7545c;
    }
}
