package h1;

import l1.w;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f3907a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3908b;

    /* renamed from: c, reason: collision with root package name */
    private final w f3909c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3910d;

    /* renamed from: e, reason: collision with root package name */
    private final long f3911e;

    public e(String str, int r22, w wVar, int r4, long j4) {
        this.f3907a = str;
        this.f3908b = r22;
        this.f3909c = wVar;
        this.f3910d = r4;
        this.f3911e = j4;
    }

    public String a() {
        return this.f3907a;
    }

    public w b() {
        return this.f3909c;
    }

    public int c() {
        return this.f3908b;
    }

    public long d() {
        return this.f3911e;
    }

    public int e() {
        return this.f3910d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f3908b == eVar.f3908b && this.f3910d == eVar.f3910d && this.f3911e == eVar.f3911e && this.f3907a.equals(eVar.f3907a)) {
            return this.f3909c.equals(eVar.f3909c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f3907a.hashCode() * 31) + this.f3908b) * 31) + this.f3910d) * 31;
        long j4 = this.f3911e;
        return ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f3909c.hashCode();
    }
}
