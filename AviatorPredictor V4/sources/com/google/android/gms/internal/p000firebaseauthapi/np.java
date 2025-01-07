package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b0.l;
import org.json.JSONException;
import org.json.JSONObject;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class np extends a implements om<np> {

    /* renamed from: e, reason: collision with root package name */
    private String f1974e;

    /* renamed from: f, reason: collision with root package name */
    private String f1975f;

    /* renamed from: g, reason: collision with root package name */
    private String f1976g;

    /* renamed from: h, reason: collision with root package name */
    private fp f1977h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f1973i = np.class.getSimpleName();
    public static final Parcelable.Creator<np> CREATOR = new op();

    public np() {
    }

    np(String str, String str2, String str3, fp fpVar) {
        this.f1974e = str;
        this.f1975f = str2;
        this.f1976g = str3;
        this.f1977h = fpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        String str2;
        char c5;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1974e = l.a(jSONObject.optString("email"));
            this.f1975f = l.a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.f1976g = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                this.f1976g = (c5 == 0 || c5 == 1 || c5 == 2 || c5 == 3 || c5 == 4 || c5 == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.f1977h = fp.k0(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1973i, str);
        }
    }

    public final fp j0() {
        return this.f1977h;
    }

    public final String k0() {
        return this.f1974e;
    }

    public final String l0() {
        return this.f1975f;
    }

    public final String m0() {
        return this.f1976g;
    }

    public final boolean n0() {
        return this.f1974e != null;
    }

    public final boolean o0() {
        return this.f1977h != null;
    }

    public final boolean p0() {
        return this.f1975f != null;
    }

    public final boolean q0() {
        return this.f1976g != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f1974e, false);
        c.m(parcel, 3, this.f1975f, false);
        c.m(parcel, 4, this.f1976g, false);
        c.l(parcel, 5, this.f1977h, r6, false);
        c.b(parcel, a5);
    }
}
