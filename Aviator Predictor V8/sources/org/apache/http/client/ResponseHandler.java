package org.apache.http.client;

import java.io.IOException;
import org.apache.http.HttpResponse;

@Deprecated
/* loaded from: classes.dex */
public interface ResponseHandler<T> {
    T handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException;
}
