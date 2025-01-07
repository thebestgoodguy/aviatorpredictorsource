package s;

import java.util.Arrays;

/* loaded from: classes.dex */
final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7507b;

    v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f7507b = bArr;
    }

    @Override // s.u
    final byte[] h() {
        return this.f7507b;
    }
}
