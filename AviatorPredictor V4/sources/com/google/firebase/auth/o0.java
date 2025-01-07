package com.google.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.p0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseAuth f2541a;

    /* renamed from: b, reason: collision with root package name */
    private Long f2542b;

    /* renamed from: c, reason: collision with root package name */
    private p0.b f2543c;

    /* renamed from: d, reason: collision with root package name */
    private Executor f2544d;

    /* renamed from: e, reason: collision with root package name */
    private String f2545e;

    /* renamed from: f, reason: collision with root package name */
    private Activity f2546f;

    /* renamed from: g, reason: collision with root package name */
    private p0.a f2547g;

    /* renamed from: h, reason: collision with root package name */
    private k0 f2548h;

    /* renamed from: i, reason: collision with root package name */
    private s0 f2549i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2550j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f2551a;

        /* renamed from: b, reason: collision with root package name */
        private String f2552b;

        /* renamed from: c, reason: collision with root package name */
        private Long f2553c;

        /* renamed from: d, reason: collision with root package name */
        private p0.b f2554d;

        /* renamed from: e, reason: collision with root package name */
        private Executor f2555e;

        /* renamed from: f, reason: collision with root package name */
        private Activity f2556f;

        /* renamed from: g, reason: collision with root package name */
        private p0.a f2557g;

        /* renamed from: h, reason: collision with root package name */
        private k0 f2558h;

        /* renamed from: i, reason: collision with root package name */
        private s0 f2559i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f2560j;

        public a(FirebaseAuth firebaseAuth) {
            this.f2551a = (FirebaseAuth) w.r.i(firebaseAuth);
        }

        public o0 a() {
            boolean z4;
            String str;
            w.r.j(this.f2551a, "FirebaseAuth instance cannot be null");
            w.r.j(this.f2553c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            w.r.j(this.f2554d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            w.r.j(this.f2556f, "You must specify an Activity on your PhoneAuthOptions. Please call #setActivity()");
            this.f2555e = o0.j.f6711a;
            if (this.f2553c.longValue() < 0 || this.f2553c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            k0 k0Var = this.f2558h;
            if (k0Var == null) {
                w.r.f(this.f2552b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                w.r.b(!this.f2560j, "You cannot require sms validation without setting a multi-factor session.");
                w.r.b(this.f2559i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (((a1.j) k0Var).n0()) {
                    w.r.e(this.f2552b);
                    z4 = this.f2559i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                } else {
                    w.r.b(this.f2559i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z4 = this.f2552b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                }
                w.r.b(z4, str);
            }
            return new o0(this.f2551a, this.f2553c, this.f2554d, this.f2555e, this.f2552b, this.f2556f, this.f2557g, this.f2558h, this.f2559i, this.f2560j, null);
        }

        public a b(Activity activity) {
            this.f2556f = activity;
            return this;
        }

        public a c(p0.b bVar) {
            this.f2554d = bVar;
            return this;
        }

        public a d(p0.a aVar) {
            this.f2557g = aVar;
            return this;
        }

        public a e(s0 s0Var) {
            this.f2559i = s0Var;
            return this;
        }

        public a f(k0 k0Var) {
            this.f2558h = k0Var;
            return this;
        }

        public a g(String str) {
            this.f2552b = str;
            return this;
        }

        public a h(Long l4, TimeUnit timeUnit) {
            this.f2553c = Long.valueOf(TimeUnit.SECONDS.convert(l4.longValue(), timeUnit));
            return this;
        }
    }

    /* synthetic */ o0(FirebaseAuth firebaseAuth, Long l4, p0.b bVar, Executor executor, String str, Activity activity, p0.a aVar, k0 k0Var, s0 s0Var, boolean z4, f1 f1Var) {
        this.f2541a = firebaseAuth;
        this.f2545e = str;
        this.f2542b = l4;
        this.f2543c = bVar;
        this.f2546f = activity;
        this.f2544d = executor;
        this.f2547g = aVar;
        this.f2548h = k0Var;
        this.f2549i = s0Var;
        this.f2550j = z4;
    }

    public final Activity a() {
        return this.f2546f;
    }

    public final FirebaseAuth b() {
        return this.f2541a;
    }

    public final k0 c() {
        return this.f2548h;
    }

    public final p0.a d() {
        return this.f2547g;
    }

    public final p0.b e() {
        return this.f2543c;
    }

    public final s0 f() {
        return this.f2549i;
    }

    public final Long g() {
        return this.f2542b;
    }

    public final String h() {
        return this.f2545e;
    }

    public final Executor i() {
        return this.f2544d;
    }

    public final boolean j() {
        return this.f2550j;
    }

    public final boolean k() {
        return this.f2548h != null;
    }
}
