package io.flutter.plugins.firebase.auth;

import androidx.annotation.Keep;
import b1.d;
import b1.i;
import java.util.Collections;
import java.util.List;
import u1.h;

@Keep
/* loaded from: classes.dex */
public class FlutterFirebaseAuthRegistrar implements i {
    @Override // b1.i
    public List<d<?>> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-auth", "3.6.2"));
    }
}
