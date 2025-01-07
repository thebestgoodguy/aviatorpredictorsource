package io.flutter.view;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import q2.a;

/* loaded from: classes.dex */
public class c extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    private final View f4819a;

    /* renamed from: b, reason: collision with root package name */
    private final q2.a f4820b;

    /* renamed from: c, reason: collision with root package name */
    private final AccessibilityManager f4821c;

    /* renamed from: d, reason: collision with root package name */
    private final AccessibilityViewEmbedder f4822d;

    /* renamed from: e, reason: collision with root package name */
    private final io.flutter.plugin.platform.h f4823e;

    /* renamed from: f, reason: collision with root package name */
    private final ContentResolver f4824f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, l> f4825g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Integer, h> f4826h;

    /* renamed from: i, reason: collision with root package name */
    private l f4827i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f4828j;

    /* renamed from: k, reason: collision with root package name */
    private Integer f4829k;

    /* renamed from: l, reason: collision with root package name */
    private int f4830l;

    /* renamed from: m, reason: collision with root package name */
    private l f4831m;

    /* renamed from: n, reason: collision with root package name */
    private l f4832n;

    /* renamed from: o, reason: collision with root package name */
    private l f4833o;

    /* renamed from: p, reason: collision with root package name */
    private final List<Integer> f4834p;

    /* renamed from: q, reason: collision with root package name */
    private int f4835q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f4836r;

    /* renamed from: s, reason: collision with root package name */
    private k f4837s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4838t;

    /* renamed from: u, reason: collision with root package name */
    private final a.b f4839u;

    /* renamed from: v, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f4840v;

    /* renamed from: w, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f4841w;

    /* renamed from: x, reason: collision with root package name */
    private final ContentObserver f4842x;

    /* renamed from: y, reason: collision with root package name */
    private static final int f4817y = ((g.SCROLL_RIGHT.f4879e | g.SCROLL_LEFT.f4879e) | g.SCROLL_UP.f4879e) | g.SCROLL_DOWN.f4879e;

    /* renamed from: z, reason: collision with root package name */
    private static final int f4818z = ((((((((((i.HAS_CHECKED_STATE.f4906e | i.IS_CHECKED.f4906e) | i.IS_SELECTED.f4906e) | i.IS_TEXT_FIELD.f4906e) | i.IS_FOCUSED.f4906e) | i.HAS_ENABLED_STATE.f4906e) | i.IS_ENABLED.f4906e) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f4906e) | i.HAS_TOGGLED_STATE.f4906e) | i.IS_TOGGLED.f4906e) | i.IS_FOCUSABLE.f4906e) | i.IS_SLIDER.f4906e;
    private static int A = 267386881;

    class a implements a.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.X(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.W(byteBuffer, strArr);
        }

        @Override // q2.a.b
        public void c(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent G = c.this.G(0, 32);
            G.getText().add(str);
            c.this.Q(G);
        }

        @Override // q2.a.b
        public void d(int r32) {
            c.this.P(r32, 2);
        }

        @Override // q2.a.b
        public void e(String str) {
            c.this.f4819a.announceForAccessibility(str);
        }

        @Override // q2.a.b
        public void f(int r32) {
            c.this.P(r32, 1);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z4) {
            if (c.this.f4838t) {
                return;
            }
            q2.a aVar = c.this.f4820b;
            if (z4) {
                aVar.g(c.this.f4839u);
                c.this.f4820b.e();
            } else {
                aVar.g(null);
                c.this.f4820b.d();
            }
            if (c.this.f4837s != null) {
                c.this.f4837s.a(z4, c.this.f4821c.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.c$c, reason: collision with other inner class name */
    class C0052c extends ContentObserver {
        C0052c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            onChange(z4, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4, Uri uri) {
            if (c.this.f4838t) {
                return;
            }
            String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(c.this.f4824f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                c.f(c.this, f.DISABLE_ANIMATIONS.f4857e);
            } else {
                c.e(c.this, ~f.DISABLE_ANIMATIONS.f4857e);
            }
            c.this.R();
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f4846a;

        d(AccessibilityManager accessibilityManager) {
            this.f4846a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z4) {
            if (c.this.f4838t) {
                return;
            }
            c cVar = c.this;
            if (z4) {
                c.f(cVar, f.ACCESSIBLE_NAVIGATION.f4857e);
            } else {
                cVar.J();
                c.e(c.this, ~f.ACCESSIBLE_NAVIGATION.f4857e);
            }
            c.this.R();
            if (c.this.f4837s != null) {
                c.this.f4837s.a(this.f4846a.isEnabled(), z4);
            }
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4848a;

        static {
            int[] r02 = new int[o.values().length];
            f4848a = r02;
            try {
                r02[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4848a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* renamed from: e, reason: collision with root package name */
        final int f4857e;

        f(int r32) {
            this.f4857e = r32;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);


        /* renamed from: e, reason: collision with root package name */
        public final int f4879e;

        g(int r32) {
            this.f4879e = r32;
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        private int f4880a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f4881b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f4882c = -1;

        /* renamed from: d, reason: collision with root package name */
        private String f4883d;

        /* renamed from: e, reason: collision with root package name */
        private String f4884e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);


        /* renamed from: e, reason: collision with root package name */
        final int f4906e;

        i(int r32) {
            this.f4906e = r32;
        }
    }

    private static class j extends n {

        /* renamed from: d, reason: collision with root package name */
        String f4907d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z4, boolean z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {
        private p A;
        private int C;
        private int D;
        private int E;
        private int F;
        private float G;
        private float H;
        private float I;
        private String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        private l Q;
        private List<h> T;
        private h U;
        private h V;
        private float[] X;
        private float[] Z;

        /* renamed from: a, reason: collision with root package name */
        final c f4908a;

        /* renamed from: a0, reason: collision with root package name */
        private Rect f4909a0;

        /* renamed from: c, reason: collision with root package name */
        private int f4911c;

        /* renamed from: d, reason: collision with root package name */
        private int f4912d;

        /* renamed from: e, reason: collision with root package name */
        private int f4913e;

        /* renamed from: f, reason: collision with root package name */
        private int f4914f;

        /* renamed from: g, reason: collision with root package name */
        private int f4915g;

        /* renamed from: h, reason: collision with root package name */
        private int f4916h;

        /* renamed from: i, reason: collision with root package name */
        private int f4917i;

        /* renamed from: j, reason: collision with root package name */
        private int f4918j;

        /* renamed from: k, reason: collision with root package name */
        private int f4919k;

        /* renamed from: l, reason: collision with root package name */
        private float f4920l;

        /* renamed from: m, reason: collision with root package name */
        private float f4921m;

        /* renamed from: n, reason: collision with root package name */
        private float f4922n;

        /* renamed from: o, reason: collision with root package name */
        private String f4923o;

        /* renamed from: p, reason: collision with root package name */
        private List<n> f4924p;

        /* renamed from: q, reason: collision with root package name */
        private String f4925q;

        /* renamed from: r, reason: collision with root package name */
        private List<n> f4926r;

        /* renamed from: s, reason: collision with root package name */
        private String f4927s;

        /* renamed from: t, reason: collision with root package name */
        private List<n> f4928t;

        /* renamed from: u, reason: collision with root package name */
        private String f4929u;

        /* renamed from: v, reason: collision with root package name */
        private List<n> f4930v;

        /* renamed from: w, reason: collision with root package name */
        private String f4931w;

        /* renamed from: x, reason: collision with root package name */
        private List<n> f4932x;

        /* renamed from: y, reason: collision with root package name */
        private String f4933y;

        /* renamed from: b, reason: collision with root package name */
        private int f4910b = -1;

        /* renamed from: z, reason: collision with root package name */
        private int f4934z = -1;
        private boolean B = false;
        private List<l> R = new ArrayList();
        private List<l> S = new ArrayList();
        private boolean W = true;
        private boolean Y = true;

        l(c cVar) {
            this.f4908a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(List<l> list) {
            if (p0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<l> it = this.R.iterator();
            while (it.hasNext()) {
                it.next().c0(list);
            }
        }

        private SpannableString d0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int r12 = e.f4848a[nVar.f4937c.ordinal()];
                    if (r12 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f4935a, nVar.f4936b, 0);
                    } else if (r12 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f4907d)), nVar.f4935a, nVar.f4936b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e0() {
            String str;
            String str2 = this.f4923o;
            if (str2 == null && this.K == null) {
                return false;
            }
            return str2 == null || (str = this.K) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0() {
            return (Float.isNaN(this.f4920l) || Float.isNaN(this.G) || this.G == this.f4920l) ? false : true;
        }

        private void g0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (Matrix.invertM(this.X, 0, this.P, 0)) {
                    return;
                }
                Arrays.fill(this.X, 0.0f);
            }
        }

        private l h0(z2.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect i0() {
            return this.f4909a0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String j0() {
            String str;
            if (p0(i.NAMES_ROUTE) && (str = this.f4923o) != null && !str.isEmpty()) {
                return this.f4923o;
            }
            Iterator<l> it = this.R.iterator();
            while (it.hasNext()) {
                String j02 = it.next().j0();
                if (j02 != null && !j02.isEmpty()) {
                    return j02;
                }
            }
            return null;
        }

        private List<n> k0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int r02 = byteBuffer.getInt();
            a aVar = null;
            if (r02 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(r02);
            for (int r32 = 0; r32 < r02; r32++) {
                int r4 = byteBuffer.getInt();
                int r5 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int r7 = e.f4848a[oVar.ordinal()];
                if (r7 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f4935a = r4;
                    mVar.f4936b = r5;
                    mVar.f4937c = oVar;
                    arrayList.add(mVar);
                } else if (r7 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f4935a = r4;
                    jVar.f4936b = r5;
                    jVar.f4937c = oVar;
                    jVar.f4907d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence l0() {
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : Build.VERSION.SDK_INT < 21 ? new CharSequence[]{this.f4925q, this.f4923o, this.f4931w} : new CharSequence[]{d0(this.f4925q, this.f4926r), d0(this.f4923o, this.f4924p), d0(this.f4931w, this.f4932x)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        static /* synthetic */ int m(l lVar, int r22) {
            int r02 = lVar.f4916h + r22;
            lVar.f4916h = r02;
            return r02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m0(g gVar) {
            return (gVar.f4879e & this.D) != 0;
        }

        static /* synthetic */ int n(l lVar, int r22) {
            int r02 = lVar.f4916h - r22;
            lVar.f4916h = r02;
            return r02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n0(i iVar) {
            return (iVar.f4906e & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o0(g gVar) {
            return (gVar.f4879e & this.f4912d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p0(i iVar) {
            return (iVar.f4906e & this.f4911c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l q0(float[] fArr) {
            float f5 = fArr[3];
            float f6 = fArr[0] / f5;
            float f7 = fArr[1] / f5;
            if (f6 < this.L || f6 >= this.N || f7 < this.M || f7 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.S) {
                if (!lVar.p0(i.IS_HIDDEN)) {
                    lVar.g0();
                    Matrix.multiplyMV(fArr2, 0, lVar.X, 0, fArr, 0);
                    l q02 = lVar.q0(fArr2);
                    if (q02 != null) {
                        return q02;
                    }
                }
            }
            if (r0()) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r0() {
            String str;
            String str2;
            String str3;
            if (p0(i.SCOPES_ROUTE)) {
                return false;
            }
            return (!p0(i.IS_FOCUSABLE) && (this.f4912d & (~c.f4817y)) == 0 && (this.f4911c & c.f4818z) == 0 && ((str = this.f4923o) == null || str.isEmpty()) && (((str2 = this.f4925q) == null || str2.isEmpty()) && ((str3 = this.f4931w) == null || str3.isEmpty()))) ? false : true;
        }

        private float s0(float f5, float f6, float f7, float f8) {
            return Math.max(f5, Math.max(f6, Math.max(f7, f8)));
        }

        private float t0(float f5, float f6, float f7, float f8) {
            return Math.min(f5, Math.min(f6, Math.min(f7, f8)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean u0(l lVar, z2.d<l> dVar) {
            return (lVar == null || lVar.h0(dVar) == null) ? false : true;
        }

        private void v0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f5 = fArr[3];
            fArr[0] = fArr[0] / f5;
            fArr[1] = fArr[1] / f5;
            fArr[2] = fArr[2] / f5;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w0(float[] fArr, Set<l> set, boolean z4) {
            set.add(this);
            if (this.Y) {
                z4 = true;
            }
            if (z4) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = {this.L, this.M, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                v0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                v0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                v0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                v0(fArr6, this.Z, fArr2);
                if (this.f4909a0 == null) {
                    this.f4909a0 = new Rect();
                }
                this.f4909a0.set(Math.round(t0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(t0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(s0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(s0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int r13 = -1;
            for (l lVar : this.R) {
                lVar.f4934z = r13;
                r13 = lVar.f4910b;
                lVar.w0(this.Z, set, z4);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f4925q;
            this.K = this.f4923o;
            this.C = this.f4911c;
            this.D = this.f4912d;
            this.E = this.f4915g;
            this.F = this.f4916h;
            this.G = this.f4920l;
            this.H = this.f4921m;
            this.I = this.f4922n;
            this.f4911c = byteBuffer.getInt();
            this.f4912d = byteBuffer.getInt();
            this.f4913e = byteBuffer.getInt();
            this.f4914f = byteBuffer.getInt();
            this.f4915g = byteBuffer.getInt();
            this.f4916h = byteBuffer.getInt();
            this.f4917i = byteBuffer.getInt();
            this.f4918j = byteBuffer.getInt();
            this.f4919k = byteBuffer.getInt();
            this.f4920l = byteBuffer.getFloat();
            this.f4921m = byteBuffer.getFloat();
            this.f4922n = byteBuffer.getFloat();
            int r12 = byteBuffer.getInt();
            this.f4923o = r12 == -1 ? null : strArr[r12];
            this.f4924p = k0(byteBuffer, byteBufferArr);
            int r13 = byteBuffer.getInt();
            this.f4925q = r13 == -1 ? null : strArr[r13];
            this.f4926r = k0(byteBuffer, byteBufferArr);
            int r14 = byteBuffer.getInt();
            this.f4927s = r14 == -1 ? null : strArr[r14];
            this.f4928t = k0(byteBuffer, byteBufferArr);
            int r15 = byteBuffer.getInt();
            this.f4929u = r15 == -1 ? null : strArr[r15];
            this.f4930v = k0(byteBuffer, byteBufferArr);
            int r16 = byteBuffer.getInt();
            this.f4931w = r16 == -1 ? null : strArr[r16];
            this.f4932x = k0(byteBuffer, byteBufferArr);
            int r8 = byteBuffer.getInt();
            this.f4933y = r8 == -1 ? null : strArr[r8];
            this.A = p.d(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int r17 = 0; r17 < 16; r17++) {
                this.P[r17] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int r82 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int r02 = 0; r02 < r82; r02++) {
                l z4 = this.f4908a.z(byteBuffer.getInt());
                z4.Q = this;
                this.R.add(z4);
            }
            for (int r03 = 0; r03 < r82; r03++) {
                l z5 = this.f4908a.z(byteBuffer.getInt());
                z5.Q = this;
                this.S.add(z5);
            }
            int r83 = byteBuffer.getInt();
            if (r83 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(r83);
            } else {
                list.clear();
            }
            for (int r7 = 0; r7 < r83; r7++) {
                h y4 = this.f4908a.y(byteBuffer.getInt());
                if (y4.f4882c == g.TAP.f4879e) {
                    this.U = y4;
                } else if (y4.f4882c == g.LONG_PRESS.f4879e) {
                    this.V = y4;
                } else {
                    this.T.add(y4);
                }
                this.T.add(y4);
            }
        }
    }

    private static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* renamed from: a, reason: collision with root package name */
        int f4935a;

        /* renamed from: b, reason: collision with root package name */
        int f4936b;

        /* renamed from: c, reason: collision with root package name */
        o f4937c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p d(int r12) {
            return r12 != 1 ? r12 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, q2.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.h hVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), hVar);
    }

    public c(View view, q2.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.h hVar) {
        this.f4825g = new HashMap();
        this.f4826h = new HashMap();
        this.f4830l = 0;
        this.f4834p = new ArrayList();
        this.f4835q = 0;
        this.f4836r = 0;
        this.f4838t = false;
        this.f4839u = new a();
        b bVar = new b();
        this.f4840v = bVar;
        C0052c c0052c = new C0052c(new Handler());
        this.f4842x = c0052c;
        this.f4819a = view;
        this.f4820b = aVar;
        this.f4821c = accessibilityManager;
        this.f4824f = contentResolver;
        this.f4822d = accessibilityViewEmbedder;
        this.f4823e = hVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int r5 = Build.VERSION.SDK_INT;
        if (r5 >= 19) {
            d dVar = new d(accessibilityManager);
            this.f4841w = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.f4841w = null;
        }
        if (r5 >= 17) {
            c0052c.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c0052c);
        }
        hVar.b(this);
    }

    private l A() {
        return this.f4825g.get(0);
    }

    private void B(float f5, float f6) {
        l q02;
        if (this.f4825g.isEmpty() || (q02 = A().q0(new float[]{f5, f6, 0.0f, 1.0f})) == this.f4833o) {
            return;
        }
        if (q02 != null) {
            P(q02.f4910b, 128);
        }
        l lVar = this.f4833o;
        if (lVar != null) {
            P(lVar.f4910b, 256);
        }
        this.f4833o = q02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar) {
        return lVar.p0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent G(int r22, int r32) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(r32);
        obtain.setPackageName(this.f4819a.getContext().getPackageName());
        obtain.setSource(this.f4819a, r22);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        l lVar = this.f4833o;
        if (lVar != null) {
            P(lVar.f4910b, 256);
            this.f4833o = null;
        }
    }

    private void K(l lVar) {
        String j02 = lVar.j0();
        if (j02 == null) {
            j02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            T(j02);
            return;
        }
        AccessibilityEvent G = G(lVar.f4910b, 32);
        G.getText().add(j02);
        Q(G);
    }

    private boolean L(l lVar, int r6, Bundle bundle, boolean z4) {
        int r02 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int r12 = lVar.f4915g;
        int r22 = lVar.f4916h;
        N(lVar, r02, z4, z5);
        if (r12 != lVar.f4915g || r22 != lVar.f4916h) {
            String str = lVar.f4925q != null ? lVar.f4925q : "";
            AccessibilityEvent G = G(lVar.f4910b, 8192);
            G.getText().add(str);
            G.setFromIndex(lVar.f4915g);
            G.setToIndex(lVar.f4916h);
            G.setItemCount(str.length());
            Q(G);
        }
        if (r02 == 1) {
            if (z4) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.o0(gVar)) {
                    this.f4820b.c(r6, gVar, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (z4) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.o0(gVar2)) {
                return false;
            }
            this.f4820b.c(r6, gVar2, Boolean.valueOf(z5));
            return true;
        }
        if (r02 != 2) {
            return r02 == 4 || r02 == 8 || r02 == 16;
        }
        if (z4) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.o0(gVar3)) {
                this.f4820b.c(r6, gVar3, Boolean.valueOf(z5));
                return true;
            }
        }
        if (z4) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.o0(gVar4)) {
            return false;
        }
        this.f4820b.c(r6, gVar4, Boolean.valueOf(z5));
        return true;
    }

    private boolean M(l lVar, int r4, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f4820b.c(r4, g.SET_TEXT, string);
        lVar.f4925q = string;
        lVar.f4926r = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r6 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r5 = r4.f4925q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r4.f4916h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r4.f4916h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        io.flutter.view.c.l.m(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r5.find() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r5.find() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void N(io.flutter.view.c.l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.flutter.view.c.l.k(r4)
            if (r0 < 0) goto L111
            int r0 = io.flutter.view.c.l.i(r4)
            if (r0 >= 0) goto Le
            goto L111
        Le:
            r0 = 1
            if (r5 == r0) goto Le9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L94
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L108
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.flutter.view.c.l.q(r4)
            int r5 = r5.length()
        L2c:
            io.flutter.view.c.l.l(r4, r5)
            goto L108
        L31:
            io.flutter.view.c.l.l(r4, r2)
            goto L108
        L36:
            if (r6 == 0) goto L6b
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L6b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        L62:
            int r5 = r5.start(r0)
            io.flutter.view.c.l.m(r4, r5)
            goto L108
        L6b:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L8f:
            int r5 = r5.start(r0)
            goto L2c
        L94:
            if (r6 == 0) goto Lc4
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto L62
        Lc4:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L108
            goto L8f
        Le9:
            if (r6 == 0) goto Lfd
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lfd
            io.flutter.view.c.l.m(r4, r0)
            goto L108
        Lfd:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            io.flutter.view.c.l.n(r4, r0)
        L108:
            if (r7 != 0) goto L111
            int r5 = io.flutter.view.c.l.k(r4)
            io.flutter.view.c.l.j(r4, r5)
        L111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.N(io.flutter.view.c$l, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(int r22, int r32) {
        if (this.f4821c.isEnabled()) {
            Q(G(r22, r32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(AccessibilityEvent accessibilityEvent) {
        if (this.f4821c.isEnabled()) {
            this.f4819a.getParent().requestSendAccessibilityEvent(this.f4819a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.f4820b.f(this.f4830l);
    }

    private void S(int r32) {
        AccessibilityEvent G = G(r32, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            G.setContentChangeTypes(1);
        }
        Q(G);
    }

    private void T(String str) {
        this.f4819a.setAccessibilityPaneTitle(str);
    }

    private boolean V(final l lVar) {
        return lVar.f4918j > 0 && (l.u0(this.f4827i, new z2.d() { // from class: io.flutter.view.a
            @Override // z2.d
            public final boolean test(Object obj) {
                boolean E;
                E = c.E(c.l.this, (c.l) obj);
                return E;
            }
        }) || !l.u0(this.f4827i, new z2.d() { // from class: io.flutter.view.b
            @Override // z2.d
            public final boolean test(Object obj) {
                boolean F;
                F = c.F((c.l) obj);
                return F;
            }
        }));
    }

    private void Y(l lVar) {
        View d5;
        Integer num;
        lVar.Q = null;
        if (lVar.f4917i != -1 && (num = this.f4828j) != null && this.f4822d.platformViewOfNode(num.intValue()) == this.f4823e.d(lVar.f4917i)) {
            P(this.f4828j.intValue(), 65536);
            this.f4828j = null;
        }
        if (lVar.f4917i != -1 && (d5 = this.f4823e.d(lVar.f4917i)) != null) {
            d5.setImportantForAccessibility(4);
        }
        l lVar2 = this.f4827i;
        if (lVar2 == lVar) {
            P(lVar2.f4910b, 65536);
            this.f4827i = null;
        }
        if (this.f4831m == lVar) {
            this.f4831m = null;
        }
        if (this.f4833o == lVar) {
            this.f4833o = null;
        }
    }

    static /* synthetic */ int e(c cVar, int r22) {
        int r23 = r22 & cVar.f4830l;
        cVar.f4830l = r23;
        return r23;
    }

    static /* synthetic */ int f(c cVar, int r22) {
        int r23 = r22 | cVar.f4830l;
        cVar.f4830l = r23;
        return r23;
    }

    private AccessibilityEvent u(int r6, String str, String str2) {
        AccessibilityEvent G = G(r6, 16);
        G.setBeforeText(str);
        G.getText().add(str2);
        int r02 = 0;
        while (r02 < str.length() && r02 < str2.length() && str.charAt(r02) == str2.charAt(r02)) {
            r02++;
        }
        if (r02 >= str.length() && r02 >= str2.length()) {
            return null;
        }
        G.setFromIndex(r02);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= r02 && length2 >= r02 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        G.setRemovedCount((length - r02) + 1);
        G.setAddedCount((length2 - r02) + 1);
        return G;
    }

    private boolean v() {
        Activity e5 = z2.h.e(this.f4819a.getContext());
        if (e5 == null || e5.getWindow() == null) {
            return false;
        }
        int r02 = e5.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return r02 == 2 || r02 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] r4 = new int[2];
        this.f4819a.getLocationOnScreen(r4);
        rect2.offset(r4[0], r4[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h y(int r32) {
        h hVar = this.f4826h.get(Integer.valueOf(r32));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f4881b = r32;
        hVar2.f4880a = A + r32;
        this.f4826h.put(Integer.valueOf(r32), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l z(int r32) {
        l lVar = this.f4825g.get(Integer.valueOf(r32));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f4910b = r32;
        this.f4825g.put(Integer.valueOf(r32), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f4821c.isEnabled();
    }

    public boolean D() {
        return this.f4821c.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo H(View view, int r22) {
        return AccessibilityNodeInfo.obtain(view, r22);
    }

    public boolean I(MotionEvent motionEvent) {
        if (!this.f4821c.isTouchExplorationEnabled() || this.f4825g.isEmpty()) {
            return false;
        }
        l q02 = A().q0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (q02 != null && q02.f4917i != -1) {
            return this.f4822d.onAccessibilityHoverEvent(q02.f4910b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            B(motionEvent.getX(), motionEvent.getY());
        } else {
            if (motionEvent.getAction() != 10) {
                e2.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            J();
        }
        return true;
    }

    public void O() {
        this.f4838t = true;
        this.f4823e.a();
        U(null);
        this.f4821c.removeAccessibilityStateChangeListener(this.f4840v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4821c.removeTouchExplorationStateChangeListener(this.f4841w);
        }
        this.f4824f.unregisterContentObserver(this.f4842x);
        this.f4820b.g(null);
    }

    public void U(k kVar) {
        this.f4837s = kVar;
    }

    void W(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h y4 = y(byteBuffer.getInt());
            y4.f4882c = byteBuffer.getInt();
            int r12 = byteBuffer.getInt();
            String str = null;
            y4.f4883d = r12 == -1 ? null : strArr[r12];
            int r13 = byteBuffer.getInt();
            if (r13 != -1) {
                str = strArr[r13];
            }
            y4.f4884e = str;
        }
    }

    void X(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f5;
        float f6;
        WindowInsets rootWindowInsets;
        View d5;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l z4 = z(byteBuffer.getInt());
            z4.x0(byteBuffer, strArr, byteBufferArr);
            if (!z4.p0(i.IS_HIDDEN)) {
                if (z4.p0(i.IS_FOCUSED)) {
                    this.f4831m = z4;
                }
                if (z4.B) {
                    arrayList.add(z4);
                }
                if (z4.f4917i != -1 && !this.f4823e.c(z4.f4917i) && (d5 = this.f4823e.d(z4.f4917i)) != null) {
                    d5.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l A2 = A();
        ArrayList<l> arrayList2 = new ArrayList();
        if (A2 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int r4 = Build.VERSION.SDK_INT;
            if (r4 >= 23) {
                if ((r4 >= 28 ? v() : true) && (rootWindowInsets = this.f4819a.getRootWindowInsets()) != null) {
                    if (!this.f4836r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        A2.Y = true;
                        A2.W = true;
                    }
                    this.f4836r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
                }
            }
            A2.w0(fArr, hashSet, false);
            A2.c0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f4834p.contains(Integer.valueOf(lVar4.f4910b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f4910b != this.f4835q || arrayList2.size() != this.f4834p.size())) {
            this.f4835q = lVar3.f4910b;
            K(lVar3);
        }
        this.f4834p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f4834p.add(Integer.valueOf(((l) it.next()).f4910b));
        }
        Iterator<Map.Entry<Integer, l>> it2 = this.f4825g.entrySet().iterator();
        while (it2.hasNext()) {
            l value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                Y(value);
                it2.remove();
            }
        }
        S(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar5 = (l) it3.next();
            if (lVar5.f0()) {
                AccessibilityEvent G = G(lVar5.f4910b, 4096);
                float f7 = lVar5.f4920l;
                float f8 = lVar5.f4921m;
                if (Float.isInfinite(lVar5.f4921m)) {
                    if (f7 > 70000.0f) {
                        f7 = 70000.0f;
                    }
                    f8 = 100000.0f;
                }
                if (Float.isInfinite(lVar5.f4922n)) {
                    f5 = f8 + 100000.0f;
                    if (f7 < -70000.0f) {
                        f7 = -70000.0f;
                    }
                    f6 = f7 + 100000.0f;
                } else {
                    f5 = f8 - lVar5.f4922n;
                    f6 = f7 - lVar5.f4922n;
                }
                if (lVar5.m0(g.SCROLL_UP) || lVar5.m0(g.SCROLL_DOWN)) {
                    G.setScrollY((int) f6);
                    G.setMaxScrollY((int) f5);
                } else if (lVar5.m0(g.SCROLL_LEFT) || lVar5.m0(g.SCROLL_RIGHT)) {
                    G.setScrollX((int) f6);
                    G.setMaxScrollX((int) f5);
                }
                if (lVar5.f4918j > 0) {
                    G.setItemCount(lVar5.f4918j);
                    G.setFromIndex(lVar5.f4919k);
                    Iterator it4 = lVar5.S.iterator();
                    int r42 = 0;
                    while (it4.hasNext()) {
                        if (!((l) it4.next()).p0(i.IS_HIDDEN)) {
                            r42++;
                        }
                    }
                    G.setToIndex((lVar5.f4919k + r42) - 1);
                }
                Q(G);
            }
            if (lVar5.p0(i.IS_LIVE_REGION) && lVar5.e0()) {
                S(lVar5.f4910b);
            }
            l lVar6 = this.f4827i;
            if (lVar6 != null && lVar6.f4910b == lVar5.f4910b) {
                i iVar = i.IS_SELECTED;
                if (!lVar5.n0(iVar) && lVar5.p0(iVar)) {
                    AccessibilityEvent G2 = G(lVar5.f4910b, 4);
                    G2.getText().add(lVar5.f4923o);
                    Q(G2);
                }
            }
            l lVar7 = this.f4831m;
            if (lVar7 != null && lVar7.f4910b == lVar5.f4910b && ((lVar2 = this.f4832n) == null || lVar2.f4910b != this.f4831m.f4910b)) {
                this.f4832n = this.f4831m;
                Q(G(lVar5.f4910b, 8));
            } else if (this.f4831m == null) {
                this.f4832n = null;
            }
            l lVar8 = this.f4831m;
            if (lVar8 != null && lVar8.f4910b == lVar5.f4910b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar5.n0(iVar2) && lVar5.p0(iVar2) && ((lVar = this.f4827i) == null || lVar.f4910b == this.f4831m.f4910b)) {
                    String str = lVar5.J != null ? lVar5.J : "";
                    String str2 = lVar5.f4925q != null ? lVar5.f4925q : "";
                    AccessibilityEvent u4 = u(lVar5.f4910b, str, str2);
                    if (u4 != null) {
                        Q(u4);
                    }
                    if (lVar5.E != lVar5.f4915g || lVar5.F != lVar5.f4916h) {
                        AccessibilityEvent G3 = G(lVar5.f4910b, 8192);
                        G3.getText().add(str2);
                        G3.setFromIndex(lVar5.f4915g);
                        G3.setToIndex(lVar5.f4916h);
                        G3.setItemCount(str2.length());
                        Q(G3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0455 A[LOOP:0: B:188:0x044f->B:190:0x0455, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047a  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.c$l r2 = r1.f4831m
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.c.l.a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.f4829k
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.c$l r2 = r1.f4827i
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.f4828j
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int r8, int r9, Bundle bundle) {
        int r10;
        if (r8 >= 65536) {
            boolean performAction = this.f4822d.performAction(r8, r9, bundle);
            if (performAction && r9 == 128) {
                this.f4828j = null;
            }
            return performAction;
        }
        l lVar = this.f4825g.get(Integer.valueOf(r8));
        boolean z4 = false;
        if (lVar == null) {
            return false;
        }
        switch (r9) {
            case 16:
                this.f4820b.b(r8, g.TAP);
                return true;
            case 32:
                this.f4820b.b(r8, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f4827i == null) {
                    this.f4819a.invalidate();
                }
                this.f4827i = lVar;
                this.f4820b.b(r8, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                P(r8, 32768);
                if (lVar.o0(g.INCREASE) || lVar.o0(g.DECREASE)) {
                    P(r8, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f4827i;
                if (lVar2 != null && lVar2.f4910b == r8) {
                    this.f4827i = null;
                }
                Integer num = this.f4828j;
                if (num != null && num.intValue() == r8) {
                    this.f4828j = null;
                }
                this.f4820b.b(r8, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                P(r8, 65536);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return L(lVar, r8, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return L(lVar, r8, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.o0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.o0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.o0(gVar)) {
                            return false;
                        }
                        lVar.f4925q = lVar.f4927s;
                        lVar.f4926r = lVar.f4928t;
                        P(r8, 4);
                    }
                }
                this.f4820b.b(r8, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.o0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.o0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.o0(gVar2)) {
                            return false;
                        }
                        lVar.f4925q = lVar.f4929u;
                        lVar.f4926r = lVar.f4930v;
                        P(r8, 4);
                    }
                }
                this.f4820b.b(r8, gVar2);
                return true;
            case 16384:
                this.f4820b.b(r8, g.COPY);
                return true;
            case 32768:
                this.f4820b.b(r8, g.PASTE);
                return true;
            case 65536:
                this.f4820b.b(r8, g.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z4 = true;
                }
                if (z4) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    r10 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f4916h));
                    r10 = lVar.f4916h;
                }
                hashMap.put("extent", Integer.valueOf(r10));
                this.f4820b.c(r8, g.SET_SELECTION, hashMap);
                l lVar3 = this.f4825g.get(Integer.valueOf(r8));
                lVar3.f4915g = ((Integer) hashMap.get("base")).intValue();
                lVar3.f4916h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f4820b.b(r8, g.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return M(lVar, r8, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f4820b.b(r8, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f4826h.get(Integer.valueOf(r9 - A));
                if (hVar == null) {
                    return false;
                }
                this.f4820b.c(r8, g.CUSTOM_ACTION, Integer.valueOf(hVar.f4881b));
                return true;
        }
    }

    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f4822d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f4822d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f4829k = recordFlutterId;
            this.f4831m = null;
            return true;
        }
        if (eventType == 128) {
            this.f4833o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f4828j = recordFlutterId;
            this.f4827i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f4829k = null;
        this.f4828j = null;
        return true;
    }
}
