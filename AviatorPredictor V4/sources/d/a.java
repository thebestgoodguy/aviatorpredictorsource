package d;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3194a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3195b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f3196c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3197d;

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0026a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f3198a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f3199b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f3200c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f3201d;

        public a a() {
            return new a(this.f3198a, this.f3199b, this.f3200c, this.f3201d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f3194a = num;
        this.f3195b = num2;
        this.f3196c = num3;
        this.f3197d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f3194a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f3195b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f3196c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f3197d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
