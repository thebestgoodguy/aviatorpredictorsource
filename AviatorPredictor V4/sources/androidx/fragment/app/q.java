package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class q {

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f470e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f472g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ArrayList f473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f474i;

        a(int r22, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f470e = r22;
            this.f471f = arrayList;
            this.f472g = arrayList2;
            this.f473h = arrayList3;
            this.f474i = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int r02 = 0; r02 < this.f470e; r02++) {
                k.e.k((View) this.f471f.get(r02), (String) this.f472g.get(r02));
                k.e.k((View) this.f473h.get(r02), (String) this.f474i.get(r02));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f476e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f477f;

        b(ArrayList arrayList, Map map) {
            this.f476e = arrayList;
            this.f477f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f476e.size();
            for (int r12 = 0; r12 < size; r12++) {
                View view = (View) this.f476e.get(r12);
                String f5 = k.e.f(view);
                if (f5 != null) {
                    k.e.k(view, q.i(this.f477f, f5));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f479e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f480f;

        c(ArrayList arrayList, Map map) {
            this.f479e = arrayList;
            this.f480f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f479e.size();
            for (int r12 = 0; r12 < size; r12++) {
                View view = (View) this.f479e.get(r12);
                k.e.k(view, (String) this.f480f.get(k.e.f(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int r7 = size; r7 < list.size(); r7++) {
            View view2 = list.get(r7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int r32 = 0; r32 < childCount; r32++) {
                    View childAt = viewGroup.getChildAt(r32);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int r5) {
        for (int r12 = 0; r12 < r5; r12++) {
            if (list.get(r12) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z4 = view instanceof ViewGroup;
            View view2 = view;
            if (z4) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean a5 = k.f.a(viewGroup);
                view2 = viewGroup;
                if (!a5) {
                    int childCount = viewGroup.getChildCount();
                    for (int r12 = 0; r12 < childCount; r12++) {
                        f(arrayList, viewGroup.getChildAt(r12));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String f5 = k.e.f(view);
            if (f5 != null) {
                map.put(f5, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int r12 = 0; r12 < childCount; r12++) {
                    j(map, viewGroup.getChildAt(r12));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] r02 = new int[2];
        view.getLocationOnScreen(r02);
        rect.set(r02[0], r02[1], r02[0] + view.getWidth(), r02[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int r22 = 0; r22 < size; r22++) {
            View view = arrayList.get(r22);
            arrayList2.add(k.e.f(view));
            k.e.k(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        k.d.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        k.d.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int r12 = 0; r12 < size; r12++) {
            View view2 = arrayList.get(r12);
            String f5 = k.e.f(view2);
            arrayList4.add(f5);
            if (f5 != null) {
                k.e.k(view2, null);
                String str = map.get(f5);
                int r5 = 0;
                while (true) {
                    if (r5 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(r5))) {
                        k.e.k(arrayList2.get(r5), f5);
                        break;
                    }
                    r5++;
                }
            }
        }
        k.d.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
