package a1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.hp;
import com.google.android.gms.internal.p000firebaseauthapi.uo;
import com.google.android.gms.internal.p000firebaseauthapi.zf;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i1 extends x.a implements com.google.firebase.auth.x0 {
    public static final Parcelable.Creator<i1> CREATOR = new j1();

    /* renamed from: e, reason: collision with root package name */
    private final String f56e;

    /* renamed from: f, reason: collision with root package name */
    private final String f57f;

    /* renamed from: g, reason: collision with root package name */
    private final String f58g;

    /* renamed from: h, reason: collision with root package name */
    private String f59h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f60i;

    /* renamed from: j, reason: collision with root package name */
    private final String f61j;

    /* renamed from: k, reason: collision with root package name */
    private final String f62k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f63l;

    /* renamed from: m, reason: collision with root package name */
    private final String f64m;

    public i1(hp hpVar) {
        w.r.i(hpVar);
        this.f56e = hpVar.m0();
        this.f57f = w.r.e(hpVar.o0());
        this.f58g = hpVar.k0();
        Uri j02 = hpVar.j0();
        if (j02 != null) {
            this.f59h = j02.toString();
            this.f60i = j02;
        }
        this.f61j = hpVar.l0();
        this.f62k = hpVar.n0();
        this.f63l = false;
        this.f64m = hpVar.p0();
    }

    public i1(uo uoVar, String str) {
        w.r.i(uoVar);
        w.r.e("firebase");
        this.f56e = w.r.e(uoVar.x0());
        this.f57f = "firebase";
        this.f61j = uoVar.w0();
        this.f58g = uoVar.v0();
        Uri l02 = uoVar.l0();
        if (l02 != null) {
            this.f59h = l02.toString();
            this.f60i = l02;
        }
        this.f63l = uoVar.B0();
        this.f64m = null;
        this.f62k = uoVar.y0();
    }

    public i1(String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        this.f56e = str;
        this.f57f = str2;
        this.f61j = str3;
        this.f62k = str4;
        this.f58g = str5;
        this.f59h = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f60i = Uri.parse(this.f59h);
        }
        this.f63l = z4;
        this.f64m = str7;
    }

    @Override // com.google.firebase.auth.x0
    public final boolean F() {
        return this.f63l;
    }

    @Override // com.google.firebase.auth.x0
    public final String R() {
        return this.f58g;
    }

    @Override // com.google.firebase.auth.x0
    public final String X() {
        return this.f62k;
    }

    public final String a() {
        return this.f64m;
    }

    @Override // com.google.firebase.auth.x0
    public final String e() {
        return this.f56e;
    }

    @Override // com.google.firebase.auth.x0
    public final String h() {
        return this.f57f;
    }

    public final String j0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f56e);
            jSONObject.putOpt("providerId", this.f57f);
            jSONObject.putOpt("displayName", this.f58g);
            jSONObject.putOpt("photoUrl", this.f59h);
            jSONObject.putOpt("email", this.f61j);
            jSONObject.putOpt("phoneNumber", this.f62k);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f63l));
            jSONObject.putOpt("rawUserInfo", this.f64m);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zf(e5);
        }
    }

    @Override // com.google.firebase.auth.x0
    public final Uri l() {
        if (!TextUtils.isEmpty(this.f59h) && this.f60i == null) {
            this.f60i = Uri.parse(this.f59h);
        }
        return this.f60i;
    }

    @Override // com.google.firebase.auth.x0
    public final String n() {
        return this.f61j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f56e, false);
        x.c.m(parcel, 2, this.f57f, false);
        x.c.m(parcel, 3, this.f58g, false);
        x.c.m(parcel, 4, this.f59h, false);
        x.c.m(parcel, 5, this.f61j, false);
        x.c.m(parcel, 6, this.f62k, false);
        x.c.c(parcel, 7, this.f63l);
        x.c.m(parcel, 8, this.f64m, false);
        x.c.b(parcel, a5);
    }
}
