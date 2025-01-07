package i;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f4021a;

    f(LocaleList localeList) {
        this.f4021a = localeList;
    }

    @Override // i.e
    public Object a() {
        return this.f4021a;
    }

    public boolean equals(Object obj) {
        return this.f4021a.equals(((e) obj).a());
    }

    @Override // i.e
    public Locale get(int r22) {
        return this.f4021a.get(r22);
    }

    public int hashCode() {
        return this.f4021a.hashCode();
    }

    public String toString() {
        return this.f4021a.toString();
    }
}
