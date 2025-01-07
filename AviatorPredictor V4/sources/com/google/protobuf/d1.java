package com.google.protobuf;

import com.google.protobuf.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class d1 extends j.i {

    /* renamed from: i, reason: collision with root package name */
    private final ByteBuffer f2852i;

    d1(ByteBuffer byteBuffer) {
        d0.b(byteBuffer, "buffer");
        this.f2852i = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer Y(int r4, int r5) {
        if (r4 < this.f2852i.position() || r5 > this.f2852i.limit() || r4 > r5) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(r4), Integer.valueOf(r5)));
        }
        ByteBuffer slice = this.f2852i.slice();
        slice.position(r4 - this.f2852i.position());
        slice.limit(r5 - this.f2852i.position());
        return slice;
    }

    @Override // com.google.protobuf.j
    protected void A(byte[] bArr, int r32, int r4, int r5) {
        ByteBuffer slice = this.f2852i.slice();
        slice.position(r32);
        slice.get(bArr, r4, r5);
    }

    @Override // com.google.protobuf.j
    public byte C(int r12) {
        return r(r12);
    }

    @Override // com.google.protobuf.j
    public boolean E() {
        return a2.r(this.f2852i);
    }

    @Override // com.google.protobuf.j
    public k H() {
        return k.i(this.f2852i, true);
    }

    @Override // com.google.protobuf.j
    protected int I(int r32, int r4, int r5) {
        for (int r02 = r4; r02 < r4 + r5; r02++) {
            r32 = (r32 * 31) + this.f2852i.get(r02);
        }
        return r32;
    }

    @Override // com.google.protobuf.j
    protected int J(int r22, int r32, int r4) {
        return a2.u(r22, this.f2852i, r32, r4 + r32);
    }

    @Override // com.google.protobuf.j
    public j M(int r12, int r22) {
        try {
            return new d1(Y(r12, r22));
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e6) {
            throw new ArrayIndexOutOfBoundsException(e6.getMessage());
        }
    }

    @Override // com.google.protobuf.j
    protected String Q(Charset charset) {
        byte[] N;
        int r12;
        int length;
        if (this.f2852i.hasArray()) {
            N = this.f2852i.array();
            r12 = this.f2852i.arrayOffset() + this.f2852i.position();
            length = this.f2852i.remaining();
        } else {
            N = N();
            r12 = 0;
            length = N.length;
        }
        return new String(N, r12, length, charset);
    }

    @Override // com.google.protobuf.j
    void W(i iVar) {
        iVar.a(this.f2852i.slice());
    }

    @Override // com.google.protobuf.j.i
    boolean X(j jVar, int r32, int r4) {
        return M(0, r4).equals(jVar.M(r32, r4 + r32));
    }

    @Override // com.google.protobuf.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (size() != jVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof d1 ? this.f2852i.equals(((d1) obj).f2852i) : obj instanceof m1 ? obj.equals(this) : this.f2852i.equals(jVar.p());
    }

    @Override // com.google.protobuf.j
    public ByteBuffer p() {
        return this.f2852i.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.j
    public byte r(int r22) {
        try {
            return this.f2852i.get(r22);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e6) {
            throw new ArrayIndexOutOfBoundsException(e6.getMessage());
        }
    }

    @Override // com.google.protobuf.j
    public int size() {
        return this.f2852i.remaining();
    }
}
