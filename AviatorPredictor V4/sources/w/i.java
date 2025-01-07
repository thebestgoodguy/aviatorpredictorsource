package w;

import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f7996a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7997b;

    public i(String str) {
        this(str, null);
    }

    public i(String str, String str2) {
        r.j(str, "log tag cannot be null");
        r.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f7996a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f7997b = null;
        } else {
            this.f7997b = str2;
        }
    }

    private final String f(String str) {
        String str2 = this.f7997b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int r22) {
        return Log.isLoggable(this.f7996a, r22);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, f(str2), th);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }
}
