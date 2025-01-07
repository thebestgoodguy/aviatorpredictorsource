package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes54.dex */
public final class ObjectKey implements Key {
    private final Object object;

    public ObjectKey(@NonNull Object object) {
        this.object = Preconditions.checkNotNull(object);
    }

    public String toString() {
        return "ObjectKey{object=" + this.object + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        if (!(o instanceof ObjectKey)) {
            return false;
        }
        ObjectKey other = (ObjectKey) o;
        return this.object.equals(other.object);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.object.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.object.toString().getBytes(CHARSET));
    }
}
