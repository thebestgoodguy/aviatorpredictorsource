package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f4583a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f4584b;

    /* renamed from: c, reason: collision with root package name */
    private int f4585c;

    /* renamed from: d, reason: collision with root package name */
    private int f4586d;

    /* renamed from: e, reason: collision with root package name */
    private int f4587e;

    /* renamed from: f, reason: collision with root package name */
    private int f4588f;

    /* renamed from: g, reason: collision with root package name */
    private int f4589g;

    /* renamed from: h, reason: collision with root package name */
    private int f4590h;

    public e(CharSequence charSequence, int r22, int r32, int r4, int r5) {
        this.f4587e = r22;
        this.f4588f = r32;
        this.f4589g = r4;
        this.f4590h = r5;
        a(charSequence, "", -1, -1);
    }

    public e(CharSequence charSequence, int r22, int r32, CharSequence charSequence2, int r5, int r6, int r7, int r8) {
        this.f4587e = r5;
        this.f4588f = r6;
        this.f4589g = r7;
        this.f4590h = r8;
        a(charSequence, charSequence2.toString(), r22, r32);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int r32, int r4) {
        this.f4583a = charSequence;
        this.f4584b = charSequence2;
        this.f4585c = r32;
        this.f4586d = r4;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f4583a.toString());
            jSONObject.put("deltaText", this.f4584b.toString());
            jSONObject.put("deltaStart", this.f4585c);
            jSONObject.put("deltaEnd", this.f4586d);
            jSONObject.put("selectionBase", this.f4587e);
            jSONObject.put("selectionExtent", this.f4588f);
            jSONObject.put("composingBase", this.f4589g);
            jSONObject.put("composingExtent", this.f4590h);
        } catch (JSONException e5) {
            e2.b.b("TextEditingDelta", "unable to create JSONObject: " + e5);
        }
        return jSONObject;
    }
}
