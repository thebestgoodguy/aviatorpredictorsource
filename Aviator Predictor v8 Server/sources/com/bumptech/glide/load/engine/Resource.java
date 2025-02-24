package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;

/* loaded from: classes54.dex */
public interface Resource<Z> {
    @NonNull
    Z get();

    @NonNull
    Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
