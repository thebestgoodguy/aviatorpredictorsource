package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
class er extends dr {

    /* renamed from: i, reason: collision with root package name */
    protected final byte[] f1600i;

    er(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f1600i = bArr;
    }

    protected int H() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hr) || q() != ((hr) obj).q()) {
            return false;
        }
        if (q() == 0) {
            return true;
        }
        if (!(obj instanceof er)) {
            return obj.equals(this);
        }
        er erVar = (er) obj;
        int z4 = z();
        int z5 = erVar.z();
        if (z4 != 0 && z5 != 0 && z4 != z5) {
            return false;
        }
        int q4 = q();
        if (q4 > erVar.q()) {
            throw new IllegalArgumentException("Length too large: " + q4 + q());
        }
        if (q4 > erVar.q()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + q4 + ", " + erVar.q());
        }
        byte[] bArr = this.f1600i;
        byte[] bArr2 = erVar.f1600i;
        erVar.H();
        int r9 = 0;
        int r5 = 0;
        while (r9 < q4) {
            if (bArr[r9] != bArr2[r5]) {
                return false;
            }
            r9++;
            r5++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    public byte i(int r22) {
        return this.f1600i[r22];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    byte p(int r22) {
        return this.f1600i[r22];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    public int q() {
        return this.f1600i.length;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    protected void r(byte[] bArr, int r22, int r32, int r4) {
        System.arraycopy(this.f1600i, 0, bArr, 0, r4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    protected final int s(int r22, int r32, int r4) {
        return f.d(r22, this.f1600i, 0, r4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    public final hr t(int r32, int r4) {
        int y4 = hr.y(0, r4, q());
        return y4 == 0 ? hr.f1739f : new br(this.f1600i, 0, y4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    public final lr u() {
        return lr.n(this.f1600i, 0, q(), true);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    protected final String v(Charset charset) {
        return new String(this.f1600i, 0, q(), charset);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    final void w(xq xqVar) {
        xqVar.a(this.f1600i, 0, q());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hr
    public final boolean x() {
        return x1.f(this.f1600i, 0, q());
    }
}
