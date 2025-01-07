package org.apache.http.auth;

import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes.dex */
public interface AuthSchemeFactory {
    AuthScheme newInstance(HttpParams httpParams);
}
