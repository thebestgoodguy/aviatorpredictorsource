package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f558a;

    /* renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f559b = new SavedStateRegistry();

    private a(b bVar) {
        this.f558a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f559b;
    }

    public void c(Bundle bundle) {
        d b5 = this.f558a.b();
        if (b5.b() != d.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        b5.a(new Recreator(this.f558a));
        this.f559b.b(b5, bundle);
    }

    public void d(Bundle bundle) {
        this.f559b.c(bundle);
    }
}
