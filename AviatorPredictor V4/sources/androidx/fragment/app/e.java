package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public abstract class e {
    @Deprecated
    public Fragment a(Context context, String str, Bundle bundle) {
        return Fragment.O(context, str, bundle);
    }

    public abstract View c(int r12);

    public abstract boolean d();
}
