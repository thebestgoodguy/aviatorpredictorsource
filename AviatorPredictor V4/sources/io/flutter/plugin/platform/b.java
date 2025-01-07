package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.FileNotFoundException;
import java.util.List;
import q2.i;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f4632a;

    /* renamed from: b, reason: collision with root package name */
    private final q2.i f4633b;

    /* renamed from: c, reason: collision with root package name */
    private final d f4634c;

    /* renamed from: d, reason: collision with root package name */
    private i.j f4635d;

    /* renamed from: e, reason: collision with root package name */
    private int f4636e;

    /* renamed from: f, reason: collision with root package name */
    final i.h f4637f;

    class a implements i.h {
        a() {
        }

        @Override // q2.i.h
        public void a() {
            b.this.r();
        }

        @Override // q2.i.h
        public void b() {
            b.this.v();
        }

        @Override // q2.i.h
        public void c(i.c cVar) {
            b.this.u(cVar);
        }

        @Override // q2.i.h
        public void d() {
            b.this.s();
        }

        @Override // q2.i.h
        public void e(i.EnumC0078i enumC0078i) {
            b.this.q(enumC0078i);
        }

        @Override // q2.i.h
        public void f(String str) {
            b.this.t(str);
        }

        @Override // q2.i.h
        public CharSequence g(i.e eVar) {
            return b.this.p(eVar);
        }

        @Override // q2.i.h
        public void h(i.j jVar) {
            b.this.z(jVar);
        }

        @Override // q2.i.h
        public void i(i.g gVar) {
            b.this.B(gVar);
        }

        @Override // q2.i.h
        public void j(i.k kVar) {
            b.this.w(kVar);
        }

        @Override // q2.i.h
        public void k(int r22) {
            b.this.y(r22);
        }

        @Override // q2.i.h
        public void l(List<i.l> list) {
            b.this.x(list);
        }

        @Override // q2.i.h
        public boolean m() {
            return b.this.n();
        }
    }

    /* renamed from: io.flutter.plugin.platform.b$b, reason: collision with other inner class name */
    class ViewOnSystemUiVisibilityChangeListenerC0050b implements View.OnSystemUiVisibilityChangeListener {
        ViewOnSystemUiVisibilityChangeListenerC0050b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int r22) {
            q2.i iVar;
            boolean z4;
            if ((r22 & 4) == 0) {
                iVar = b.this.f4633b;
                z4 = false;
            } else {
                iVar = b.this.f4633b;
                z4 = true;
            }
            iVar.m(z4);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4640a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4641b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f4642c;

        static {
            int[] r02 = new int[i.d.values().length];
            f4642c = r02;
            try {
                r02[i.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4642c[i.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] r22 = new int[i.l.values().length];
            f4641b = r22;
            try {
                r22[i.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4641b[i.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] r23 = new int[i.g.values().length];
            f4640a = r23;
            try {
                r23[i.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4640a[i.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4640a[i.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4640a[i.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4640a[i.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean a();
    }

    public b(Activity activity, q2.i iVar, d dVar) {
        a aVar = new a();
        this.f4637f = aVar;
        this.f4632a = activity;
        this.f4633b = iVar;
        iVar.l(aVar);
        this.f4634c = dVar;
        this.f4636e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f4632a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence p(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f4632a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null && eVar != i.e.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f4632a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
            }
            return itemAt.coerceToText(this.f4632a);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SecurityException e5) {
            e2.b.g("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(i.EnumC0078i enumC0078i) {
        if (enumC0078i == i.EnumC0078i.CLICK) {
            this.f4632a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void r() {
        d dVar = this.f4634c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f4632a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).i().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        ((ClipboardManager) this.f4632a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(i.c cVar) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 21) {
            return;
        }
        if (r02 < 28 && r02 > 21) {
            this.f4632a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f7222b, (Bitmap) null, cVar.f7221a));
        }
        if (r02 >= 28) {
            this.f4632a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f7222b, 0, cVar.f7221a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.f4632a.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0050b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(i.k kVar) {
        int r32;
        if (kVar == i.k.LEAN_BACK) {
            r32 = 1798;
        } else if (kVar == i.k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
            r32 = 3846;
        } else if (kVar == i.k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
            r32 = 5894;
        } else if (kVar != i.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            r32 = 1792;
        }
        this.f4636e = r32;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(List<i.l> list) {
        int r02 = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int r12 = 0; r12 < list.size(); r12++) {
            int r22 = c.f4641b[list.get(r12).ordinal()];
            if (r22 == 1) {
                r02 &= -5;
            } else if (r22 == 2) {
                r02 = r02 & (-513) & (-3);
            }
        }
        this.f4636e = r02;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int r22) {
        this.f4632a.setRequestedOrientation(r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(i.j jVar) {
        Window window = this.f4632a.getWindow();
        k.g gVar = new k.g(window, window.getDecorView());
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (r12 >= 23) {
            i.d dVar = jVar.f7248b;
            if (dVar != null) {
                int r32 = c.f4642c[dVar.ordinal()];
                if (r32 == 1) {
                    gVar.b(true);
                } else if (r32 == 2) {
                    gVar.b(false);
                }
            }
            Integer num = jVar.f7247a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f7249c;
        if (bool != null && r12 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (r12 >= 26) {
            i.d dVar2 = jVar.f7251e;
            if (dVar2 != null) {
                int r33 = c.f4642c[dVar2.ordinal()];
                if (r33 == 1) {
                    gVar.a(true);
                } else if (r33 == 2) {
                    gVar.a(false);
                }
            }
            Integer num2 = jVar.f7250d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f7252f;
        if (num3 != null && r12 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f7253g;
        if (bool2 != null && r12 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f4635d = jVar;
    }

    public void A() {
        this.f4632a.getWindow().getDecorView().setSystemUiVisibility(this.f4636e);
        i.j jVar = this.f4635d;
        if (jVar != null) {
            z(jVar);
        }
    }

    void B(i.g gVar) {
        int r4;
        View decorView = this.f4632a.getWindow().getDecorView();
        int r42 = c.f4640a[gVar.ordinal()];
        int r12 = 1;
        if (r42 != 1) {
            if (r42 != 2) {
                r12 = 3;
                if (r42 != 3) {
                    r12 = 4;
                    if (r42 != 4) {
                        if (r42 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        r4 = 6;
                    }
                }
            }
            decorView.performHapticFeedback(r12);
            return;
        }
        r4 = 0;
        decorView.performHapticFeedback(r4);
    }

    public void o() {
        this.f4633b.l(null);
    }
}
