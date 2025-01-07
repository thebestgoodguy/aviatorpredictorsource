package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import q2.p;

/* loaded from: classes.dex */
class c extends SpannableStringBuilder {

    /* renamed from: e, reason: collision with root package name */
    private int f4565e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f4566f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<b> f4567g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<b> f4568h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<e> f4569i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private String f4570j;

    /* renamed from: k, reason: collision with root package name */
    private String f4571k;

    /* renamed from: l, reason: collision with root package name */
    private int f4572l;

    /* renamed from: m, reason: collision with root package name */
    private int f4573m;

    /* renamed from: n, reason: collision with root package name */
    private int f4574n;

    /* renamed from: o, reason: collision with root package name */
    private int f4575o;

    /* renamed from: p, reason: collision with root package name */
    private BaseInputConnection f4576p;

    class a extends BaseInputConnection {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f4577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z4, Editable editable) {
            super(view, z4);
            this.f4577a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f4577a;
        }
    }

    interface b {
        void a(boolean z4, boolean z5, boolean z6);
    }

    public c(p.e eVar, View view) {
        this.f4576p = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z4, boolean z5, boolean z6) {
        this.f4566f++;
        bVar.a(z4, z5, z6);
        this.f4566f--;
    }

    private void k(boolean z4, boolean z5, boolean z6) {
        if (z4 || z5 || z6) {
            Iterator<b> it = this.f4567g.iterator();
            while (it.hasNext()) {
                j(it.next(), z4, z5, z6);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f4566f > 0) {
            e2.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f4565e > 0) {
            e2.b.f("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f4568h;
        } else {
            arrayList = this.f4567g;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f4565e++;
        if (this.f4566f > 0) {
            e2.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f4565e != 1 || this.f4567g.isEmpty()) {
            return;
        }
        this.f4571k = toString();
        this.f4572l = i();
        this.f4573m = h();
        this.f4574n = g();
        this.f4575o = f();
    }

    public void c() {
        this.f4569i.clear();
    }

    public void d() {
        int r02 = this.f4565e;
        if (r02 == 0) {
            e2.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (r02 == 1) {
            Iterator<b> it = this.f4568h.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f4567g.isEmpty()) {
                e2.b.e("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f4567g.size()) + " listener(s)");
                k(!toString().equals(this.f4571k), (this.f4572l == i() && this.f4573m == h()) ? false : true, (this.f4574n == g() && this.f4575o == f()) ? false : true);
            }
        }
        this.f4567g.addAll(this.f4568h);
        this.f4568h.clear();
        this.f4565e--;
    }

    public ArrayList<e> e() {
        ArrayList<e> arrayList = new ArrayList<>(this.f4569i);
        this.f4569i.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f4566f > 0) {
            e2.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f4567g.remove(bVar);
        if (this.f4565e > 0) {
            this.f4568h.remove(bVar);
        }
    }

    public void m(int r22, int r32) {
        if (r22 < 0 || r22 >= r32) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f4576p.setComposingRegion(r22, r32);
        }
    }

    public void n(p.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f7348a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f7349b, eVar.f7350c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f7351d, eVar.f7352e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int r22, int r23, CharSequence charSequence, int r25, int r26) {
        boolean z4;
        boolean z5;
        if (this.f4566f > 0) {
            e2.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int r12 = r23 - r22;
        boolean z6 = r12 != r26 - r25;
        for (int r32 = 0; r32 < r12 && !z6; r32++) {
            z6 |= charAt(r22 + r32) != charSequence.charAt(r25 + r32);
        }
        if (z6) {
            this.f4570j = null;
        }
        int i4 = i();
        int h5 = h();
        int g5 = g();
        int f5 = f();
        SpannableStringBuilder replace = super.replace(r22, r23, charSequence, r25, r26);
        boolean z7 = z6;
        this.f4569i.add(new e(cVar, r22, r23, charSequence, i(), h(), g(), f()));
        if (this.f4565e > 0) {
            return replace;
        }
        boolean z8 = (i() == i4 && h() == h5) ? false : true;
        if (g() == g5 && f() == f5) {
            z4 = z7;
            z5 = false;
        } else {
            z4 = z7;
            z5 = true;
        }
        k(z4, z8, z5);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int r8, int r9, int r10) {
        super.setSpan(obj, r8, r9, r10);
        this.f4569i.add(new e(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f4570j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f4570j = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
