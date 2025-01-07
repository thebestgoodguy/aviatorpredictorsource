package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f554b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f555c;

    /* renamed from: a, reason: collision with root package name */
    private b.b<String, b> f553a = new b.b<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f556d = true;

    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (!this.f555c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f554b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f554b.remove(str);
        if (this.f554b.isEmpty()) {
            this.f554b = null;
        }
        return bundle2;
    }

    void b(d dVar, Bundle bundle) {
        if (this.f555c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f554b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dVar.a(new e() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.e
            public void d(g gVar, d.a aVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z4;
                if (aVar == d.a.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z4 = true;
                } else {
                    if (aVar != d.a.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z4 = false;
                }
                savedStateRegistry.f556d = z4;
            }
        });
        this.f555c = true;
    }

    void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f554b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b<String, b>.d q4 = this.f553a.q();
        while (q4.hasNext()) {
            Map.Entry next = q4.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
