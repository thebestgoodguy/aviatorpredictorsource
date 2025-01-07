package s;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import w.p1;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7489a = i.f7494a;

    /* renamed from: b, reason: collision with root package name */
    private static final e f7490b = new e();

    e() {
    }

    public static e e() {
        return f7490b;
    }

    public Intent a(Context context, int r5, String str) {
        if (r5 != 1 && r5 != 2) {
            if (r5 != 3) {
                return null;
            }
            return p1.c("com.google.android.gms");
        }
        if (context != null && b0.g.c(context)) {
            return p1.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f7489a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c0.c.a(context).c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return p1.b("com.google.android.gms", sb.toString());
    }

    public PendingIntent b(Context context, int r32, int r4) {
        return c(context, r32, r4, null);
    }

    public PendingIntent c(Context context, int r32, int r4, String str) {
        Intent a5 = a(context, r32, str);
        if (a5 == null) {
            return null;
        }
        return h0.d.a(context, r4, a5, h0.d.f3898a | 134217728);
    }

    public String d(int r12) {
        return i.b(r12);
    }

    public int f(Context context) {
        return g(context, f7489a);
    }

    public int g(Context context, int r22) {
        int e5 = i.e(context, r22);
        if (i.f(context, e5)) {
            return 18;
        }
        return e5;
    }

    public boolean h(Context context, String str) {
        return i.i(context, str);
    }

    public boolean i(int r12) {
        return i.h(r12);
    }

    public void j(Context context, int r22) {
        i.a(context, r22);
    }
}
