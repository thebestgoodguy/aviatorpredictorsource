package b3;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public interface l extends n, u {

    public static final class a implements l {
        @Override // b3.n, b3.u
        public String a() {
            return "gzip";
        }

        @Override // b3.u
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // b3.n
        public OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final l f836a = new b();

        private b() {
        }

        @Override // b3.n, b3.u
        public String a() {
            return "identity";
        }

        @Override // b3.u
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // b3.n
        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
