package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import java.util.Set;

/* loaded from: classes54.dex */
abstract class GeneratedAppGlideModule extends AppGlideModule {
    @NonNull
    abstract Set<Class<?>> getExcludedModuleClasses();

    GeneratedAppGlideModule() {
    }

    @Nullable
    RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory() {
        return null;
    }
}
