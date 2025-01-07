package okhttp3.internal.http;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* loaded from: classes59.dex */
public final class HttpMethod {
    public static boolean invalidatesCache(String method) {
        return method.equals(HttpPost.METHOD_NAME) || method.equals("PATCH") || method.equals(HttpPut.METHOD_NAME) || method.equals(HttpDelete.METHOD_NAME) || method.equals("MOVE");
    }

    public static boolean requiresRequestBody(String method) {
        return method.equals(HttpPost.METHOD_NAME) || method.equals(HttpPut.METHOD_NAME) || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    public static boolean permitsRequestBody(String method) {
        return requiresRequestBody(method) || method.equals(HttpOptions.METHOD_NAME) || method.equals(HttpDelete.METHOD_NAME) || method.equals("PROPFIND") || method.equals("MKCOL") || method.equals("LOCK");
    }

    public static boolean redirectsWithBody(String method) {
        return method.equals("PROPFIND");
    }

    public static boolean redirectsToGet(String method) {
        return !method.equals("PROPFIND");
    }

    private HttpMethod() {
    }
}
