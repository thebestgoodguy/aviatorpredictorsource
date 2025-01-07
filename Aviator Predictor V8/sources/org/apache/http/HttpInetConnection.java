package org.apache.http;

import java.net.InetAddress;

@Deprecated
/* loaded from: classes.dex */
public interface HttpInetConnection extends HttpConnection {
    InetAddress getLocalAddress();

    int getLocalPort();

    InetAddress getRemoteAddress();

    int getRemotePort();
}
