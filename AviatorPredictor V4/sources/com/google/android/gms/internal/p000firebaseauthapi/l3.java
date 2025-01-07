package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f1868a;

    /* renamed from: c, reason: collision with root package name */
    private m3 f1870c;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap f1869b = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final h8 f1871d = h8.f1719b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.p000firebaseauthapi.l3 d(java.lang.Object r11, com.google.android.gms.internal.p000firebaseauthapi.ed r12, boolean r13) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentMap r0 = r10.f1869b
            if (r0 == 0) goto Lba
            int r0 = r12.G()
            r1 = 3
            if (r0 != r1) goto Lb2
            com.google.android.gms.internal.firebase-auth-api.q3 r8 = new com.google.android.gms.internal.firebase-auth-api.q3
            com.google.android.gms.internal.firebase-auth-api.sc r0 = r12.A()
            java.lang.String r0 = r0.D()
            int r2 = r12.H()
            r9 = 0
            r8.<init>(r0, r2, r9)
            com.google.android.gms.internal.firebase-auth-api.m3 r0 = new com.google.android.gms.internal.firebase-auth-api.m3
            int r2 = r12.H()
            int r2 = r2 + (-2)
            r3 = 5
            r4 = 1
            if (r2 == r4) goto L47
            r4 = 2
            if (r2 == r4) goto L3d
            if (r2 == r1) goto L3a
            r1 = 4
            if (r2 != r1) goto L32
            goto L3d
        L32:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "unknown output prefix type"
            r11.<init>(r12)
            throw r11
        L3a:
            byte[] r1 = com.google.android.gms.internal.p000firebaseauthapi.p2.f2010a
            goto L5b
        L3d:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
            goto L4f
        L47:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r1 = r1.put(r4)
        L4f:
            int r2 = r12.z()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L5b:
            r4 = r1
            int r5 = r12.G()
            int r6 = r12.H()
            int r7 = r12.z()
            r2 = r0
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r0)
            com.google.android.gms.internal.firebase-auth-api.o3 r12 = new com.google.android.gms.internal.firebase-auth-api.o3
            byte[] r1 = r0.b()
            r12.<init>(r1, r9)
            java.util.concurrent.ConcurrentMap r1 = r10.f1869b
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            java.lang.Object r11 = r1.put(r12, r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto La0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r11)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap r11 = r10.f1869b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r11.put(r12, r1)
        La0:
            if (r13 == 0) goto Lb1
            com.google.android.gms.internal.firebase-auth-api.m3 r11 = r10.f1870c
            if (r11 != 0) goto La9
            r10.f1870c = r0
            goto Lb1
        La9:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "you cannot set two primary primitives"
            r11.<init>(r12)
            throw r11
        Lb1:
            return r10
        Lb2:
            java.security.GeneralSecurityException r11 = new java.security.GeneralSecurityException
            java.lang.String r12 = "only ENABLED key is allowed"
            r11.<init>(r12)
            throw r11
        Lba:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "addPrimitive cannot be called after build"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.l3.d(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.ed, boolean):com.google.android.gms.internal.firebase-auth-api.l3");
    }

    public final l3 a(Object obj, ed edVar) {
        d(obj, edVar, true);
        return this;
    }

    public final l3 b(Object obj, ed edVar) {
        d(obj, edVar, false);
        return this;
    }

    public final s3 c() {
        ConcurrentMap concurrentMap = this.f1869b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        s3 s3Var = new s3(concurrentMap, this.f1870c, this.f1871d, this.f1868a, null);
        this.f1869b = null;
        return s3Var;
    }
}
