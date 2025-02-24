package okhttp3.internal.cache;

import java.io.IOException;
import okio.Sink;

/* loaded from: classes59.dex */
public interface CacheRequest {
    void abort();

    Sink body() throws IOException;
}
