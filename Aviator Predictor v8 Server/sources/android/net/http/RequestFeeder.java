package android.net.http;

import org.apache.http.HttpHost;

/* loaded from: classes.dex */
interface RequestFeeder {
    Request getRequest();

    Request getRequest(HttpHost httpHost);

    boolean haveRequest(HttpHost httpHost);

    void requeueRequest(Request request);
}
