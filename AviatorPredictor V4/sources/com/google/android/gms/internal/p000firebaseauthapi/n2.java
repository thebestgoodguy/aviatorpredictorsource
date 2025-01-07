package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class n2 implements g3 {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f1952a;

    private n2(OutputStream outputStream) {
        this.f1952a = outputStream;
    }

    public static g3 c(OutputStream outputStream) {
        return new n2(outputStream);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g3
    public final void a(pb pbVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g3
    public final void b(fd fdVar) {
        try {
            fdVar.d(this.f1952a);
        } finally {
            this.f1952a.close();
        }
    }
}
