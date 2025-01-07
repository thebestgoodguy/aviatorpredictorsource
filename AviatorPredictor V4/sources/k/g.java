package k;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final e f5989a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f5990a;

        /* renamed from: b, reason: collision with root package name */
        private final View f5991b;

        a(Window window, View view) {
            this.f5990a = window;
            this.f5991b = view;
        }

        protected void c(int r32) {
            View decorView = this.f5990a.getDecorView();
            decorView.setSystemUiVisibility(r32 | decorView.getSystemUiVisibility());
        }

        protected void d(int r22) {
            this.f5990a.addFlags(r22);
        }

        protected void e(int r32) {
            View decorView = this.f5990a.getDecorView();
            decorView.setSystemUiVisibility((~r32) & decorView.getSystemUiVisibility());
        }

        protected void f(int r22) {
            this.f5990a.clearFlags(r22);
        }
    }

    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // k.g.e
        public void b(boolean z4) {
            if (!z4) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // k.g.e
        public void a(boolean z4) {
            if (!z4) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final g f5992a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f5993b;

        /* renamed from: c, reason: collision with root package name */
        private final e.e<Object, WindowInsetsController.OnControllableInsetsChangedListener> f5994c;

        d(Window window, g gVar) {
            this(window.getInsetsController(), gVar);
        }

        d(WindowInsetsController windowInsetsController, g gVar) {
            this.f5994c = new e.e<>();
            this.f5993b = windowInsetsController;
            this.f5992a = gVar;
        }

        @Override // k.g.e
        public void a(boolean z4) {
            if (z4) {
                this.f5993b.setSystemBarsAppearance(16, 16);
            } else {
                this.f5993b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // k.g.e
        public void b(boolean z4) {
            if (z4) {
                this.f5993b.setSystemBarsAppearance(8, 8);
            } else {
                this.f5993b.setSystemBarsAppearance(0, 8);
            }
        }
    }

    private static class e {
        e() {
        }

        public void a(boolean z4) {
        }

        public void b(boolean z4) {
        }
    }

    public g(Window window, View view) {
        e aVar;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            this.f5989a = new d(window, this);
            return;
        }
        if (r02 >= 26) {
            aVar = new c(window, view);
        } else if (r02 >= 23) {
            aVar = new b(window, view);
        } else {
            if (r02 < 20) {
                this.f5989a = new e();
                return;
            }
            aVar = new a(window, view);
        }
        this.f5989a = aVar;
    }

    public void a(boolean z4) {
        this.f5989a.a(z4);
    }

    public void b(boolean z4) {
        this.f5989a.b(z4);
    }
}
