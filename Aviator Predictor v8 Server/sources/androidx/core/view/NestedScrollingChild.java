package androidx.core.view;

/* loaded from: classes6.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int r1, int r2, int[] r3, int[] r4);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, int[] r5);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int r1);

    void stopNestedScroll();
}
