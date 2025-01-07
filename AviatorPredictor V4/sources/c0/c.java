package c0;

import android.content.Context;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f1093b = new c();

    /* renamed from: a, reason: collision with root package name */
    private b f1094a = null;

    public static b a(Context context) {
        return f1093b.b(context);
    }

    public final synchronized b b(Context context) {
        if (this.f1094a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f1094a = new b(context);
        }
        return this.f1094a;
    }
}
