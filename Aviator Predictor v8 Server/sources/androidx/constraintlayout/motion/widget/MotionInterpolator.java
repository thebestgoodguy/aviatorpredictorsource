package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* loaded from: classes39.dex */
public abstract class MotionInterpolator implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float v);

    public abstract float getVelocity();
}
