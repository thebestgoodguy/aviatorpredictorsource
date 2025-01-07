package io.flutter.plugin.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private io.flutter.view.c f4631a;

    a() {
    }

    public boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.c cVar = this.f4631a;
        if (cVar == null) {
            return false;
        }
        return cVar.w(view, view2, accessibilityEvent);
    }

    void b(io.flutter.view.c cVar) {
        this.f4631a = cVar;
    }
}
