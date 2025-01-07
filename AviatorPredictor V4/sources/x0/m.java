package x0;

import android.content.Context;
import android.text.TextUtils;
import w.p;
import w.r;
import w.u;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f8140a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8141b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8142c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8143d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8144e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8145f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8146g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f8147a;

        /* renamed from: b, reason: collision with root package name */
        private String f8148b;

        /* renamed from: c, reason: collision with root package name */
        private String f8149c;

        /* renamed from: d, reason: collision with root package name */
        private String f8150d;

        /* renamed from: e, reason: collision with root package name */
        private String f8151e;

        /* renamed from: f, reason: collision with root package name */
        private String f8152f;

        /* renamed from: g, reason: collision with root package name */
        private String f8153g;

        public m a() {
            return new m(this.f8148b, this.f8147a, this.f8149c, this.f8150d, this.f8151e, this.f8152f, this.f8153g);
        }

        public b b(String str) {
            this.f8147a = r.f(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f8148b = r.f(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f8149c = str;
            return this;
        }

        public b e(String str) {
            this.f8150d = str;
            return this;
        }

        public b f(String str) {
            this.f8151e = str;
            return this;
        }

        public b g(String str) {
            this.f8153g = str;
            return this;
        }

        public b h(String str) {
            this.f8152f = str;
            return this;
        }
    }

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.l(!b0.l.b(str), "ApplicationId must be set.");
        this.f8141b = str;
        this.f8140a = str2;
        this.f8142c = str3;
        this.f8143d = str4;
        this.f8144e = str5;
        this.f8145f = str6;
        this.f8146g = str7;
    }

    public static m a(Context context) {
        u uVar = new u(context);
        String a5 = uVar.a("google_app_id");
        if (TextUtils.isEmpty(a5)) {
            return null;
        }
        return new m(a5, uVar.a("google_api_key"), uVar.a("firebase_database_url"), uVar.a("ga_trackingId"), uVar.a("gcm_defaultSenderId"), uVar.a("google_storage_bucket"), uVar.a("project_id"));
    }

    public String b() {
        return this.f8140a;
    }

    public String c() {
        return this.f8141b;
    }

    public String d() {
        return this.f8142c;
    }

    public String e() {
        return this.f8143d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p.a(this.f8141b, mVar.f8141b) && p.a(this.f8140a, mVar.f8140a) && p.a(this.f8142c, mVar.f8142c) && p.a(this.f8143d, mVar.f8143d) && p.a(this.f8144e, mVar.f8144e) && p.a(this.f8145f, mVar.f8145f) && p.a(this.f8146g, mVar.f8146g);
    }

    public String f() {
        return this.f8144e;
    }

    public String g() {
        return this.f8146g;
    }

    public String h() {
        return this.f8145f;
    }

    public int hashCode() {
        return p.b(this.f8141b, this.f8140a, this.f8142c, this.f8143d, this.f8144e, this.f8145f, this.f8146g);
    }

    public String toString() {
        return p.c(this).a("applicationId", this.f8141b).a("apiKey", this.f8140a).a("databaseUrl", this.f8142c).a("gcmSenderId", this.f8144e).a("storageBucket", this.f8145f).a("projectId", this.f8146g).toString();
    }
}
