package org.apache.http.client;

import java.io.IOException;
import org.apache.http.protocol.HttpContext;

@Deprecated
/* loaded from: classes.dex */
public interface HttpRequestRetryHandler {
    boolean retryRequest(IOException iOException, int r2, HttpContext httpContext);
}
