package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.q;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.n;
import java.util.HashMap;
import q2.p;

/* loaded from: classes.dex */
public class f implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final View f4591a;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f4592b;

    /* renamed from: c, reason: collision with root package name */
    private final AutofillManager f4593c;

    /* renamed from: d, reason: collision with root package name */
    private final p f4594d;

    /* renamed from: e, reason: collision with root package name */
    private c f4595e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    private p.b f4596f;

    /* renamed from: g, reason: collision with root package name */
    private SparseArray<p.b> f4597g;

    /* renamed from: h, reason: collision with root package name */
    private io.flutter.plugin.editing.c f4598h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4599i;

    /* renamed from: j, reason: collision with root package name */
    private InputConnection f4600j;

    /* renamed from: k, reason: collision with root package name */
    private n f4601k;

    /* renamed from: l, reason: collision with root package name */
    private Rect f4602l;

    /* renamed from: m, reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f4603m;

    /* renamed from: n, reason: collision with root package name */
    private p.e f4604n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4605o;

    class a implements p.f {
        a() {
        }

        @Override // q2.p.f
        public void a(String str, Bundle bundle) {
            f.this.B(str, bundle);
        }

        @Override // q2.p.f
        public void b() {
            f.this.m();
        }

        @Override // q2.p.f
        public void c() {
            f fVar = f.this;
            fVar.F(fVar.f4591a);
        }

        @Override // q2.p.f
        public void d(int r22, boolean z4) {
            f.this.C(r22, z4);
        }

        @Override // q2.p.f
        public void e(double d5, double d6, double[] dArr) {
            f.this.A(d5, d6, dArr);
        }

        @Override // q2.p.f
        public void f() {
            f.this.x();
        }

        @Override // q2.p.f
        public void g(p.e eVar) {
            f fVar = f.this;
            fVar.E(fVar.f4591a, eVar);
        }

        @Override // q2.p.f
        public void h(int r22, p.b bVar) {
            f.this.D(r22, bVar);
        }

        @Override // q2.p.f
        public void i(boolean z4) {
            if (Build.VERSION.SDK_INT < 26 || f.this.f4593c == null) {
                return;
            }
            if (z4) {
                f.this.f4593c.commit();
            } else {
                f.this.f4593c.cancel();
            }
        }

        @Override // q2.p.f
        public void j() {
            if (f.this.f4595e.f4611a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                f.this.y();
            } else {
                f fVar = f.this;
                fVar.s(fVar.f4591a);
            }
        }
    }

    class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f4608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f4609c;

        b(boolean z4, double[] dArr, double[] dArr2) {
            this.f4607a = z4;
            this.f4608b = dArr;
            this.f4609c = dArr2;
        }

        @Override // io.flutter.plugin.editing.f.d
        public void a(double d5, double d6) {
            double d7 = 1.0d;
            if (!this.f4607a) {
                double[] dArr = this.f4608b;
                d7 = 1.0d / (((dArr[3] * d5) + (dArr[7] * d6)) + dArr[15]);
            }
            double[] dArr2 = this.f4608b;
            double d8 = ((dArr2[0] * d5) + (dArr2[4] * d6) + dArr2[12]) * d7;
            double d9 = ((dArr2[1] * d5) + (dArr2[5] * d6) + dArr2[13]) * d7;
            double[] dArr3 = this.f4609c;
            if (d8 < dArr3[0]) {
                dArr3[0] = d8;
            } else if (d8 > dArr3[1]) {
                dArr3[1] = d8;
            }
            if (d9 < dArr3[2]) {
                dArr3[2] = d9;
            } else if (d9 > dArr3[3]) {
                dArr3[3] = d9;
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        a f4611a;

        /* renamed from: b, reason: collision with root package name */
        int f4612b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int r22) {
            this.f4611a = aVar;
            this.f4612b = r22;
        }
    }

    private interface d {
        void a(double d5, double d6);
    }

    public f(View view, p pVar, n nVar) {
        this.f4591a = view;
        this.f4598h = new io.flutter.plugin.editing.c(null, view);
        this.f4592b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int r02 = Build.VERSION.SDK_INT;
        this.f4593c = r02 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (r02 >= 30) {
            int navigationBars = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : 0;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? navigationBars | WindowInsets.Type.statusBars() : navigationBars, WindowInsets.Type.ime());
            this.f4603m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f4594d = pVar;
        pVar.m(new a());
        pVar.j();
        this.f4601k = nVar;
        nVar.A(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(double d5, double d6, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z4 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d7 = dArr[12] / dArr[15];
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / dArr[15];
        dArr2[3] = d8;
        dArr2[2] = d8;
        b bVar = new b(z4, dArr, dArr2);
        bVar.a(d5, 0.0d);
        bVar.a(d5, d6);
        bVar.a(0.0d, d6);
        Float valueOf = Float.valueOf(this.f4591a.getContext().getResources().getDisplayMetrics().density);
        this.f4602l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int r22, boolean z4) {
        if (!z4) {
            this.f4595e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, r22);
            this.f4600j = null;
        } else {
            this.f4591a.requestFocus();
            this.f4595e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, r22);
            this.f4592b.restartInput(this.f4591a);
            this.f4599i = false;
        }
    }

    private void H(p.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f7333j == null) {
            this.f4597g = null;
            return;
        }
        p.b[] bVarArr = bVar.f7334k;
        SparseArray<p.b> sparseArray = new SparseArray<>();
        this.f4597g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f7333j.f7335a.hashCode(), bVar);
            return;
        }
        for (p.b bVar2 : bVarArr) {
            p.b.a aVar = bVar2.f7333j;
            if (aVar != null) {
                this.f4597g.put(aVar.f7335a.hashCode(), bVar2);
                this.f4593c.notifyValueChanged(this.f4591a, aVar.f7335a.hashCode(), AutofillValue.forText(aVar.f7337c.f7348a));
            }
        }
    }

    private boolean k() {
        p.c cVar;
        p.b bVar = this.f4596f;
        return bVar == null || (cVar = bVar.f7330g) == null || cVar.f7339a != p.g.NONE;
    }

    private static boolean n(p.e eVar, p.e eVar2) {
        int r02 = eVar.f7352e - eVar.f7351d;
        if (r02 != eVar2.f7352e - eVar2.f7351d) {
            return true;
        }
        for (int r32 = 0; r32 < r02; r32++) {
            if (eVar.f7348a.charAt(eVar.f7351d + r32) != eVar2.f7348a.charAt(eVar2.f7351d + r32)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(View view) {
        y();
        this.f4592b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int t(p.c cVar, boolean z4, boolean z5, boolean z6, boolean z7, p.d dVar) {
        p.g gVar = cVar.f7339a;
        if (gVar == p.g.DATETIME) {
            return 4;
        }
        if (gVar == p.g.NUMBER) {
            int r22 = cVar.f7340b ? 4098 : 2;
            return cVar.f7341c ? r22 | 8192 : r22;
        }
        if (gVar == p.g.PHONE) {
            return 3;
        }
        if (gVar == p.g.NONE) {
            return 0;
        }
        int r12 = 1;
        if (gVar == p.g.MULTILINE) {
            r12 = 131073;
        } else if (gVar == p.g.EMAIL_ADDRESS) {
            r12 = 33;
        } else if (gVar == p.g.URL) {
            r12 = 17;
        } else if (gVar == p.g.VISIBLE_PASSWORD) {
            r12 = 145;
        } else if (gVar == p.g.NAME) {
            r12 = 97;
        } else if (gVar == p.g.POSTAL_ADDRESS) {
            r12 = 113;
        }
        if (z4) {
            r12 = r12 | 524288 | 128;
        } else {
            if (z5) {
                r12 |= 32768;
            }
            if (!z6) {
                r12 |= 524288;
            }
        }
        return dVar == p.d.CHARACTERS ? r12 | 4096 : dVar == p.d.WORDS ? r12 | 8192 : dVar == p.d.SENTENCES ? r12 | 16384 : r12;
    }

    private boolean v() {
        return this.f4597g != null;
    }

    private void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f4593c == null || !v()) {
            return;
        }
        this.f4593c.notifyValueChanged(this.f4591a, this.f4596f.f7333j.f7335a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f4593c == null || !v()) {
            return;
        }
        String str = this.f4596f.f7333j.f7335a;
        int[] r12 = new int[2];
        this.f4591a.getLocationOnScreen(r12);
        Rect rect = new Rect(this.f4602l);
        rect.offset(r12[0], r12[1]);
        this.f4593c.notifyViewEntered(this.f4591a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        p.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f4593c == null || (bVar = this.f4596f) == null || bVar.f7333j == null || !v()) {
            return;
        }
        this.f4593c.notifyViewExited(this.f4591a, this.f4596f.f7333j.f7335a.hashCode());
    }

    public void B(String str, Bundle bundle) {
        this.f4592b.sendAppPrivateCommand(this.f4591a, str, bundle);
    }

    void D(int r4, p.b bVar) {
        y();
        this.f4596f = bVar;
        this.f4595e = k() ? new c(c.a.FRAMEWORK_CLIENT, r4) : new c(c.a.NO_TARGET, r4);
        this.f4598h.l(this);
        p.b.a aVar = bVar.f7333j;
        this.f4598h = new io.flutter.plugin.editing.c(aVar != null ? aVar.f7337c : null, this.f4591a);
        H(bVar);
        this.f4599i = true;
        G();
        this.f4602l = null;
        this.f4598h.a(this);
    }

    void E(View view, p.e eVar) {
        p.e eVar2;
        if (!this.f4599i && (eVar2 = this.f4604n) != null && eVar2.b()) {
            boolean n4 = n(this.f4604n, eVar);
            this.f4599i = n4;
            if (n4) {
                e2.b.d("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f4604n = eVar;
        this.f4598h.n(eVar);
        if (this.f4599i) {
            this.f4592b.restartInput(view);
            this.f4599i = false;
        }
    }

    void F(View view) {
        if (!k()) {
            s(view);
        } else {
            view.requestFocus();
            this.f4592b.showSoftInput(view, 0);
        }
    }

    public void G() {
        if (this.f4595e.f4611a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f4605o = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.f7352e) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.c r9 = r8.f4598h
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        Lb:
            io.flutter.plugin.editing.c r9 = r8.f4598h
            int r9 = r9.i()
            io.flutter.plugin.editing.c r10 = r8.f4598h
            int r10 = r10.h()
            io.flutter.plugin.editing.c r11 = r8.f4598h
            int r11 = r11.g()
            io.flutter.plugin.editing.c r0 = r8.f4598h
            int r7 = r0.f()
            io.flutter.plugin.editing.c r0 = r8.f4598h
            java.util.ArrayList r0 = r0.e()
            q2.p$e r1 = r8.f4604n
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.c r1 = r8.f4598h
            java.lang.String r1 = r1.toString()
            q2.p$e r2 = r8.f4604n
            java.lang.String r2 = r2.f7348a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            q2.p$e r1 = r8.f4604n
            int r2 = r1.f7349b
            if (r9 != r2) goto L50
            int r2 = r1.f7350c
            if (r10 != r2) goto L50
            int r2 = r1.f7351d
            if (r11 != r2) goto L50
            int r1 = r1.f7352e
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f4598h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            e2.b.e(r2, r1)
            q2.p$b r1 = r8.f4596f
            boolean r1 = r1.f7328e
            if (r1 == 0) goto L86
            q2.p r1 = r8.f4594d
            io.flutter.plugin.editing.f$c r2 = r8.f4595e
            int r2 = r2.f4612b
            r1.p(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f4598h
            r0.c()
            goto L99
        L86:
            q2.p r0 = r8.f4594d
            io.flutter.plugin.editing.f$c r1 = r8.f4595e
            int r1 = r1.f4612b
            io.flutter.plugin.editing.c r2 = r8.f4598h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.o(r1, r2, r3, r4, r5, r6)
        L99:
            q2.p$e r6 = new q2.p$e
            io.flutter.plugin.editing.c r0 = r8.f4598h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f4604n = r6
            goto Lb1
        Lac:
            io.flutter.plugin.editing.c r9 = r8.f4598h
            r9.c()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.f.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        p.b bVar;
        p.b.a aVar;
        p.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f4596f) == null || this.f4597g == null || (aVar = bVar.f7333j) == null) {
            return;
        }
        HashMap<String, p.e> hashMap = new HashMap<>();
        for (int r22 = 0; r22 < sparseArray.size(); r22++) {
            p.b bVar2 = this.f4597g.get(sparseArray.keyAt(r22));
            if (bVar2 != null && (aVar2 = bVar2.f7333j) != null) {
                String charSequence = sparseArray.valueAt(r22).getTextValue().toString();
                p.e eVar = new p.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f7335a.equals(aVar.f7335a)) {
                    this.f4598h.n(eVar);
                } else {
                    hashMap.put(aVar2.f7335a, eVar);
                }
            }
        }
        this.f4594d.q(this.f4595e.f4612b, hashMap);
    }

    public void l(int r4) {
        c cVar = this.f4595e;
        c.a aVar = cVar.f4611a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f4612b == r4) {
            this.f4595e = new c(c.a.NO_TARGET, 0);
            y();
            this.f4592b.hideSoftInputFromWindow(this.f4591a.getApplicationWindowToken(), 0);
            this.f4592b.restartInput(this.f4591a);
            this.f4599i = false;
        }
    }

    void m() {
        if (this.f4595e.f4611a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f4598h.l(this);
        y();
        this.f4596f = null;
        H(null);
        this.f4595e = new c(c.a.NO_TARGET, 0);
        G();
        this.f4602l = null;
    }

    public InputConnection o(View view, q qVar, EditorInfo editorInfo) {
        c cVar = this.f4595e;
        c.a aVar = cVar.f4611a;
        if (aVar == c.a.NO_TARGET) {
            this.f4600j = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f4605o) {
                return this.f4600j;
            }
            InputConnection onCreateInputConnection = this.f4601k.d(cVar.f4612b).onCreateInputConnection(editorInfo);
            this.f4600j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        p.b bVar = this.f4596f;
        int t4 = t(bVar.f7330g, bVar.f7324a, bVar.f7325b, bVar.f7326c, bVar.f7327d, bVar.f7329f);
        editorInfo.inputType = t4;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f4596f.f7327d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f4596f.f7331h;
        int intValue = num == null ? (t4 & 131072) != 0 ? 1 : 6 : num.intValue();
        String str = this.f4596f.f7332i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        io.flutter.plugin.editing.b bVar2 = new io.flutter.plugin.editing.b(view, this.f4595e.f4612b, this.f4594d, qVar, this.f4598h, editorInfo);
        editorInfo.initialSelStart = this.f4598h.i();
        editorInfo.initialSelEnd = this.f4598h.h();
        this.f4600j = bVar2;
        return bVar2;
    }

    public void p() {
        this.f4601k.J();
        this.f4594d.m(null);
        y();
        this.f4598h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f4603m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f4592b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f4600j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void u() {
        if (this.f4595e.f4611a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f4605o = true;
        }
    }

    public void z(ViewStructure viewStructure, int r18) {
        ViewStructure viewStructure2;
        CharSequence charSequence;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f4596f.f7333j.f7335a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int r5 = 0; r5 < this.f4597g.size(); r5++) {
            int keyAt = this.f4597g.keyAt(r5);
            p.b.a aVar = this.f4597g.valueAt(r5).f7333j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(r5);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f7336b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f7338d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f4602l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f7337c.f7348a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f4602l.height());
                    charSequence = this.f4598h;
                }
                viewStructure2.setAutofillValue(AutofillValue.forText(charSequence));
            }
        }
    }
}
