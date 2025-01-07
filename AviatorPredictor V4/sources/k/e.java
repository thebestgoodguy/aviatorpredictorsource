package k;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<View, String> f5974b;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f5973a = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private static WeakHashMap<View, Object> f5975c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5976d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f5977e = {f.a.f3615a, f.a.f3616b, f.a.f3627m, f.a.f3638x, f.a.A, f.a.B, f.a.C, f.a.D, f.a.E, f.a.F, f.a.f3617c, f.a.f3618d, f.a.f3619e, f.a.f3620f, f.a.f3621g, f.a.f3622h, f.a.f3623i, f.a.f3624j, f.a.f3625k, f.a.f3626l, f.a.f3628n, f.a.f3629o, f.a.f3630p, f.a.f3631q, f.a.f3632r, f.a.f3633s, f.a.f3634t, f.a.f3635u, f.a.f3636v, f.a.f3637w, f.a.f3639y, f.a.f3640z};

    /* renamed from: f, reason: collision with root package name */
    private static final k.c f5978f = new a();

    /* renamed from: g, reason: collision with root package name */
    private static c f5979g = new c();

    class a implements k.c {
        a() {
        }
    }

    class b extends d<CharSequence> {
        b(int r12, Class cls, int r32, int r4) {
            super(r12, cls, r32, r4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k.e.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f5980e = new WeakHashMap<>();

        c() {
        }

        private void a(View view, boolean z4) {
            boolean z5 = view.getVisibility() == 0;
            if (z4 != z5) {
                e.h(view, z5 ? 16 : 32);
                this.f5980e.put(view, Boolean.valueOf(z5));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f5980e.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f5981a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f5982b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5983c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5984d;

        d(int r12, Class<T> cls, int r32, int r4) {
            this.f5981a = r12;
            this.f5982b = cls;
            this.f5984d = r32;
            this.f5983c = r4;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f5983c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t4 = (T) view.getTag(this.f5981a);
            if (this.f5982b.isInstance(t4)) {
                return t4;
            }
            return null;
        }
    }

    /* renamed from: k.e$e, reason: collision with other inner class name */
    public interface InterfaceC0063e {
        boolean a(View view, KeyEvent keyEvent);
    }

    static class f {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f5985d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f5986a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f5987b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f5988c = null;

        f() {
        }

        static f a(View view) {
            int r02 = f.a.I;
            f fVar = (f) view.getTag(r02);
            if (fVar != null) {
                return fVar;
            }
            f fVar2 = new f();
            view.setTag(r02, fVar2);
            return fVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f5986a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c5 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c5 != null) {
                            return c5;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f5987b == null) {
                this.f5987b = new SparseArray<>();
            }
            return this.f5987b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(f.a.J);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC0063e) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f5986a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f5985d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f5986a == null) {
                    this.f5986a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f5985d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f5986a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f5986a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c5 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c5 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c5));
                }
            }
            return c5 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f5988c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f5988c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d5 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d5.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d5.valueAt(indexOfKey);
                d5.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d5.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && e.g(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return f.a(view).b(view, keyEvent);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return f.a(view).f(keyEvent);
    }

    public static int c(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static CharSequence d(View view) {
        return i().d(view);
    }

    public static int e(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static String f(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f5974b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static boolean g(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    static void h(View view, int r5) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = d(view) != null && view.getVisibility() == 0;
            if (c(view) != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(r5);
                if (z4) {
                    obtain.getText().add(d(view));
                    l(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (r5 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(r5);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, r5);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e5);
                }
            }
        }
    }

    private static d<CharSequence> i() {
        return new b(f.a.G, CharSequence.class, 8, 28);
    }

    public static void j(View view, int r32) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 19) {
            if (r02 < 16) {
                return;
            }
            if (r32 == 4) {
                r32 = 2;
            }
        }
        view.setImportantForAccessibility(r32);
    }

    public static void k(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f5974b == null) {
            f5974b = new WeakHashMap<>();
        }
        f5974b.put(view, str);
    }

    private static void l(View view) {
        if (e(view) == 0) {
            j(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (e((View) parent) == 4) {
                j(view, 2);
                return;
            }
        }
    }
}
