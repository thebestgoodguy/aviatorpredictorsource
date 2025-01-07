package z;

import android.util.Log;
import java.util.Locale;
import w.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8327a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8328b;

    /* renamed from: c, reason: collision with root package name */
    private final i f8329c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8330d;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f8328b = sb;
        this.f8327a = str;
        this.f8329c = new i(str);
        int r7 = 2;
        while (r7 <= 7 && !Log.isLoggable(this.f8327a, r7)) {
            r7++;
        }
        this.f8330d = r7;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f8327a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.e(this.f8327a, d(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f8327a, d(str, objArr));
    }

    protected String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f8328b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f8327a, d(str, objArr));
    }

    public boolean f(int r22) {
        return this.f8330d <= r22;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f8327a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f8327a, d(str, objArr));
    }

    public void i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f8327a, d(str, objArr), th);
    }

    public void j(Throwable th) {
        Log.wtf(this.f8327a, th);
    }
}
