package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f4488a;

    public x(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f4488a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, j.a<WindowLayoutInfo> aVar) {
        this.f4488a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(j.a<WindowLayoutInfo> aVar) {
        this.f4488a.removeWindowLayoutInfoListener(aVar);
    }
}
