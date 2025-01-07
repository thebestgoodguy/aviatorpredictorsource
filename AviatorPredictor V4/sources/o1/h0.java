package o1;

import b3.f1;
import java.util.Locale;
import p1.g;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: b, reason: collision with root package name */
    private int f6797b;

    /* renamed from: c, reason: collision with root package name */
    private g.b f6798c;

    /* renamed from: e, reason: collision with root package name */
    private final p1.g f6800e;

    /* renamed from: f, reason: collision with root package name */
    private final a f6801f;

    /* renamed from: a, reason: collision with root package name */
    private i1.v0 f6796a = i1.v0.UNKNOWN;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6799d = true;

    interface a {
        void a(i1.v0 v0Var);
    }

    h0(p1.g gVar, a aVar) {
        this.f6800e = gVar;
        this.f6801f = aVar;
    }

    private void b() {
        g.b bVar = this.f6798c;
        if (bVar != null) {
            bVar.c();
            this.f6798c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f6798c = null;
        p1.b.d(this.f6796a == i1.v0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        h(i1.v0.OFFLINE);
    }

    private void g(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        Object[] objArr = new Object[1];
        if (!this.f6799d) {
            objArr[0] = format;
            p1.v.a("OnlineStateTracker", "%s", objArr);
        } else {
            objArr[0] = format;
            p1.v.d("OnlineStateTracker", "%s", objArr);
            this.f6799d = false;
        }
    }

    private void h(i1.v0 v0Var) {
        if (v0Var != this.f6796a) {
            this.f6796a = v0Var;
            this.f6801f.a(v0Var);
        }
    }

    i1.v0 c() {
        return this.f6796a;
    }

    void d(f1 f1Var) {
        if (this.f6796a == i1.v0.ONLINE) {
            h(i1.v0.UNKNOWN);
            p1.b.d(this.f6797b == 0, "watchStreamFailures must be 0", new Object[0]);
            p1.b.d(this.f6798c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int r02 = this.f6797b + 1;
        this.f6797b = r02;
        if (r02 >= 1) {
            b();
            g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, f1Var));
            h(i1.v0.OFFLINE);
        }
    }

    void e() {
        if (this.f6797b == 0) {
            h(i1.v0.UNKNOWN);
            p1.b.d(this.f6798c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f6798c = this.f6800e.k(g.d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: o1.g0
                @Override // java.lang.Runnable
                public final void run() {
                    h0.this.f();
                }
            });
        }
    }

    void i(i1.v0 v0Var) {
        b();
        this.f6797b = 0;
        if (v0Var == i1.v0.ONLINE) {
            this.f6799d = false;
        }
        h(v0Var);
    }
}
