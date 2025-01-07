package androidx.core.view;

import android.view.View;

/* loaded from: classes6.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(View view, float f, float f2, boolean z);

    boolean onNestedPreFling(View view, float f, float f2);

    void onNestedPreScroll(View view, int r2, int r3, int[] r4);

    void onNestedScroll(View view, int r2, int r3, int r4, int r5);

    void onNestedScrollAccepted(View view, View view2, int r3);

    boolean onStartNestedScroll(View view, View view2, int r3);

    void onStopNestedScroll(View view);
}
