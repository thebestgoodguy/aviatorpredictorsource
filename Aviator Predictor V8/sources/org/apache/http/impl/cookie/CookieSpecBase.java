package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;

@Deprecated
/* loaded from: classes.dex */
public abstract class CookieSpecBase extends AbstractCookieSpec {
    public CookieSpecBase() {
        throw new RuntimeException("Stub!");
    }

    protected static String getDefaultPath(CookieOrigin origin) {
        throw new RuntimeException("Stub!");
    }

    protected static String getDefaultDomain(CookieOrigin origin) {
        throw new RuntimeException("Stub!");
    }

    protected List<Cookie> parse(HeaderElement[] elems, CookieOrigin origin) throws MalformedCookieException {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin origin) {
        throw new RuntimeException("Stub!");
    }
}
