package com.google.android.gms.internal.p000firebaseauthapi;

import a1.x0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import w.r;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class cq extends a implements nm {
    public static final Parcelable.Creator<cq> CREATOR = new dq();

    /* renamed from: e, reason: collision with root package name */
    private String f1494e;

    /* renamed from: f, reason: collision with root package name */
    private String f1495f;

    /* renamed from: g, reason: collision with root package name */
    private String f1496g;

    /* renamed from: h, reason: collision with root package name */
    private String f1497h;

    /* renamed from: i, reason: collision with root package name */
    private String f1498i;

    /* renamed from: j, reason: collision with root package name */
    private String f1499j;

    /* renamed from: k, reason: collision with root package name */
    private String f1500k;

    /* renamed from: l, reason: collision with root package name */
    private String f1501l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1502m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1503n;

    /* renamed from: o, reason: collision with root package name */
    private String f1504o;

    /* renamed from: p, reason: collision with root package name */
    private String f1505p;

    /* renamed from: q, reason: collision with root package name */
    private String f1506q;

    /* renamed from: r, reason: collision with root package name */
    private String f1507r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1508s;

    /* renamed from: t, reason: collision with root package name */
    private String f1509t;

    public cq() {
        this.f1502m = true;
        this.f1503n = true;
    }

    public cq(x0 x0Var, String str) {
        r.i(x0Var);
        this.f1505p = r.e(x0Var.d());
        this.f1506q = r.e(str);
        String e5 = r.e(x0Var.c());
        this.f1498i = e5;
        this.f1502m = true;
        this.f1500k = "providerId=".concat(String.valueOf(e5));
    }

    public cq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f1494e = "http://localhost";
        this.f1496g = str;
        this.f1497h = str2;
        this.f1501l = str5;
        this.f1504o = str6;
        this.f1507r = str7;
        this.f1509t = str8;
        this.f1502m = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f1497h) && TextUtils.isEmpty(this.f1504o)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.f1498i = r.e(str3);
        this.f1499j = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f1496g)) {
            sb.append("id_token=");
            sb.append(this.f1496g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f1497h)) {
            sb.append("access_token=");
            sb.append(this.f1497h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f1499j)) {
            sb.append("identifier=");
            sb.append(this.f1499j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f1501l)) {
            sb.append("oauth_token_secret=");
            sb.append(this.f1501l);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f1504o)) {
            sb.append("code=");
            sb.append(this.f1504o);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.f1498i);
        this.f1500k = sb.toString();
        this.f1503n = true;
    }

    cq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z4, boolean z5, String str9, String str10, String str11, String str12, boolean z6, String str13) {
        this.f1494e = str;
        this.f1495f = str2;
        this.f1496g = str3;
        this.f1497h = str4;
        this.f1498i = str5;
        this.f1499j = str6;
        this.f1500k = str7;
        this.f1501l = str8;
        this.f1502m = z4;
        this.f1503n = z5;
        this.f1504o = str9;
        this.f1505p = str10;
        this.f1506q = str11;
        this.f1507r = str12;
        this.f1508s = z6;
        this.f1509t = str13;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.String, still in use, count: 2, list:
          (r1v10 java.lang.String) from 0x0058: IF  (r1v10 java.lang.String) != (null java.lang.String)  -> B:19:0x0052 A[HIDDEN]
          (r1v10 java.lang.String) from 0x0052: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String) binds: [B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final java.lang.String a() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.f1503n
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.f1502m
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f1495f
            if (r1 == 0) goto L1c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r3.f1500k
            if (r1 == 0) goto L25
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L25:
            java.lang.String r1 = r3.f1507r
            if (r1 == 0) goto L2e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L2e:
            java.lang.String r1 = r3.f1509t
            if (r1 == 0) goto L37
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r3.f1505p
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = r3.f1505p
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L46:
            java.lang.String r1 = r3.f1506q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L56
            java.lang.String r1 = r3.f1506q
        L52:
            r0.put(r2, r1)
            goto L5b
        L56:
            java.lang.String r1 = r3.f1494e
            if (r1 == 0) goto L5b
            goto L52
        L5b:
            boolean r1 = r3.f1508s
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.cq.a():java.lang.String");
    }

    public final cq j0(boolean z4) {
        this.f1503n = false;
        return this;
    }

    public final cq k0(String str) {
        this.f1495f = r.e(str);
        return this;
    }

    public final cq l0(boolean z4) {
        this.f1508s = true;
        return this;
    }

    public final cq m0(boolean z4) {
        this.f1502m = true;
        return this;
    }

    public final cq n0(String str) {
        this.f1507r = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f1494e, false);
        c.m(parcel, 3, this.f1495f, false);
        c.m(parcel, 4, this.f1496g, false);
        c.m(parcel, 5, this.f1497h, false);
        c.m(parcel, 6, this.f1498i, false);
        c.m(parcel, 7, this.f1499j, false);
        c.m(parcel, 8, this.f1500k, false);
        c.m(parcel, 9, this.f1501l, false);
        c.c(parcel, 10, this.f1502m);
        c.c(parcel, 11, this.f1503n);
        c.m(parcel, 12, this.f1504o, false);
        c.m(parcel, 13, this.f1505p, false);
        c.m(parcel, 14, this.f1506q, false);
        c.m(parcel, 15, this.f1507r, false);
        c.c(parcel, 16, this.f1508s);
        c.m(parcel, 17, this.f1509t, false);
        c.b(parcel, a5);
    }
}
