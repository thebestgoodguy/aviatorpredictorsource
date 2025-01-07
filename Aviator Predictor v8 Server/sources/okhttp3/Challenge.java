package okhttp3;

import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.Util;

/* loaded from: classes59.dex */
public final class Challenge {
    private final Charset charset;
    private final String realm;
    private final String scheme;

    public Challenge(String scheme, String realm) {
        this(scheme, realm, Util.ISO_8859_1);
    }

    private Challenge(String scheme, String realm, Charset charset) {
        if (scheme == null) {
            throw new NullPointerException("scheme == null");
        }
        if (realm == null) {
            throw new NullPointerException("realm == null");
        }
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        this.scheme = scheme;
        this.realm = realm;
        this.charset = charset;
    }

    public Challenge withCharset(Charset charset) {
        return new Challenge(this.scheme, this.realm, charset);
    }

    public String scheme() {
        return this.scheme;
    }

    public String realm() {
        return this.realm;
    }

    public Charset charset() {
        return this.charset;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Challenge) && ((Challenge) other).scheme.equals(this.scheme) && ((Challenge) other).realm.equals(this.realm) && ((Challenge) other).charset.equals(this.charset);
    }

    public int hashCode() {
        int result = this.realm.hashCode() + 899;
        return (((result * 31) + this.scheme.hashCode()) * 31) + this.charset.hashCode();
    }

    public String toString() {
        return this.scheme + " realm=\"" + this.realm + "\" charset=\"" + this.charset + "\"";
    }
}
