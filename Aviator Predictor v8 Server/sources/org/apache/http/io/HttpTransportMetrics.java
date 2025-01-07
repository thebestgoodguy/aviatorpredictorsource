package org.apache.http.io;

@Deprecated
/* loaded from: classes.dex */
public interface HttpTransportMetrics {
    long getBytesTransferred();

    void reset();
}
