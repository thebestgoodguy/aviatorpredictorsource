package g3;

import b3.m0;
import b3.w;
import com.google.protobuf.f1;
import com.google.protobuf.m;
import com.google.protobuf.v0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class a extends InputStream implements w, m0 {

    /* renamed from: e, reason: collision with root package name */
    private v0 f3885e;

    /* renamed from: f, reason: collision with root package name */
    private final f1<?> f3886f;

    /* renamed from: g, reason: collision with root package name */
    private ByteArrayInputStream f3887g;

    a(v0 v0Var, f1<?> f1Var) {
        this.f3885e = v0Var;
        this.f3886f = f1Var;
    }

    @Override // b3.w
    public int a(OutputStream outputStream) {
        v0 v0Var = this.f3885e;
        if (v0Var != null) {
            int b5 = v0Var.b();
            this.f3885e.g(outputStream);
            this.f3885e = null;
            return b5;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3887g;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a5 = (int) b.a(byteArrayInputStream, outputStream);
        this.f3887g = null;
        return a5;
    }

    @Override // java.io.InputStream
    public int available() {
        v0 v0Var = this.f3885e;
        if (v0Var != null) {
            return v0Var.b();
        }
        ByteArrayInputStream byteArrayInputStream = this.f3887g;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    v0 d() {
        v0 v0Var = this.f3885e;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("message not available");
    }

    f1<?> e() {
        return this.f3886f;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f3885e != null) {
            this.f3887g = new ByteArrayInputStream(this.f3885e.a());
            this.f3885e = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3887g;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int r6, int r7) {
        v0 v0Var = this.f3885e;
        if (v0Var != null) {
            int b5 = v0Var.b();
            if (b5 == 0) {
                this.f3885e = null;
                this.f3887g = null;
                return -1;
            }
            if (r7 >= b5) {
                m i02 = m.i0(bArr, r6, b5);
                this.f3885e.l(i02);
                i02.d0();
                i02.d();
                this.f3885e = null;
                this.f3887g = null;
                return b5;
            }
            this.f3887g = new ByteArrayInputStream(this.f3885e.a());
            this.f3885e = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3887g;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, r6, r7);
        }
        return -1;
    }
}
