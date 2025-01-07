package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b0.d;
import b0.f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import w.r;
import x.c;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends x.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public static d f1185r = f.b();

    /* renamed from: e, reason: collision with root package name */
    final int f1186e;

    /* renamed from: f, reason: collision with root package name */
    private String f1187f;

    /* renamed from: g, reason: collision with root package name */
    private String f1188g;

    /* renamed from: h, reason: collision with root package name */
    private String f1189h;

    /* renamed from: i, reason: collision with root package name */
    private String f1190i;

    /* renamed from: j, reason: collision with root package name */
    private Uri f1191j;

    /* renamed from: k, reason: collision with root package name */
    private String f1192k;

    /* renamed from: l, reason: collision with root package name */
    private long f1193l;

    /* renamed from: m, reason: collision with root package name */
    private String f1194m;

    /* renamed from: n, reason: collision with root package name */
    List<Scope> f1195n;

    /* renamed from: o, reason: collision with root package name */
    private String f1196o;

    /* renamed from: p, reason: collision with root package name */
    private String f1197p;

    /* renamed from: q, reason: collision with root package name */
    private Set<Scope> f1198q = new HashSet();

    GoogleSignInAccount(int r22, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, List<Scope> list, String str7, String str8) {
        this.f1186e = r22;
        this.f1187f = str;
        this.f1188g = str2;
        this.f1189h = str3;
        this.f1190i = str4;
        this.f1191j = uri;
        this.f1192k = str5;
        this.f1193l = j4;
        this.f1194m = str6;
        this.f1195n = list;
        this.f1196o = str7;
        this.f1197p = str8;
    }

    public static GoogleSignInAccount q0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l4, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l4.longValue(), r.e(str7), new ArrayList((Collection) r.i(set)), str5, str6);
    }

    public static GoogleSignInAccount r0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int r5 = 0; r5 < length; r5++) {
            hashSet.add(new Scope(jSONArray.getString(r5)));
        }
        GoogleSignInAccount q02 = q0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        q02.f1192k = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return q02;
    }

    public String R() {
        return this.f1190i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f1194m.equals(this.f1194m) && googleSignInAccount.o0().equals(o0());
    }

    public int hashCode() {
        return ((this.f1194m.hashCode() + 527) * 31) + o0().hashCode();
    }

    public Account j0() {
        String str = this.f1189h;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String k0() {
        return this.f1197p;
    }

    public Uri l() {
        return this.f1191j;
    }

    public String l0() {
        return this.f1196o;
    }

    public String m0() {
        return this.f1187f;
    }

    public String n() {
        return this.f1189h;
    }

    public String n0() {
        return this.f1188g;
    }

    public Set<Scope> o0() {
        HashSet hashSet = new HashSet(this.f1195n);
        hashSet.addAll(this.f1198q);
        return hashSet;
    }

    public String p0() {
        return this.f1192k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.h(parcel, 1, this.f1186e);
        c.m(parcel, 2, m0(), false);
        c.m(parcel, 3, n0(), false);
        c.m(parcel, 4, n(), false);
        c.m(parcel, 5, R(), false);
        c.l(parcel, 6, l(), r6, false);
        c.m(parcel, 7, p0(), false);
        c.j(parcel, 8, this.f1193l);
        c.m(parcel, 9, this.f1194m, false);
        c.q(parcel, 10, this.f1195n, false);
        c.m(parcel, 11, l0(), false);
        c.m(parcel, 12, k0(), false);
        c.b(parcel, a5);
    }
}
