package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class br extends er {

    /* renamed from: j, reason: collision with root package name */
    private final int f1443j;

    br(byte[] bArr, int r22, int r32) {
        super(bArr);
        hr.y(0, r32, bArr.length);
        this.f1443j = r32;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.er
    protected final int H() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.er, com.google.android.gms.internal.p000firebaseauthapi.hr
    public final byte i(int r5) {
        int r02 = this.f1443j;
        if (((r02 - (r5 + 1)) | r5) >= 0) {
            return this.f1600i[r5];
        }
        if (r5 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + r5);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + r5 + ", " + r02);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.er, com.google.android.gms.internal.p000firebaseauthapi.hr
    final byte p(int r22) {
        return this.f1600i[r22];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.er, com.google.android.gms.internal.p000firebaseauthapi.hr
    public final int q() {
        return this.f1443j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.er, com.google.android.gms.internal.p000firebaseauthapi.hr
    protected final void r(byte[] bArr, int r22, int r32, int r4) {
        System.arraycopy(this.f1600i, 0, bArr, 0, r4);
    }
}
