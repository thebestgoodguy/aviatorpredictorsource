package j1;

import java.util.Arrays;
import java.util.Objects;
import l1.l;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    private final int f5937e;

    /* renamed from: f, reason: collision with root package name */
    private final l f5938f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f5939g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f5940h;

    a(int r12, l lVar, byte[] bArr, byte[] bArr2) {
        this.f5937e = r12;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f5938f = lVar;
        Objects.requireNonNull(bArr, "Null arrayValue");
        this.f5939g = bArr;
        Objects.requireNonNull(bArr2, "Null directionalValue");
        this.f5940h = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5937e == eVar.n() && this.f5938f.equals(eVar.k())) {
            boolean z4 = eVar instanceof a;
            if (Arrays.equals(this.f5939g, z4 ? ((a) eVar).f5939g : eVar.h())) {
                if (Arrays.equals(this.f5940h, z4 ? ((a) eVar).f5940h : eVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j1.e
    public byte[] h() {
        return this.f5939g;
    }

    public int hashCode() {
        return ((((((this.f5937e ^ 1000003) * 1000003) ^ this.f5938f.hashCode()) * 1000003) ^ Arrays.hashCode(this.f5939g)) * 1000003) ^ Arrays.hashCode(this.f5940h);
    }

    @Override // j1.e
    public byte[] i() {
        return this.f5940h;
    }

    @Override // j1.e
    public l k() {
        return this.f5938f;
    }

    @Override // j1.e
    public int n() {
        return this.f5937e;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f5937e + ", documentKey=" + this.f5938f + ", arrayValue=" + Arrays.toString(this.f5939g) + ", directionalValue=" + Arrays.toString(this.f5940h) + "}";
    }
}
