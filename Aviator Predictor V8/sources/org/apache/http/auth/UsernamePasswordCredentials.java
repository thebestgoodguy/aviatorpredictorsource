package org.apache.http.auth;

import java.security.Principal;

@Deprecated
/* loaded from: classes.dex */
public class UsernamePasswordCredentials implements Credentials {
    public UsernamePasswordCredentials(String usernamePassword) {
        throw new RuntimeException("Stub!");
    }

    public UsernamePasswordCredentials(String userName, String password) {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.auth.Credentials
    public Principal getUserPrincipal() {
        throw new RuntimeException("Stub!");
    }

    public String getUserName() {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.auth.Credentials
    public String getPassword() {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object o) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
