package u;

import android.app.Activity;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7601a;

    public d(Activity activity) {
        w.r.j(activity, "Activity must not be null");
        this.f7601a = activity;
    }

    public final Activity a() {
        return (Activity) this.f7601a;
    }

    public final androidx.fragment.app.d b() {
        return (androidx.fragment.app.d) this.f7601a;
    }

    public final boolean c() {
        return this.f7601a instanceof Activity;
    }

    public final boolean d() {
        return this.f7601a instanceof androidx.fragment.app.d;
    }
}
