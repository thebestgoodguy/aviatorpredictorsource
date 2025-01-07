package u;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 extends Fragment implements e {

    /* renamed from: h, reason: collision with root package name */
    private static final WeakHashMap<Activity, WeakReference<f0>> f7607h = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, LifecycleCallback> f7608e = Collections.synchronizedMap(new e.a());

    /* renamed from: f, reason: collision with root package name */
    private int f7609f = 0;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f7610g;

    public static f0 f(Activity activity) {
        f0 f0Var;
        WeakHashMap<Activity, WeakReference<f0>> weakHashMap = f7607h;
        WeakReference<f0> weakReference = weakHashMap.get(activity);
        if (weakReference != null && (f0Var = weakReference.get()) != null) {
            return f0Var;
        }
        try {
            f0 f0Var2 = (f0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (f0Var2 == null || f0Var2.isRemoving()) {
                f0Var2 = new f0();
                activity.getFragmentManager().beginTransaction().add(f0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference<>(f0Var2));
            return f0Var2;
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e5);
        }
    }

    @Override // u.e
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f7608e.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f7608e.put(str, lifecycleCallback);
        if (this.f7609f > 0) {
            new h0.e(Looper.getMainLooper()).post(new e0(this, lifecycleCallback, str));
        }
    }

    @Override // u.e
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f7608e.get(str));
    }

    @Override // u.e
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f7608e.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r32, int r4, Intent intent) {
        super.onActivityResult(r32, r4, intent);
        Iterator<LifecycleCallback> it = this.f7608e.values().iterator();
        while (it.hasNext()) {
            it.next().e(r32, r4, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7609f = 1;
        this.f7610g = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f7608e.entrySet()) {
            entry.getValue().f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7609f = 5;
        Iterator<LifecycleCallback> it = this.f7608e.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7609f = 3;
        Iterator<LifecycleCallback> it = this.f7608e.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f7608e.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7609f = 2;
        Iterator<LifecycleCallback> it = this.f7608e.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7609f = 4;
        Iterator<LifecycleCallback> it = this.f7608e.values().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }
}
