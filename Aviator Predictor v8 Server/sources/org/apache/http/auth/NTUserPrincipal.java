package org.apache.http.auth;

import java.security.Principal;

@Deprecated
/* loaded from: classes.dex */
public class NTUserPrincipal implements Principal {
    public NTUserPrincipal(String domain, String username) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.security.Principal
    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public String getDomain() {
        throw new RuntimeException("Stub!");
    }

    public String getUsername() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.security.Principal
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    @Override // java.security.Principal
    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    @Override // java.security.Principal
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
