package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Keep
/* loaded from: classes.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    o0.h<Void> didReinitializeFirebaseCore();

    o0.h<Map<String, Object>> getPluginConstantsForFirebaseApp(x0.e eVar);
}
