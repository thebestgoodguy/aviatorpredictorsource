package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;

/* loaded from: classes54.dex */
public class ViewPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback {
    private int[] size;
    private SizeViewTarget viewTarget;

    public ViewPreloadSizeProvider() {
    }

    public ViewPreloadSizeProvider(@NonNull View view) {
        this.viewTarget = new SizeViewTarget(view);
        this.viewTarget.getSize(this);
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @Nullable
    public int[] getPreloadSize(@NonNull T item, int adapterPosition, int itemPosition) {
        if (this.size == null) {
            return null;
        }
        return Arrays.copyOf(this.size, this.size.length);
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int width, int height) {
        this.size = new int[]{width, height};
        this.viewTarget = null;
    }

    public void setView(@NonNull View view) {
        if (this.size == null && this.viewTarget == null) {
            this.viewTarget = new SizeViewTarget(view);
            this.viewTarget.getSize(this);
        }
    }

    static final class SizeViewTarget extends CustomViewTarget<View, Object> {
        SizeViewTarget(@NonNull View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        protected void onResourceCleared(@Nullable Drawable placeholder) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(@Nullable Drawable errorDrawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@NonNull Object resource, @Nullable Transition<? super Object> transition) {
        }
    }
}
