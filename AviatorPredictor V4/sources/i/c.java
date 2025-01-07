package i;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static final c f4013b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private e f4014a;

    private c(e eVar) {
        this.f4014a = eVar;
    }

    public static c a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(new LocaleList(localeArr)) : new c(new d(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static c d(LocaleList localeList) {
        return new c(new f(localeList));
    }

    public Locale c(int r22) {
        return this.f4014a.get(r22);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f4014a.equals(((c) obj).f4014a);
    }

    public int hashCode() {
        return this.f4014a.hashCode();
    }

    public String toString() {
        return this.f4014a.toString();
    }
}
