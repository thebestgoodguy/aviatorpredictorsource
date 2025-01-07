package h1;

import java.util.List;
import l1.l;
import l1.w;

/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private final l f3921a;

    /* renamed from: b, reason: collision with root package name */
    private final w f3922b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3923c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f3924d;

    public h(l lVar, w wVar, boolean z4, List<String> list) {
        this.f3921a = lVar;
        this.f3922b = wVar;
        this.f3923c = z4;
        this.f3924d = list;
    }

    public boolean a() {
        return this.f3923c;
    }

    public l b() {
        return this.f3921a;
    }

    public List<String> c() {
        return this.f3924d;
    }

    public w d() {
        return this.f3922b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3923c == hVar.f3923c && this.f3921a.equals(hVar.f3921a) && this.f3922b.equals(hVar.f3922b)) {
            return this.f3924d.equals(hVar.f3924d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3921a.hashCode() * 31) + this.f3922b.hashCode()) * 31) + (this.f3923c ? 1 : 0)) * 31) + this.f3924d.hashCode();
    }
}
