package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* loaded from: classes54.dex */
public class RequestOptions extends BaseRequestOptions<RequestOptions> {

    @Nullable
    private static RequestOptions centerCropOptions;

    @Nullable
    private static RequestOptions centerInsideOptions;

    @Nullable
    private static RequestOptions circleCropOptions;

    @Nullable
    private static RequestOptions fitCenterOptions;

    @Nullable
    private static RequestOptions noAnimationOptions;

    @Nullable
    private static RequestOptions noTransformOptions;

    @Nullable
    private static RequestOptions skipMemoryCacheFalseOptions;

    @Nullable
    private static RequestOptions skipMemoryCacheTrueOptions;

    @NonNull
    @CheckResult
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float sizeMultiplier) {
        return new RequestOptions().sizeMultiplier(sizeMultiplier);
    }

    @NonNull
    @CheckResult
    public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions priorityOf(@NonNull Priority priority) {
        return new RequestOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@Nullable Drawable placeholder) {
        return new RequestOptions().placeholder(placeholder);
    }

    @NonNull
    @CheckResult
    public static RequestOptions placeholderOf(@DrawableRes int placeholderId) {
        return new RequestOptions().placeholder(placeholderId);
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@Nullable Drawable errorDrawable) {
        return new RequestOptions().error(errorDrawable);
    }

    @NonNull
    @CheckResult
    public static RequestOptions errorOf(@DrawableRes int errorId) {
        return new RequestOptions().error(errorId);
    }

    @NonNull
    @CheckResult
    public static RequestOptions skipMemoryCacheOf(boolean skipMemoryCache) {
        if (skipMemoryCache) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new RequestOptions().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new RequestOptions().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int width, int height) {
        return new RequestOptions().override(width, height);
    }

    @NonNull
    @CheckResult
    public static RequestOptions overrideOf(int size) {
        return overrideOf(size, size);
    }

    @NonNull
    @CheckResult
    public static RequestOptions signatureOf(@NonNull Key signature) {
        return new RequestOptions().signature(signature);
    }

    @NonNull
    @CheckResult
    public static RequestOptions fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new RequestOptions().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new RequestOptions().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    @NonNull
    @CheckResult
    public static RequestOptions centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new RequestOptions().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    @NonNull
    @CheckResult
    public static RequestOptions circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new RequestOptions().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @NonNull
    @CheckResult
    public static RequestOptions bitmapTransform(@NonNull Transformation<Bitmap> transformation) {
        return new RequestOptions().transform(transformation);
    }

    @NonNull
    @CheckResult
    public static RequestOptions noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new RequestOptions().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    @NonNull
    @CheckResult
    public static <T> RequestOptions option(@NonNull Option<T> option, @NonNull T value) {
        return new RequestOptions().set(option, value);
    }

    @NonNull
    @CheckResult
    public static RequestOptions decodeTypeOf(@NonNull Class<?> resourceClass) {
        return new RequestOptions().decode(resourceClass);
    }

    @NonNull
    @CheckResult
    public static RequestOptions formatOf(@NonNull DecodeFormat format) {
        return new RequestOptions().format(format);
    }

    @NonNull
    @CheckResult
    public static RequestOptions frameOf(@IntRange(from = 0) long frameTimeMicros) {
        return new RequestOptions().frame(frameTimeMicros);
    }

    @NonNull
    @CheckResult
    public static RequestOptions downsampleOf(@NonNull DownsampleStrategy strategy) {
        return new RequestOptions().downsample(strategy);
    }

    @NonNull
    @CheckResult
    public static RequestOptions timeoutOf(@IntRange(from = 0) int timeout) {
        return new RequestOptions().timeout(timeout);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeQualityOf(@IntRange(from = 0, to = 100) int quality) {
        return new RequestOptions().encodeQuality(quality);
    }

    @NonNull
    @CheckResult
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat format) {
        return new RequestOptions().encodeFormat(format);
    }

    @NonNull
    @CheckResult
    public static RequestOptions noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new RequestOptions().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }
}
