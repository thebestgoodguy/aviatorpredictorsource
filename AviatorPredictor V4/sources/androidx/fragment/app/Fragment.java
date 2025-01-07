package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, androidx.lifecycle.s, androidx.savedstate.b {

    /* renamed from: b0, reason: collision with root package name */
    static final Object f219b0 = new Object();
    int A;
    String B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    private boolean I;
    ViewGroup J;
    View K;
    View L;
    boolean M;
    d O;
    boolean Q;
    boolean R;
    float S;
    LayoutInflater T;
    boolean U;
    androidx.lifecycle.h W;
    r X;
    androidx.savedstate.a Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f220a0;

    /* renamed from: f, reason: collision with root package name */
    Bundle f222f;

    /* renamed from: g, reason: collision with root package name */
    SparseArray<Parcelable> f223g;

    /* renamed from: h, reason: collision with root package name */
    Boolean f224h;

    /* renamed from: j, reason: collision with root package name */
    Bundle f226j;

    /* renamed from: k, reason: collision with root package name */
    Fragment f227k;

    /* renamed from: m, reason: collision with root package name */
    int f229m;

    /* renamed from: o, reason: collision with root package name */
    boolean f231o;

    /* renamed from: p, reason: collision with root package name */
    boolean f232p;

    /* renamed from: q, reason: collision with root package name */
    boolean f233q;

    /* renamed from: r, reason: collision with root package name */
    boolean f234r;

    /* renamed from: s, reason: collision with root package name */
    boolean f235s;

    /* renamed from: t, reason: collision with root package name */
    boolean f236t;

    /* renamed from: u, reason: collision with root package name */
    int f237u;

    /* renamed from: v, reason: collision with root package name */
    j f238v;

    /* renamed from: w, reason: collision with root package name */
    h f239w;

    /* renamed from: y, reason: collision with root package name */
    Fragment f241y;

    /* renamed from: z, reason: collision with root package name */
    int f242z;

    /* renamed from: e, reason: collision with root package name */
    int f221e = 0;

    /* renamed from: i, reason: collision with root package name */
    String f225i = UUID.randomUUID().toString();

    /* renamed from: l, reason: collision with root package name */
    String f228l = null;

    /* renamed from: n, reason: collision with root package name */
    private Boolean f230n = null;

    /* renamed from: x, reason: collision with root package name */
    j f240x = new j();
    boolean H = true;
    boolean N = true;
    Runnable P = new a();
    d.b V = d.b.RESUMED;
    androidx.lifecycle.l<androidx.lifecycle.g> Y = new androidx.lifecycle.l<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.o1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e();
        }
    }

    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View c(int r32) {
            View view = Fragment.this.K;
            if (view != null) {
                return view.findViewById(r32);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.K != null;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        View f247a;

        /* renamed from: b, reason: collision with root package name */
        Animator f248b;

        /* renamed from: c, reason: collision with root package name */
        int f249c;

        /* renamed from: d, reason: collision with root package name */
        int f250d;

        /* renamed from: e, reason: collision with root package name */
        int f251e;

        /* renamed from: f, reason: collision with root package name */
        int f252f;

        /* renamed from: g, reason: collision with root package name */
        Object f253g = null;

        /* renamed from: h, reason: collision with root package name */
        Object f254h;

        /* renamed from: i, reason: collision with root package name */
        Object f255i;

        /* renamed from: j, reason: collision with root package name */
        Object f256j;

        /* renamed from: k, reason: collision with root package name */
        Object f257k;

        /* renamed from: l, reason: collision with root package name */
        Object f258l;

        /* renamed from: m, reason: collision with root package name */
        Boolean f259m;

        /* renamed from: n, reason: collision with root package name */
        Boolean f260n;

        /* renamed from: o, reason: collision with root package name */
        g.j f261o;

        /* renamed from: p, reason: collision with root package name */
        g.j f262p;

        /* renamed from: q, reason: collision with root package name */
        boolean f263q;

        /* renamed from: r, reason: collision with root package name */
        f f264r;

        /* renamed from: s, reason: collision with root package name */
        boolean f265s;

        d() {
            Object obj = Fragment.f219b0;
            this.f254h = obj;
            this.f255i = null;
            this.f256j = obj;
            this.f257k = null;
            this.f258l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        M();
    }

    private void M() {
        this.W = new androidx.lifecycle.h(this);
        this.Z = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.W.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, d.a aVar) {
                    View view;
                    if (aVar != d.a.ON_STOP || (view = Fragment.this.K) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment O(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.h1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e5) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (InstantiationException e6) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e6);
        } catch (NoSuchMethodException e7) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e7);
        } catch (InvocationTargetException e8) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e8);
        }
    }

    private d h() {
        if (this.O == null) {
            this.O = new d();
        }
        return this.O;
    }

    int A() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f251e;
    }

    public void A0(View view, Bundle bundle) {
    }

    int B() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f252f;
    }

    public void B0(Bundle bundle) {
        this.I = true;
    }

    public final Fragment C() {
        return this.f241y;
    }

    void C0(Bundle bundle) {
        this.f240x.S0();
        this.f221e = 2;
        this.I = false;
        V(bundle);
        if (this.I) {
            this.f240x.y();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object D() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f256j;
        return obj == f219b0 ? u() : obj;
    }

    void D0() {
        this.f240x.p(this.f239w, new c(), this);
        this.I = false;
        Y(this.f239w.f());
        if (this.I) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final Resources E() {
        return a1().getResources();
    }

    void E0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f240x.z(configuration);
    }

    public final boolean F() {
        return this.E;
    }

    boolean F0(MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        return a0(menuItem) || this.f240x.A(menuItem);
    }

    public Object G() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f254h;
        return obj == f219b0 ? s() : obj;
    }

    void G0(Bundle bundle) {
        this.f240x.S0();
        this.f221e = 1;
        this.I = false;
        this.Z.c(bundle);
        b0(bundle);
        this.U = true;
        if (this.I) {
            this.W.i(d.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object H() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f257k;
    }

    boolean H0(Menu menu, MenuInflater menuInflater) {
        boolean z4 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            z4 = true;
            e0(menu, menuInflater);
        }
        return z4 | this.f240x.C(menu, menuInflater);
    }

    public Object I() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f258l;
        return obj == f219b0 ? H() : obj;
    }

    void I0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f240x.S0();
        this.f236t = true;
        this.X = new r();
        View f02 = f0(layoutInflater, viewGroup, bundle);
        this.K = f02;
        if (f02 != null) {
            this.X.c();
            this.Y.g(this.X);
        } else {
            if (this.X.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.X = null;
        }
    }

    int J() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f249c;
    }

    void J0() {
        this.f240x.D();
        this.W.i(d.a.ON_DESTROY);
        this.f221e = 0;
        this.I = false;
        this.U = false;
        g0();
        if (this.I) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final Fragment K() {
        String str;
        Fragment fragment = this.f227k;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.f238v;
        if (jVar == null || (str = this.f228l) == null) {
            return null;
        }
        return jVar.f319k.get(str);
    }

    void K0() {
        this.f240x.E();
        if (this.K != null) {
            this.X.a(d.a.ON_DESTROY);
        }
        this.f221e = 1;
        this.I = false;
        i0();
        if (this.I) {
            androidx.loader.app.a.b(this).c();
            this.f236t = false;
        } else {
            throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public View L() {
        return this.K;
    }

    void L0() {
        this.I = false;
        j0();
        this.T = null;
        if (this.I) {
            if (this.f240x.D0()) {
                return;
            }
            this.f240x.D();
            this.f240x = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater M0(Bundle bundle) {
        LayoutInflater k02 = k0(bundle);
        this.T = k02;
        return k02;
    }

    void N() {
        M();
        this.f225i = UUID.randomUUID().toString();
        this.f231o = false;
        this.f232p = false;
        this.f233q = false;
        this.f234r = false;
        this.f235s = false;
        this.f237u = 0;
        this.f238v = null;
        this.f240x = new j();
        this.f239w = null;
        this.f242z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    void N0() {
        onLowMemory();
        this.f240x.F();
    }

    void O0(boolean z4) {
        o0(z4);
        this.f240x.G(z4);
    }

    boolean P() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.f265s;
    }

    boolean P0(MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        return (this.G && this.H && p0(menuItem)) || this.f240x.V(menuItem);
    }

    final boolean Q() {
        return this.f237u > 0;
    }

    void Q0(Menu menu) {
        if (this.C) {
            return;
        }
        if (this.G && this.H) {
            q0(menu);
        }
        this.f240x.W(menu);
    }

    boolean R() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.f263q;
    }

    void R0() {
        this.f240x.Y();
        if (this.K != null) {
            this.X.a(d.a.ON_PAUSE);
        }
        this.W.i(d.a.ON_PAUSE);
        this.f221e = 3;
        this.I = false;
        r0();
        if (this.I) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean S() {
        return this.f232p;
    }

    void S0(boolean z4) {
        s0(z4);
        this.f240x.Z(z4);
    }

    public final boolean T() {
        j jVar = this.f238v;
        if (jVar == null) {
            return false;
        }
        return jVar.H0();
    }

    boolean T0(Menu menu) {
        boolean z4 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            z4 = true;
            t0(menu);
        }
        return z4 | this.f240x.a0(menu);
    }

    void U() {
        this.f240x.S0();
    }

    void U0() {
        boolean F0 = this.f238v.F0(this);
        Boolean bool = this.f230n;
        if (bool == null || bool.booleanValue() != F0) {
            this.f230n = Boolean.valueOf(F0);
            u0(F0);
            this.f240x.b0();
        }
    }

    public void V(Bundle bundle) {
        this.I = true;
    }

    void V0() {
        this.f240x.S0();
        this.f240x.l0();
        this.f221e = 4;
        this.I = false;
        w0();
        if (!this.I) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.h hVar = this.W;
        d.a aVar = d.a.ON_RESUME;
        hVar.i(aVar);
        if (this.K != null) {
            this.X.a(aVar);
        }
        this.f240x.c0();
        this.f240x.l0();
    }

    public void W(int r12, int r22, Intent intent) {
    }

    void W0(Bundle bundle) {
        x0(bundle);
        this.Z.d(bundle);
        Parcelable e12 = this.f240x.e1();
        if (e12 != null) {
            bundle.putParcelable("android:support:fragments", e12);
        }
    }

    @Deprecated
    public void X(Activity activity) {
        this.I = true;
    }

    void X0() {
        this.f240x.S0();
        this.f240x.l0();
        this.f221e = 3;
        this.I = false;
        y0();
        if (!this.I) {
            throw new s("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.h hVar = this.W;
        d.a aVar = d.a.ON_START;
        hVar.i(aVar);
        if (this.K != null) {
            this.X.a(aVar);
        }
        this.f240x.d0();
    }

    public void Y(Context context) {
        this.I = true;
        h hVar = this.f239w;
        Activity e5 = hVar == null ? null : hVar.e();
        if (e5 != null) {
            this.I = false;
            X(e5);
        }
    }

    void Y0() {
        this.f240x.f0();
        if (this.K != null) {
            this.X.a(d.a.ON_STOP);
        }
        this.W.i(d.a.ON_STOP);
        this.f221e = 2;
        this.I = false;
        z0();
        if (this.I) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void Z(Fragment fragment) {
    }

    public final androidx.fragment.app.d Z0() {
        androidx.fragment.app.d l4 = l();
        if (l4 != null) {
            return l4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean a0(MenuItem menuItem) {
        return false;
    }

    public final Context a1() {
        Context r4 = r();
        if (r4 != null) {
            return r4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d b() {
        return this.W;
    }

    public void b0(Bundle bundle) {
        this.I = true;
        d1(bundle);
        if (this.f240x.G0(1)) {
            return;
        }
        this.f240x.B();
    }

    public final i b1() {
        i w4 = w();
        if (w4 != null) {
            return w4;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation c0(int r12, boolean z4, int r32) {
        return null;
    }

    public final View c1() {
        View L = L();
        if (L != null) {
            return L;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator d0(int r12, boolean z4, int r32) {
        return null;
    }

    void d1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f240x.c1(parcelable);
        this.f240x.B();
    }

    void e() {
        d dVar = this.O;
        f fVar = null;
        if (dVar != null) {
            dVar.f263q = false;
            f fVar2 = dVar.f264r;
            dVar.f264r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public void e0(Menu menu, MenuInflater menuInflater) {
    }

    final void e1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f223g;
        if (sparseArray != null) {
            this.L.restoreHierarchyState(sparseArray);
            this.f223g = null;
        }
        this.I = false;
        B0(bundle);
        if (this.I) {
            if (this.K != null) {
                this.X.a(d.a.ON_CREATE);
            }
        } else {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f242z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f221e);
        printWriter.print(" mWho=");
        printWriter.print(this.f225i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f237u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f231o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f232p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f233q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f234r);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.f238v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f238v);
        }
        if (this.f239w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f239w);
        }
        if (this.f241y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f241y);
        }
        if (this.f226j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f226j);
        }
        if (this.f222f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f222f);
        }
        if (this.f223g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f223g);
        }
        Fragment K = K();
        if (K != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(K);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f229m);
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(z());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.K);
        }
        if (o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(o());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(J());
        }
        if (r() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f240x + ":");
        this.f240x.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int r4 = this.f220a0;
        if (r4 != 0) {
            return layoutInflater.inflate(r4, viewGroup, false);
        }
        return null;
    }

    void f1(View view) {
        h().f247a = view;
    }

    @Override // androidx.lifecycle.s
    public androidx.lifecycle.r g() {
        j jVar = this.f238v;
        if (jVar != null) {
            return jVar.A0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void g0() {
        this.I = true;
    }

    void g1(Animator animator) {
        h().f248b = animator;
    }

    public void h0() {
    }

    public void h1(Bundle bundle) {
        if (this.f238v != null && T()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f226j = bundle;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i0() {
        this.I = true;
    }

    void i1(boolean z4) {
        h().f265s = z4;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry j() {
        return this.Z.b();
    }

    public void j0() {
        this.I = true;
    }

    void j1(int r22) {
        if (this.O == null && r22 == 0) {
            return;
        }
        h().f250d = r22;
    }

    Fragment k(String str) {
        return str.equals(this.f225i) ? this : this.f240x.q0(str);
    }

    public LayoutInflater k0(Bundle bundle) {
        return y(bundle);
    }

    void k1(int r22, int r32) {
        if (this.O == null && r22 == 0 && r32 == 0) {
            return;
        }
        h();
        d dVar = this.O;
        dVar.f251e = r22;
        dVar.f252f = r32;
    }

    public final androidx.fragment.app.d l() {
        h hVar = this.f239w;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.e();
    }

    public void l0(boolean z4) {
    }

    void l1(f fVar) {
        h();
        d dVar = this.O;
        f fVar2 = dVar.f264r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f263q) {
            dVar.f264r = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public boolean m() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.f260n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void m0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    void m1(int r22) {
        h().f249c = r22;
    }

    public boolean n() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.f259m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        h hVar = this.f239w;
        Activity e5 = hVar == null ? null : hVar.e();
        if (e5 != null) {
            this.I = false;
            m0(e5, attributeSet, bundle);
        }
    }

    public void n1(Intent intent, int r32, Bundle bundle) {
        h hVar = this.f239w;
        if (hVar != null) {
            hVar.r(this, intent, r32, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    View o() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f247a;
    }

    public void o0(boolean z4) {
    }

    public void o1() {
        j jVar = this.f238v;
        if (jVar == null || jVar.f329u == null) {
            h().f263q = false;
        } else if (Looper.myLooper() != this.f238v.f329u.h().getLooper()) {
            this.f238v.f329u.h().postAtFrontOfQueue(new b());
        } else {
            e();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Z0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.I = true;
    }

    Animator p() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f248b;
    }

    public boolean p0(MenuItem menuItem) {
        return false;
    }

    public final i q() {
        if (this.f239w != null) {
            return this.f240x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void q0(Menu menu) {
    }

    public Context r() {
        h hVar = this.f239w;
        if (hVar == null) {
            return null;
        }
        return hVar.f();
    }

    public void r0() {
        this.I = true;
    }

    public Object s() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f253g;
    }

    public void s0(boolean z4) {
    }

    public void startActivityForResult(Intent intent, int r32) {
        n1(intent, r32, null);
    }

    g.j t() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f261o;
    }

    public void t0(Menu menu) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        j.b.a(this, sb);
        sb.append(" (");
        sb.append(this.f225i);
        sb.append(")");
        if (this.f242z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f242z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f255i;
    }

    public void u0(boolean z4) {
    }

    g.j v() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f262p;
    }

    public void v0(int r12, String[] strArr, int[] r32) {
    }

    public final i w() {
        return this.f238v;
    }

    public void w0() {
        this.I = true;
    }

    public final Object x() {
        h hVar = this.f239w;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void x0(Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater y(Bundle bundle) {
        h hVar = this.f239w;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater n4 = hVar.n();
        k.b.b(n4, this.f240x.y0());
        return n4;
    }

    public void y0() {
        this.I = true;
    }

    int z() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f250d;
    }

    public void z0() {
        this.I = true;
    }
}
