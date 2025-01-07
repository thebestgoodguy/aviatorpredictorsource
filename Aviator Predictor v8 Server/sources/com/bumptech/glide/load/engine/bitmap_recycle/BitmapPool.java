package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes54.dex */
public interface BitmapPool {
    void clearMemory();

    @NonNull
    Bitmap get(int r1, int r2, Bitmap.Config config);

    @NonNull
    Bitmap getDirty(int r1, int r2, Bitmap.Config config);

    long getMaxSize();

    void put(Bitmap bitmap);

    void setSizeMultiplier(float f);

    void trimMemory(int r1);
}
