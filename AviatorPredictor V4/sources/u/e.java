package u;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public interface e {
    void a(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T c(String str, Class<T> cls);

    Activity d();

    void startActivityForResult(Intent intent, int r22);
}
