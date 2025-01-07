package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes5.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    private static int binarySearchHashes(int[] hashes, int N, int hash) {
        try {
            return ContainerHelpers.binarySearch(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    int indexOf(Object key, int hash) {
        int N = this.mSize;
        if (N == 0) {
            return -1;
        }
        int index = binarySearchHashes(this.mHashes, N, hash);
        if (index < 0) {
            return index;
        }
        if (key.equals(this.mArray[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.mHashes[end] == hash) {
            if (key.equals(this.mArray[end << 1])) {
                return end;
            }
            end++;
        }
        for (int i = index - 1; i >= 0 && this.mHashes[i] == hash; i--) {
            if (key.equals(this.mArray[i << 1])) {
                return i;
            }
        }
        int i2 = end ^ (-1);
        return i2;
    }

    int indexOfNull() {
        int N = this.mSize;
        if (N == 0) {
            return -1;
        }
        int index = binarySearchHashes(this.mHashes, N, 0);
        if (index < 0) {
            return index;
        }
        if (this.mArray[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.mHashes[end] == 0) {
            if (this.mArray[end << 1] == null) {
                return end;
            }
            end++;
        }
        for (int i = index - 1; i >= 0 && this.mHashes[i] == 0; i--) {
            if (this.mArray[i << 1] == null) {
                return i;
            }
        }
        int i2 = end ^ (-1);
        return i2;
    }

    private void allocArrays(int size) {
        if (size == 8) {
            synchronized (SimpleArrayMap.class) {
                Object[] array = mTwiceBaseCache;
                if (array != null) {
                    this.mArray = array;
                    mTwiceBaseCache = (Object[]) array[0];
                    this.mHashes = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (SimpleArrayMap.class) {
                Object[] array2 = mBaseCache;
                if (array2 != null) {
                    this.mArray = array2;
                    mBaseCache = (Object[]) array2[0];
                    this.mHashes = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[size];
        this.mArray = new Object[size << 1];
    }

    private static void freeArrays(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (SimpleArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    array[0] = mTwiceBaseCache;
                    array[1] = hashes;
                    for (int i = (size << 1) - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    mTwiceBaseCache = array;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (hashes.length == 4) {
            synchronized (SimpleArrayMap.class) {
                if (mBaseCacheSize < 10) {
                    array[0] = mBaseCache;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    mBaseCache = array;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int capacity) {
        if (capacity == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(capacity);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    public void clear() {
        if (this.mSize > 0) {
            int[] ohashes = this.mHashes;
            Object[] oarray = this.mArray;
            int osize = this.mSize;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(ohashes, oarray, osize);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int minimumCapacity) {
        int osize = this.mSize;
        if (this.mHashes.length < minimumCapacity) {
            int[] ohashes = this.mHashes;
            Object[] oarray = this.mArray;
            allocArrays(minimumCapacity);
            if (this.mSize > 0) {
                System.arraycopy(ohashes, 0, this.mHashes, 0, osize);
                System.arraycopy(oarray, 0, this.mArray, 0, osize << 1);
            }
            freeArrays(ohashes, oarray, osize);
        }
        if (this.mSize != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object key) {
        if (indexOfKey(key) >= 0) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public int indexOfKey(Object key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    int indexOfValue(Object value) {
        int N = this.mSize * 2;
        Object[] array = this.mArray;
        if (value == null) {
            for (int i = 1; i < N; i += 2) {
                if (array[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < N; i2 += 2) {
            if (value.equals(array[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object value) {
        if (indexOfValue(value) >= 0) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public V get(Object key) {
        return getOrDefault(key, null);
    }

    public V getOrDefault(Object obj, V v) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (V) this.mArray[(indexOfKey << 1) + 1] : v;
    }

    public K keyAt(int r3) {
        return (K) this.mArray[r3 << 1];
    }

    public V valueAt(int r3) {
        return (V) this.mArray[(r3 << 1) + 1];
    }

    public V setValueAt(int r3, V v) {
        int r0 = (r3 << 1) + 1;
        Object[] objArr = this.mArray;
        V v2 = (V) objArr[r0];
        objArr[r0] = v;
        return v2;
    }

    public boolean isEmpty() {
        if (this.mSize <= 0) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public V put(K k, V v) {
        int hashCode;
        int indexOf;
        int r0 = this.mSize;
        if (k == null) {
            hashCode = 0;
            indexOf = indexOfNull();
        } else {
            hashCode = k.hashCode();
            indexOf = indexOf(k, hashCode);
        }
        if (indexOf >= 0) {
            int r3 = (indexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v2 = (V) objArr[r3];
            objArr[r3] = v;
            return v2;
        }
        int r2 = indexOf ^ (-1);
        if (r0 >= this.mHashes.length) {
            int r32 = 4;
            if (r0 >= 8) {
                r32 = (r0 >> 1) + r0;
            } else if (r0 >= 4) {
                r32 = 8;
            }
            int[] r4 = this.mHashes;
            Object[] objArr2 = this.mArray;
            allocArrays(r32);
            if (r0 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] r6 = this.mHashes;
            if (r6.length > 0) {
                System.arraycopy(r4, 0, r6, 0, r4.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(r4, objArr2, r0);
        }
        if (r2 < r0) {
            int[] r33 = this.mHashes;
            System.arraycopy(r33, r2, r33, r2 + 1, r0 - r2);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, r2 << 1, objArr3, (r2 + 1) << 1, (this.mSize - r2) << 1);
        }
        int r34 = this.mSize;
        if (r0 == r34) {
            int[] r42 = this.mHashes;
            if (r2 < r42.length) {
                r42[r2] = hashCode;
                Object[] objArr4 = this.mArray;
                objArr4[r2 << 1] = k;
                objArr4[(r2 << 1) + 1] = v;
                this.mSize = r34 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> array) {
        int N = array.mSize;
        ensureCapacity(this.mSize + N);
        if (this.mSize == 0) {
            if (N > 0) {
                System.arraycopy(array.mHashes, 0, this.mHashes, 0, N);
                System.arraycopy(array.mArray, 0, this.mArray, 0, N << 1);
                this.mSize = N;
                return;
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            put(array.keyAt(i), array.valueAt(i));
        }
    }

    public V putIfAbsent(K key, V value) {
        V mapValue = get(key);
        if (mapValue == null) {
            return put(key, value);
        }
        return mapValue;
    }

    public V remove(Object key) {
        int index = indexOfKey(key);
        if (index >= 0) {
            return removeAt(index);
        }
        return null;
    }

    public boolean remove(Object key, Object value) {
        int index = indexOfKey(key);
        if (index >= 0) {
            V mapValue = valueAt(index);
            if (value == mapValue || (value != null && value.equals(mapValue))) {
                removeAt(index);
                return CONCURRENT_MODIFICATION_EXCEPTIONS;
            }
            return false;
        }
        return false;
    }

    public V removeAt(int r12) {
        V v = (V) this.mArray[(r12 << 1) + 1];
        int r1 = this.mSize;
        if (r1 <= 1) {
            clear();
        } else {
            int r3 = r1 - 1;
            int[] r4 = this.mHashes;
            if (r4.length > 8 && r1 < r4.length / 3) {
                int r42 = r1 > 8 ? r1 + (r1 >> 1) : 8;
                int[] r5 = this.mHashes;
                Object[] objArr = this.mArray;
                allocArrays(r42);
                if (r1 != this.mSize) {
                    throw new ConcurrentModificationException();
                }
                if (r12 > 0) {
                    System.arraycopy(r5, 0, this.mHashes, 0, r12);
                    System.arraycopy(objArr, 0, this.mArray, 0, r12 << 1);
                }
                if (r12 < r3) {
                    System.arraycopy(r5, r12 + 1, this.mHashes, r12, r3 - r12);
                    System.arraycopy(objArr, (r12 + 1) << 1, this.mArray, r12 << 1, (r3 - r12) << 1);
                }
            } else {
                if (r12 < r3) {
                    System.arraycopy(r4, r12 + 1, r4, r12, r3 - r12);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, (r12 + 1) << 1, objArr2, r12 << 1, (r3 - r12) << 1);
                }
                Object[] objArr3 = this.mArray;
                objArr3[r3 << 1] = null;
                objArr3[(r3 << 1) + 1] = null;
            }
            if (r1 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            this.mSize = r3;
        }
        return v;
    }

    public V replace(K key, V value) {
        int index = indexOfKey(key);
        if (index >= 0) {
            return setValueAt(index, value);
        }
        return null;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int index = indexOfKey(key);
        if (index >= 0) {
            V mapValue = valueAt(index);
            if (mapValue == oldValue || (oldValue != null && oldValue.equals(mapValue))) {
                setValueAt(index, newValue);
                return CONCURRENT_MODIFICATION_EXCEPTIONS;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.mSize;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        if (object instanceof SimpleArrayMap) {
            SimpleArrayMap<?, ?> map = (SimpleArrayMap) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.mSize; i++) {
                K key = keyAt(i);
                V mine = valueAt(i);
                Object theirs = map.get(key);
                if (mine == null) {
                    if (theirs != null || !map.containsKey(key)) {
                        return false;
                    }
                } else if (!mine.equals(theirs)) {
                    return false;
                }
            }
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        if (object instanceof Map) {
            Map<?, ?> map2 = (Map) object;
            if (size() != map2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.mSize; i2++) {
                K key2 = keyAt(i2);
                V mine2 = valueAt(i2);
                Object theirs2 = map2.get(key2);
                if (mine2 == null) {
                    if (theirs2 != null || !map2.containsKey(key2)) {
                        return false;
                    }
                } else if (!mine2.equals(theirs2)) {
                    return false;
                }
            }
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public int hashCode() {
        int[] hashes = this.mHashes;
        Object[] array = this.mArray;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.mSize;
        while (i < s) {
            Object value = array[v];
            result += hashes[i] ^ (value == null ? 0 : value.hashCode());
            i++;
            v += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.mSize * 28);
        buffer.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object key = keyAt(i);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = valueAt(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
