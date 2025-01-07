package io.flutter.plugins;

import androidx.annotation.Keep;
import e2.b;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.i;
import u2.r0;
import v2.t;
import y2.c;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.o().g(new t());
        } catch (Exception e5) {
            b.c(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e5);
        }
        try {
            aVar.o().g(new r0());
        } catch (Exception e6) {
            b.c(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e6);
        }
        try {
            aVar.o().g(new i());
        } catch (Exception e7) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e7);
        }
        try {
            aVar.o().g(new a3.a());
        } catch (Exception e8) {
            b.c(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e8);
        }
        try {
            aVar.o().g(new c());
        } catch (Exception e9) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e9);
        }
    }
}
