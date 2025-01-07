package u2;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class t0 {

    public interface b {
        void h(String str, h hVar, i<Map<String, Object>> iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends r2.p {

        /* renamed from: d, reason: collision with root package name */
        public static final c f7785d = new c();

        private c() {
        }

        @Override // r2.p
        protected Object g(byte b5, ByteBuffer byteBuffer) {
            switch (b5) {
                case Byte.MIN_VALUE:
                    return f.a((Map) f(byteBuffer));
                case -127:
                    return g.a((Map) f(byteBuffer));
                case -126:
                    return h.a((Map) f(byteBuffer));
                default:
                    return super.g(b5, byteBuffer);
            }
        }

        @Override // r2.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f5;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f5 = ((f) obj).g();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(129);
                f5 = ((g) obj).c();
            } else if (!(obj instanceof h)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(130);
                f5 = ((h) obj).f();
            }
            p(byteArrayOutputStream, f5);
        }
    }

    public interface d {
        void b(String str, i<g> iVar);

        void e(String str, i<List<f>> iVar);

        void j(String str, h hVar, String str2, i<Void> iVar);

        void l(String str, String str2, i<Void> iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e extends r2.p {

        /* renamed from: d, reason: collision with root package name */
        public static final e f7786d = new e();

        private e() {
        }

        @Override // r2.p
        protected Object g(byte b5, ByteBuffer byteBuffer) {
            switch (b5) {
                case Byte.MIN_VALUE:
                    return f.a((Map) f(byteBuffer));
                case -127:
                    return g.a((Map) f(byteBuffer));
                case -126:
                    return h.a((Map) f(byteBuffer));
                default:
                    return super.g(b5, byteBuffer);
            }
        }

        @Override // r2.p
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f5;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f5 = ((f) obj).g();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(129);
                f5 = ((g) obj).c();
            } else if (!(obj instanceof h)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(130);
                f5 = ((h) obj).f();
            }
            p(byteArrayOutputStream, f5);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private String f7787a;

        /* renamed from: b, reason: collision with root package name */
        private Double f7788b;

        /* renamed from: c, reason: collision with root package name */
        private String f7789c;

        /* renamed from: d, reason: collision with root package name */
        private String f7790d;

        /* renamed from: e, reason: collision with root package name */
        private String f7791e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f7792a;

            /* renamed from: b, reason: collision with root package name */
            private Double f7793b;

            /* renamed from: c, reason: collision with root package name */
            private String f7794c;

            /* renamed from: d, reason: collision with root package name */
            private String f7795d;

            /* renamed from: e, reason: collision with root package name */
            private String f7796e;

            public f a() {
                f fVar = new f();
                fVar.b(this.f7792a);
                fVar.c(this.f7793b);
                fVar.d(this.f7794c);
                fVar.f(this.f7795d);
                fVar.e(this.f7796e);
                return fVar;
            }

            public a b(String str) {
                this.f7792a = str;
                return this;
            }

            public a c(Double d5) {
                this.f7793b = d5;
                return this;
            }

            public a d(String str) {
                this.f7794c = str;
                return this;
            }

            public a e(String str) {
                this.f7796e = str;
                return this;
            }

            public a f(String str) {
                this.f7795d = str;
                return this;
            }
        }

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.b((String) map.get("displayName"));
            fVar.c((Double) map.get("enrollmentTimestamp"));
            fVar.d((String) map.get("factorId"));
            fVar.f((String) map.get("uid"));
            fVar.e((String) map.get("phoneNumber"));
            return fVar;
        }

        public void b(String str) {
            this.f7787a = str;
        }

        public void c(Double d5) {
            if (d5 == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.f7788b = d5;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"factorId\" is null.");
            }
            this.f7789c = str;
        }

        public void e(String str) {
            this.f7791e = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f7790d = str;
        }

        Map<String, Object> g() {
            HashMap hashMap = new HashMap();
            hashMap.put("displayName", this.f7787a);
            hashMap.put("enrollmentTimestamp", this.f7788b);
            hashMap.put("factorId", this.f7789c);
            hashMap.put("uid", this.f7790d);
            hashMap.put("phoneNumber", this.f7791e);
            return hashMap;
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private String f7797a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f7798a;

            public g a() {
                g gVar = new g();
                gVar.b(this.f7798a);
                return gVar;
            }

            public a b(String str) {
                this.f7798a = str;
                return this;
            }
        }

        private g() {
        }

        static g a(Map<String, Object> map) {
            g gVar = new g();
            gVar.b((String) map.get("id"));
            return gVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f7797a = str;
        }

        Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f7797a);
            return hashMap;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private String f7799a;

        /* renamed from: b, reason: collision with root package name */
        private String f7800b;

        private h() {
        }

        static h a(Map<String, Object> map) {
            h hVar = new h();
            hVar.e((String) map.get("verificationId"));
            hVar.d((String) map.get("verificationCode"));
            return hVar;
        }

        public String b() {
            return this.f7800b;
        }

        public String c() {
            return this.f7799a;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.f7800b = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.f7799a = str;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", this.f7799a);
            hashMap.put("verificationCode", this.f7800b);
            return hashMap;
        }
    }

    public interface i<T> {
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
