package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    public interface b {
        void a(String str, Boolean bool, h<Void> hVar);

        void g(String str, Boolean bool, h<Void> hVar);

        void h(String str, h<Void> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends r2.p {

        /* renamed from: d, reason: collision with root package name */
        public static final c f4739d = new c();

        private c() {
        }
    }

    public interface d {
        void b(String str, f fVar, h<g> hVar);

        void e(h<List<g>> hVar);

        void f(h<f> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e extends r2.p {

        /* renamed from: d, reason: collision with root package name */
        public static final e f4740d = new e();

        private e() {
        }

        @Override // r2.p
        protected Object g(byte b5, ByteBuffer byteBuffer) {
            return b5 != Byte.MIN_VALUE ? b5 != -127 ? super.g(b5, byteBuffer) : g.a((Map) f(byteBuffer)) : f.a((Map) f(byteBuffer));
        }

        @Override // r2.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f5;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f5 = ((f) obj).w();
            } else if (!(obj instanceof g)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                f5 = ((g) obj).f();
            }
            p(byteArrayOutputStream, f5);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private String f4741a;

        /* renamed from: b, reason: collision with root package name */
        private String f4742b;

        /* renamed from: c, reason: collision with root package name */
        private String f4743c;

        /* renamed from: d, reason: collision with root package name */
        private String f4744d;

        /* renamed from: e, reason: collision with root package name */
        private String f4745e;

        /* renamed from: f, reason: collision with root package name */
        private String f4746f;

        /* renamed from: g, reason: collision with root package name */
        private String f4747g;

        /* renamed from: h, reason: collision with root package name */
        private String f4748h;

        /* renamed from: i, reason: collision with root package name */
        private String f4749i;

        /* renamed from: j, reason: collision with root package name */
        private String f4750j;

        /* renamed from: k, reason: collision with root package name */
        private String f4751k;

        /* renamed from: l, reason: collision with root package name */
        private String f4752l;

        /* renamed from: m, reason: collision with root package name */
        private String f4753m;

        /* renamed from: n, reason: collision with root package name */
        private String f4754n;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f4755a;

            /* renamed from: b, reason: collision with root package name */
            private String f4756b;

            /* renamed from: c, reason: collision with root package name */
            private String f4757c;

            /* renamed from: d, reason: collision with root package name */
            private String f4758d;

            /* renamed from: e, reason: collision with root package name */
            private String f4759e;

            /* renamed from: f, reason: collision with root package name */
            private String f4760f;

            /* renamed from: g, reason: collision with root package name */
            private String f4761g;

            /* renamed from: h, reason: collision with root package name */
            private String f4762h;

            /* renamed from: i, reason: collision with root package name */
            private String f4763i;

            /* renamed from: j, reason: collision with root package name */
            private String f4764j;

            /* renamed from: k, reason: collision with root package name */
            private String f4765k;

            /* renamed from: l, reason: collision with root package name */
            private String f4766l;

            /* renamed from: m, reason: collision with root package name */
            private String f4767m;

            /* renamed from: n, reason: collision with root package name */
            private String f4768n;

            public f a() {
                f fVar = new f();
                fVar.j(this.f4755a);
                fVar.l(this.f4756b);
                fVar.s(this.f4757c);
                fVar.t(this.f4758d);
                fVar.m(this.f4759e);
                fVar.n(this.f4760f);
                fVar.u(this.f4761g);
                fVar.r(this.f4762h);
                fVar.v(this.f4763i);
                fVar.o(this.f4764j);
                fVar.i(this.f4765k);
                fVar.q(this.f4766l);
                fVar.p(this.f4767m);
                fVar.k(this.f4768n);
                return fVar;
            }

            public a b(String str) {
                this.f4755a = str;
                return this;
            }

            public a c(String str) {
                this.f4756b = str;
                return this;
            }

            public a d(String str) {
                this.f4760f = str;
                return this;
            }

            public a e(String str) {
                this.f4757c = str;
                return this;
            }

            public a f(String str) {
                this.f4758d = str;
                return this;
            }

            public a g(String str) {
                this.f4761g = str;
                return this;
            }

            public a h(String str) {
                this.f4763i = str;
                return this;
            }
        }

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.j((String) map.get("apiKey"));
            fVar.l((String) map.get("appId"));
            fVar.s((String) map.get("messagingSenderId"));
            fVar.t((String) map.get("projectId"));
            fVar.m((String) map.get("authDomain"));
            fVar.n((String) map.get("databaseURL"));
            fVar.u((String) map.get("storageBucket"));
            fVar.r((String) map.get("measurementId"));
            fVar.v((String) map.get("trackingId"));
            fVar.o((String) map.get("deepLinkURLScheme"));
            fVar.i((String) map.get("androidClientId"));
            fVar.q((String) map.get("iosClientId"));
            fVar.p((String) map.get("iosBundleId"));
            fVar.k((String) map.get("appGroupId"));
            return fVar;
        }

        public String b() {
            return this.f4741a;
        }

        public String c() {
            return this.f4742b;
        }

        public String d() {
            return this.f4746f;
        }

        public String e() {
            return this.f4743c;
        }

        public String f() {
            return this.f4744d;
        }

        public String g() {
            return this.f4747g;
        }

        public String h() {
            return this.f4749i;
        }

        public void i(String str) {
            this.f4751k = str;
        }

        public void j(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f4741a = str;
        }

        public void k(String str) {
            this.f4754n = str;
        }

        public void l(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f4742b = str;
        }

        public void m(String str) {
            this.f4745e = str;
        }

        public void n(String str) {
            this.f4746f = str;
        }

        public void o(String str) {
            this.f4750j = str;
        }

        public void p(String str) {
            this.f4753m = str;
        }

        public void q(String str) {
            this.f4752l = str;
        }

        public void r(String str) {
            this.f4748h = str;
        }

        public void s(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f4743c = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f4744d = str;
        }

        public void u(String str) {
            this.f4747g = str;
        }

        public void v(String str) {
            this.f4749i = str;
        }

        Map<String, Object> w() {
            HashMap hashMap = new HashMap();
            hashMap.put("apiKey", this.f4741a);
            hashMap.put("appId", this.f4742b);
            hashMap.put("messagingSenderId", this.f4743c);
            hashMap.put("projectId", this.f4744d);
            hashMap.put("authDomain", this.f4745e);
            hashMap.put("databaseURL", this.f4746f);
            hashMap.put("storageBucket", this.f4747g);
            hashMap.put("measurementId", this.f4748h);
            hashMap.put("trackingId", this.f4749i);
            hashMap.put("deepLinkURLScheme", this.f4750j);
            hashMap.put("androidClientId", this.f4751k);
            hashMap.put("iosClientId", this.f4752l);
            hashMap.put("iosBundleId", this.f4753m);
            hashMap.put("appGroupId", this.f4754n);
            return hashMap;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private String f4769a;

        /* renamed from: b, reason: collision with root package name */
        private f f4770b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f4771c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, Object> f4772d;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f4773a;

            /* renamed from: b, reason: collision with root package name */
            private f f4774b;

            /* renamed from: c, reason: collision with root package name */
            private Boolean f4775c;

            /* renamed from: d, reason: collision with root package name */
            private Map<String, Object> f4776d;

            public g a() {
                g gVar = new g();
                gVar.c(this.f4773a);
                gVar.d(this.f4774b);
                gVar.b(this.f4775c);
                gVar.e(this.f4776d);
                return gVar;
            }

            public a b(Boolean bool) {
                this.f4775c = bool;
                return this;
            }

            public a c(String str) {
                this.f4773a = str;
                return this;
            }

            public a d(f fVar) {
                this.f4774b = fVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f4776d = map;
                return this;
            }
        }

        private g() {
        }

        static g a(Map<String, Object> map) {
            g gVar = new g();
            gVar.c((String) map.get("name"));
            Object obj = map.get("options");
            gVar.d(obj == null ? null : f.a((Map) obj));
            gVar.b((Boolean) map.get("isAutomaticDataCollectionEnabled"));
            gVar.e((Map) map.get("pluginConstants"));
            return gVar;
        }

        public void b(Boolean bool) {
            this.f4771c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f4769a = str;
        }

        public void d(f fVar) {
            if (fVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f4770b = fVar;
        }

        public void e(Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f4772d = map;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f4769a);
            f fVar = this.f4770b;
            hashMap.put("options", fVar == null ? null : fVar.w());
            hashMap.put("isAutomaticDataCollectionEnabled", this.f4771c);
            hashMap.put("pluginConstants", this.f4772d);
            return hashMap;
        }
    }

    public interface h<T> {
        void a(T t4);

        void b(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
