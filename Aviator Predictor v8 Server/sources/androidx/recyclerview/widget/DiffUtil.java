package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes42.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal o1, Diagonal o2) {
            return o1.x - o2.x;
        }
    };

    private DiffUtil() {
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback cb) {
        return calculateDiff(cb, true);
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback cb, boolean detectMoves) {
        int oldSize = cb.getOldListSize();
        int newSize = cb.getNewListSize();
        List<Diagonal> diagonals = new ArrayList<>();
        List<Range> stack = new ArrayList<>();
        stack.add(new Range(0, oldSize, 0, newSize));
        int max = ((oldSize + newSize) + 1) / 2;
        CenteredArray forward = new CenteredArray((max * 2) + 1);
        CenteredArray backward = new CenteredArray((max * 2) + 1);
        List<Range> rangePool = new ArrayList<>();
        while (!stack.isEmpty()) {
            Range range = stack.remove(stack.size() - 1);
            Snake snake = midPoint(range, cb, forward, backward);
            if (snake != null) {
                if (snake.diagonalSize() > 0) {
                    diagonals.add(snake.toDiagonal());
                }
                Range left = rangePool.isEmpty() ? new Range() : rangePool.remove(rangePool.size() - 1);
                left.oldListStart = range.oldListStart;
                left.newListStart = range.newListStart;
                left.oldListEnd = snake.startX;
                left.newListEnd = snake.startY;
                stack.add(left);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = snake.endX;
                range.newListStart = snake.endY;
                stack.add(range);
            } else {
                rangePool.add(range);
            }
        }
        Collections.sort(diagonals, DIAGONAL_COMPARATOR);
        return new DiffResult(cb, diagonals, forward.backingData(), backward.backingData(), detectMoves);
    }

    @Nullable
    private static Snake midPoint(Range range, Callback cb, CenteredArray forward, CenteredArray backward) {
        if (range.oldSize() < 1 || range.newSize() < 1) {
            return null;
        }
        int max = ((range.oldSize() + range.newSize()) + 1) / 2;
        forward.set(1, range.oldListStart);
        backward.set(1, range.oldListEnd);
        for (int d = 0; d < max; d++) {
            Snake snake = forward(range, cb, forward, backward, d);
            if (snake == null) {
                Snake snake2 = backward(range, cb, forward, backward, d);
                if (snake2 != null) {
                    return snake2;
                }
            } else {
                return snake;
            }
        }
        return null;
    }

    @Nullable
    private static Snake forward(Range range, Callback cb, CenteredArray forward, CenteredArray backward, int d) {
        int startX;
        int x;
        int backwardsK;
        boolean checkForSnake = Math.abs(range.oldSize() - range.newSize()) % 2 == 1;
        int delta = range.oldSize() - range.newSize();
        for (int k = -d; k <= d; k += 2) {
            if (k == (-d) || (k != d && forward.get(k + 1) > forward.get(k - 1))) {
                startX = forward.get(k + 1);
                x = startX;
            } else {
                startX = forward.get(k - 1);
                x = startX + 1;
            }
            int y = (range.newListStart + (x - range.oldListStart)) - k;
            int startY = (d == 0 || x != startX) ? y : y - 1;
            while (x < range.oldListEnd && y < range.newListEnd && cb.areItemsTheSame(x, y)) {
                x++;
                y++;
            }
            forward.set(k, x);
            if (checkForSnake && (backwardsK = delta - k) >= (-d) + 1 && backwardsK <= d - 1 && backward.get(backwardsK) <= x) {
                Snake snake = new Snake();
                snake.startX = startX;
                snake.startY = startY;
                snake.endX = x;
                snake.endY = y;
                snake.reverse = false;
                return snake;
            }
        }
        return null;
    }

    @Nullable
    private static Snake backward(Range range, Callback cb, CenteredArray forward, CenteredArray backward, int d) {
        int startX;
        int x;
        int forwardsK;
        boolean checkForSnake = (range.oldSize() - range.newSize()) % 2 == 0;
        int delta = range.oldSize() - range.newSize();
        for (int k = -d; k <= d; k += 2) {
            if (k == (-d) || (k != d && backward.get(k + 1) < backward.get(k - 1))) {
                startX = backward.get(k + 1);
                x = startX;
            } else {
                startX = backward.get(k - 1);
                x = startX - 1;
            }
            int y = range.newListEnd - ((range.oldListEnd - x) - k);
            int startY = (d == 0 || x != startX) ? y : y + 1;
            while (x > range.oldListStart && y > range.newListStart && cb.areItemsTheSame(x - 1, y - 1)) {
                x--;
                y--;
            }
            backward.set(k, x);
            if (checkForSnake && (forwardsK = delta - k) >= (-d) && forwardsK <= d && forward.get(forwardsK) >= x) {
                Snake snake = new Snake();
                snake.startX = x;
                snake.startY = y;
                snake.endX = startX;
                snake.endY = startY;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int r1, int r2);

        public abstract boolean areItemsTheSame(int r1, int r2);

        public abstract int getNewListSize();

        public abstract int getOldListSize();

        @Nullable
        public Object getChangePayload(int oldItemPosition, int newItemPosition) {
            return null;
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
            return null;
        }
    }

    static class Diagonal {
        public final int size;
        public final int x;
        public final int y;

        Diagonal(int x, int y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
        }

        int endX() {
            return this.x + this.size;
        }

        int endY() {
            return this.y + this.size;
        }
    }

    static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        Snake() {
        }

        boolean hasAdditionOrRemoval() {
            return this.endY - this.startY != this.endX - this.startX;
        }

        boolean isAddition() {
            return this.endY - this.startY > this.endX - this.startX;
        }

        int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        @NonNull
        Diagonal toDiagonal() {
            if (hasAdditionOrRemoval()) {
                if (this.reverse) {
                    return new Diagonal(this.startX, this.startY, diagonalSize());
                }
                if (isAddition()) {
                    return new Diagonal(this.startX, this.startY + 1, diagonalSize());
                }
                return new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
            return new Diagonal(this.startX, this.startY, this.endX - this.startX);
        }
    }

    static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public Range(int oldListStart, int oldListEnd, int newListStart, int newListEnd) {
            this.oldListStart = oldListStart;
            this.oldListEnd = oldListEnd;
            this.newListStart = newListStart;
            this.newListEnd = newListEnd;
        }

        int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        int newSize() {
            return this.newListEnd - this.newListStart;
        }
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        DiffResult(Callback callback, List<Diagonal> diagonals, int[] oldItemStatuses, int[] newItemStatuses, boolean detectMoves) {
            this.mDiagonals = diagonals;
            this.mOldItemStatuses = oldItemStatuses;
            this.mNewItemStatuses = newItemStatuses;
            Arrays.fill(this.mOldItemStatuses, 0);
            Arrays.fill(this.mNewItemStatuses, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = detectMoves;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal first = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (first == null || first.x != 0 || first.y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int offset = 0; offset < diagonal.size; offset++) {
                    int posX = diagonal.x + offset;
                    int posY = diagonal.y + offset;
                    boolean theSame = this.mCallback.areContentsTheSame(posX, posY);
                    int changeFlag = theSame ? 1 : 2;
                    this.mOldItemStatuses[posX] = (posY << 4) | changeFlag;
                    this.mNewItemStatuses[posY] = (posX << 4) | changeFlag;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int posX = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (posX < diagonal.x) {
                    if (this.mOldItemStatuses[posX] == 0) {
                        findMatchingAddition(posX);
                    }
                    posX++;
                }
                posX = diagonal.endX();
            }
        }

        private void findMatchingAddition(int posX) {
            int posY = 0;
            int diagonalsSize = this.mDiagonals.size();
            for (int i = 0; i < diagonalsSize; i++) {
                Diagonal diagonal = this.mDiagonals.get(i);
                while (posY < diagonal.y) {
                    if (this.mNewItemStatuses[posY] == 0) {
                        boolean matching = this.mCallback.areItemsTheSame(posX, posY);
                        if (matching) {
                            boolean contentsMatching = this.mCallback.areContentsTheSame(posX, posY);
                            int changeFlag = contentsMatching ? 8 : 4;
                            this.mOldItemStatuses[posX] = (posY << 4) | changeFlag;
                            this.mNewItemStatuses[posY] = (posX << 4) | changeFlag;
                            return;
                        }
                    }
                    posY++;
                }
                posY = diagonal.endY();
            }
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int oldListPosition) {
            if (oldListPosition < 0 || oldListPosition >= this.mOldListSize) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + oldListPosition + ", old list size = " + this.mOldListSize);
            }
            int status = this.mOldItemStatuses[oldListPosition];
            if ((status & 15) == 0) {
                return -1;
            }
            return status >> 4;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int newListPosition) {
            if (newListPosition < 0 || newListPosition >= this.mNewListSize) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + newListPosition + ", new list size = " + this.mNewListSize);
            }
            int status = this.mNewItemStatuses[newListPosition];
            if ((status & 15) == 0) {
                return -1;
            }
            return status >> 4;
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback updateCallback) {
            BatchingListUpdateCallback batchingCallback;
            if (updateCallback instanceof BatchingListUpdateCallback) {
                batchingCallback = (BatchingListUpdateCallback) updateCallback;
            } else {
                batchingCallback = new BatchingListUpdateCallback(updateCallback);
            }
            int currentListSize = this.mOldListSize;
            Collection<PostponedUpdate> postponedUpdates = new ArrayDeque<>();
            int posX = this.mOldListSize;
            int posY = this.mNewListSize;
            for (int diagonalIndex = this.mDiagonals.size() - 1; diagonalIndex >= 0; diagonalIndex--) {
                Diagonal diagonal = this.mDiagonals.get(diagonalIndex);
                int endX = diagonal.endX();
                int endY = diagonal.endY();
                while (posX > endX) {
                    posX--;
                    int status = this.mOldItemStatuses[posX];
                    if ((status & 12) != 0) {
                        int newPos = status >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(postponedUpdates, newPos, false);
                        if (postponedUpdate != null) {
                            int updatedNewPos = currentListSize - postponedUpdate.currentPos;
                            batchingCallback.onMoved(posX, updatedNewPos - 1);
                            if ((status & 4) != 0) {
                                Object changePayload = this.mCallback.getChangePayload(posX, newPos);
                                batchingCallback.onChanged(updatedNewPos - 1, 1, changePayload);
                            }
                        } else {
                            postponedUpdates.add(new PostponedUpdate(posX, (currentListSize - posX) - 1, true));
                        }
                    } else {
                        batchingCallback.onRemoved(posX, 1);
                        currentListSize--;
                    }
                }
                while (posY > endY) {
                    posY--;
                    int status2 = this.mNewItemStatuses[posY];
                    if ((status2 & 12) != 0) {
                        int oldPos = status2 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(postponedUpdates, oldPos, true);
                        if (postponedUpdate2 == null) {
                            postponedUpdates.add(new PostponedUpdate(posY, currentListSize - posX, false));
                        } else {
                            int updatedOldPos = (currentListSize - postponedUpdate2.currentPos) - 1;
                            batchingCallback.onMoved(updatedOldPos, posX);
                            if ((status2 & 4) != 0) {
                                Object changePayload2 = this.mCallback.getChangePayload(oldPos, posY);
                                batchingCallback.onChanged(posX, 1, changePayload2);
                            }
                        }
                    } else {
                        batchingCallback.onInserted(posX, 1);
                        currentListSize++;
                    }
                }
                int posX2 = diagonal.x;
                int posY2 = diagonal.y;
                for (int i = 0; i < diagonal.size; i++) {
                    if ((this.mOldItemStatuses[posX2] & 15) == 2) {
                        Object changePayload3 = this.mCallback.getChangePayload(posX2, posY2);
                        batchingCallback.onChanged(posX2, 1, changePayload3);
                    }
                    posX2++;
                    posY2++;
                }
                posX = diagonal.x;
                posY = diagonal.y;
            }
            batchingCallback.dispatchLastEvent();
        }

        @Nullable
        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> postponedUpdates, int posInList, boolean removal) {
            PostponedUpdate postponedUpdate = null;
            Iterator<PostponedUpdate> itr = postponedUpdates.iterator();
            while (true) {
                if (!itr.hasNext()) {
                    break;
                }
                PostponedUpdate update = itr.next();
                if (update.posInOwnerList == posInList && update.removal == removal) {
                    postponedUpdate = update;
                    itr.remove();
                    break;
                }
            }
            while (itr.hasNext()) {
                PostponedUpdate update2 = itr.next();
                if (removal) {
                    update2.currentPos--;
                } else {
                    update2.currentPos++;
                }
            }
            return postponedUpdate;
        }
    }

    private static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        PostponedUpdate(int posInOwnerList, int currentPos, boolean removal) {
            this.posInOwnerList = posInOwnerList;
            this.currentPos = currentPos;
            this.removal = removal;
        }
    }

    static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        CenteredArray(int size) {
            this.mData = new int[size];
            this.mMid = this.mData.length / 2;
        }

        int get(int index) {
            return this.mData[this.mMid + index];
        }

        int[] backingData() {
            return this.mData;
        }

        void set(int index, int value) {
            this.mData[this.mMid + index] = value;
        }

        public void fill(int value) {
            Arrays.fill(this.mData, value);
        }
    }
}
