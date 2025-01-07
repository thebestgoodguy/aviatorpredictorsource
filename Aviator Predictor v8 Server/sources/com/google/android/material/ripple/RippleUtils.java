package com.google.android.material.ripple;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;

/* loaded from: classes37.dex */
public class RippleUtils {
    private static final int[] ENABLED_PRESSED_STATE_SET;
    private static final int[] FOCUSED_STATE_SET;
    private static final int[] HOVERED_FOCUSED_STATE_SET;
    private static final int[] HOVERED_STATE_SET;
    static final String LOG_TAG;
    private static final int[] PRESSED_STATE_SET;
    private static final int[] SELECTED_FOCUSED_STATE_SET;
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET;
    private static final int[] SELECTED_HOVERED_STATE_SET;
    private static final int[] SELECTED_PRESSED_STATE_SET;
    private static final int[] SELECTED_STATE_SET;
    static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
    public static final boolean USE_FRAMEWORK_RIPPLE;

    static {
        USE_FRAMEWORK_RIPPLE = Build.VERSION.SDK_INT >= 21;
        PRESSED_STATE_SET = new int[]{R.attr.state_pressed};
        HOVERED_FOCUSED_STATE_SET = new int[]{R.attr.state_hovered, R.attr.state_focused};
        FOCUSED_STATE_SET = new int[]{R.attr.state_focused};
        HOVERED_STATE_SET = new int[]{R.attr.state_hovered};
        SELECTED_PRESSED_STATE_SET = new int[]{R.attr.state_selected, R.attr.state_pressed};
        SELECTED_HOVERED_FOCUSED_STATE_SET = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        SELECTED_FOCUSED_STATE_SET = new int[]{R.attr.state_selected, R.attr.state_focused};
        SELECTED_HOVERED_STATE_SET = new int[]{R.attr.state_selected, R.attr.state_hovered};
        SELECTED_STATE_SET = new int[]{R.attr.state_selected};
        ENABLED_PRESSED_STATE_SET = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        LOG_TAG = RippleUtils.class.getSimpleName();
    }

    private RippleUtils() {
    }

    public static ColorStateList convertToRippleDrawableColor(ColorStateList rippleColor) {
        if (USE_FRAMEWORK_RIPPLE) {
            int[][] states = new int[2][];
            int[] colors = new int[2];
            states[0] = SELECTED_STATE_SET;
            colors[0] = getColorForState(rippleColor, SELECTED_PRESSED_STATE_SET);
            int i = 0 + 1;
            states[i] = StateSet.NOTHING;
            colors[i] = getColorForState(rippleColor, PRESSED_STATE_SET);
            int r3 = i + 1;
            return new ColorStateList(states, colors);
        }
        int[][] states2 = new int[10][];
        int[] colors2 = new int[10];
        int[] r4 = SELECTED_PRESSED_STATE_SET;
        states2[0] = r4;
        colors2[0] = getColorForState(rippleColor, r4);
        int i2 = 0 + 1;
        int[] r42 = SELECTED_HOVERED_FOCUSED_STATE_SET;
        states2[i2] = r42;
        colors2[i2] = getColorForState(rippleColor, r42);
        int i3 = i2 + 1;
        int[] r43 = SELECTED_FOCUSED_STATE_SET;
        states2[i3] = r43;
        colors2[i3] = getColorForState(rippleColor, r43);
        int i4 = i3 + 1;
        int[] r44 = SELECTED_HOVERED_STATE_SET;
        states2[i4] = r44;
        colors2[i4] = getColorForState(rippleColor, r44);
        int i5 = i4 + 1;
        states2[i5] = SELECTED_STATE_SET;
        colors2[i5] = 0;
        int i6 = i5 + 1;
        int[] r5 = PRESSED_STATE_SET;
        states2[i6] = r5;
        colors2[i6] = getColorForState(rippleColor, r5);
        int i7 = i6 + 1;
        int[] r52 = HOVERED_FOCUSED_STATE_SET;
        states2[i7] = r52;
        colors2[i7] = getColorForState(rippleColor, r52);
        int i8 = i7 + 1;
        int[] r53 = FOCUSED_STATE_SET;
        states2[i8] = r53;
        colors2[i8] = getColorForState(rippleColor, r53);
        int i9 = i8 + 1;
        int[] r54 = HOVERED_STATE_SET;
        states2[i9] = r54;
        colors2[i9] = getColorForState(rippleColor, r54);
        int i10 = i9 + 1;
        states2[i10] = StateSet.NOTHING;
        colors2[i10] = 0;
        int r32 = i10 + 1;
        return new ColorStateList(states2, colors2);
    }

    public static ColorStateList sanitizeRippleDrawableColor(ColorStateList rippleColor) {
        if (rippleColor != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(rippleColor.getDefaultColor()) == 0 && Color.alpha(rippleColor.getColorForState(ENABLED_PRESSED_STATE_SET, 0)) != 0) {
                Log.w(LOG_TAG, TRANSPARENT_DEFAULT_COLOR_WARNING);
            }
            return rippleColor;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(int[] stateSet) {
        boolean enabled = false;
        boolean interactedState = false;
        for (int state : stateSet) {
            if (state == 16842910) {
                enabled = true;
            } else if (state == 16842908) {
                interactedState = true;
            } else if (state == 16842919) {
                interactedState = true;
            } else if (state == 16843623) {
                interactedState = true;
            }
        }
        return enabled && interactedState;
    }

    private static int getColorForState(ColorStateList rippleColor, int[] state) {
        int color;
        if (rippleColor != null) {
            color = rippleColor.getColorForState(state, rippleColor.getDefaultColor());
        } else {
            color = 0;
        }
        return USE_FRAMEWORK_RIPPLE ? doubleAlpha(color) : color;
    }

    private static int doubleAlpha(int color) {
        int alpha = Math.min(Color.alpha(color) * 2, 255);
        return ColorUtils.setAlphaComponent(color, alpha);
    }
}
