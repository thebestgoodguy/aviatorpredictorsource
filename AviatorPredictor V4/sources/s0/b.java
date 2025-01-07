package s0;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import q0.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final OutputStream f7533a = new a();

    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int r12) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            l.n(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int r22, int r32) {
            l.n(bArr);
        }
    }

    private static byte[] a(Queue<byte[]> queue, int r7) {
        byte[] bArr = new byte[r7];
        int r12 = r7;
        while (r12 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(r12, remove.length);
            System.arraycopy(remove, 0, bArr, r7 - r12, min);
            r12 -= min;
        }
        return bArr;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        l.n(inputStream);
        l.n(outputStream);
        byte[] c5 = c();
        long j4 = 0;
        while (true) {
            int read = inputStream.read(c5);
            if (read == -1) {
                return j4;
            }
            outputStream.write(c5, 0, read);
            j4 += read;
        }
    }

    static byte[] c() {
        return new byte[8192];
    }

    public static byte[] d(InputStream inputStream) {
        l.n(inputStream);
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int r8) {
        int r02 = 8192;
        while (r8 < 2147483639) {
            int min = Math.min(r02, 2147483639 - r8);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int r4 = 0;
            while (r4 < min) {
                int read = inputStream.read(bArr, r4, min - r4);
                if (read == -1) {
                    return a(queue, r8);
                }
                r4 += read;
                r8 += read;
            }
            r02 = t0.a.e(r02, 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
