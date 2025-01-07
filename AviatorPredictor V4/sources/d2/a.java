package d2;

import c2.d;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3215b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3216c;

    public a(d dVar, int r22, String str) {
        this.f3214a = dVar;
        this.f3215b = r22;
        this.f3216c = str;
    }

    public static a a(String str) {
        d dVar;
        String str2;
        int r32 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                dVar = d.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                dVar = d.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            dVar = d.HTTP_1_0;
            r32 = 4;
        }
        int r6 = r32 + 3;
        if (str.length() < r6) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(r32, r6));
            if (str.length() <= r6) {
                str2 = "";
            } else {
                if (str.charAt(r6) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(r32 + 4);
            }
            return new a(dVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3214a == d.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f3215b);
        if (this.f3216c != null) {
            sb.append(' ');
            sb.append(this.f3216c);
        }
        return sb.toString();
    }
}
