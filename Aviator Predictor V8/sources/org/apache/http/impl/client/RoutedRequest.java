package org.apache.http.impl.client;

import org.apache.http.conn.routing.HttpRoute;

@Deprecated
/* loaded from: classes.dex */
public class RoutedRequest {
    protected final RequestWrapper request;
    protected final HttpRoute route;

    public RoutedRequest(RequestWrapper req, HttpRoute route) {
        throw new RuntimeException("Stub!");
    }

    public final RequestWrapper getRequest() {
        throw new RuntimeException("Stub!");
    }

    public final HttpRoute getRoute() {
        throw new RuntimeException("Stub!");
    }
}
