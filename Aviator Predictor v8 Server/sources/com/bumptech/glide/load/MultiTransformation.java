package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes54.dex */
public class MultiTransformation<T> implements Transformation<T> {
    private final Collection<? extends Transformation<T>> transformations;

    @SafeVarargs
    public MultiTransformation(@NonNull Transformation<T>... transformations) {
        if (transformations.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.transformations = Arrays.asList(transformations);
    }

    public MultiTransformation(@NonNull Collection<? extends Transformation<T>> transformationList) {
        if (transformationList.isEmpty()) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.transformations = transformationList;
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<T> transform(@NonNull Context context, @NonNull Resource<T> resource, int outWidth, int outHeight) {
        Resource<T> previous = resource;
        for (Transformation<T> transformation : this.transformations) {
            Resource<T> transformed = transformation.transform(context, previous, outWidth, outHeight);
            if (previous != null && !previous.equals(resource) && !previous.equals(transformed)) {
                previous.recycle();
            }
            previous = transformed;
        }
        return previous;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        if (!(o instanceof MultiTransformation)) {
            return false;
        }
        MultiTransformation<?> other = (MultiTransformation) o;
        return this.transformations.equals(other.transformations);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.transformations.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        for (Transformation<T> transformation : this.transformations) {
            transformation.updateDiskCacheKey(messageDigest);
        }
    }
}
