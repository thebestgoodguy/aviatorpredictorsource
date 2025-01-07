package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.android.g;
import io.flutter.embedding.android.q;
import io.flutter.view.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2.a;
import t2.a;

/* loaded from: classes.dex */
public class k extends FrameLayout implements a.c, q.e {
    private final j.a<WindowLayoutInfo> A;

    /* renamed from: e, reason: collision with root package name */
    private h f4401e;

    /* renamed from: f, reason: collision with root package name */
    private i f4402f;

    /* renamed from: g, reason: collision with root package name */
    private io.flutter.embedding.android.g f4403g;

    /* renamed from: h, reason: collision with root package name */
    p2.c f4404h;

    /* renamed from: i, reason: collision with root package name */
    private p2.c f4405i;

    /* renamed from: j, reason: collision with root package name */
    private final Set<p2.b> f4406j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4407k;

    /* renamed from: l, reason: collision with root package name */
    private io.flutter.embedding.engine.a f4408l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<f> f4409m;

    /* renamed from: n, reason: collision with root package name */
    private t2.a f4410n;

    /* renamed from: o, reason: collision with root package name */
    private io.flutter.plugin.editing.f f4411o;

    /* renamed from: p, reason: collision with root package name */
    private io.flutter.plugin.editing.d f4412p;

    /* renamed from: q, reason: collision with root package name */
    private s2.a f4413q;

    /* renamed from: r, reason: collision with root package name */
    private q f4414r;

    /* renamed from: s, reason: collision with root package name */
    private io.flutter.embedding.android.a f4415s;

    /* renamed from: t, reason: collision with root package name */
    private io.flutter.view.c f4416t;

    /* renamed from: u, reason: collision with root package name */
    private TextServicesManager f4417u;

    /* renamed from: v, reason: collision with root package name */
    private x f4418v;

    /* renamed from: w, reason: collision with root package name */
    private final a.g f4419w;

    /* renamed from: x, reason: collision with root package name */
    private final c.k f4420x;

    /* renamed from: y, reason: collision with root package name */
    private final ContentObserver f4421y;

    /* renamed from: z, reason: collision with root package name */
    private final p2.b f4422z;

    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z4, boolean z5) {
            k.this.A(z4, z5);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            if (k.this.f4408l == null) {
                return;
            }
            e2.b.e("FlutterView", "System settings changed. Sending user settings to Flutter.");
            k.this.C();
        }
    }

    class c implements p2.b {
        c() {
        }

        @Override // p2.b
        public void c() {
            k.this.f4407k = false;
            Iterator it = k.this.f4406j.iterator();
            while (it.hasNext()) {
                ((p2.b) it.next()).c();
            }
        }

        @Override // p2.b
        public void f() {
            k.this.f4407k = true;
            Iterator it = k.this.f4406j.iterator();
            while (it.hasNext()) {
                ((p2.b) it.next()).f();
            }
        }
    }

    class d implements j.a<WindowLayoutInfo> {
        d() {
        }

        @Override // j.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements p2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p2.a f4427a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f4428b;

        e(p2.a aVar, Runnable runnable) {
            this.f4427a = aVar;
            this.f4428b = runnable;
        }

        @Override // p2.b
        public void c() {
        }

        @Override // p2.b
        public void f() {
            this.f4427a.p(this);
            this.f4428b.run();
            k kVar = k.this;
            if ((kVar.f4404h instanceof io.flutter.embedding.android.g) || kVar.f4403g == null) {
                return;
            }
            k.this.f4403g.c();
        }
    }

    public interface f {
        void a(io.flutter.embedding.engine.a aVar);

        void b();
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, h hVar) {
        super(context, attributeSet);
        this.f4406j = new HashSet();
        this.f4409m = new HashSet();
        this.f4419w = new a.g();
        this.f4420x = new a();
        this.f4421y = new b(new Handler(Looper.getMainLooper()));
        this.f4422z = new c();
        this.A = new d();
        this.f4401e = hVar;
        this.f4404h = hVar;
        v();
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f4406j = new HashSet();
        this.f4409m = new HashSet();
        this.f4419w = new a.g();
        this.f4420x = new a();
        this.f4421y = new b(new Handler(Looper.getMainLooper()));
        this.f4422z = new c();
        this.A = new d();
        this.f4402f = iVar;
        this.f4404h = iVar;
        v();
    }

    public k(Context context, h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z4, boolean z5) {
        boolean z6 = false;
        if (!this.f4408l.p().k() && !z4 && !z5) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    private void D() {
        if (!w()) {
            e2.b.f("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f4419w.f7106a = getResources().getDisplayMetrics().density;
        this.f4419w.f7121p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f4408l.p().r(this.f4419w);
    }

    private g o() {
        Context context = getContext();
        int r12 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (r12 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    private int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void v() {
        View view;
        e2.b.e("FlutterView", "Initializing FlutterView");
        if (this.f4401e != null) {
            e2.b.e("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f4401e;
        } else if (this.f4402f != null) {
            e2.b.e("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f4402f;
        } else {
            e2.b.e("FlutterView", "Internally using a FlutterImageView.");
            view = this.f4403g;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean x(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    public void B(Runnable runnable) {
        io.flutter.embedding.android.g gVar = this.f4403g;
        if (gVar == null) {
            e2.b.e("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        p2.c cVar = this.f4405i;
        if (cVar == null) {
            e2.b.e("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f4404h = cVar;
        this.f4405i = null;
        io.flutter.embedding.engine.a aVar = this.f4408l;
        if (aVar == null) {
            gVar.c();
            runnable.run();
            return;
        }
        p2.a p4 = aVar.p();
        if (p4 == null) {
            this.f4403g.c();
            runnable.run();
        } else {
            this.f4404h.b(p4);
            p4.f(new e(p4, runnable));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void C() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1a
            q2.m$b r0 = q2.m.b.dark
            goto L1c
        L1a:
            q2.m$b r0 = q2.m.b.light
        L1c:
            android.view.textservice.TextServicesManager r3 = r6.f4417u
            if (r3 == 0) goto L40
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.j r4 = new java.util.function.Predicate() { // from class: io.flutter.embedding.android.j
                static {
                    /*
                        io.flutter.embedding.android.j r0 = new io.flutter.embedding.android.j
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:io.flutter.embedding.android.j) io.flutter.embedding.android.j.a io.flutter.embedding.android.j
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.<init>():void");
                }

                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object r1) {
                    /*
                        r0 = this;
                        android.view.textservice.SpellCheckerInfo r1 = (android.view.textservice.SpellCheckerInfo) r1
                        boolean r1 = io.flutter.embedding.android.k.d(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.j.test(java.lang.Object):boolean");
                }
            }
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f4417u
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L40
            if (r3 == 0) goto L40
        L3e:
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            io.flutter.embedding.engine.a r4 = r6.f4408l
            q2.m r4 = r4.r()
            q2.m$a r4 = r4.a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            q2.m$a r4 = r4.e(r5)
            q2.m$a r3 = r4.c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L6e
            r1 = 1
        L6e:
            q2.m$a r1 = r3.b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            q2.m$a r1 = r1.f(r2)
            q2.m$a r0 = r1.d(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.k.C():void");
    }

    @Override // io.flutter.embedding.android.q.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f4411o.j(sparseArray);
    }

    @Override // io.flutter.embedding.android.q.e
    public boolean b(KeyEvent keyEvent) {
        return this.f4411o.r(keyEvent);
    }

    @Override // t2.a.c
    public PointerIcon c(int r22) {
        return PointerIcon.getSystemIcon(getContext(), r22);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f4408l;
        return aVar != null ? aVar.n().D(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (w() && this.f4414r.a(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        a.g gVar = this.f4419w;
        gVar.f7109d = rect.top;
        gVar.f7110e = rect.right;
        gVar.f7111f = 0;
        gVar.f7112g = rect.left;
        gVar.f7113h = 0;
        gVar.f7114i = 0;
        gVar.f7115j = rect.bottom;
        gVar.f7116k = 0;
        e2.b.e("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f4419w.f7109d + ", Left: " + this.f4419w.f7112g + ", Right: " + this.f4419w.f7110e + "\nKeyboard insets: Bottom: " + this.f4419w.f7115j + ", Left: " + this.f4419w.f7116k + ", Right: " + this.f4419w.f7114i);
        D();
        return true;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.f4416t;
        if (cVar == null || !cVar.C()) {
            return null;
        }
        return this.f4416t;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f4408l;
    }

    @Override // io.flutter.embedding.android.q.e
    public r2.b getBinaryMessenger() {
        return this.f4408l.h();
    }

    public io.flutter.embedding.android.g getCurrentImageSurface() {
        return this.f4403g;
    }

    public boolean j() {
        io.flutter.embedding.android.g gVar = this.f4403g;
        if (gVar != null) {
            return gVar.d();
        }
        return false;
    }

    public void k(f fVar) {
        this.f4409m.add(fVar);
    }

    public void l(p2.b bVar) {
        this.f4406j.add(bVar);
    }

    public void m(io.flutter.embedding.android.g gVar) {
        io.flutter.embedding.engine.a aVar = this.f4408l;
        if (aVar != null) {
            gVar.b(aVar.p());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        e2.b.e("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (w()) {
            if (aVar == this.f4408l) {
                e2.b.e("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                e2.b.e("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f4408l = aVar;
        p2.a p4 = aVar.p();
        this.f4407k = p4.j();
        this.f4404h.b(p4);
        p4.f(this.f4422z);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4410n = new t2.a(this, this.f4408l.k());
        }
        this.f4411o = new io.flutter.plugin.editing.f(this, this.f4408l.u(), this.f4408l.n());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f4417u = textServicesManager;
            this.f4412p = new io.flutter.plugin.editing.d(textServicesManager, this.f4408l.s());
        } catch (Exception unused) {
            e2.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f4413q = this.f4408l.j();
        this.f4414r = new q(this);
        this.f4415s = new io.flutter.embedding.android.a(this.f4408l.p(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, aVar.f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f4408l.n());
        this.f4416t = cVar;
        cVar.U(this.f4420x);
        A(this.f4416t.C(), this.f4416t.D());
        this.f4408l.n().b(this.f4416t);
        this.f4408l.n().B(this.f4408l.p());
        this.f4411o.q().restartInput(this);
        C();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f4421y);
        D();
        aVar.n().C(this);
        Iterator<f> it = this.f4409m.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
        if (this.f4407k) {
            this.f4422z.f();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int r12 = Build.VERSION.SDK_INT;
        if (r12 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.f4419w;
            gVar.f7117l = systemGestureInsets.top;
            gVar.f7118m = systemGestureInsets.right;
            gVar.f7119n = systemGestureInsets.bottom;
            gVar.f7120o = systemGestureInsets.left;
        }
        boolean z4 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z5 = (getWindowSystemUiVisibility() & 2) == 0;
        if (r12 >= 30) {
            int navigationBars = z5 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z4) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            a.g gVar2 = this.f4419w;
            gVar2.f7109d = insets.top;
            gVar2.f7110e = insets.right;
            gVar2.f7111f = insets.bottom;
            gVar2.f7112g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.f4419w;
            gVar3.f7113h = insets2.top;
            gVar3.f7114i = insets2.right;
            gVar3.f7115j = insets2.bottom;
            gVar3.f7116k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.f4419w;
            gVar4.f7117l = insets3.top;
            gVar4.f7118m = insets3.right;
            gVar4.f7119n = insets3.bottom;
            gVar4.f7120o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.f4419w;
                gVar5.f7109d = Math.max(Math.max(gVar5.f7109d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.f4419w;
                gVar6.f7110e = Math.max(Math.max(gVar6.f7110e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.f4419w;
                gVar7.f7111f = Math.max(Math.max(gVar7.f7111f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.f4419w;
                gVar8.f7112g = Math.max(Math.max(gVar8.f7112g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z5) {
                gVar9 = o();
            }
            this.f4419w.f7109d = z4 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f4419w.f7110e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f4419w.f7111f = (z5 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f4419w.f7112g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.f4419w;
            gVar10.f7113h = 0;
            gVar10.f7114i = 0;
            gVar10.f7115j = t(windowInsets);
            this.f4419w.f7116k = 0;
        }
        e2.b.e("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f4419w.f7109d + ", Left: " + this.f4419w.f7112g + ", Right: " + this.f4419w.f7110e + "\nKeyboard insets: Bottom: " + this.f4419w.f7115j + ", Left: " + this.f4419w.f7116k + ", Right: " + this.f4419w.f7114i + "System Gesture Insets - Left: " + this.f4419w.f7120o + ", Top: " + this.f4419w.f7117l + ", Right: " + this.f4419w.f7118m + ", Bottom: " + this.f4419w.f7115j);
        D();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4418v = r();
        Activity e5 = z2.h.e(getContext());
        x xVar = this.f4418v;
        if (xVar == null || e5 == null) {
            return;
        }
        xVar.a(e5, androidx.core.content.a.b(getContext()), this.A);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4408l != null) {
            e2.b.e("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f4413q.d(configuration);
            C();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !w() ? super.onCreateInputConnection(editorInfo) : this.f4411o.o(this, this.f4414r, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        x xVar = this.f4418v;
        if (xVar != null) {
            xVar.b(this.A);
        }
        this.f4418v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (w() && this.f4415s.e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !w() ? super.onHoverEvent(motionEvent) : this.f4416t.I(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int r32) {
        super.onProvideAutofillVirtualStructure(viewStructure, r32);
        this.f4411o.z(viewStructure, r32);
    }

    @Override // android.view.View
    protected void onSizeChanged(int r32, int r4, int r5, int r6) {
        super.onSizeChanged(r32, r4, r5, r6);
        e2.b.e("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + r5 + " x " + r6 + ", it is now " + r32 + " x " + r4);
        a.g gVar = this.f4419w;
        gVar.f7107b = r32;
        gVar.f7108c = r4;
        D();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!w()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f4415s.f(motionEvent);
    }

    public void p() {
        this.f4404h.a();
        io.flutter.embedding.android.g gVar = this.f4403g;
        if (gVar == null) {
            io.flutter.embedding.android.g q4 = q();
            this.f4403g = q4;
            addView(q4);
        } else {
            gVar.j(getWidth(), getHeight());
        }
        this.f4405i = this.f4404h;
        io.flutter.embedding.android.g gVar2 = this.f4403g;
        this.f4404h = gVar2;
        io.flutter.embedding.engine.a aVar = this.f4408l;
        if (aVar != null) {
            gVar2.b(aVar.p());
        }
    }

    public io.flutter.embedding.android.g q() {
        return new io.flutter.embedding.android.g(getContext(), getWidth(), getHeight(), g.b.background);
    }

    protected x r() {
        try {
            return new x(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        e2.b.e("FlutterView", "Detaching from a FlutterEngine: " + this.f4408l);
        if (!w()) {
            e2.b.e("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<f> it = this.f4409m.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f4421y);
        this.f4408l.n().I();
        this.f4408l.n().a();
        this.f4416t.O();
        this.f4416t = null;
        this.f4411o.q().restartInput(this);
        this.f4411o.p();
        this.f4414r.c();
        io.flutter.plugin.editing.d dVar = this.f4412p;
        if (dVar != null) {
            dVar.b();
        }
        t2.a aVar = this.f4410n;
        if (aVar != null) {
            aVar.c();
        }
        p2.a p4 = this.f4408l.p();
        this.f4407k = false;
        p4.p(this.f4422z);
        p4.t();
        p4.q(false);
        p2.c cVar = this.f4405i;
        if (cVar != null && this.f4404h == this.f4403g) {
            this.f4404h = cVar;
        }
        this.f4404h.c();
        io.flutter.embedding.android.g gVar = this.f4403g;
        if (gVar != null) {
            gVar.f();
            removeView(this.f4403g);
            this.f4403g = null;
        }
        this.f4405i = null;
        this.f4408l = null;
    }

    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            e2.b.e("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new a.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? a.d.HINGE : a.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? a.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(displayFeature.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                e2.b.e("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new a.b(rect, a.d.CUTOUT));
            }
        }
        this.f4419w.f7122q = arrayList;
        D();
    }

    public boolean u() {
        return this.f4407k;
    }

    public boolean w() {
        io.flutter.embedding.engine.a aVar = this.f4408l;
        return aVar != null && aVar.p() == this.f4404h.getAttachedRenderer();
    }

    public void y(f fVar) {
        this.f4409m.remove(fVar);
    }

    public void z(p2.b bVar) {
        this.f4406j.remove(bVar);
    }
}
