package org.apache.http.client;

import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: classes.dex */
public interface UserTokenHandler {
    Object getUserToken(HttpContext httpContext);
}
