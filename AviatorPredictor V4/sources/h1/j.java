package h1;

import l1.w;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f3927a;

    /* renamed from: b, reason: collision with root package name */
    private final i f3928b;

    /* renamed from: c, reason: collision with root package name */
    private final w f3929c;

    public j(String str, i iVar, w wVar) {
        this.f3927a = str;
        this.f3928b = iVar;
        this.f3929c = wVar;
    }

    public i a() {
        return this.f3928b;
    }

    public String b() {
        return this.f3927a;
    }

    public w c() {
        return this.f3929c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f3927a.equals(jVar.f3927a) && this.f3928b.equals(jVar.f3928b)) {
            return this.f3929c.equals(jVar.f3929c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f3927a.hashCode() * 31) + this.f3928b.hashCode()) * 31) + this.f3929c.hashCode();
    }
}
