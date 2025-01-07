package com.bumptech.glide.manager;

import androidx.annotation.NonNull;

/* loaded from: classes54.dex */
public interface Lifecycle {
    void addListener(@NonNull LifecycleListener lifecycleListener);

    void removeListener(@NonNull LifecycleListener lifecycleListener);
}
