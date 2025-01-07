package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes54.dex */
public interface ArrayPool {
    public static final int STANDARD_BUFFER_SIZE_BYTES = 65536;

    void clearMemory();

    <T> T get(int r1, Class<T> cls);

    <T> T getExact(int r1, Class<T> cls);

    <T> void put(T t);

    @Deprecated
    <T> void put(T t, Class<T> cls);

    void trimMemory(int r1);
}
