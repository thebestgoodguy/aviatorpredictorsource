package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class sp implements nm {

    /* renamed from: e, reason: collision with root package name */
    private String f2143e;

    /* renamed from: f, reason: collision with root package name */
    private String f2144f;

    /* renamed from: g, reason: collision with root package name */
    private String f2145g;

    /* renamed from: h, reason: collision with root package name */
    private String f2146h;

    /* renamed from: i, reason: collision with root package name */
    private String f2147i;

    /* renamed from: j, reason: collision with root package name */
    private String f2148j;

    /* renamed from: k, reason: collision with root package name */
    private final aq f2149k = new aq(null);

    /* renamed from: l, reason: collision with root package name */
    private final aq f2150l = new aq(null);

    /* renamed from: m, reason: collision with root package name */
    private String f2151m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        char c5;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.f2150l.k0().isEmpty()) {
            List k02 = this.f2150l.k0();
            JSONArray jSONArray = new JSONArray();
            for (int r5 = 0; r5 < k02.size(); r5++) {
                jSONArray.put(k02.get(r5));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List k03 = this.f2149k.k0();
        int size = k03.size();
        int[] r52 = new int[size];
        for (int r6 = 0; r6 < k03.size(); r6++) {
            String str = (String) k03.get(r6);
            int r10 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
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
                r10 = 1;
            } else if (c5 != 1) {
                r10 = c5 != 2 ? c5 != 3 ? 0 : 4 : 5;
            }
            r52[r6] = r10;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int r32 = 0; r32 < size; r32++) {
                jSONArray2.put(r52[r32]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.f2143e;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.f2145g;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.f2146h;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.f2144f;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.f2148j;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.f2147i;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.f2151m;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final sp b(String str) {
        r.e(str);
        this.f2150l.k0().add(str);
        return this;
    }

    public final sp c(String str) {
        if (str == null) {
            this.f2149k.k0().add("DISPLAY_NAME");
        } else {
            this.f2144f = str;
        }
        return this;
    }

    public final sp d(String str) {
        if (str == null) {
            this.f2149k.k0().add("EMAIL");
        } else {
            this.f2145g = str;
        }
        return this;
    }

    public final sp e(String str) {
        this.f2143e = r.e(str);
        return this;
    }

    public final sp f(String str) {
        this.f2147i = r.e(str);
        return this;
    }

    public final sp g(String str) {
        if (str == null) {
            this.f2149k.k0().add("PASSWORD");
        } else {
            this.f2146h = str;
        }
        return this;
    }

    public final sp h(String str) {
        if (str == null) {
            this.f2149k.k0().add("PHOTO_URL");
        } else {
            this.f2148j = str;
        }
        return this;
    }

    public final sp i(String str) {
        this.f2151m = str;
        return this;
    }

    public final String j() {
        return this.f2144f;
    }

    public final String k() {
        return this.f2145g;
    }

    public final String l() {
        return this.f2146h;
    }

    public final String m() {
        return this.f2148j;
    }

    public final boolean n(String str) {
        r.e(str);
        return this.f2149k.k0().contains(str);
    }
}
