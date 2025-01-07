package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.qq;
import com.google.android.gms.internal.p000firebaseauthapi.rq;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class rq<MessageType extends rq<MessageType, BuilderType>, BuilderType extends qq<MessageType, BuilderType>> implements e0 {
    protected int zza = 0;

    int b() {
        throw null;
    }

    void c(int r12) {
        throw null;
    }

    public final void d(OutputStream outputStream) {
        tr i4 = tr.i(outputStream, tr.c(k()));
        h(i4);
        i4.m();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e0
    public final hr g() {
        try {
            int k4 = k();
            hr hrVar = hr.f1739f;
            byte[] bArr = new byte[k4];
            tr h5 = tr.h(bArr);
            h(h5);
            h5.j();
            return new er(bArr);
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e0
    public final byte[] m() {
        try {
            byte[] bArr = new byte[k()];
            tr h5 = tr.h(bArr);
            h(h5);
            h5.j();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }
}
