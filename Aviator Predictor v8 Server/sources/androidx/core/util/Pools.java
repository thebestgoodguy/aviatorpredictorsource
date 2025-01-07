package androidx.core.util;

/* loaded from: classes6.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T t);
    }

    private Pools() {
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int maxPoolSize) {
            if (maxPoolSize <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[maxPoolSize];
        }

        @Override // androidx.core.util.Pools.Pool
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

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            if (isInPool(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int r0 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (r0 < objArr.length) {
                objArr[r0] = instance;
                this.mPoolSize = r0 + 1;
                return true;
            }
            return false;
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

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock;

        public SynchronizedPool(int maxPoolSize) {
            super(maxPoolSize);
            this.mLock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(instance);
            }
            return release;
        }
    }
}
