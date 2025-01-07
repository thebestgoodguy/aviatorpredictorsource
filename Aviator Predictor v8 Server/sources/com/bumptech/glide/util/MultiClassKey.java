package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes54.dex */
public class MultiClassKey {
    private Class<?> first;
    private Class<?> second;
    private Class<?> third;

    public MultiClassKey() {
    }

    public MultiClassKey(@NonNull Class<?> first, @NonNull Class<?> second) {
        set(first, second);
    }

    public MultiClassKey(@NonNull Class<?> first, @NonNull Class<?> second, @Nullable Class<?> third) {
        set(first, second, third);
    }

    public void set(@NonNull Class<?> first, @NonNull Class<?> second) {
        set(first, second, null);
    }

    public void set(@NonNull Class<?> first, @NonNull Class<?> second, @Nullable Class<?> third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.first + ", second=" + this.second + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiClassKey that = (MultiClassKey) o;
        return this.first.equals(that.first) && this.second.equals(that.second) && Util.bothNullOrEqual(this.third, that.third);
    }

    public int hashCode() {
        int result = this.first.hashCode();
        return (((result * 31) + this.second.hashCode()) * 31) + (this.third != null ? this.third.hashCode() : 0);
    }
}
