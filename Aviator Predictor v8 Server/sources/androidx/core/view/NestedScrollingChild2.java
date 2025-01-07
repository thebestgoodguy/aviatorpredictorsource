package androidx.core.view;

/* loaded from: classes6.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int r1, int r2, int[] r3, int[] r4, int r5);

    boolean dispatchNestedScroll(int r1, int r2, int r3, int r4, int[] r5, int r6);

    boolean hasNestedScrollingParent(int r1);

    boolean startNestedScroll(int r1, int r2);

    void stopNestedScroll(int r1);
}
