package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* loaded from: classes54.dex */
interface LruPoolStrategy {
    @Nullable
    Bitmap get(int r1, int r2, Bitmap.Config config);

    int getSize(Bitmap bitmap);

    String logBitmap(int r1, int r2, Bitmap.Config config);

    String logBitmap(Bitmap bitmap);

    void put(Bitmap bitmap);

    @Nullable
    Bitmap removeLast();
}
