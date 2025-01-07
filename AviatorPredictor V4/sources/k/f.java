package k;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class f {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(f.a.H);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && e.f(viewGroup) == null) ? false : true;
    }
}
