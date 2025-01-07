package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
final class o3 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f1985e;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        o3 o3Var = (o3) obj;
        int length = this.f1985e.length;
        int length2 = o3Var.f1985e.length;
        if (length != length2) {
            return length - length2;
        }
        int r02 = 0;
        while (true) {
            byte[] bArr = this.f1985e;
            if (r02 >= bArr.length) {
                return 0;
            }
            byte b5 = bArr[r02];
            byte b6 = o3Var.f1985e[r02];
            if (b5 != b6) {
                return b5 - b6;
            }
            r02++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o3) {
            return Arrays.equals(this.f1985e, ((o3) obj).f1985e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1985e);
    }

    public final String toString() {
        return nf.a(this.f1985e);
    }
}
