package r2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface b {

    public interface a {
        void a(ByteBuffer byteBuffer, InterfaceC0084b interfaceC0084b);
    }

    /* renamed from: r2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0084b {
        void a(ByteBuffer byteBuffer);
    }

    public interface c {
    }

    void a(String str, a aVar, c cVar);

    void b(String str, a aVar);

    void c(String str, ByteBuffer byteBuffer);

    void e(String str, ByteBuffer byteBuffer, InterfaceC0084b interfaceC0084b);
}
