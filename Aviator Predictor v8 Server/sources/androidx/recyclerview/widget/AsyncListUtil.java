package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes42.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final DataCallback<T> mDataCallback;
    final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final Class<T> mTClass;
    final TileList<T> mTileList;
    final int mTileSize;
    final ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = this.mDisplayedGeneration;
    final SparseIntArray mMissingPositions = new SparseIntArray();
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int generation, int itemCount) {
            if (isRequestedGeneration(generation)) {
                AsyncListUtil.this.mItemCount = itemCount;
                AsyncListUtil.this.mViewCallback.onDataRefresh();
                AsyncListUtil.this.mDisplayedGeneration = AsyncListUtil.this.mRequestedGeneration;
                recycleAllTiles();
                AsyncListUtil.this.mAllowScrollHints = false;
                AsyncListUtil.this.updateRange();
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int generation, TileList.Tile<T> tile) {
            if (!isRequestedGeneration(generation)) {
                AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                return;
            }
            TileList.Tile<T> duplicate = AsyncListUtil.this.mTileList.addOrReplace(tile);
            if (duplicate != null) {
                Log.e(AsyncListUtil.TAG, "duplicate tile @" + duplicate.mStartPosition);
                AsyncListUtil.this.mBackgroundProxy.recycleTile(duplicate);
            }
            int endPosition = tile.mStartPosition + tile.mItemCount;
            int index = 0;
            while (index < AsyncListUtil.this.mMissingPositions.size()) {
                int position = AsyncListUtil.this.mMissingPositions.keyAt(index);
                if (tile.mStartPosition <= position && position < endPosition) {
                    AsyncListUtil.this.mMissingPositions.removeAt(index);
                    AsyncListUtil.this.mViewCallback.onItemLoaded(position);
                } else {
                    index++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int generation, int position) {
            if (isRequestedGeneration(generation)) {
                TileList.Tile<T> tile = AsyncListUtil.this.mTileList.removeAtPos(position);
                if (tile == null) {
                    Log.e(AsyncListUtil.TAG, "tile not found @" + position);
                } else {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                }
            }
        }

        private void recycleAllTiles() {
            for (int i = 0; i < AsyncListUtil.this.mTileList.size(); i++) {
                AsyncListUtil.this.mBackgroundProxy.recycleTile(AsyncListUtil.this.mTileList.getAtIndex(i));
            }
            AsyncListUtil.this.mTileList.clear();
        }

        private boolean isRequestedGeneration(int generation) {
            return generation == AsyncListUtil.this.mRequestedGeneration;
        }
    };
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
        private int mFirstRequiredTileStart;
        private int mGeneration;
        private int mItemCount;
        private int mLastRequiredTileStart;
        final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
        private TileList.Tile<T> mRecycledRoot;

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int generation) {
            this.mGeneration = generation;
            this.mLoadedTiles.clear();
            this.mItemCount = AsyncListUtil.this.mDataCallback.refreshData();
            AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, this.mItemCount);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int rangeStart, int rangeEnd, int extRangeStart, int extRangeEnd, int scrollHint) {
            if (rangeStart <= rangeEnd) {
                int firstVisibleTileStart = getTileStart(rangeStart);
                int lastVisibleTileStart = getTileStart(rangeEnd);
                this.mFirstRequiredTileStart = getTileStart(extRangeStart);
                this.mLastRequiredTileStart = getTileStart(extRangeEnd);
                if (scrollHint == 1) {
                    requestTiles(this.mFirstRequiredTileStart, lastVisibleTileStart, scrollHint, true);
                    requestTiles(AsyncListUtil.this.mTileSize + lastVisibleTileStart, this.mLastRequiredTileStart, scrollHint, false);
                } else {
                    requestTiles(firstVisibleTileStart, this.mLastRequiredTileStart, scrollHint, false);
                    requestTiles(this.mFirstRequiredTileStart, firstVisibleTileStart - AsyncListUtil.this.mTileSize, scrollHint, true);
                }
            }
        }

        private int getTileStart(int position) {
            return position - (position % AsyncListUtil.this.mTileSize);
        }

        private void requestTiles(int firstTileStart, int lastTileStart, int scrollHint, boolean backwards) {
            int i = firstTileStart;
            while (i <= lastTileStart) {
                int tileStart = backwards ? (lastTileStart + firstTileStart) - i : i;
                AsyncListUtil.this.mBackgroundProxy.loadTile(tileStart, scrollHint);
                i += AsyncListUtil.this.mTileSize;
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int position, int scrollHint) {
            if (!isTileLoaded(position)) {
                TileList.Tile<T> tile = acquireTile();
                tile.mStartPosition = position;
                tile.mItemCount = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - tile.mStartPosition);
                AsyncListUtil.this.mDataCallback.fillData(tile.mItems, tile.mStartPosition, tile.mItemCount);
                flushTileCache(scrollHint);
                addTile(tile);
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile<T> tile) {
            AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
            tile.mNext = this.mRecycledRoot;
            this.mRecycledRoot = tile;
        }

        private TileList.Tile<T> acquireTile() {
            if (this.mRecycledRoot != null) {
                TileList.Tile<T> result = this.mRecycledRoot;
                this.mRecycledRoot = this.mRecycledRoot.mNext;
                return result;
            }
            TileList.Tile<T> result2 = new TileList.Tile<>(AsyncListUtil.this.mTClass, AsyncListUtil.this.mTileSize);
            return result2;
        }

        private boolean isTileLoaded(int position) {
            return this.mLoadedTiles.get(position);
        }

        private void addTile(TileList.Tile<T> tile) {
            this.mLoadedTiles.put(tile.mStartPosition, true);
            AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
        }

        private void removeTile(int position) {
            this.mLoadedTiles.delete(position);
            AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, position);
        }

        private void flushTileCache(int scrollHint) {
            int cacheSizeLimit = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
            while (this.mLoadedTiles.size() >= cacheSizeLimit) {
                int firstLoadedTileStart = this.mLoadedTiles.keyAt(0);
                int lastLoadedTileStart = this.mLoadedTiles.keyAt(this.mLoadedTiles.size() - 1);
                int startMargin = this.mFirstRequiredTileStart - firstLoadedTileStart;
                int endMargin = lastLoadedTileStart - this.mLastRequiredTileStart;
                if (startMargin > 0 && (startMargin >= endMargin || scrollHint == 2)) {
                    removeTile(firstLoadedTileStart);
                } else {
                    if (endMargin <= 0) {
                        return;
                    }
                    if (startMargin < endMargin || scrollHint == 1) {
                        removeTile(lastLoadedTileStart);
                    } else {
                        return;
                    }
                }
            }
        }

        private void log(String s, Object... args) {
            Log.d(AsyncListUtil.TAG, "[BKGR] " + String.format(s, args));
        }
    };

    void log(String s, Object... args) {
        Log.d(TAG, "[MAIN] " + String.format(s, args));
    }

    public AsyncListUtil(@NonNull Class<T> klass, int tileSize, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        this.mTClass = klass;
        this.mTileSize = tileSize;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(this.mTileSize);
        ThreadUtil<T> threadUtil = new MessageThreadUtil<>();
        this.mMainThreadProxy = threadUtil.getMainThreadProxy(this.mMainThreadCallback);
        this.mBackgroundProxy = threadUtil.getBackgroundProxy(this.mBackgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        return this.mRequestedGeneration != this.mDisplayedGeneration;
    }

    public void onRangeChanged() {
        if (!isRefreshPending()) {
            updateRange();
            this.mAllowScrollHints = true;
        }
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int r1 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = r1;
        backgroundCallback.refresh(r1);
    }

    @Nullable
    public T getItem(int position) {
        if (position < 0 || position >= this.mItemCount) {
            throw new IndexOutOfBoundsException(position + " is not within 0 and " + this.mItemCount);
        }
        T item = this.mTileList.getItemAt(position);
        if (item == null && !isRefreshPending()) {
            this.mMissingPositions.put(position, 0);
        }
        return item;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    void updateRange() {
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        if (this.mTmpRange[0] <= this.mTmpRange[1] && this.mTmpRange[0] >= 0 && this.mTmpRange[1] < this.mItemCount) {
            if (!this.mAllowScrollHints) {
                this.mScrollHint = 0;
            } else if (this.mTmpRange[0] > this.mPrevRange[1] || this.mPrevRange[0] > this.mTmpRange[1]) {
                this.mScrollHint = 0;
            } else if (this.mTmpRange[0] < this.mPrevRange[0]) {
                this.mScrollHint = 1;
            } else if (this.mTmpRange[0] > this.mPrevRange[0]) {
                this.mScrollHint = 2;
            }
            this.mPrevRange[0] = this.mTmpRange[0];
            this.mPrevRange[1] = this.mTmpRange[1];
            this.mViewCallback.extendRangeInto(this.mTmpRange, this.mTmpRangeExtended, this.mScrollHint);
            this.mTmpRangeExtended[0] = Math.min(this.mTmpRange[0], Math.max(this.mTmpRangeExtended[0], 0));
            this.mTmpRangeExtended[1] = Math.max(this.mTmpRange[1], Math.min(this.mTmpRangeExtended[1], this.mItemCount - 1));
            this.mBackgroundProxy.updateRange(this.mTmpRange[0], this.mTmpRange[1], this.mTmpRangeExtended[0], this.mTmpRangeExtended[1], this.mScrollHint);
        }
    }

    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int r2, int r3);

        @WorkerThread
        public abstract int refreshData();

        @WorkerThread
        public void recycleData(@NonNull T[] data, int itemCount) {
        }

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] r1);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int r1);

        @UiThread
        public void extendRangeInto(@NonNull int[] range, @NonNull int[] outRange, int scrollHint) {
            int fullRange = (range[1] - range[0]) + 1;
            int halfRange = fullRange / 2;
            outRange[0] = range[0] - (scrollHint == 1 ? fullRange : halfRange);
            int r2 = range[1];
            if (scrollHint != 2) {
                fullRange = halfRange;
            }
            outRange[1] = r2 + fullRange;
        }
    }
}
