package androidx.constraintlayout.core;

/* loaded from: classes40.dex */
final class Pools {
    private static final boolean DEBUG = false;

    interface Pool<T> {
        T acquire();

        boolean release(T t);

        void releaseAll(T[] tArr, int r2);
    }

    private Pools() {
    }

    static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        SimplePool(int maxPoolSize) {
            if (maxPoolSize <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[maxPoolSize];
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int r0 = this.mPoolSize;
            if (r0 <= 0) {
                return null;
            }
            int r2 = r0 - 1;
            Object[] objArr = this.mPool;
            T t = (T) objArr[r2];
            objArr[r2] = null;
            this.mPoolSize = r0 - 1;
            return t;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T instance) {
            int r0 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (r0 < objArr.length) {
                objArr[r0] = instance;
                this.mPoolSize = r0 + 1;
                return true;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] variables, int count) {
            if (count > variables.length) {
                count = variables.length;
            }
            for (int i = 0; i < count; i++) {
                T instance = variables[i];
                int r2 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (r2 < objArr.length) {
                    objArr[r2] = instance;
                    this.mPoolSize = r2 + 1;
                }
            }
        }

        private boolean isInPool(T instance) {
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == instance) {
                    return true;
                }
            }
            return false;
        }
    }
}
