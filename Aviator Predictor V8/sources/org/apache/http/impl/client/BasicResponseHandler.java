package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;

@Deprecated
/* loaded from: classes.dex */
public class BasicResponseHandler implements ResponseHandler<String> {
    public BasicResponseHandler() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.client.ResponseHandler
    public String handleResponse(HttpResponse response) throws HttpResponseException, IOException {
        throw new RuntimeException("Stub!");
    }
}
