package s;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class w extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference<byte[]> f7508c = new WeakReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<byte[]> f7509b;

    w(byte[] bArr) {
        super(bArr);
        this.f7509b = f7508c;
    }

    @Override // s.u
    final byte[] h() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f7509b.get();
            if (bArr == null) {
                bArr = w();
                this.f7509b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] w();
}
