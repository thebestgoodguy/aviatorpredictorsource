package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
/* loaded from: classes.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static o0.h<Void> didReinitializeFirebaseCore() {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(o0.i.this);
            }
        });
        return iVar.a();
    }

    static o0.h<Map<String, Object>> getPluginConstantsForFirebaseApp(final x0.e eVar) {
        final o0.i iVar = new o0.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(x0.e.this, iVar);
            }
        });
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(o0.i iVar) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                o0.k.a(it.next().getValue().didReinitializeFirebaseCore());
            }
            iVar.c(null);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(x0.e eVar, o0.i iVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), o0.k.a(entry.getValue().getPluginConstantsForFirebaseApp(eVar)));
            }
            iVar.c(hashMap);
        } catch (Exception e5) {
            iVar.b(e5);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
