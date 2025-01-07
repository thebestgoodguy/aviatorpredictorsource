package org.apache.http.conn.params;

import org.apache.http.conn.routing.HttpRoute;

@Deprecated
/* loaded from: classes.dex */
public interface ConnPerRoute {
    int getMaxForRoute(HttpRoute httpRoute);
}
