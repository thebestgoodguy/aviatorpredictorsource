package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements b1.i {
    @Override // b1.i
    public List<b1.d<?>> getComponents() {
        return Collections.singletonList(u1.h.b("flutter-fire-core", "1.20.0"));
    }
}
