package h4;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface m extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void w(c cVar, long j4);
}
