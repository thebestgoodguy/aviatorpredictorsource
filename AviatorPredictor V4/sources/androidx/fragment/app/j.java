package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean L = false;
    static final Interpolator M = new DecelerateInterpolator(2.5f);
    static final Interpolator N = new DecelerateInterpolator(1.5f);
    boolean A;
    boolean B;
    boolean C;
    ArrayList<androidx.fragment.app.a> D;
    ArrayList<Boolean> E;
    ArrayList<Fragment> F;
    ArrayList<m> I;
    private androidx.fragment.app.l J;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<k> f315g;

    /* renamed from: h, reason: collision with root package name */
    boolean f316h;

    /* renamed from: l, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f320l;

    /* renamed from: m, reason: collision with root package name */
    ArrayList<Fragment> f321m;

    /* renamed from: n, reason: collision with root package name */
    private OnBackPressedDispatcher f322n;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f324p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<Integer> f325q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<i.b> f326r;

    /* renamed from: u, reason: collision with root package name */
    androidx.fragment.app.h f329u;

    /* renamed from: v, reason: collision with root package name */
    androidx.fragment.app.e f330v;

    /* renamed from: w, reason: collision with root package name */
    Fragment f331w;

    /* renamed from: x, reason: collision with root package name */
    Fragment f332x;

    /* renamed from: y, reason: collision with root package name */
    boolean f333y;

    /* renamed from: z, reason: collision with root package name */
    boolean f334z;

    /* renamed from: i, reason: collision with root package name */
    int f317i = 0;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList<Fragment> f318j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    final HashMap<String, Fragment> f319k = new HashMap<>();

    /* renamed from: o, reason: collision with root package name */
    private final androidx.activity.b f323o = new a(false);

    /* renamed from: s, reason: collision with root package name */
    private final CopyOnWriteArrayList<i> f327s = new CopyOnWriteArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    int f328t = 0;
    Bundle G = null;
    SparseArray<Parcelable> H = null;
    Runnable K = new b();

    class a extends androidx.activity.b {
        a(boolean z4) {
            super(z4);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.B0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.l0();
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f337a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f338b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f338b.o() != null) {
                    c.this.f338b.f1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f338b;
                    jVar.R0(fragment, fragment.J(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f337a = viewGroup;
            this.f338b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f337a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f342b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f343c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f341a = viewGroup;
            this.f342b = view;
            this.f343c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f341a.endViewTransition(this.f342b);
            Animator p4 = this.f343c.p();
            this.f343c.g1(null);
            if (p4 == null || this.f341a.indexOfChild(this.f342b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f343c;
            jVar.R0(fragment, fragment.J(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f347c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f345a = viewGroup;
            this.f346b = view;
            this.f347c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f345a.endViewTransition(this.f346b);
            animator.removeListener(this);
            Fragment fragment = this.f347c;
            View view = fragment.K;
            if (view == null || !fragment.C) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.f329u;
            return hVar.a(hVar.f(), str, null);
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f350a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f351b;

        g(Animator animator) {
            this.f350a = null;
            this.f351b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f350a = animation;
            this.f351b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final ViewGroup f352e;

        /* renamed from: f, reason: collision with root package name */
        private final View f353f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f354g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f355h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f356i;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f356i = true;
            this.f352e = viewGroup;
            this.f353f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation) {
            this.f356i = true;
            if (this.f354g) {
                return !this.f355h;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f354g = true;
                k.d.a(this.f352e, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation, float f5) {
            this.f356i = true;
            if (this.f354g) {
                return !this.f355h;
            }
            if (!super.getTransformation(j4, transformation, f5)) {
                this.f354g = true;
                k.d.a(this.f352e, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f354g || !this.f356i) {
                this.f352e.endViewTransition(this.f353f);
                this.f355h = true;
            } else {
                this.f356i = false;
                this.f352e.post(this);
            }
        }
    }

    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        final i.a f357a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f358b;
    }

    /* renamed from: androidx.fragment.app.j$j, reason: collision with other inner class name */
    static class C0004j {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f359a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {

        /* renamed from: a, reason: collision with root package name */
        final String f360a;

        /* renamed from: b, reason: collision with root package name */
        final int f361b;

        /* renamed from: c, reason: collision with root package name */
        final int f362c;

        l(String str, int r32, int r4) {
            this.f360a = str;
            this.f361b = r32;
            this.f362c = r4;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.f332x;
            if (fragment == null || this.f361b >= 0 || this.f360a != null || !fragment.q().h()) {
                return j.this.V0(arrayList, arrayList2, this.f360a, this.f361b, this.f362c);
            }
            return false;
        }
    }

    static class m implements Fragment.f {

        /* renamed from: a, reason: collision with root package name */
        final boolean f364a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f365b;

        /* renamed from: c, reason: collision with root package name */
        private int f366c;

        m(androidx.fragment.app.a aVar, boolean z4) {
            this.f364a = z4;
            this.f365b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int r02 = this.f366c - 1;
            this.f366c = r02;
            if (r02 != 0) {
                return;
            }
            this.f365b.f266s.h1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f366c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f365b;
            aVar.f266s.v(aVar, this.f364a, false, false);
        }

        public void d() {
            boolean z4 = this.f366c > 0;
            j jVar = this.f365b.f266s;
            int size = jVar.f318j.size();
            for (int r12 = 0; r12 < size; r12++) {
                Fragment fragment = jVar.f318j.get(r12);
                fragment.l1(null);
                if (z4 && fragment.R()) {
                    fragment.o1();
                }
            }
            androidx.fragment.app.a aVar = this.f365b;
            aVar.f266s.v(aVar, this.f364a, !z4, true);
        }

        public boolean e() {
            return this.f366c == 0;
        }
    }

    j() {
    }

    private boolean E0(Fragment fragment) {
        return (fragment.G && fragment.H) || fragment.f240x.s();
    }

    static g K0(float f5, float f6) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f5, f6);
        alphaAnimation.setInterpolator(N);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g M0(float f5, float f6, float f7, float f8) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f5, f6, f5, f6, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(M);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f7, f8);
        alphaAnimation.setInterpolator(N);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void N0(e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int r12 = 0; r12 < size; r12++) {
            Fragment v4 = bVar.v(r12);
            if (!v4.f231o) {
                View c12 = v4.c1();
                v4.S = c12.getAlpha();
                c12.setAlpha(0.0f);
            }
        }
    }

    private boolean U0(String str, int r10, int r11) {
        l0();
        j0(true);
        Fragment fragment = this.f332x;
        if (fragment != null && r10 < 0 && str == null && fragment.q().h()) {
            return true;
        }
        boolean V0 = V0(this.D, this.E, str, r10, r11);
        if (V0) {
            this.f316h = true;
            try {
                Z0(this.D, this.E);
            } finally {
                u();
            }
        }
        p1();
        g0();
        r();
        return V0;
    }

    private int W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r10, int r11, e.b<Fragment> bVar) {
        int r12 = r11;
        for (int r02 = r11 - 1; r02 >= r10; r02--) {
            androidx.fragment.app.a aVar = arrayList.get(r02);
            boolean booleanValue = arrayList2.get(r02).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, r02 + 1, r11)) {
                if (this.I == null) {
                    this.I = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.I.add(mVar);
                aVar.u(mVar);
                if (booleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                r12--;
                if (r02 != r12) {
                    arrayList.remove(r02);
                    arrayList.add(r12, aVar);
                }
                j(bVar);
            }
        }
        return r12;
    }

    private void X(Fragment fragment) {
        if (fragment == null || this.f319k.get(fragment.f225i) != fragment) {
            return;
        }
        fragment.U0();
    }

    private void Z0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        o0(arrayList, arrayList2);
        int size = arrayList.size();
        int r12 = 0;
        int r22 = 0;
        while (r12 < size) {
            if (!arrayList.get(r12).f409q) {
                if (r22 != r12) {
                    n0(arrayList, arrayList2, r22, r12);
                }
                r22 = r12 + 1;
                if (arrayList2.get(r12).booleanValue()) {
                    while (r22 < size && arrayList2.get(r22).booleanValue() && !arrayList.get(r22).f409q) {
                        r22++;
                    }
                }
                n0(arrayList, arrayList2, r12, r22);
                r12 = r22 - 1;
            }
            r12++;
        }
        if (r22 != size) {
            n0(arrayList, arrayList2, r22, size);
        }
    }

    public static int d1(int r32) {
        if (r32 == 4097) {
            return 8194;
        }
        if (r32 != 4099) {
            return r32 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void e0(int r32) {
        try {
            this.f316h = true;
            P0(r32, false);
            this.f316h = false;
            l0();
        } catch (Throwable th) {
            this.f316h = false;
            throw th;
        }
    }

    private void h0() {
        for (Fragment fragment : this.f319k.values()) {
            if (fragment != null) {
                if (fragment.o() != null) {
                    int J = fragment.J();
                    View o4 = fragment.o();
                    Animation animation = o4.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        o4.clearAnimation();
                    }
                    fragment.f1(null);
                    R0(fragment, J, 0, 0, false);
                } else if (fragment.p() != null) {
                    fragment.p().end();
                }
            }
        }
    }

    private void j(e.b<Fragment> bVar) {
        int r02 = this.f328t;
        if (r02 < 1) {
            return;
        }
        int min = Math.min(r02, 3);
        int size = this.f318j.size();
        for (int r8 = 0; r8 < size; r8++) {
            Fragment fragment = this.f318j.get(r8);
            if (fragment.f221e < min) {
                R0(fragment, min, fragment.z(), fragment.A(), false);
                if (fragment.K != null && !fragment.C && fragment.Q) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void j0(boolean z4) {
        if (this.f316h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f329u == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f329u.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4) {
            t();
        }
        if (this.D == null) {
            this.D = new ArrayList<>();
            this.E = new ArrayList<>();
        }
        this.f316h = true;
        try {
            o0(null, null);
        } finally {
            this.f316h = false;
        }
    }

    private static void m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r5, int r6) {
        while (r5 < r6) {
            androidx.fragment.app.a aVar = arrayList.get(r5);
            if (arrayList2.get(r5).booleanValue()) {
                aVar.h(-1);
                aVar.m(r5 == r6 + (-1));
            } else {
                aVar.h(1);
                aVar.l();
            }
            r5++;
        }
    }

    private void n0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r18, int r19) {
        int r4;
        int r12;
        int r9 = r18;
        boolean z4 = arrayList.get(r9).f409q;
        ArrayList<Fragment> arrayList3 = this.F;
        if (arrayList3 == null) {
            this.F = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.F.addAll(this.f318j);
        Fragment z02 = z0();
        boolean z5 = false;
        for (int r22 = r9; r22 < r19; r22++) {
            androidx.fragment.app.a aVar = arrayList.get(r22);
            z02 = !arrayList2.get(r22).booleanValue() ? aVar.n(this.F, z02) : aVar.v(this.F, z02);
            z5 = z5 || aVar.f400h;
        }
        this.F.clear();
        if (!z4) {
            o.B(this, arrayList, arrayList2, r18, r19, false);
        }
        m0(arrayList, arrayList2, r18, r19);
        if (z4) {
            e.b<Fragment> bVar = new e.b<>();
            j(bVar);
            int W0 = W0(arrayList, arrayList2, r18, r19, bVar);
            N0(bVar);
            r4 = W0;
        } else {
            r4 = r19;
        }
        if (r4 != r9 && z4) {
            o.B(this, arrayList, arrayList2, r18, r4, true);
            P0(this.f328t, true);
        }
        while (r9 < r19) {
            androidx.fragment.app.a aVar2 = arrayList.get(r9);
            if (arrayList2.get(r9).booleanValue() && (r12 = aVar2.f268u) >= 0) {
                t0(r12);
                aVar2.f268u = -1;
            }
            aVar2.t();
            r9++;
        }
        if (z5) {
            b1();
        }
    }

    private void n1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
        androidx.fragment.app.h hVar = this.f329u;
        try {
            if (hVar != null) {
                hVar.l("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw runtimeException;
        }
    }

    private void o(Fragment fragment, g gVar, int r5) {
        View view = fragment.K;
        ViewGroup viewGroup = fragment.J;
        viewGroup.startViewTransition(view);
        fragment.m1(r5);
        if (gVar.f350a != null) {
            h hVar = new h(gVar.f350a, viewGroup, view);
            fragment.f1(fragment.K);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.K.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f351b;
        fragment.g1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.K);
        animator.start();
    }

    private void o0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int r22 = 0;
        while (r22 < size) {
            m mVar = this.I.get(r22);
            if (arrayList == null || mVar.f364a || (indexOf2 = arrayList.indexOf(mVar.f365b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f365b.q(arrayList, 0, arrayList.size()))) {
                    this.I.remove(r22);
                    r22--;
                    size--;
                    if (arrayList == null || mVar.f364a || (indexOf = arrayList.indexOf(mVar.f365b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                r22++;
            } else {
                this.I.remove(r22);
                r22--;
                size--;
            }
            mVar.c();
            r22++;
        }
    }

    public static int o1(int r12, boolean z4) {
        if (r12 == 4097) {
            return z4 ? 1 : 2;
        }
        if (r12 == 4099) {
            return z4 ? 5 : 6;
        }
        if (r12 != 8194) {
            return -1;
        }
        return z4 ? 3 : 4;
    }

    private void p1() {
        ArrayList<k> arrayList = this.f315g;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f323o.f(v0() > 0 && F0(this.f331w));
        } else {
            this.f323o.f(true);
        }
    }

    private void r() {
        this.f319k.values().removeAll(Collections.singleton(null));
    }

    private Fragment r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.J;
        View view = fragment.K;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f318j.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f318j.get(indexOf);
                if (fragment2.J == viewGroup && fragment2.K != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void s0() {
        if (this.I != null) {
            while (!this.I.isEmpty()) {
                this.I.remove(0).d();
            }
        }
    }

    private void t() {
        if (H0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void u() {
        this.f316h = false;
        this.E.clear();
        this.D.clear();
    }

    private boolean u0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f315g;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f315g.size();
                boolean z4 = false;
                for (int r12 = 0; r12 < size; r12++) {
                    z4 |= this.f315g.get(r12).a(arrayList, arrayList2);
                }
                this.f315g.clear();
                this.f329u.h().removeCallbacks(this.K);
                return z4;
            }
            return false;
        }
    }

    public boolean A(MenuItem menuItem) {
        if (this.f328t < 1) {
            return false;
        }
        for (int r02 = 0; r02 < this.f318j.size(); r02++) {
            Fragment fragment = this.f318j.get(r02);
            if (fragment != null && fragment.F0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    androidx.lifecycle.r A0(Fragment fragment) {
        return this.J.i(fragment);
    }

    public void B() {
        this.f334z = false;
        this.A = false;
        e0(1);
    }

    void B0() {
        l0();
        if (this.f323o.c()) {
            h();
        } else {
            this.f322n.c();
        }
    }

    public boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f328t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z4 = false;
        for (int r32 = 0; r32 < this.f318j.size(); r32++) {
            Fragment fragment = this.f318j.get(r32);
            if (fragment != null && fragment.H0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z4 = true;
            }
        }
        if (this.f321m != null) {
            for (int r12 = 0; r12 < this.f321m.size(); r12++) {
                Fragment fragment2 = this.f321m.get(r12);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.h0();
                }
            }
        }
        this.f321m = arrayList;
        return z4;
    }

    public void C0(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.C) {
            return;
        }
        fragment.C = true;
        fragment.R = true ^ fragment.R;
    }

    public void D() {
        this.B = true;
        l0();
        e0(0);
        this.f329u = null;
        this.f330v = null;
        this.f331w = null;
        if (this.f322n != null) {
            this.f323o.d();
            this.f322n = null;
        }
    }

    public boolean D0() {
        return this.B;
    }

    public void E() {
        e0(1);
    }

    public void F() {
        for (int r02 = 0; r02 < this.f318j.size(); r02++) {
            Fragment fragment = this.f318j.get(r02);
            if (fragment != null) {
                fragment.N0();
            }
        }
    }

    boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.f238v;
        return fragment == jVar.z0() && F0(jVar.f331w);
    }

    public void G(boolean z4) {
        for (int size = this.f318j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f318j.get(size);
            if (fragment != null) {
                fragment.O0(z4);
            }
        }
    }

    boolean G0(int r22) {
        return this.f328t >= r22;
    }

    void H(Fragment fragment, Bundle bundle, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).H(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    public boolean H0() {
        return this.f334z || this.A;
    }

    void I(Fragment fragment, Context context, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).I(fragment, context, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    g I0(Fragment fragment, int r7, boolean z4, int r9) {
        int o12;
        int z5 = fragment.z();
        boolean z6 = false;
        fragment.j1(0);
        ViewGroup viewGroup = fragment.J;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation c02 = fragment.c0(r7, z4, z5);
        if (c02 != null) {
            return new g(c02);
        }
        Animator d02 = fragment.d0(r7, z4, z5);
        if (d02 != null) {
            return new g(d02);
        }
        if (z5 != 0) {
            boolean equals = "anim".equals(this.f329u.f().getResources().getResourceTypeName(z5));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f329u.f(), z5);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z6 = true;
                } catch (Resources.NotFoundException e5) {
                    throw e5;
                } catch (RuntimeException unused) {
                }
            }
            if (!z6) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f329u.f(), z5);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e6) {
                    if (equals) {
                        throw e6;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f329u.f(), z5);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2);
                    }
                }
            }
        }
        if (r7 == 0 || (o12 = o1(r7, z4)) < 0) {
            return null;
        }
        switch (o12) {
            case 1:
                return M0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return M0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return M0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return M0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return K0(0.0f, 1.0f);
            case 6:
                return K0(1.0f, 0.0f);
            default:
                if (r9 == 0 && this.f329u.p()) {
                    this.f329u.o();
                }
                return null;
        }
    }

    void J(Fragment fragment, Bundle bundle, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).J(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void J0(Fragment fragment) {
        if (this.f319k.get(fragment.f225i) != null) {
            return;
        }
        this.f319k.put(fragment.f225i, fragment);
        if (fragment.F) {
            if (fragment.E) {
                m(fragment);
            } else {
                a1(fragment);
            }
            fragment.F = false;
        }
        if (L) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void K(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).K(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void L(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).L(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void L0(Fragment fragment) {
        if (this.f319k.get(fragment.f225i) == null) {
            return;
        }
        if (L) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f319k.values()) {
            if (fragment2 != null && fragment.f225i.equals(fragment2.f228l)) {
                fragment2.f227k = fragment;
                fragment2.f228l = null;
            }
        }
        this.f319k.put(fragment.f225i, null);
        a1(fragment);
        String str = fragment.f228l;
        if (str != null) {
            fragment.f227k = this.f319k.get(str);
        }
        fragment.N();
    }

    void M(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).M(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void N(Fragment fragment, Context context, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).N(fragment, context, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void O(Fragment fragment, Bundle bundle, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).O(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void O0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f319k.containsKey(fragment.f225i)) {
            if (L) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f328t + "since it is not added to " + this);
                return;
            }
            return;
        }
        int r02 = this.f328t;
        if (fragment.f232p) {
            r02 = fragment.Q() ? Math.min(r02, 1) : Math.min(r02, 0);
        }
        R0(fragment, r02, fragment.A(), fragment.B(), false);
        if (fragment.K != null) {
            Fragment r03 = r0(fragment);
            if (r03 != null) {
                View view = r03.K;
                ViewGroup viewGroup = fragment.J;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.K);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.K, indexOfChild);
                }
            }
            if (fragment.Q && fragment.J != null) {
                float f5 = fragment.S;
                if (f5 > 0.0f) {
                    fragment.K.setAlpha(f5);
                }
                fragment.S = 0.0f;
                fragment.Q = false;
                g I0 = I0(fragment, fragment.A(), true, fragment.B());
                if (I0 != null) {
                    Animation animation = I0.f350a;
                    if (animation != null) {
                        fragment.K.startAnimation(animation);
                    } else {
                        I0.f351b.setTarget(fragment.K);
                        I0.f351b.start();
                    }
                }
            }
        }
        if (fragment.R) {
            w(fragment);
        }
    }

    void P(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).P(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void P0(int r32, boolean z4) {
        androidx.fragment.app.h hVar;
        if (this.f329u == null && r32 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || r32 != this.f328t) {
            this.f328t = r32;
            int size = this.f318j.size();
            for (int r02 = 0; r02 < size; r02++) {
                O0(this.f318j.get(r02));
            }
            for (Fragment fragment : this.f319k.values()) {
                if (fragment != null && (fragment.f232p || fragment.D)) {
                    if (!fragment.Q) {
                        O0(fragment);
                    }
                }
            }
            m1();
            if (this.f333y && (hVar = this.f329u) != null && this.f328t == 4) {
                hVar.s();
                this.f333y = false;
            }
        }
    }

    void Q(Fragment fragment, Bundle bundle, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).Q(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    void Q0(Fragment fragment) {
        R0(fragment, this.f328t, 0, 0, false);
    }

    void R(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).R(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 != 3) goto L265;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void R0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.R0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void S(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).S(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    public void S0() {
        this.f334z = false;
        this.A = false;
        int size = this.f318j.size();
        for (int r02 = 0; r02 < size; r02++) {
            Fragment fragment = this.f318j.get(r02);
            if (fragment != null) {
                fragment.U();
            }
        }
    }

    void T(Fragment fragment, View view, Bundle bundle, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).T(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    public void T0(Fragment fragment) {
        if (fragment.M) {
            if (this.f316h) {
                this.C = true;
            } else {
                fragment.M = false;
                R0(fragment, this.f328t, 0, 0, false);
            }
        }
    }

    void U(Fragment fragment, boolean z4) {
        Fragment fragment2 = this.f331w;
        if (fragment2 != null) {
            androidx.fragment.app.i w4 = fragment2.w();
            if (w4 instanceof j) {
                ((j) w4).U(fragment, true);
            }
        }
        Iterator<i> it = this.f327s.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z4 || next.f358b) {
                i.a aVar = next.f357a;
                throw null;
            }
        }
    }

    public boolean V(MenuItem menuItem) {
        if (this.f328t < 1) {
            return false;
        }
        for (int r02 = 0; r02 < this.f318j.size(); r02++) {
            Fragment fragment = this.f318j.get(r02);
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean V0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int r9, int r10) {
        int r8;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f320l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && r9 < 0 && (r10 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f320l.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || r9 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f320l.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (r9 >= 0 && r9 == aVar.f268u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((r10 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f320l.get(size2);
                        if (str == null || !str.equals(aVar2.o())) {
                            if (r9 < 0 || r9 != aVar2.f268u) {
                                break;
                            }
                        }
                    }
                }
                r8 = size2;
            } else {
                r8 = -1;
            }
            if (r8 == this.f320l.size() - 1) {
                return false;
            }
            for (int size3 = this.f320l.size() - 1; size3 > r8; size3--) {
                arrayList.add(this.f320l.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W(Menu menu) {
        if (this.f328t < 1) {
            return;
        }
        for (int r02 = 0; r02 < this.f318j.size(); r02++) {
            Fragment fragment = this.f318j.get(r02);
            if (fragment != null) {
                fragment.Q0(menu);
            }
        }
    }

    public void X0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f238v != this) {
            n1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f225i);
    }

    public void Y() {
        e0(3);
    }

    public void Y0(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f237u);
        }
        boolean z4 = !fragment.Q();
        if (!fragment.D || z4) {
            synchronized (this.f318j) {
                this.f318j.remove(fragment);
            }
            if (E0(fragment)) {
                this.f333y = true;
            }
            fragment.f231o = false;
            fragment.f232p = true;
        }
    }

    public void Z(boolean z4) {
        for (int size = this.f318j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f318j.get(size);
            if (fragment != null) {
                fragment.S0(z4);
            }
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    public boolean a0(Menu menu) {
        if (this.f328t < 1) {
            return false;
        }
        boolean z4 = false;
        for (int r12 = 0; r12 < this.f318j.size(); r12++) {
            Fragment fragment = this.f318j.get(r12);
            if (fragment != null && fragment.T0(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    void a1(Fragment fragment) {
        if (H0()) {
            if (L) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.J.k(fragment) && L) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f319k.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f319k.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.f(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f318j.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int r12 = 0; r12 < size5; r12++) {
                Fragment fragment2 = this.f318j.get(r12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r12);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f321m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int r13 = 0; r13 < size4; r13++) {
                Fragment fragment3 = this.f321m.get(r13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r13);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f320l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int r14 = 0; r14 < size3; r14++) {
                androidx.fragment.app.a aVar = this.f320l.get(r14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r14);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f324p;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int r02 = 0; r02 < size2; r02++) {
                    Object obj = (androidx.fragment.app.a) this.f324p.get(r02);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(r02);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.f325q;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f325q.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f315g;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int r8 = 0; r8 < size; r8++) {
                Object obj2 = (k) this.f315g.get(r8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r8);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f329u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f330v);
        if (this.f331w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f331w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f328t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f334z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.B);
        if (this.f333y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f333y);
        }
    }

    void b0() {
        p1();
        X(this.f332x);
    }

    void b1() {
        if (this.f326r != null) {
            for (int r02 = 0; r02 < this.f326r.size(); r02++) {
                this.f326r.get(r02).a();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public boolean c() {
        boolean l02 = l0();
        s0();
        return l02;
    }

    public void c0() {
        this.f334z = false;
        this.A = false;
        e0(4);
    }

    void c1(Parcelable parcelable) {
        androidx.fragment.app.m mVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f367e == null) {
            return;
        }
        for (Fragment fragment : this.J.h()) {
            if (L) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.m> it = kVar.f367e.iterator();
            while (true) {
                if (it.hasNext()) {
                    mVar = it.next();
                    if (mVar.f380f.equals(fragment.f225i)) {
                        break;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar == null) {
                if (L) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f367e);
                }
                R0(fragment, 1, 0, 0, false);
                fragment.f232p = true;
                R0(fragment, 0, 0, 0, false);
            } else {
                mVar.f392r = fragment;
                fragment.f223g = null;
                fragment.f237u = 0;
                fragment.f234r = false;
                fragment.f231o = false;
                Fragment fragment2 = fragment.f227k;
                fragment.f228l = fragment2 != null ? fragment2.f225i : null;
                fragment.f227k = null;
                Bundle bundle = mVar.f391q;
                if (bundle != null) {
                    bundle.setClassLoader(this.f329u.f().getClassLoader());
                    fragment.f223g = mVar.f391q.getSparseParcelableArray("android:view_state");
                    fragment.f222f = mVar.f391q;
                }
            }
        }
        this.f319k.clear();
        Iterator<androidx.fragment.app.m> it2 = kVar.f367e.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.m next = it2.next();
            if (next != null) {
                Fragment a5 = next.a(this.f329u.f().getClassLoader(), e());
                a5.f238v = this;
                if (L) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a5.f225i + "): " + a5);
                }
                this.f319k.put(a5.f225i, a5);
                next.f392r = null;
            }
        }
        this.f318j.clear();
        ArrayList<String> arrayList = kVar.f368f;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.f319k.get(next2);
                if (fragment3 == null) {
                    n1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                }
                fragment3.f231o = true;
                if (L) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.f318j.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f318j) {
                    this.f318j.add(fragment3);
                }
            }
        }
        if (kVar.f369g != null) {
            this.f320l = new ArrayList<>(kVar.f369g.length);
            int r02 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.f369g;
                if (r02 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a6 = bVarArr[r02].a(this);
                if (L) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + r02 + " (index " + a6.f268u + "): " + a6);
                    PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
                    a6.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f320l.add(a6);
                int r22 = a6.f268u;
                if (r22 >= 0) {
                    i1(r22, a6);
                }
                r02++;
            }
        } else {
            this.f320l = null;
        }
        String str = kVar.f370h;
        if (str != null) {
            Fragment fragment4 = this.f319k.get(str);
            this.f332x = fragment4;
            X(fragment4);
        }
        this.f317i = kVar.f371i;
    }

    @Override // androidx.fragment.app.i
    public Fragment d(String str) {
        if (str != null) {
            for (int size = this.f318j.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f318j.get(size);
                if (fragment != null && str.equals(fragment.B)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f319k.values()) {
            if (fragment2 != null && str.equals(fragment2.B)) {
                return fragment2;
            }
        }
        return null;
    }

    public void d0() {
        this.f334z = false;
        this.A = false;
        e0(3);
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g e() {
        if (super.e() == androidx.fragment.app.i.f313f) {
            Fragment fragment = this.f331w;
            if (fragment != null) {
                return fragment.f238v.e();
            }
            i(new f());
        }
        return super.e();
    }

    Parcelable e1() {
        ArrayList<String> arrayList;
        int size;
        s0();
        h0();
        l0();
        this.f334z = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f319k.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.m> arrayList2 = new ArrayList<>(this.f319k.size());
        boolean z4 = false;
        for (Fragment fragment : this.f319k.values()) {
            if (fragment != null) {
                if (fragment.f238v != this) {
                    n1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                androidx.fragment.app.m mVar = new androidx.fragment.app.m(fragment);
                arrayList2.add(mVar);
                if (fragment.f221e <= 0 || mVar.f391q != null) {
                    mVar.f391q = fragment.f222f;
                } else {
                    mVar.f391q = f1(fragment);
                    String str = fragment.f228l;
                    if (str != null) {
                        Fragment fragment2 = this.f319k.get(str);
                        if (fragment2 == null) {
                            n1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f228l));
                        }
                        if (mVar.f391q == null) {
                            mVar.f391q = new Bundle();
                        }
                        X0(mVar.f391q, "android:target_state", fragment2);
                        int r8 = fragment.f229m;
                        if (r8 != 0) {
                            mVar.f391q.putInt("android:target_req_state", r8);
                        }
                    }
                }
                if (L) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f391q);
                }
                z4 = true;
            }
        }
        if (!z4) {
            if (L) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f318j.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f318j.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f225i);
                if (next.f238v != this) {
                    n1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (L) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f225i + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f320l;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int r4 = 0; r4 < size; r4++) {
                bVarArr[r4] = new androidx.fragment.app.b(this.f320l.get(r4));
                if (L) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + r4 + ": " + this.f320l.get(r4));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f367e = arrayList2;
        kVar.f368f = arrayList;
        kVar.f369g = bVarArr;
        Fragment fragment3 = this.f332x;
        if (fragment3 != null) {
            kVar.f370h = fragment3.f225i;
        }
        kVar.f371i = this.f317i;
        return kVar;
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> f() {
        List<Fragment> list;
        if (this.f318j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f318j) {
            list = (List) this.f318j.clone();
        }
        return list;
    }

    public void f0() {
        this.A = true;
        e0(2);
    }

    Bundle f1(Fragment fragment) {
        if (this.G == null) {
            this.G = new Bundle();
        }
        fragment.W0(this.G);
        Q(fragment, this.G, false);
        Bundle bundle = null;
        if (!this.G.isEmpty()) {
            Bundle bundle2 = this.G;
            this.G = null;
            bundle = bundle2;
        }
        if (fragment.K != null) {
            g1(fragment);
        }
        if (fragment.f223g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f223g);
        }
        if (!fragment.N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.N);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public void g(int r32, int r4) {
        if (r32 >= 0) {
            i0(new l(null, r32, r4), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + r32);
    }

    void g0() {
        if (this.C) {
            this.C = false;
            m1();
        }
    }

    void g1(Fragment fragment) {
        if (fragment.L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.H;
        if (sparseArray == null) {
            this.H = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.L.saveHierarchyState(this.H);
        if (this.H.size() > 0) {
            fragment.f223g = this.H;
            this.H = null;
        }
    }

    @Override // androidx.fragment.app.i
    public boolean h() {
        t();
        return U0(null, -1, 0);
    }

    void h1() {
        synchronized (this) {
            ArrayList<m> arrayList = this.I;
            boolean z4 = false;
            boolean z5 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f315g;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z4 = true;
            }
            if (z5 || z4) {
                this.f329u.h().removeCallbacks(this.K);
                this.f329u.h().post(this.K);
                p1();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i0(androidx.fragment.app.j.k r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.t()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.B     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            androidx.fragment.app.h r0 = r1.f329u     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<androidx.fragment.app.j$k> r3 = r1.f315g     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f315g = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<androidx.fragment.app.j$k> r3 = r1.f315g     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.h1()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.i0(androidx.fragment.app.j$k, boolean):void");
    }

    public void i1(int r5, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.f324p == null) {
                this.f324p = new ArrayList<>();
            }
            int size = this.f324p.size();
            if (r5 < size) {
                if (L) {
                    Log.v("FragmentManager", "Setting back stack index " + r5 + " to " + aVar);
                }
                this.f324p.set(r5, aVar);
            } else {
                while (size < r5) {
                    this.f324p.add(null);
                    if (this.f325q == null) {
                        this.f325q = new ArrayList<>();
                    }
                    if (L) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f325q.add(Integer.valueOf(size));
                    size++;
                }
                if (L) {
                    Log.v("FragmentManager", "Adding back stack index " + r5 + " with " + aVar);
                }
                this.f324p.add(aVar);
            }
        }
    }

    public void j1(Fragment fragment, d.b bVar) {
        if (this.f319k.get(fragment.f225i) == fragment && (fragment.f239w == null || fragment.w() == this)) {
            fragment.V = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void k(androidx.fragment.app.a aVar) {
        if (this.f320l == null) {
            this.f320l = new ArrayList<>();
        }
        this.f320l.add(aVar);
    }

    void k0(Fragment fragment) {
        if (!fragment.f233q || fragment.f236t) {
            return;
        }
        fragment.I0(fragment.M0(fragment.f222f), null, fragment.f222f);
        View view = fragment.K;
        if (view == null) {
            fragment.L = null;
            return;
        }
        fragment.L = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.C) {
            fragment.K.setVisibility(8);
        }
        fragment.A0(fragment.K, fragment.f222f);
        T(fragment, fragment.K, fragment.f222f, false);
    }

    public void k1(Fragment fragment) {
        if (fragment == null || (this.f319k.get(fragment.f225i) == fragment && (fragment.f239w == null || fragment.w() == this))) {
            Fragment fragment2 = this.f332x;
            this.f332x = fragment;
            X(fragment2);
            X(this.f332x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void l(Fragment fragment, boolean z4) {
        if (L) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        J0(fragment);
        if (fragment.D) {
            return;
        }
        if (this.f318j.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f318j) {
            this.f318j.add(fragment);
        }
        fragment.f231o = true;
        fragment.f232p = false;
        if (fragment.K == null) {
            fragment.R = false;
        }
        if (E0(fragment)) {
            this.f333y = true;
        }
        if (z4) {
            Q0(fragment);
        }
    }

    public boolean l0() {
        j0(true);
        boolean z4 = false;
        while (u0(this.D, this.E)) {
            this.f316h = true;
            try {
                Z0(this.D, this.E);
                u();
                z4 = true;
            } catch (Throwable th) {
                u();
                throw th;
            }
        }
        p1();
        g0();
        r();
        return z4;
    }

    public void l1(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            fragment.R = !fragment.R;
        }
    }

    void m(Fragment fragment) {
        if (H0()) {
            if (L) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.J.d(fragment) && L) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    void m1() {
        for (Fragment fragment : this.f319k.values()) {
            if (fragment != null) {
                T0(fragment);
            }
        }
    }

    public int n(androidx.fragment.app.a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f325q;
            if (arrayList != null && arrayList.size() > 0) {
                int intValue = this.f325q.remove(r0.size() - 1).intValue();
                if (L) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + aVar);
                }
                this.f324p.set(intValue, aVar);
                return intValue;
            }
            if (this.f324p == null) {
                this.f324p = new ArrayList<>();
            }
            int size = this.f324p.size();
            if (L) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f324p.add(aVar);
            return size;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0004j.f359a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment p02 = resourceId != -1 ? p0(resourceId) : null;
        if (p02 == null && string != null) {
            p02 = d(string);
        }
        if (p02 == null && id != -1) {
            p02 = p0(id);
        }
        if (L) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + p02);
        }
        if (p02 == null) {
            p02 = e().a(context.getClassLoader(), str2);
            p02.f233q = true;
            p02.f242z = resourceId != 0 ? resourceId : id;
            p02.A = id;
            p02.B = string;
            p02.f234r = true;
            p02.f238v = this;
            androidx.fragment.app.h hVar = this.f329u;
            p02.f239w = hVar;
            p02.n0(hVar.f(), attributeSet, p02.f222f);
            l(p02, true);
        } else {
            if (p02.f234r) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            p02.f234r = true;
            androidx.fragment.app.h hVar2 = this.f329u;
            p02.f239w = hVar2;
            p02.n0(hVar2.f(), attributeSet, p02.f222f);
        }
        Fragment fragment = p02;
        if (this.f328t >= 1 || !fragment.f233q) {
            Q0(fragment);
        } else {
            R0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.K.getTag() == null) {
                fragment.K.setTag(string);
            }
            return fragment.K;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.f329u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f329u = hVar;
        this.f330v = eVar;
        this.f331w = fragment;
        if (fragment != null) {
            p1();
        }
        if (hVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) hVar;
            OnBackPressedDispatcher i4 = cVar.i();
            this.f322n = i4;
            androidx.lifecycle.g gVar = cVar;
            if (fragment != null) {
                gVar = fragment;
            }
            i4.a(gVar, this.f323o);
        }
        this.J = fragment != null ? fragment.f238v.w0(fragment) : hVar instanceof androidx.lifecycle.s ? androidx.fragment.app.l.g(((androidx.lifecycle.s) hVar).g()) : new androidx.fragment.app.l(false);
    }

    public Fragment p0(int r4) {
        for (int size = this.f318j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f318j.get(size);
            if (fragment != null && fragment.f242z == r4) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f319k.values()) {
            if (fragment2 != null && fragment2.f242z == r4) {
                return fragment2;
            }
        }
        return null;
    }

    public void q(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            if (fragment.f231o) {
                return;
            }
            if (this.f318j.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (L) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f318j) {
                this.f318j.add(fragment);
            }
            fragment.f231o = true;
            if (E0(fragment)) {
                this.f333y = true;
            }
        }
    }

    public Fragment q0(String str) {
        Fragment k4;
        for (Fragment fragment : this.f319k.values()) {
            if (fragment != null && (k4 = fragment.k(str)) != null) {
                return k4;
            }
        }
        return null;
    }

    boolean s() {
        boolean z4 = false;
        for (Fragment fragment : this.f319k.values()) {
            if (fragment != null) {
                z4 = E0(fragment);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public void t0(int r4) {
        synchronized (this) {
            this.f324p.set(r4, null);
            if (this.f325q == null) {
                this.f325q = new ArrayList<>();
            }
            if (L) {
                Log.v("FragmentManager", "Freeing back stack index " + r4);
            }
            this.f325q.add(Integer.valueOf(r4));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f331w;
        if (obj == null) {
            obj = this.f329u;
        }
        j.b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    void v(androidx.fragment.app.a aVar, boolean z4, boolean z5, boolean z6) {
        if (z4) {
            aVar.m(z6);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z4));
        if (z5) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z6) {
            P0(this.f328t, true);
        }
        for (Fragment fragment : this.f319k.values()) {
            if (fragment != null && fragment.K != null && fragment.Q && aVar.p(fragment.A)) {
                float f5 = fragment.S;
                if (f5 > 0.0f) {
                    fragment.K.setAlpha(f5);
                }
                if (z6) {
                    fragment.S = 0.0f;
                } else {
                    fragment.S = -1.0f;
                    fragment.Q = false;
                }
            }
        }
    }

    public int v0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f320l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void w(Fragment fragment) {
        Animator animator;
        if (fragment.K != null) {
            g I0 = I0(fragment, fragment.A(), !fragment.C, fragment.B());
            if (I0 == null || (animator = I0.f351b) == null) {
                if (I0 != null) {
                    fragment.K.startAnimation(I0.f350a);
                    I0.f350a.start();
                }
                fragment.K.setVisibility((!fragment.C || fragment.P()) ? 0 : 8);
                if (fragment.P()) {
                    fragment.i1(false);
                }
            } else {
                animator.setTarget(fragment.K);
                if (!fragment.C) {
                    fragment.K.setVisibility(0);
                } else if (fragment.P()) {
                    fragment.i1(false);
                } else {
                    ViewGroup viewGroup = fragment.J;
                    View view = fragment.K;
                    viewGroup.startViewTransition(view);
                    I0.f351b.addListener(new e(viewGroup, view, fragment));
                }
                I0.f351b.start();
            }
        }
        if (fragment.f231o && E0(fragment)) {
            this.f333y = true;
        }
        fragment.R = false;
        fragment.l0(fragment.C);
    }

    androidx.fragment.app.l w0(Fragment fragment) {
        return this.J.f(fragment);
    }

    public void x(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.D) {
            return;
        }
        fragment.D = true;
        if (fragment.f231o) {
            if (L) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f318j) {
                this.f318j.remove(fragment);
            }
            if (E0(fragment)) {
                this.f333y = true;
            }
            fragment.f231o = false;
        }
    }

    public Fragment x0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f319k.get(string);
        if (fragment == null) {
            n1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void y() {
        this.f334z = false;
        this.A = false;
        e0(2);
    }

    LayoutInflater.Factory2 y0() {
        return this;
    }

    public void z(Configuration configuration) {
        for (int r02 = 0; r02 < this.f318j.size(); r02++) {
            Fragment fragment = this.f318j.get(r02);
            if (fragment != null) {
                fragment.E0(configuration);
            }
        }
    }

    public Fragment z0() {
        return this.f332x;
    }
}
