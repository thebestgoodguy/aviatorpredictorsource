package io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.s;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.platform.n;
import io.flutter.view.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q2.k;

/* loaded from: classes.dex */
public class n implements h {

    /* renamed from: w, reason: collision with root package name */
    private static Class[] f4673w = {SurfaceView.class};

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.android.a f4675b;

    /* renamed from: c, reason: collision with root package name */
    private Context f4676c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.android.k f4677d;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.view.d f4678e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.plugin.editing.f f4679f;

    /* renamed from: g, reason: collision with root package name */
    private q2.k f4680g;

    /* renamed from: o, reason: collision with root package name */
    private int f4688o = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4689p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4690q = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4694u = false;

    /* renamed from: v, reason: collision with root package name */
    private final k.g f4695v = new a();

    /* renamed from: a, reason: collision with root package name */
    private final f f4674a = new f();

    /* renamed from: i, reason: collision with root package name */
    final HashMap<Integer, o> f4682i = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f4681h = new io.flutter.plugin.platform.a();

    /* renamed from: j, reason: collision with root package name */
    final HashMap<Context, View> f4683j = new HashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private final SparseArray<io.flutter.embedding.android.g> f4686m = new SparseArray<>();

    /* renamed from: r, reason: collision with root package name */
    private final HashSet<Integer> f4691r = new HashSet<>();

    /* renamed from: s, reason: collision with root package name */
    private final HashSet<Integer> f4692s = new HashSet<>();

    /* renamed from: n, reason: collision with root package name */
    private final SparseArray<g> f4687n = new SparseArray<>();

    /* renamed from: k, reason: collision with root package name */
    private final SparseArray<c> f4684k = new SparseArray<>();

    /* renamed from: l, reason: collision with root package name */
    private final SparseArray<i2.a> f4685l = new SparseArray<>();

    /* renamed from: t, reason: collision with root package name */
    private final s f4693t = s.a();

    class a implements k.g {
        a() {
        }

        private void m(int r5) {
            int r02 = Build.VERSION.SDK_INT;
            if (r02 >= r5) {
                return;
            }
            throw new IllegalStateException("Trying to use platform views with API " + r02 + ", required API level is: " + r5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(k.d dVar, View view, boolean z4) {
            if (z4) {
                n.this.f4680g.d(dVar.f7271a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(int r12, View view, boolean z4) {
            n nVar = n.this;
            if (z4) {
                nVar.f4680g.d(r12);
            } else if (nVar.f4679f != null) {
                n.this.f4679f.l(r12);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(o oVar, k.b bVar) {
            n.this.j0(oVar);
            bVar.a(new k.c(n.this.g0(oVar.d()), n.this.g0(oVar.c())));
        }

        @Override // q2.k.g
        public void a(int r4) {
            View f5;
            StringBuilder sb;
            String str;
            if (n.this.c(r4)) {
                f5 = n.this.f4682i.get(Integer.valueOf(r4)).e();
            } else {
                c cVar = (c) n.this.f4684k.get(r4);
                if (cVar == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb.append(str);
                    sb.append(r4);
                    e2.b.b("PlatformViewsController", sb.toString());
                }
                f5 = cVar.f();
            }
            if (f5 != null) {
                f5.clearFocus();
                return;
            }
            sb = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb.append(str);
            sb.append(r4);
            e2.b.b("PlatformViewsController", sb.toString());
        }

        @Override // q2.k.g
        public void b(boolean z4) {
            n.this.f4690q = z4;
        }

        @Override // q2.k.g
        public void c(int r22, double d5, double d6) {
            if (n.this.c(r22)) {
                return;
            }
            g gVar = (g) n.this.f4687n.get(r22);
            if (gVar == null) {
                e2.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + r22);
                return;
            }
            int i02 = n.this.i0(d5);
            int i03 = n.this.i0(d6);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gVar.getLayoutParams();
            layoutParams.topMargin = i02;
            layoutParams.leftMargin = i03;
            gVar.j(layoutParams);
        }

        @Override // q2.k.g
        public void d(int r4, int r5) {
            View f5;
            StringBuilder sb;
            String str;
            if (!n.k0(r5)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + r5 + "(view id: " + r4 + ")");
            }
            if (n.this.c(r4)) {
                f5 = n.this.f4682i.get(Integer.valueOf(r4)).e();
            } else {
                c cVar = (c) n.this.f4684k.get(r4);
                if (cVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb.append(str);
                    sb.append(r4);
                    e2.b.b("PlatformViewsController", sb.toString());
                }
                f5 = cVar.f();
            }
            if (f5 != null) {
                f5.setLayoutDirection(r5);
                return;
            }
            sb = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb.append(str);
            sb.append(r4);
            e2.b.b("PlatformViewsController", sb.toString());
        }

        @Override // q2.k.g
        public void e(k.f fVar) {
            int r02 = fVar.f7282a;
            float f5 = n.this.f4676c.getResources().getDisplayMetrics().density;
            if (n.this.c(r02)) {
                n.this.f4682i.get(Integer.valueOf(r02)).b(n.this.h0(f5, fVar, true));
                return;
            }
            c cVar = (c) n.this.f4684k.get(r02);
            if (cVar == null) {
                e2.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + r02);
                return;
            }
            View f6 = cVar.f();
            if (f6 != null) {
                f6.dispatchTouchEvent(n.this.h0(f5, fVar, false));
                return;
            }
            e2.b.b("PlatformViewsController", "Sending touch to a null view with id: " + r02);
        }

        @Override // q2.k.g
        public void f(int r4) {
            c cVar = (c) n.this.f4684k.get(r4);
            if (cVar == null) {
                e2.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + r4);
                return;
            }
            n.this.f4684k.remove(r4);
            try {
                cVar.d();
            } catch (RuntimeException e5) {
                e2.b.c("PlatformViewsController", "Disposing platform view threw an exception", e5);
            }
            if (n.this.c(r4)) {
                View e6 = n.this.f4682i.get(Integer.valueOf(r4)).e();
                if (e6 != null) {
                    n.this.f4683j.remove(e6.getContext());
                }
                n.this.f4682i.remove(Integer.valueOf(r4));
                return;
            }
            g gVar = (g) n.this.f4687n.get(r4);
            if (gVar != null) {
                gVar.removeAllViews();
                gVar.h();
                gVar.o();
                ViewGroup viewGroup = (ViewGroup) gVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(gVar);
                }
                n.this.f4687n.remove(r4);
                return;
            }
            i2.a aVar = (i2.a) n.this.f4685l.get(r4);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                n.this.f4685l.remove(r4);
            }
        }

        @Override // q2.k.g
        public long g(final k.d dVar) {
            g gVar;
            long j4;
            final int r02 = dVar.f7271a;
            if (n.this.f4687n.get(r02) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + r02);
            }
            if (!n.k0(dVar.f7277g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f7277g + "(view id: " + r02 + ")");
            }
            if (n.this.f4678e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + r02);
            }
            if (n.this.f4677d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + r02);
            }
            d a5 = n.this.f4674a.a(dVar.f7272b);
            if (a5 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f7272b);
            }
            Object a6 = dVar.f7278h != null ? a5.b().a(dVar.f7278h) : null;
            c a7 = a5.a(new MutableContextWrapper(n.this.f4676c), r02, a6);
            n.this.f4684k.put(r02, a7);
            View f5 = a7.f();
            if (f5 == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (f5.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            f5.setLayoutDirection(dVar.f7277g);
            int i02 = n.this.i0(dVar.f7273c);
            int i03 = n.this.i0(dVar.f7274d);
            boolean z4 = z2.h.f(f5, n.f4673w) || Build.VERSION.SDK_INT < 23;
            if (!n.this.f4694u && z4) {
                e2.b.d("PlatformViewsController", "Hosting view in a virtual display for platform view: " + r02);
                m(20);
                d.c a8 = n.this.f4678e.a();
                o a9 = o.a(n.this.f4676c, n.this.f4681h, a7, a8, i02, i03, dVar.f7271a, a6, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.l
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z5) {
                        n.a.this.n(dVar, view, z5);
                    }
                });
                if (a9 != null) {
                    if (n.this.f4677d != null) {
                        a9.f(n.this.f4677d);
                    }
                    n.this.f4682i.put(Integer.valueOf(dVar.f7271a), a9);
                    n.this.f4683j.put(f5.getContext(), f5);
                    return a8.a();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + dVar.f7272b + " with id: " + dVar.f7271a);
            }
            m(23);
            e2.b.d("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + r02);
            if (n.this.f4694u) {
                gVar = new g(n.this.f4676c);
                j4 = -1;
            } else {
                d.c a10 = n.this.f4678e.a();
                g gVar2 = new g(n.this.f4676c, a10);
                long a11 = a10.a();
                gVar = gVar2;
                j4 = a11;
            }
            gVar.m(n.this.f4675b);
            gVar.i(i02, i03);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i02, i03);
            int i04 = n.this.i0(dVar.f7275e);
            int i05 = n.this.i0(dVar.f7276f);
            layoutParams.topMargin = i04;
            layoutParams.leftMargin = i05;
            gVar.j(layoutParams);
            f5.setLayoutParams(new FrameLayout.LayoutParams(i02, i03));
            f5.setImportantForAccessibility(4);
            gVar.addView(f5);
            gVar.k(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.k
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z5) {
                    n.a.this.o(r02, view, z5);
                }
            });
            n.this.f4677d.addView(gVar);
            n.this.f4687n.append(r02, gVar);
            return j4;
        }

        @Override // q2.k.g
        public void h(k.e eVar, final k.b bVar) {
            int i02 = n.this.i0(eVar.f7280b);
            int i03 = n.this.i0(eVar.f7281c);
            int r5 = eVar.f7279a;
            if (n.this.c(r5)) {
                final o oVar = n.this.f4682i.get(Integer.valueOf(r5));
                n.this.S(oVar);
                oVar.i(i02, i03, new Runnable() { // from class: io.flutter.plugin.platform.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.this.p(oVar, bVar);
                    }
                });
                return;
            }
            c cVar = (c) n.this.f4684k.get(r5);
            g gVar = (g) n.this.f4687n.get(r5);
            if (cVar == null || gVar == null) {
                e2.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + r5);
                return;
            }
            if (i02 > gVar.e() || i03 > gVar.d()) {
                gVar.i(i02, i03);
            }
            ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
            layoutParams.width = i02;
            layoutParams.height = i03;
            gVar.setLayoutParams(layoutParams);
            View f5 = cVar.f();
            if (f5 != null) {
                ViewGroup.LayoutParams layoutParams2 = f5.getLayoutParams();
                layoutParams2.width = i02;
                layoutParams2.height = i03;
                f5.setLayoutParams(layoutParams2);
            }
            bVar.a(new k.c(n.this.g0(gVar.e()), n.this.g0(gVar.d())));
        }

        @Override // q2.k.g
        public void i(k.d dVar) {
            m(19);
            int r02 = dVar.f7271a;
            if (!n.k0(dVar.f7277g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f7277g + "(view id: " + r02 + ")");
            }
            d a5 = n.this.f4674a.a(dVar.f7272b);
            if (a5 == null) {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f7272b);
            }
            c a6 = a5.a(n.this.f4676c, r02, dVar.f7278h != null ? a5.b().a(dVar.f7278h) : null);
            a6.f().setLayoutDirection(dVar.f7277g);
            n.this.f4684k.put(r02, a6);
            e2.b.d("PlatformViewsController", "Using hybrid composition for platform view: " + r02);
        }
    }

    private void K() {
        while (this.f4684k.size() > 0) {
            this.f4695v.f(this.f4684k.keyAt(0));
        }
    }

    private void L(boolean z4) {
        for (int r12 = 0; r12 < this.f4686m.size(); r12++) {
            int keyAt = this.f4686m.keyAt(r12);
            io.flutter.embedding.android.g valueAt = this.f4686m.valueAt(r12);
            if (this.f4691r.contains(Integer.valueOf(keyAt))) {
                this.f4677d.m(valueAt);
                z4 &= valueAt.d();
            } else {
                if (!this.f4689p) {
                    valueAt.c();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int r13 = 0; r13 < this.f4685l.size(); r13++) {
            int keyAt2 = this.f4685l.keyAt(r13);
            i2.a aVar = this.f4685l.get(keyAt2);
            if (!this.f4692s.contains(Integer.valueOf(keyAt2)) || (!z4 && this.f4690q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    private float M() {
        return this.f4676c.getResources().getDisplayMetrics().density;
    }

    private void P() {
        if (!this.f4690q || this.f4689p) {
            return;
        }
        this.f4677d.p();
        this.f4689p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(int r12, View view, boolean z4) {
        if (z4) {
            this.f4680g.d(r12);
            return;
        }
        io.flutter.plugin.editing.f fVar = this.f4679f;
        if (fVar != null) {
            fVar.l(r12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        L(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(o oVar) {
        io.flutter.plugin.editing.f fVar = this.f4679f;
        if (fVar == null) {
            return;
        }
        fVar.u();
        oVar.g();
    }

    private static MotionEvent.PointerCoords a0(Object obj, float f5) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f5;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f5;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f5;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f5;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f5;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f5;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> b0(Object obj, float f5) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(a0(it.next(), f5));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties c0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> d0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c0(it.next()));
        }
        return arrayList;
    }

    private void e0() {
        if (this.f4677d == null) {
            e2.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int r02 = 0; r02 < this.f4686m.size(); r02++) {
            this.f4677d.removeView(this.f4686m.valueAt(r02));
        }
        this.f4686m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g0(double d5) {
        return (int) Math.round(d5 / M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0(double d5) {
        return (int) Math.round(d5 * M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(o oVar) {
        io.flutter.plugin.editing.f fVar = this.f4679f;
        if (fVar == null) {
            return;
        }
        fVar.G();
        oVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k0(int r12) {
        return r12 == 0 || r12 == 1;
    }

    public void A(io.flutter.plugin.editing.f fVar) {
        this.f4679f = fVar;
    }

    public void B(p2.a aVar) {
        this.f4675b = new io.flutter.embedding.android.a(aVar, true);
    }

    public void C(io.flutter.embedding.android.k kVar) {
        this.f4677d = kVar;
        for (int r02 = 0; r02 < this.f4687n.size(); r02++) {
            this.f4677d.addView(this.f4687n.valueAt(r02));
        }
        for (int r03 = 0; r03 < this.f4685l.size(); r03++) {
            this.f4677d.addView(this.f4685l.valueAt(r03));
        }
        for (int r4 = 0; r4 < this.f4684k.size(); r4++) {
            this.f4684k.valueAt(r4).a(this.f4677d);
        }
    }

    public boolean D(View view) {
        if (view == null || !this.f4683j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f4683j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public FlutterOverlaySurface E() {
        return F(new io.flutter.embedding.android.g(this.f4677d.getContext(), this.f4677d.getWidth(), this.f4677d.getHeight(), g.b.overlay));
    }

    public FlutterOverlaySurface F(io.flutter.embedding.android.g gVar) {
        int r02 = this.f4688o;
        this.f4688o = r02 + 1;
        this.f4686m.put(r02, gVar);
        return new FlutterOverlaySurface(r02, gVar.getSurface());
    }

    public void G() {
        for (int r02 = 0; r02 < this.f4686m.size(); r02++) {
            io.flutter.embedding.android.g valueAt = this.f4686m.valueAt(r02);
            valueAt.c();
            valueAt.f();
        }
    }

    public void H() {
        q2.k kVar = this.f4680g;
        if (kVar != null) {
            kVar.e(null);
        }
        G();
        this.f4680g = null;
        this.f4676c = null;
        this.f4678e = null;
    }

    public void I() {
        for (int r12 = 0; r12 < this.f4687n.size(); r12++) {
            this.f4677d.removeView(this.f4687n.valueAt(r12));
        }
        for (int r13 = 0; r13 < this.f4685l.size(); r13++) {
            this.f4677d.removeView(this.f4685l.valueAt(r13));
        }
        G();
        e0();
        this.f4677d = null;
        this.f4689p = false;
        for (int r02 = 0; r02 < this.f4684k.size(); r02++) {
            this.f4684k.valueAt(r02).b();
        }
    }

    public void J() {
        this.f4679f = null;
    }

    public e N() {
        return this.f4674a;
    }

    void O(final int r6) {
        c cVar = this.f4684k.get(r6);
        if (cVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f4685l.get(r6) != null) {
            return;
        }
        View f5 = cVar.f();
        if (f5 == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (f5.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f4676c;
        i2.a aVar = new i2.a(context, context.getResources().getDisplayMetrics().density, this.f4675b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z4) {
                n.this.Q(r6, view, z4);
            }
        });
        this.f4685l.put(r6, aVar);
        f5.setImportantForAccessibility(4);
        aVar.addView(f5);
        this.f4677d.addView(aVar);
    }

    public void T() {
    }

    public void U() {
        this.f4691r.clear();
        this.f4692s.clear();
    }

    public void V() {
        K();
    }

    public void W(int r32, int r4, int r5, int r6, int r7) {
        if (this.f4686m.get(r32) == null) {
            throw new IllegalStateException("The overlay surface (id:" + r32 + ") doesn't exist");
        }
        P();
        io.flutter.embedding.android.g gVar = this.f4686m.get(r32);
        if (gVar.getParent() == null) {
            this.f4677d.addView(gVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r6, r7);
        layoutParams.leftMargin = r4;
        layoutParams.topMargin = r5;
        gVar.setLayoutParams(layoutParams);
        gVar.setVisibility(0);
        gVar.bringToFront();
        this.f4691r.add(Integer.valueOf(r32));
    }

    public void X(int r8, int r9, int r10, int r11, int r12, int r13, int r14, FlutterMutatorsStack flutterMutatorsStack) {
        P();
        O(r8);
        i2.a aVar = this.f4685l.get(r8);
        aVar.a(flutterMutatorsStack, r9, r10, r11, r12);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r13, r14);
        View f5 = this.f4684k.get(r8).f();
        if (f5 != null) {
            f5.setLayoutParams(layoutParams);
            f5.bringToFront();
        }
        this.f4692s.add(Integer.valueOf(r8));
    }

    public void Y() {
        boolean z4 = false;
        if (this.f4689p && this.f4692s.isEmpty()) {
            this.f4689p = false;
            this.f4677d.B(new Runnable() { // from class: io.flutter.plugin.platform.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.R();
                }
            });
        } else {
            if (this.f4689p && this.f4677d.j()) {
                z4 = true;
            }
            L(z4);
        }
    }

    public void Z() {
        K();
    }

    @Override // io.flutter.plugin.platform.h
    public void a() {
        this.f4681h.b(null);
    }

    @Override // io.flutter.plugin.platform.h
    public void b(io.flutter.view.c cVar) {
        this.f4681h.b(cVar);
    }

    @Override // io.flutter.plugin.platform.h
    public boolean c(int r22) {
        return this.f4682i.containsKey(Integer.valueOf(r22));
    }

    @Override // io.flutter.plugin.platform.h
    public View d(int r22) {
        if (c(r22)) {
            return this.f4682i.get(Integer.valueOf(r22)).e();
        }
        c cVar = this.f4684k.get(r22);
        if (cVar == null) {
            return null;
        }
        return cVar.f();
    }

    public void f0(boolean z4) {
        this.f4694u = z4;
    }

    public MotionEvent h0(float f5, k.f fVar, boolean z4) {
        MotionEvent b5 = this.f4693t.b(s.a.c(fVar.f7297p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) d0(fVar.f7287f).toArray(new MotionEvent.PointerProperties[fVar.f7286e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) b0(fVar.f7288g, f5).toArray(new MotionEvent.PointerCoords[fVar.f7286e]);
        return (z4 || b5 == null) ? MotionEvent.obtain(fVar.f7283b.longValue(), fVar.f7284c.longValue(), fVar.f7285d, fVar.f7286e, pointerPropertiesArr, pointerCoordsArr, fVar.f7289h, fVar.f7290i, fVar.f7291j, fVar.f7292k, fVar.f7293l, fVar.f7294m, fVar.f7295n, fVar.f7296o) : MotionEvent.obtain(b5.getDownTime(), b5.getEventTime(), b5.getAction(), fVar.f7286e, pointerPropertiesArr, pointerCoordsArr, b5.getMetaState(), b5.getButtonState(), b5.getXPrecision(), b5.getYPrecision(), b5.getDeviceId(), b5.getEdgeFlags(), b5.getSource(), b5.getFlags());
    }

    public void z(Context context, io.flutter.view.d dVar, f2.a aVar) {
        if (this.f4676c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f4676c = context;
        this.f4678e = dVar;
        q2.k kVar = new q2.k(aVar);
        this.f4680g = kVar;
        kVar.e(this.f4695v);
    }
}
