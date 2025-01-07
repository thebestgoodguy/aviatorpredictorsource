package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes51.dex */
public class ChangeClipBounds extends Transition {
    private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
    private static final String PROPNAME_CLIP = "android:clipBounds:clip";
    private static final String[] sTransitionProperties = {PROPNAME_CLIP};

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attrs) {
        super(context, attrs);
    }

    private void captureValues(TransitionValues values) {
        View view = values.view;
        if (view.getVisibility() != 8) {
            Rect clip = ViewCompat.getClipBounds(view);
            values.values.put(PROPNAME_CLIP, clip);
            if (clip == null) {
                Rect bounds = new Rect(0, 0, view.getWidth(), view.getHeight());
                values.values.put(PROPNAME_BOUNDS, bounds);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup sceneRoot, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        ObjectAnimator animator = null;
        if (startValues != null && endValues != null && startValues.values.containsKey(PROPNAME_CLIP) && endValues.values.containsKey(PROPNAME_CLIP)) {
            Rect start = (Rect) startValues.values.get(PROPNAME_CLIP);
            Rect end = (Rect) endValues.values.get(PROPNAME_CLIP);
            boolean endIsNull = end == null;
            if (start != null || end != null) {
                if (start == null) {
                    start = (Rect) startValues.values.get(PROPNAME_BOUNDS);
                } else if (end == null) {
                    end = (Rect) endValues.values.get(PROPNAME_BOUNDS);
                }
                if (!start.equals(end)) {
                    ViewCompat.setClipBounds(endValues.view, start);
                    RectEvaluator evaluator = new RectEvaluator(new Rect());
                    animator = ObjectAnimator.ofObject(endValues.view, (Property<View, V>) ViewUtils.CLIP_BOUNDS, (TypeEvaluator) evaluator, (Object[]) new Rect[]{start, end});
                    if (endIsNull) {
                        final View endView = endValues.view;
                        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.ChangeClipBounds.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                ViewCompat.setClipBounds(endView, null);
                            }
                        });
                    }
                }
            }
        }
        return animator;
    }
}
