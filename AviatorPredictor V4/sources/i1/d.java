package i1;

import android.app.Activity;
import android.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<Runnable> f4069a;

        private b() {
            this.f4069a = new ArrayList();
        }

        synchronized void a(Runnable runnable) {
            this.f4069a.add(runnable);
        }

        void b() {
            for (Runnable runnable : this.f4069a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class c extends Fragment {

        /* renamed from: e, reason: collision with root package name */
        b f4070e = new b();

        @Override // android.app.Fragment
        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.f4070e) {
                bVar = this.f4070e;
                this.f4070e = new b();
            }
            bVar.b();
        }
    }

    /* renamed from: i1.d$d, reason: collision with other inner class name */
    public static class C0044d extends androidx.fragment.app.Fragment {

        /* renamed from: c0, reason: collision with root package name */
        b f4071c0 = new b();

        @Override // androidx.fragment.app.Fragment
        public void z0() {
            b bVar;
            super.z0();
            synchronized (this.f4071c0) {
                bVar = this.f4071c0;
                this.f4071c0 = new b();
            }
            bVar.b();
        }
    }

    public static com.google.firebase.firestore.a0 c(Activity activity, final com.google.firebase.firestore.a0 a0Var) {
        if (activity != null) {
            if (activity instanceof androidx.fragment.app.d) {
                Objects.requireNonNull(a0Var);
                h((androidx.fragment.app.d) activity, new Runnable() { // from class: i1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.firestore.a0.this.remove();
                    }
                });
            } else {
                Objects.requireNonNull(a0Var);
                g(activity, new Runnable() { // from class: i1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.firebase.firestore.a0.this.remove();
                    }
                });
            }
        }
        return a0Var;
    }

    private static <T> T d(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Activity activity, Runnable runnable) {
        c cVar = (c) d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f4070e.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(androidx.fragment.app.d dVar, Runnable runnable) {
        C0044d c0044d = (C0044d) d(C0044d.class, dVar.q().d("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (c0044d == null || c0044d.S()) {
            c0044d = new C0044d();
            dVar.q().a().b(c0044d, "FirestoreOnStopObserverSupportFragment").e();
            dVar.q().c();
        }
        c0044d.f4071c0.a(runnable);
    }

    private static void g(final Activity activity, final Runnable runnable) {
        p1.b.d(!(activity instanceof androidx.fragment.app.d), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: i1.a
            @Override // java.lang.Runnable
            public final void run() {
                d.e(activity, runnable);
            }
        });
    }

    private static void h(final androidx.fragment.app.d dVar, final Runnable runnable) {
        dVar.runOnUiThread(new Runnable() { // from class: i1.b
            @Override // java.lang.Runnable
            public final void run() {
                d.f(androidx.fragment.app.d.this, runnable);
            }
        });
    }
}
