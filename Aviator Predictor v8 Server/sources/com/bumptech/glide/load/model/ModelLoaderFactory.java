package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;

/* loaded from: classes54.dex */
public interface ModelLoaderFactory<T, Y> {
    @NonNull
    ModelLoader<T, Y> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory);

    void teardown();
}
