package t;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.o;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import t.a;
import t.a.d;
import u.a0;
import u.p;
import w.d;
import w.r;

/* loaded from: classes.dex */
public abstract class e<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7548a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7549b;

    /* renamed from: c, reason: collision with root package name */
    private final t.a<O> f7550c;

    /* renamed from: d, reason: collision with root package name */
    private final O f7551d;

    /* renamed from: e, reason: collision with root package name */
    private final u.b<O> f7552e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f7553f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7554g;

    /* renamed from: h, reason: collision with root package name */
    @NotOnlyInitialized
    private final f f7555h;

    /* renamed from: i, reason: collision with root package name */
    private final u.k f7556i;

    /* renamed from: j, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.c f7557j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f7558c = new C0091a().a();

        /* renamed from: a, reason: collision with root package name */
        public final u.k f7559a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f7560b;

        /* renamed from: t.e$a$a, reason: collision with other inner class name */
        public static class C0091a {

            /* renamed from: a, reason: collision with root package name */
            private u.k f7561a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f7562b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f7561a == null) {
                    this.f7561a = new u.a();
                }
                if (this.f7562b == null) {
                    this.f7562b = Looper.getMainLooper();
                }
                return new a(this.f7561a, this.f7562b);
            }

            public C0091a b(u.k kVar) {
                r.j(kVar, "StatusExceptionMapper must not be null.");
                this.f7561a = kVar;
                return this;
            }
        }

        private a(u.k kVar, Account account, Looper looper) {
            this.f7559a = kVar;
            this.f7560b = looper;
        }
    }

    private e(Context context, Activity activity, t.a<O> aVar, O o4, a aVar2) {
        r.j(context, "Null context is not permitted.");
        r.j(aVar, "Api must not be null.");
        r.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f7548a = context.getApplicationContext();
        String str = null;
        if (b0.j.i()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f7549b = str;
        this.f7550c = aVar;
        this.f7551d = o4;
        this.f7553f = aVar2.f7560b;
        u.b<O> a5 = u.b.a(aVar, o4, str);
        this.f7552e = a5;
        this.f7555h = new p(this);
        com.google.android.gms.common.api.internal.c x4 = com.google.android.gms.common.api.internal.c.x(this.f7548a);
        this.f7557j = x4;
        this.f7554g = x4.m();
        this.f7556i = aVar2.f7559a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, x4, a5);
        }
        x4.b(this);
    }

    public e(Context context, t.a<O> aVar, O o4, a aVar2) {
        this(context, null, aVar, o4, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.content.Context r2, t.a<O> r3, O r4, u.k r5) {
        /*
            r1 = this;
            t.e$a$a r0 = new t.e$a$a
            r0.<init>()
            r0.b(r5)
            t.e$a r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.<init>(android.content.Context, t.a, t.a$d, u.k):void");
    }

    private final <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends k, A>> T m(int r22, T t4) {
        t4.j();
        this.f7557j.D(this, r22, t4);
        return t4;
    }

    private final <TResult, A extends a.b> o0.h<TResult> n(int r8, com.google.android.gms.common.api.internal.d<A, TResult> dVar) {
        o0.i iVar = new o0.i();
        this.f7557j.E(this, r8, dVar, iVar, this.f7556i);
        return iVar.a();
    }

    public f b() {
        return this.f7555h;
    }

    protected d.a c() {
        Account a5;
        GoogleSignInAccount b5;
        GoogleSignInAccount b6;
        d.a aVar = new d.a();
        O o4 = this.f7551d;
        if (!(o4 instanceof a.d.b) || (b6 = ((a.d.b) o4).b()) == null) {
            O o5 = this.f7551d;
            a5 = o5 instanceof a.d.InterfaceC0090a ? ((a.d.InterfaceC0090a) o5).a() : null;
        } else {
            a5 = b6.j0();
        }
        aVar.d(a5);
        O o6 = this.f7551d;
        aVar.c((!(o6 instanceof a.d.b) || (b5 = ((a.d.b) o6).b()) == null) ? Collections.emptySet() : b5.o0());
        aVar.e(this.f7548a.getClass().getName());
        aVar.b(this.f7548a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> o0.h<TResult> d(com.google.android.gms.common.api.internal.d<A, TResult> dVar) {
        return n(2, dVar);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.b<? extends k, A>> T e(T t4) {
        m(0, t4);
        return t4;
    }

    public <TResult, A extends a.b> o0.h<TResult> f(com.google.android.gms.common.api.internal.d<A, TResult> dVar) {
        return n(1, dVar);
    }

    public final u.b<O> g() {
        return this.f7552e;
    }

    protected String h() {
        return this.f7549b;
    }

    public Looper i() {
        return this.f7553f;
    }

    public final int j() {
        return this.f7554g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f k(Looper looper, o<O> oVar) {
        a.f a5 = ((a.AbstractC0089a) r.i(this.f7550c.a())).a(this.f7548a, looper, c().a(), this.f7551d, oVar, oVar);
        String h5 = h();
        if (h5 != null && (a5 instanceof w.c)) {
            ((w.c) a5).O(h5);
        }
        if (h5 != null && (a5 instanceof u.g)) {
            ((u.g) a5).r(h5);
        }
        return a5;
    }

    public final a0 l(Context context, Handler handler) {
        return new a0(context, handler, c().a());
    }
}
