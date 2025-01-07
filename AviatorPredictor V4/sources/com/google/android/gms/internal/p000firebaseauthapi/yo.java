package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.e;
import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class yo implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f2391e;

    /* renamed from: f, reason: collision with root package name */
    private String f2392f;

    /* renamed from: g, reason: collision with root package name */
    private String f2393g;

    /* renamed from: h, reason: collision with root package name */
    private String f2394h;

    /* renamed from: i, reason: collision with root package name */
    private e f2395i;

    /* renamed from: j, reason: collision with root package name */
    private String f2396j;

    public yo(int r22) {
        this.f2391e = r22 != 1 ? r22 != 4 ? r22 != 6 ? r22 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private yo(int r12, e eVar, String str, String str2, String str3, String str4) {
        this.f2391e = "VERIFY_AND_CHANGE_EMAIL";
        this.f2395i = (e) r.i(eVar);
        this.f2392f = null;
        this.f2393g = str2;
        this.f2394h = str3;
        this.f2396j = null;
    }

    public static yo c(e eVar, String str, String str2) {
        r.e(str);
        r.e(str2);
        r.i(eVar);
        return new yo(7, eVar, null, str2, str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        char c5;
        JSONObject jSONObject = new JSONObject();
        String str = this.f2391e;
        int r32 = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        if (c5 == 0) {
            r32 = 1;
        } else if (c5 == 1) {
            r32 = 4;
        } else if (c5 == 2) {
            r32 = 6;
        } else if (c5 == 3) {
            r32 = 7;
        }
        jSONObject.put("requestType", r32);
        String str2 = this.f2392f;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.f2393g;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.f2394h;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        e eVar = this.f2395i;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.k0());
            jSONObject.put("canHandleCodeInApp", this.f2395i.j0());
            if (this.f2395i.o0() != null) {
                jSONObject.put("continueUrl", this.f2395i.o0());
            }
            if (this.f2395i.n0() != null) {
                jSONObject.put("iosBundleId", this.f2395i.n0());
            }
            if (this.f2395i.t0() != null) {
                jSONObject.put("iosAppStoreId", this.f2395i.t0());
            }
            if (this.f2395i.m0() != null) {
                jSONObject.put("androidPackageName", this.f2395i.m0());
            }
            if (this.f2395i.l0() != null) {
                jSONObject.put("androidMinimumVersion", this.f2395i.l0());
            }
            if (this.f2395i.s0() != null) {
                jSONObject.put("dynamicLinkDomain", this.f2395i.s0());
            }
        }
        String str5 = this.f2396j;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        return jSONObject.toString();
    }

    public final e b() {
        return this.f2395i;
    }

    public final yo d(e eVar) {
        this.f2395i = (e) r.i(eVar);
        return this;
    }

    public final yo e(String str) {
        this.f2392f = r.e(str);
        return this;
    }

    public final yo f(String str) {
        this.f2396j = str;
        return this;
    }

    public final yo g(String str) {
        this.f2394h = r.e(str);
        return this;
    }
}
