package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes37.dex */
class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    ElasticTabIndicatorInterpolator() {
    }

    private static float decInterp(float fraction) {
        double d = fraction;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    private static float accInterp(float fraction) {
        double d = fraction;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void updateIndicatorForOffset(TabLayout tabLayout, View startTitle, View endTitle, float offset, Drawable indicator) {
        float leftFraction;
        float rightFraction;
        RectF startIndicator = calculateIndicatorWidthForTab(tabLayout, startTitle);
        RectF endIndicator = calculateIndicatorWidthForTab(tabLayout, endTitle);
        boolean isMovingRight = startIndicator.left < endIndicator.left;
        if (isMovingRight) {
            leftFraction = accInterp(offset);
            rightFraction = decInterp(offset);
        } else {
            leftFraction = decInterp(offset);
            rightFraction = accInterp(offset);
        }
        indicator.setBounds(AnimationUtils.lerp((int) startIndicator.left, (int) endIndicator.left, leftFraction), indicator.getBounds().top, AnimationUtils.lerp((int) startIndicator.right, (int) endIndicator.right, rightFraction), indicator.getBounds().bottom);
    }
}
