package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes54.dex */
public final class Option<T> {
    private static final CacheKeyUpdater<Object> EMPTY_UPDATER = new CacheKeyUpdater<Object>() { // from class: com.bumptech.glide.load.Option.1
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(@NonNull byte[] keyBytes, @NonNull Object value, @NonNull MessageDigest messageDigest) {
        }
    };
    private final CacheKeyUpdater<T> cacheKeyUpdater;
    private final T defaultValue;
    private final String key;
    private volatile byte[] keyBytes;

    public interface CacheKeyUpdater<T> {
        void update(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String key) {
        return new Option<>(key, null, emptyUpdater());
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String key, @NonNull T defaultValue) {
        return new Option<>(key, defaultValue, emptyUpdater());
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String key, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(key, null, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String key, @Nullable T defaultValue, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(key, defaultValue, cacheKeyUpdater);
    }

    private Option(@NonNull String key, @Nullable T defaultValue, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        this.key = Preconditions.checkNotEmpty(key);
        this.defaultValue = defaultValue;
        this.cacheKeyUpdater = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    @Nullable
    public T getDefaultValue() {
        return this.defaultValue;
    }

    public void update(@NonNull T value, @NonNull MessageDigest messageDigest) {
        this.cacheKeyUpdater.update(getKeyBytes(), value, messageDigest);
    }

    @NonNull
    private byte[] getKeyBytes() {
        if (this.keyBytes == null) {
            this.keyBytes = this.key.getBytes(Key.CHARSET);
        }
        return this.keyBytes;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Option)) {
            return false;
        }
        Option<?> other = (Option) o;
        return this.key.equals(other.key);
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @NonNull
    private static <T> CacheKeyUpdater<T> emptyUpdater() {
        return (CacheKeyUpdater<T>) EMPTY_UPDATER;
    }

    public String toString() {
        return "Option{key='" + this.key + "'}";
    }
}
