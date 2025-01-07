package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, j.a<WindowLayoutInfo> aVar);

    void unregisterLayoutChangeCallback(j.a<WindowLayoutInfo> aVar);
}
