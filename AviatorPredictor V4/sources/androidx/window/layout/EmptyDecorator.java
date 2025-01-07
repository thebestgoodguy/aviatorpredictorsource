package androidx.window.layout;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        i.d(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
