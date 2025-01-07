package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;

@Deprecated
/* loaded from: classes.dex */
public final class RouteTracker implements RouteInfo {
    public RouteTracker(HttpHost target, InetAddress local) {
        throw new RuntimeException("Stub!");
    }

    public RouteTracker(HttpRoute route) {
        throw new RuntimeException("Stub!");
    }

    public void connectTarget(boolean secure) {
        throw new RuntimeException("Stub!");
    }

    public void connectProxy(HttpHost proxy, boolean secure) {
        throw new RuntimeException("Stub!");
    }

    public void tunnelTarget(boolean secure) {
        throw new RuntimeException("Stub!");
    }

    public void tunnelProxy(HttpHost proxy, boolean secure) {
        throw new RuntimeException("Stub!");
    }

    public void layerProtocol(boolean secure) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getTargetHost() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public InetAddress getLocalAddress() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public int getHopCount() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getHopTarget(int hop) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getProxyHost() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.TunnelType getTunnelType() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isTunnelled() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.LayerType getLayerType() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isLayered() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isSecure() {
        throw new RuntimeException("Stub!");
    }

    public HttpRoute toRoute() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
