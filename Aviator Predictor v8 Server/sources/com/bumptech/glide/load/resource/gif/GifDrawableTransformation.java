package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes54.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {
    private final Transformation<Bitmap> wrapped;

    public GifDrawableTransformation(Transformation<Bitmap> wrapped) {
        this.wrapped = (Transformation) Preconditions.checkNotNull(wrapped);
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<GifDrawable> transform(@NonNull Context context, @NonNull Resource<GifDrawable> resource, int outWidth, int outHeight) {
        GifDrawable drawable = resource.get();
        BitmapPool bitmapPool = Glide.get(context).getBitmapPool();
        Bitmap firstFrame = drawable.getFirstFrame();
        Resource<Bitmap> bitmapResource = new BitmapResource(firstFrame, bitmapPool);
        Resource<Bitmap> transformed = this.wrapped.transform(context, bitmapResource, outWidth, outHeight);
        if (!bitmapResource.equals(transformed)) {
            bitmapResource.recycle();
        }
        Bitmap transformedFrame = transformed.get();
        drawable.setFrameTransformation(this.wrapped, transformedFrame);
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object o) {
        if (!(o instanceof GifDrawableTransformation)) {
            return false;
        }
        GifDrawableTransformation other = (GifDrawableTransformation) o;
        return this.wrapped.equals(other.wrapped);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.wrapped.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.wrapped.updateDiskCacheKey(messageDigest);
    }
}
