package u;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 extends Fragment implements e {

    /* renamed from: f0, reason: collision with root package name */
    private static final WeakHashMap<androidx.fragment.app.d, WeakReference<h0>> f7626f0 = new WeakHashMap<>();

    /* renamed from: c0, reason: collision with root package name */
    private final Map<String, LifecycleCallback> f7627c0 = Collections.synchronizedMap(new e.a());

    /* renamed from: d0, reason: collision with root package name */
    private int f7628d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    private Bundle f7629e0;

    public static h0 r1(androidx.fragment.app.d dVar) {
        h0 h0Var;
        WeakHashMap<androidx.fragment.app.d, WeakReference<h0>> weakHashMap = f7626f0;
        WeakReference<h0> weakReference = weakHashMap.get(dVar);
        if (weakReference != null && (h0Var = weakReference.get()) != null) {
            return h0Var;
        }
        try {
            h0 h0Var2 = (h0) dVar.q().d("SupportLifecycleFragmentImpl");
            if (h0Var2 == null || h0Var2.S()) {
                h0Var2 = new h0();
                dVar.q().a().b(h0Var2, "SupportLifecycleFragmentImpl").e();
            }
            weakHashMap.put(dVar, new WeakReference<>(h0Var2));
            return h0Var2;
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(int r32, int r4, Intent intent) {
        super.W(r32, r4, intent);
        Iterator<LifecycleCallback> it = this.f7627c0.values().iterator();
        while (it.hasNext()) {
            it.next().e(r32, r4, intent);
        }
    }

    @Override // u.e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f7627c0.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f7627c0.put(str, lifecycleCallback);
        if (this.f7628d0 > 0) {
            new h0.e(Looper.getMainLooper()).post(new g0(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        this.f7628d0 = 1;
        this.f7629e0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f7627c0.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // u.e
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f7627c0.get(str));
    }

    @Override // u.e
    public final /* synthetic */ Activity d() {
        return l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f7627c0.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        this.f7628d0 = 5;
        Iterator<LifecycleCallback> it = this.f7627c0.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void w0() {
        super.w0();
        this.f7628d0 = 3;
        Iterator<LifecycleCallback> it = this.f7627c0.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f7627c0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y0() {
        super.y0();
        this.f7628d0 = 2;
        Iterator<LifecycleCallback> it = this.f7627c0.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void z0() {
        super.z0();
        this.f7628d0 = 4;
        Iterator<LifecycleCallback> it = this.f7627c0.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }
}
