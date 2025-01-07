package org.apache.http.conn.scheme;

import java.util.List;
import java.util.Map;
import org.apache.http.HttpHost;

@Deprecated
/* loaded from: classes.dex */
public final class SchemeRegistry {
    public SchemeRegistry() {
        throw new RuntimeException("Stub!");
    }

    public synchronized Scheme getScheme(String name) {
        throw new RuntimeException("Stub!");
    }

    public synchronized Scheme getScheme(HttpHost host) {
        throw new RuntimeException("Stub!");
    }

    public synchronized Scheme get(String name) {
        throw new RuntimeException("Stub!");
    }

    public synchronized Scheme register(Scheme sch) {
        throw new RuntimeException("Stub!");
    }

    public synchronized Scheme unregister(String name) {
        throw new RuntimeException("Stub!");
    }

    public synchronized List<String> getSchemeNames() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setItems(Map<String, Scheme> map) {
        throw new RuntimeException("Stub!");
    }
}
