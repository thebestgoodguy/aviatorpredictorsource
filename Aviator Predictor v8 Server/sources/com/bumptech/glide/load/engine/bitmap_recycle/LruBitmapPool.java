package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes54.dex */
public class LruBitmapPool implements BitmapPool {
    private static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.ARGB_8888;
    private static final String TAG = "LruBitmapPool";
    private final Set<Bitmap.Config> allowedConfigs;
    private long currentSize;
    private int evictions;
    private int hits;
    private final long initialMaxSize;
    private long maxSize;
    private int misses;
    private int puts;
    private final LruPoolStrategy strategy;
    private final BitmapTracker tracker;

    private interface BitmapTracker {
        void add(Bitmap bitmap);

        void remove(Bitmap bitmap);
    }

    LruBitmapPool(long maxSize, LruPoolStrategy strategy, Set<Bitmap.Config> allowedConfigs) {
        this.initialMaxSize = maxSize;
        this.maxSize = maxSize;
        this.strategy = strategy;
        this.allowedConfigs = allowedConfigs;
        this.tracker = new NullBitmapTracker();
    }

    public LruBitmapPool(long maxSize) {
        this(maxSize, getDefaultStrategy(), getDefaultAllowedConfigs());
    }

    public LruBitmapPool(long maxSize, Set<Bitmap.Config> allowedConfigs) {
        this(maxSize, getDefaultStrategy(), allowedConfigs);
    }

    public long hitCount() {
        return this.hits;
    }

    public long missCount() {
        return this.misses;
    }

    public long evictionCount() {
        return this.evictions;
    }

    public long getCurrentSize() {
        return this.currentSize;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float sizeMultiplier) {
        this.maxSize = Math.round(this.initialMaxSize * sizeMultiplier);
        evict();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
        if (!bitmap.isMutable() || this.strategy.getSize(bitmap) > this.maxSize || !this.allowedConfigs.contains(bitmap.getConfig())) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Reject bitmap from pool, bitmap: " + this.strategy.logBitmap(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.allowedConfigs.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } else {
            int size = this.strategy.getSize(bitmap);
            this.strategy.put(bitmap);
            this.tracker.add(bitmap);
            this.puts++;
            this.currentSize += size;
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "Put bitmap in pool=" + this.strategy.logBitmap(bitmap));
            }
            dump();
            evict();
        }
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap get(int width, int height, Bitmap.Config config) {
        Bitmap result = getDirtyOrNull(width, height, config);
        if (result != null) {
            result.eraseColor(0);
            return result;
        }
        return createBitmap(width, height, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap getDirty(int width, int height, Bitmap.Config config) {
        Bitmap result = getDirtyOrNull(width, height, config);
        if (result == null) {
            return createBitmap(width, height, config);
        }
        return result;
    }

    @NonNull
    private static Bitmap createBitmap(int width, int height, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = DEFAULT_CONFIG;
        }
        return Bitmap.createBitmap(width, height, config);
    }

    @TargetApi(26)
    private static void assertNotHardwareConfig(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @Nullable
    private synchronized Bitmap getDirtyOrNull(int width, int height, @Nullable Bitmap.Config config) {
        Bitmap result;
        assertNotHardwareConfig(config);
        result = this.strategy.get(width, height, config != null ? config : DEFAULT_CONFIG);
        if (result == null) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Missing bitmap=" + this.strategy.logBitmap(width, height, config));
            }
            this.misses++;
        } else {
            this.hits++;
            this.currentSize -= this.strategy.getSize(result);
            this.tracker.remove(result);
            normalize(result);
        }
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Get bitmap=" + this.strategy.logBitmap(width, height, config));
        }
        dump();
        return result;
    }

    private static void normalize(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        maybeSetPreMultiplied(bitmap);
    }

    @TargetApi(19)
    private static void maybeSetPreMultiplied(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "clearMemory");
        }
        trimToSize(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int level) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "trimMemory, level=" + level);
        }
        if (level >= 40 || (Build.VERSION.SDK_INT >= 23 && level >= 20)) {
            clearMemory();
        } else if (level >= 20 || level == 15) {
            trimToSize(getMaxSize() / 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        if (android.util.Log.isLoggable(com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.TAG, 5) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0018, code lost:
    
        android.util.Log.w(com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.TAG, "Size mismatch, resetting");
        dumpUnchecked();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
    
        r7.currentSize = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void trimToSize(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
        L1:
            long r2 = r7.currentSize     // Catch: java.lang.Throwable -> L6d
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L26
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r1 = r7.strategy     // Catch: java.lang.Throwable -> L6d
            android.graphics.Bitmap r0 = r1.removeLast()     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L28
            java.lang.String r1 = "LruBitmapPool"
            r2 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L22
            java.lang.String r1 = "LruBitmapPool"
            java.lang.String r2 = "Size mismatch, resetting"
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L6d
            r7.dumpUnchecked()     // Catch: java.lang.Throwable -> L6d
        L22:
            r2 = 0
            r7.currentSize = r2     // Catch: java.lang.Throwable -> L6d
        L26:
            monitor-exit(r7)
            return
        L28:
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r1 = r7.tracker     // Catch: java.lang.Throwable -> L6d
            r1.remove(r0)     // Catch: java.lang.Throwable -> L6d
            long r2 = r7.currentSize     // Catch: java.lang.Throwable -> L6d
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r1 = r7.strategy     // Catch: java.lang.Throwable -> L6d
            int r1 = r1.getSize(r0)     // Catch: java.lang.Throwable -> L6d
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L6d
            long r2 = r2 - r4
            r7.currentSize = r2     // Catch: java.lang.Throwable -> L6d
            int r1 = r7.evictions     // Catch: java.lang.Throwable -> L6d
            int r1 = r1 + 1
            r7.evictions = r1     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L66
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r2.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "Evicting bitmap="
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L6d
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r7.strategy     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = r3.logBitmap(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6d
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L6d
        L66:
            r7.dump()     // Catch: java.lang.Throwable -> L6d
            r0.recycle()     // Catch: java.lang.Throwable -> L6d
            goto L1
        L6d:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.trimToSize(long):void");
    }

    private void dump() {
        if (Log.isLoggable(TAG, 2)) {
            dumpUnchecked();
        }
    }

    private void dumpUnchecked() {
        Log.v(TAG, "Hits=" + this.hits + ", misses=" + this.misses + ", puts=" + this.puts + ", evictions=" + this.evictions + ", currentSize=" + this.currentSize + ", maxSize=" + this.maxSize + "\nStrategy=" + this.strategy);
    }

    private static LruPoolStrategy getDefaultStrategy() {
        if (Build.VERSION.SDK_INT >= 19) {
            LruPoolStrategy strategy = new SizeConfigStrategy();
            return strategy;
        }
        LruPoolStrategy strategy2 = new AttributeStrategy();
        return strategy2;
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> getDefaultAllowedConfigs() {
        Set<Bitmap.Config> configs = new HashSet<>(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            configs.add(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            configs.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(configs);
    }

    private static class ThrowingBitmapTracker implements BitmapTracker {
        private final Set<Bitmap> bitmaps = Collections.synchronizedSet(new HashSet());

        private ThrowingBitmapTracker() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(Bitmap bitmap) {
            if (this.bitmaps.contains(bitmap)) {
                throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
            }
            this.bitmaps.add(bitmap);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(Bitmap bitmap) {
            if (!this.bitmaps.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.bitmaps.remove(bitmap);
        }
    }

    private static final class NullBitmapTracker implements BitmapTracker {
        NullBitmapTracker() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(Bitmap bitmap) {
        }
    }
}
