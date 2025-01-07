package e3;

import java.io.IOException;

/* loaded from: classes.dex */
public enum g {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: e, reason: collision with root package name */
    private final String f3599e;

    g(String str) {
        this.f3599e = str;
    }

    public static g d(String str) {
        g gVar = HTTP_1_0;
        if (str.equals(gVar.f3599e)) {
            return gVar;
        }
        g gVar2 = HTTP_1_1;
        if (str.equals(gVar2.f3599e)) {
            return gVar2;
        }
        g gVar3 = HTTP_2;
        if (str.equals(gVar3.f3599e)) {
            return gVar3;
        }
        g gVar4 = SPDY_3;
        if (str.equals(gVar4.f3599e)) {
            return gVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3599e;
    }
}
