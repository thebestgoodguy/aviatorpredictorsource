package org.apache.http.auth;

import java.security.Principal;

@Deprecated
/* loaded from: classes.dex */
public interface Credentials {
    String getPassword();

    Principal getUserPrincipal();
}
