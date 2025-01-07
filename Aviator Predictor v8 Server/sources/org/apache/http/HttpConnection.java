package org.apache.http;

import java.io.IOException;

@Deprecated
/* loaded from: classes.dex */
public interface HttpConnection {
    void close() throws IOException;

    HttpConnectionMetrics getMetrics();

    int getSocketTimeout();

    boolean isOpen();

    boolean isStale();

    void setSocketTimeout(int r1);

    void shutdown() throws IOException;
}
