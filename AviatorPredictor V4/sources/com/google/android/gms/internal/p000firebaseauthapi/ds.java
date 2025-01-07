package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ds {

    /* renamed from: d, reason: collision with root package name */
    private static final ds f1529d = new ds(true);

    /* renamed from: a, reason: collision with root package name */
    final e1 f1530a = new t0(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f1531b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1532c;

    private ds() {
    }

    private ds(boolean z4) {
        b();
        b();
    }

    public static ds a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.p000firebaseauthapi.cs r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.firebase-auth-api.y1 r0 = r4.b()
            com.google.android.gms.internal.p000firebaseauthapi.f.e(r5)
            com.google.android.gms.internal.firebase-auth-api.y1 r1 = com.google.android.gms.internal.p000firebaseauthapi.y1.f2351f
            com.google.android.gms.internal.firebase-auth-api.z1 r1 = com.google.android.gms.internal.p000firebaseauthapi.z1.INT
            com.google.android.gms.internal.firebase-auth-api.z1 r0 = r0.d()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p000firebaseauthapi.e0
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p000firebaseauthapi.hr
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.y1 r4 = r4.b()
            com.google.android.gms.internal.firebase-auth-api.z1 r4 = r4.d()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.ds.d(com.google.android.gms.internal.firebase-auth-api.cs, java.lang.Object):void");
    }

    public final void b() {
        if (this.f1531b) {
            return;
        }
        this.f1530a.a();
        this.f1531b = true;
    }

    public final void c(cs csVar, Object obj) {
        if (!csVar.c()) {
            d(csVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int r12 = 0; r12 < size; r12++) {
                d(csVar, arrayList.get(r12));
            }
            obj = arrayList;
        }
        this.f1530a.put(csVar, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        ds dsVar = new ds();
        for (int r12 = 0; r12 < this.f1530a.b(); r12++) {
            Map.Entry g5 = this.f1530a.g(r12);
            dsVar.c((cs) g5.getKey(), g5.getValue());
        }
        for (Map.Entry entry : this.f1530a.c()) {
            dsVar.c((cs) entry.getKey(), entry.getValue());
        }
        dsVar.f1532c = this.f1532c;
        return dsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ds) {
            return this.f1530a.equals(((ds) obj).f1530a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1530a.hashCode();
    }
}
