package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f419a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    private static final q f420b;

    /* renamed from: c, reason: collision with root package name */
    private static final q f421c;

    static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f422e;

        a(ArrayList arrayList) {
            this.f422e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.A(this.f422e, 4);
        }
    }

    static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f423e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q f424f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f425g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Fragment f426h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f427i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ArrayList f428j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ArrayList f429k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f430l;

        b(Object obj, q qVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f423e = obj;
            this.f424f = qVar;
            this.f425g = view;
            this.f426h = fragment;
            this.f427i = arrayList;
            this.f428j = arrayList2;
            this.f429k = arrayList3;
            this.f430l = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f423e;
            if (obj != null) {
                this.f424f.p(obj, this.f425g);
                this.f428j.addAll(o.k(this.f424f, this.f423e, this.f426h, this.f427i, this.f425g));
            }
            if (this.f429k != null) {
                if (this.f430l != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f425g);
                    this.f424f.q(this.f430l, this.f429k, arrayList);
                }
                this.f429k.clear();
                this.f429k.add(this.f425g);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f431e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f432f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f433g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e.a f434h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ View f435i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ q f436j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Rect f437k;

        c(Fragment fragment, Fragment fragment2, boolean z4, e.a aVar, View view, q qVar, Rect rect) {
            this.f431e = fragment;
            this.f432f = fragment2;
            this.f433g = z4;
            this.f434h = aVar;
            this.f435i = view;
            this.f436j = qVar;
            this.f437k = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.f(this.f431e, this.f432f, this.f433g, this.f434h, false);
            View view = this.f435i;
            if (view != null) {
                this.f436j.k(view, this.f437k);
            }
        }
    }

    static class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f438e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.a f439f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f440g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f441h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f442i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f443j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Fragment f444k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Fragment f445l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f446m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ArrayList f447n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f448o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Rect f449p;

        d(q qVar, e.a aVar, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z4, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f438e = qVar;
            this.f439f = aVar;
            this.f440g = obj;
            this.f441h = eVar;
            this.f442i = arrayList;
            this.f443j = view;
            this.f444k = fragment;
            this.f445l = fragment2;
            this.f446m = z4;
            this.f447n = arrayList2;
            this.f448o = obj2;
            this.f449p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.a<String, View> h5 = o.h(this.f438e, this.f439f, this.f440g, this.f441h);
            if (h5 != null) {
                this.f442i.addAll(h5.values());
                this.f442i.add(this.f443j);
            }
            o.f(this.f444k, this.f445l, this.f446m, h5, false);
            Object obj = this.f440g;
            if (obj != null) {
                this.f438e.z(obj, this.f447n, this.f442i);
                View s4 = o.s(h5, this.f441h, this.f448o, this.f446m);
                if (s4 != null) {
                    this.f438e.k(s4, this.f449p);
                }
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f450a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f451b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f452c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f453d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f454e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f455f;

        e() {
        }
    }

    static {
        f420b = Build.VERSION.SDK_INT >= 21 ? new p() : null;
        f421c = w();
    }

    static void A(ArrayList<View> arrayList, int r32) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(r32);
        }
    }

    static void B(j jVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r10, int r11, boolean z4) {
        if (jVar.f328t < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int r12 = r10; r12 < r11; r12++) {
            androidx.fragment.app.a aVar = arrayList.get(r12);
            if (arrayList2.get(r12).booleanValue()) {
                e(aVar, sparseArray, z4);
            } else {
                c(aVar, sparseArray, z4);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(jVar.f329u.f());
            int size = sparseArray.size();
            for (int r32 = 0; r32 < size; r32++) {
                int keyAt = sparseArray.keyAt(r32);
                e.a<String, String> d5 = d(keyAt, arrayList, arrayList2, r10, r11);
                e eVar = (e) sparseArray.valueAt(r32);
                if (z4) {
                    o(jVar, keyAt, eVar, view, d5);
                } else {
                    n(jVar, keyAt, eVar, view, d5);
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, e.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l4 = aVar.l(size);
            if (collection.contains(k.e.f(l4))) {
                arrayList.add(l4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (r10.f231o != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0090, code lost:
    
        if (r10.C == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r16, androidx.fragment.app.n.a r17, android.util.SparseArray<androidx.fragment.app.o.e> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.b(androidx.fragment.app.a, androidx.fragment.app.n$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z4) {
        int size = aVar.f393a.size();
        for (int r22 = 0; r22 < size; r22++) {
            b(aVar, aVar.f393a.get(r22), sparseArray, false, z4);
        }
    }

    private static e.a<String, String> d(int r9, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int r12, int r13) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        e.a<String, String> aVar = new e.a<>();
        for (int r132 = r13 - 1; r132 >= r12; r132--) {
            androidx.fragment.app.a aVar2 = arrayList.get(r132);
            if (aVar2.p(r9)) {
                boolean booleanValue = arrayList2.get(r132).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f407o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f407o;
                        arrayList4 = aVar2.f408p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f407o;
                        arrayList3 = aVar2.f408p;
                        arrayList4 = arrayList6;
                    }
                    for (int r4 = 0; r4 < size; r4++) {
                        String str = arrayList4.get(r4);
                        String str2 = arrayList3.get(r4);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<e> sparseArray, boolean z4) {
        if (aVar.f266s.f330v.d()) {
            for (int size = aVar.f393a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f393a.get(size), sparseArray, true, z4);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z4, e.a<String, View> aVar, boolean z5) {
        if (z4) {
            fragment2.t();
        } else {
            fragment.t();
        }
    }

    private static boolean g(q qVar, List<Object> list) {
        int size = list.size();
        for (int r22 = 0; r22 < size; r22++) {
            if (!qVar.e(list.get(r22))) {
                return false;
            }
        }
        return true;
    }

    static e.a<String, View> h(q qVar, e.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        Fragment fragment = eVar.f450a;
        View L = fragment.L();
        if (aVar.isEmpty() || obj == null || L == null) {
            aVar.clear();
            return null;
        }
        e.a<String, View> aVar2 = new e.a<>();
        qVar.j(aVar2, L);
        androidx.fragment.app.a aVar3 = eVar.f452c;
        if (eVar.f451b) {
            fragment.v();
            arrayList = aVar3.f407o;
        } else {
            fragment.t();
            arrayList = aVar3.f408p;
        }
        if (arrayList != null) {
            aVar2.n(arrayList);
            aVar2.n(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static e.a<String, View> i(q qVar, e.a<String, String> aVar, Object obj, e eVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f453d;
        e.a<String, View> aVar2 = new e.a<>();
        qVar.j(aVar2, fragment.c1());
        androidx.fragment.app.a aVar3 = eVar.f455f;
        if (eVar.f454e) {
            fragment.t();
            arrayList = aVar3.f408p;
        } else {
            fragment.v();
            arrayList = aVar3.f407o;
        }
        aVar2.n(arrayList);
        aVar.n(aVar2.keySet());
        return aVar2;
    }

    private static q j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object u4 = fragment.u();
            if (u4 != null) {
                arrayList.add(u4);
            }
            Object G = fragment.G();
            if (G != null) {
                arrayList.add(G);
            }
            Object I = fragment.I();
            if (I != null) {
                arrayList.add(I);
            }
        }
        if (fragment2 != null) {
            Object s4 = fragment2.s();
            if (s4 != null) {
                arrayList.add(s4);
            }
            Object D = fragment2.D();
            if (D != null) {
                arrayList.add(D);
            }
            Object H = fragment2.H();
            if (H != null) {
                arrayList.add(H);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f420b;
        if (qVar != null && g(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f421c;
        if (qVar2 != null && g(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View L = fragment.L();
        if (L != null) {
            qVar.f(arrayList2, L);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(q qVar, ViewGroup viewGroup, View view, e.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t4;
        e.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f450a;
        Fragment fragment2 = eVar.f453d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z4 = eVar.f451b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t4 = null;
        } else {
            t4 = t(qVar, fragment, fragment2, z4);
            aVar2 = aVar;
        }
        e.a<String, View> i4 = i(qVar, aVar2, t4, eVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i4.values());
            obj3 = t4;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z4, i4, true);
        if (obj3 != null) {
            rect = new Rect();
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, i4, eVar.f454e, eVar.f455f);
            if (obj != null) {
                qVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        k.d.a(viewGroup, new d(qVar, aVar, obj3, eVar, arrayList2, view, fragment, fragment2, z4, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(q qVar, ViewGroup viewGroup, View view, e.a<String, String> aVar, e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f450a;
        Fragment fragment2 = eVar.f453d;
        if (fragment != null) {
            fragment.c1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z4 = eVar.f451b;
        Object t4 = aVar.isEmpty() ? null : t(qVar, fragment, fragment2, z4);
        e.a<String, View> i4 = i(qVar, aVar, t4, eVar);
        e.a<String, View> h5 = h(qVar, aVar, t4, eVar);
        if (aVar.isEmpty()) {
            if (i4 != null) {
                i4.clear();
            }
            if (h5 != null) {
                h5.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i4, aVar.keySet());
            a(arrayList2, h5, aVar.values());
            obj3 = t4;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z4, i4, true);
        if (obj3 != null) {
            arrayList2.add(view);
            qVar.y(obj3, view, arrayList);
            z(qVar, obj3, obj2, i4, eVar.f454e, eVar.f455f);
            Rect rect2 = new Rect();
            View s4 = s(h5, eVar, obj, z4);
            if (s4 != null) {
                qVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s4;
        } else {
            view2 = null;
            rect = null;
        }
        k.d.a(viewGroup, new c(fragment, fragment2, z4, h5, view2, qVar, rect));
        return obj3;
    }

    private static void n(j jVar, int r20, e eVar, View view, e.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j4;
        Object obj;
        ViewGroup viewGroup = jVar.f330v.d() ? (ViewGroup) jVar.f330v.c(r20) : null;
        if (viewGroup == null || (j4 = j((fragment2 = eVar.f453d), (fragment = eVar.f450a))) == null) {
            return;
        }
        boolean z4 = eVar.f451b;
        boolean z5 = eVar.f454e;
        Object q4 = q(j4, fragment, z4);
        Object r4 = r(j4, fragment2, z5);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l4 = l(j4, viewGroup, view, aVar, eVar, arrayList, arrayList2, q4, r4);
        if (q4 == null && l4 == null) {
            obj = r4;
            if (obj == null) {
                return;
            }
        } else {
            obj = r4;
        }
        ArrayList<View> k4 = k(j4, obj, fragment2, arrayList, view);
        Object obj2 = (k4 == null || k4.isEmpty()) ? null : obj;
        j4.a(q4, view);
        Object u4 = u(j4, q4, obj2, l4, fragment, eVar.f451b);
        if (u4 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j4.t(u4, q4, arrayList3, obj2, k4, l4, arrayList2);
            y(j4, viewGroup, fragment, view, arrayList2, q4, arrayList3, obj2, k4);
            j4.w(viewGroup, arrayList2, aVar);
            j4.c(viewGroup, u4);
            j4.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(j jVar, int r18, e eVar, View view, e.a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        q j4;
        Object obj;
        ViewGroup viewGroup = jVar.f330v.d() ? (ViewGroup) jVar.f330v.c(r18) : null;
        if (viewGroup == null || (j4 = j((fragment2 = eVar.f453d), (fragment = eVar.f450a))) == null) {
            return;
        }
        boolean z4 = eVar.f451b;
        boolean z5 = eVar.f454e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q4 = q(j4, fragment, z4);
        Object r4 = r(j4, fragment2, z5);
        Object m4 = m(j4, viewGroup, view, aVar, eVar, arrayList2, arrayList, q4, r4);
        if (q4 == null && m4 == null) {
            obj = r4;
            if (obj == null) {
                return;
            }
        } else {
            obj = r4;
        }
        ArrayList<View> k4 = k(j4, obj, fragment2, arrayList2, view);
        ArrayList<View> k5 = k(j4, q4, fragment, arrayList, view);
        A(k5, 4);
        Object u4 = u(j4, q4, obj, m4, fragment, z4);
        if (u4 != null) {
            v(j4, obj, fragment2, k4);
            ArrayList<String> o4 = j4.o(arrayList);
            j4.t(u4, q4, k5, obj, k4, m4, arrayList);
            j4.c(viewGroup, u4);
            j4.x(viewGroup, arrayList2, arrayList, o4, aVar);
            A(k5, 0);
            j4.z(m4, arrayList2, arrayList);
        }
    }

    private static e p(e eVar, SparseArray<e> sparseArray, int r22) {
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        sparseArray.put(r22, eVar2);
        return eVar2;
    }

    private static Object q(q qVar, Fragment fragment, boolean z4) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z4 ? fragment.D() : fragment.s());
    }

    private static Object r(q qVar, Fragment fragment, boolean z4) {
        if (fragment == null) {
            return null;
        }
        return qVar.g(z4 ? fragment.G() : fragment.u());
    }

    static View s(e.a<String, View> aVar, e eVar, Object obj, boolean z4) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = eVar.f452c;
        if (obj == null || aVar == null || (arrayList = aVar2.f407o) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z4 ? aVar2.f407o : aVar2.f408p).get(0));
    }

    private static Object t(q qVar, Fragment fragment, Fragment fragment2, boolean z4) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return qVar.A(qVar.g(z4 ? fragment2.I() : fragment.H()));
    }

    private static Object u(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z4) {
        return (obj == null || obj2 == null || fragment == null) ? true : z4 ? fragment.n() : fragment.m() ? qVar.n(obj2, obj, obj3) : qVar.m(obj2, obj, obj3);
    }

    private static void v(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f231o && fragment.C && fragment.R) {
            fragment.i1(true);
            qVar.r(obj, fragment.L(), arrayList);
            k.d.a(fragment.J, new a(arrayList));
        }
    }

    private static q w() {
        try {
            return (q) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void x(e.a<String, String> aVar, e.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.l(size))) {
                aVar.j(size);
            }
        }
    }

    private static void y(q qVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        k.d.a(viewGroup, new b(obj, qVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(q qVar, Object obj, Object obj2, e.a<String, View> aVar, boolean z4, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f407o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z4 ? aVar2.f408p : aVar2.f407o).get(0));
        qVar.v(obj, view);
        if (obj2 != null) {
            qVar.v(obj2, view);
        }
    }
}
