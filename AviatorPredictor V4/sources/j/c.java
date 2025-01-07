package j;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class c extends Writer {

    /* renamed from: e, reason: collision with root package name */
    private final String f5935e;

    /* renamed from: f, reason: collision with root package name */
    private StringBuilder f5936f = new StringBuilder(128);

    public c(String str) {
        this.f5935e = str;
    }

    private void a() {
        if (this.f5936f.length() > 0) {
            Log.d(this.f5935e, this.f5936f.toString());
            StringBuilder sb = this.f5936f;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int r5, int r6) {
        for (int r02 = 0; r02 < r6; r02++) {
            char c5 = cArr[r5 + r02];
            if (c5 == '\n') {
                a();
            } else {
                this.f5936f.append(c5);
            }
        }
    }
}
