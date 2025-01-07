package q2;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a<Object> f7308a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final r2.a<Object> f7309a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, Object> f7310b = new HashMap();

        a(r2.a<Object> aVar) {
            this.f7309a = aVar;
        }

        public void a() {
            e2.b.e("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f7310b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f7310b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f7310b.get("platformBrightness"));
            this.f7309a.c(this.f7310b);
        }

        public a b(boolean z4) {
            this.f7310b.put("brieflyShowPassword", Boolean.valueOf(z4));
            return this;
        }

        public a c(boolean z4) {
            this.f7310b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z4));
            return this;
        }

        public a d(b bVar) {
            this.f7310b.put("platformBrightness", bVar.f7314e);
            return this;
        }

        public a e(float f5) {
            this.f7310b.put("textScaleFactor", Float.valueOf(f5));
            return this;
        }

        public a f(boolean z4) {
            this.f7310b.put("alwaysUse24HourFormat", Boolean.valueOf(z4));
            return this;
        }
    }

    public enum b {
        light("light"),
        dark("dark");


        /* renamed from: e, reason: collision with root package name */
        public String f7314e;

        b(String str) {
            this.f7314e = str;
        }
    }

    public m(f2.a aVar) {
        this.f7308a = new r2.a<>(aVar, "flutter/settings", r2.e.f7453a);
    }

    public a a() {
        return new a(this.f7308a);
    }
}
