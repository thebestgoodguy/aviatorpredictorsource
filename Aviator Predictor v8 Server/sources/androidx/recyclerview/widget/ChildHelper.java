package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes42.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    interface Callback {
        void addView(View view, int r2);

        void attachViewToParent(View view, int r2, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int r1);

        View getChildAt(int r1);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int r1);
    }

    ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private void hideViewInternal(View child) {
        this.mHiddenViews.add(child);
        this.mCallback.onEnteredHiddenState(child);
    }

    private boolean unhideViewInternal(View child) {
        if (!this.mHiddenViews.remove(child)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(child);
        return true;
    }

    void addView(View child, boolean hidden) {
        addView(child, -1, hidden);
    }

    void addView(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.mCallback.getChildCount();
        } else {
            offset = getOffset(index);
        }
        this.mBucket.insert(offset, hidden);
        if (hidden) {
            hideViewInternal(child);
        }
        this.mCallback.addView(child, offset);
    }

    private int getOffset(int index) {
        if (index < 0) {
            return -1;
        }
        int limit = this.mCallback.getChildCount();
        int offset = index;
        while (offset < limit) {
            int removedBefore = this.mBucket.countOnesBefore(offset);
            int diff = index - (offset - removedBefore);
            if (diff == 0) {
                while (this.mBucket.get(offset)) {
                    offset++;
                }
                return offset;
            }
            offset += diff;
        }
        return -1;
    }

    void removeView(View view) {
        int index = this.mCallback.indexOfChild(view);
        if (index >= 0) {
            if (this.mBucket.remove(index)) {
                unhideViewInternal(view);
            }
            this.mCallback.removeViewAt(index);
        }
    }

    void removeViewAt(int index) {
        int offset = getOffset(index);
        View view = this.mCallback.getChildAt(offset);
        if (view != null) {
            if (this.mBucket.remove(offset)) {
                unhideViewInternal(view);
            }
            this.mCallback.removeViewAt(offset);
        }
    }

    View getChildAt(int index) {
        int offset = getOffset(index);
        return this.mCallback.getChildAt(offset);
    }

    void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int i = this.mHiddenViews.size() - 1; i >= 0; i--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(i));
            this.mHiddenViews.remove(i);
        }
        this.mCallback.removeAllViews();
    }

    View findHiddenNonRemovedView(int position) {
        int count = this.mHiddenViews.size();
        for (int i = 0; i < count; i++) {
            View view = this.mHiddenViews.get(i);
            RecyclerView.ViewHolder holder = this.mCallback.getChildViewHolder(view);
            if (holder.getLayoutPosition() == position && !holder.isInvalid() && !holder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    void attachViewToParent(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.mCallback.getChildCount();
        } else {
            offset = getOffset(index);
        }
        this.mBucket.insert(offset, hidden);
        if (hidden) {
            hideViewInternal(child);
        }
        this.mCallback.attachViewToParent(child, offset, layoutParams);
    }

    int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    View getUnfilteredChildAt(int index) {
        return this.mCallback.getChildAt(index);
    }

    void detachViewFromParent(int index) {
        int offset = getOffset(index);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    int indexOfChild(View child) {
        int index = this.mCallback.indexOfChild(child);
        if (index == -1 || this.mBucket.get(index)) {
            return -1;
        }
        return index - this.mBucket.countOnesBefore(index);
    }

    boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    void hide(View view) {
        int offset = this.mCallback.indexOfChild(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.mBucket.set(offset);
        hideViewInternal(view);
    }

    void unhide(View view) {
        int offset = this.mCallback.indexOfChild(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (!this.mBucket.get(offset)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        this.mBucket.clear(offset);
        unhideViewInternal(view);
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    boolean removeViewIfHidden(View view) {
        int index = this.mCallback.indexOfChild(view);
        if (index == -1) {
            if (unhideViewInternal(view)) {
            }
            return true;
        }
        if (this.mBucket.get(index)) {
            this.mBucket.remove(index);
            if (!unhideViewInternal(view)) {
            }
            this.mCallback.removeViewAt(index);
            return true;
        }
        return false;
    }

    static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        Bucket() {
        }

        void set(int index) {
            if (index >= 64) {
                ensureNext();
                this.mNext.set(index - 64);
            } else {
                this.mData |= 1 << index;
            }
        }

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        void clear(int index) {
            if (index >= 64) {
                if (this.mNext != null) {
                    this.mNext.clear(index - 64);
                    return;
                }
                return;
            }
            this.mData &= (1 << index) ^ (-1);
        }

        boolean get(int index) {
            if (index < 64) {
                return (this.mData & (1 << index)) != 0;
            }
            ensureNext();
            return this.mNext.get(index - 64);
        }

        void reset() {
            this.mData = 0L;
            if (this.mNext != null) {
                this.mNext.reset();
            }
        }

        void insert(int index, boolean value) {
            if (index >= 64) {
                ensureNext();
                this.mNext.insert(index - 64, value);
                return;
            }
            boolean lastBit = (this.mData & LAST_BIT) != 0;
            long mask = (1 << index) - 1;
            long before = this.mData & mask;
            long after = (this.mData & ((-1) ^ mask)) << 1;
            this.mData = before | after;
            if (value) {
                set(index);
            } else {
                clear(index);
            }
            if (lastBit || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, lastBit);
            }
        }

        boolean remove(int index) {
            if (index >= 64) {
                ensureNext();
                return this.mNext.remove(index - 64);
            }
            long mask = 1 << index;
            boolean value = (this.mData & mask) != 0;
            this.mData &= (-1) ^ mask;
            long mask2 = mask - 1;
            long before = this.mData & mask2;
            long after = Long.rotateRight(this.mData & ((-1) ^ mask2), 1);
            this.mData = before | after;
            if (this.mNext != null) {
                if (this.mNext.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
                return value;
            }
            return value;
        }

        int countOnesBefore(int index) {
            if (this.mNext == null) {
                if (index >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << index) - 1));
            }
            if (index < 64) {
                return Long.bitCount(this.mData & ((1 << index) - 1));
            }
            return this.mNext.countOnesBefore(index - 64) + Long.bitCount(this.mData);
        }

        public String toString() {
            return this.mNext == null ? Long.toBinaryString(this.mData) : this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }
}
