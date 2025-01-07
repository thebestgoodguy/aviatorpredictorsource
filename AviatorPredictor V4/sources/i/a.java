package i;

import android.content.res.Configuration;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {
    public static c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? c.d(configuration.getLocales()) : c.a(configuration.locale);
    }
}
