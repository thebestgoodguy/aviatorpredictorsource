package okhttp3;

import java.io.IOException;

/* loaded from: classes59.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String protocol;

    Protocol(String protocol) {
        this.protocol = protocol;
    }

    public static Protocol get(String protocol) throws IOException {
        if (protocol.equals(HTTP_1_0.protocol)) {
            return HTTP_1_0;
        }
        if (protocol.equals(HTTP_1_1.protocol)) {
            return HTTP_1_1;
        }
        if (protocol.equals(HTTP_2.protocol)) {
            return HTTP_2;
        }
        if (protocol.equals(SPDY_3.protocol)) {
            return SPDY_3;
        }
        throw new IOException("Unexpected protocol: " + protocol);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
