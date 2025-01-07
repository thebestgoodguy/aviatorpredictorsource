package androidx.core.view;

import android.view.View;

/* loaded from: classes6.dex */
public interface NestedScrollingParent2 extends NestedScrollingParent {
    void onNestedPreScroll(View view, int r2, int r3, int[] r4, int r5);

    void onNestedScroll(View view, int r2, int r3, int r4, int r5, int r6);

    void onNestedScrollAccepted(View view, View view2, int r3, int r4);

    boolean onStartNestedScroll(View view, View view2, int r3, int r4);

    void onStopNestedScroll(View view, int r2);
}
