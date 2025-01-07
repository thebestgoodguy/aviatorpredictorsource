package org.apache.http.conn.params;

import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes.dex */
public class ConnManagerParamBean extends HttpAbstractParamBean {
    public ConnManagerParamBean(HttpParams params) {
        super((HttpParams) null);
        throw new RuntimeException("Stub!");
    }

    public void setTimeout(long timeout) {
        throw new RuntimeException("Stub!");
    }

    public void setMaxTotalConnections(int maxConnections) {
        throw new RuntimeException("Stub!");
    }

    public void setConnectionsPerRoute(ConnPerRouteBean connPerRoute) {
        throw new RuntimeException("Stub!");
    }
}
