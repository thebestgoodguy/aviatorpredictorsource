package i;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class d implements e {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f4015c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f4016d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f4017e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f4018f = c.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f4019a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4020b;

    d(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f4019a = f4015c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int r32 = 0; r32 < localeArr.length; r32++) {
                Locale locale = localeArr[r32];
                if (locale == null) {
                    throw new NullPointerException("list[" + r32 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (r32 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f4019a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            sb = sb2.toString();
        }
        this.f4020b = sb;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // i.e
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Locale[] localeArr = ((d) obj).f4019a;
        if (this.f4019a.length != localeArr.length) {
            return false;
        }
        int r12 = 0;
        while (true) {
            Locale[] localeArr2 = this.f4019a;
            if (r12 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[r12].equals(localeArr[r12])) {
                return false;
            }
            r12++;
        }
    }

    @Override // i.e
    public Locale get(int r32) {
        if (r32 >= 0) {
            Locale[] localeArr = this.f4019a;
            if (r32 < localeArr.length) {
                return localeArr[r32];
            }
        }
        return null;
    }

    public int hashCode() {
        int r02 = 1;
        int r12 = 0;
        while (true) {
            Locale[] localeArr = this.f4019a;
            if (r12 >= localeArr.length) {
                return r02;
            }
            r02 = (r02 * 31) + localeArr[r12].hashCode();
            r12++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int r12 = 0;
        while (true) {
            Locale[] localeArr = this.f4019a;
            if (r12 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[r12]);
            if (r12 < this.f4019a.length - 1) {
                sb.append(',');
            }
            r12++;
        }
    }
}
