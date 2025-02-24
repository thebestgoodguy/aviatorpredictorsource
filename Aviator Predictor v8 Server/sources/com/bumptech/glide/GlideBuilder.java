package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes54.dex */
public final class GlideBuilder {
    private GlideExecutor animationExecutor;
    private ArrayPool arrayPool;
    private BitmapPool bitmapPool;
    private ConnectivityMonitorFactory connectivityMonitorFactory;

    @Nullable
    private List<RequestListener<Object>> defaultRequestListeners;
    private GlideExecutor diskCacheExecutor;
    private DiskCache.Factory diskCacheFactory;
    private Engine engine;
    private boolean isActiveResourceRetentionAllowed;
    private MemoryCache memoryCache;
    private MemorySizeCalculator memorySizeCalculator;

    @Nullable
    private RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
    private GlideExecutor sourceExecutor;
    private final Map<Class<?>, TransitionOptions<?, ?>> defaultTransitionOptions = new ArrayMap();
    private final GlideExperiments.Builder glideExperimentsBuilder = new GlideExperiments.Builder();
    private int logLevel = 4;
    private Glide.RequestOptionsFactory defaultRequestOptionsFactory = new Glide.RequestOptionsFactory() { // from class: com.bumptech.glide.GlideBuilder.1
        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        @NonNull
        public RequestOptions build() {
            return new RequestOptions();
        }
    };

    public static final class LogRequestOrigins implements GlideExperiments.Experiment {
    }

    @NonNull
    public GlideBuilder setBitmapPool(@Nullable BitmapPool bitmapPool) {
        this.bitmapPool = bitmapPool;
        return this;
    }

    @NonNull
    public GlideBuilder setArrayPool(@Nullable ArrayPool arrayPool) {
        this.arrayPool = arrayPool;
        return this;
    }

    @NonNull
    public GlideBuilder setMemoryCache(@Nullable MemoryCache memoryCache) {
        this.memoryCache = memoryCache;
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCache(@Nullable DiskCache.Factory diskCacheFactory) {
        this.diskCacheFactory = diskCacheFactory;
        return this;
    }

    @Deprecated
    public GlideBuilder setResizeExecutor(@Nullable GlideExecutor service) {
        return setSourceExecutor(service);
    }

    @NonNull
    public GlideBuilder setSourceExecutor(@Nullable GlideExecutor service) {
        this.sourceExecutor = service;
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCacheExecutor(@Nullable GlideExecutor service) {
        this.diskCacheExecutor = service;
        return this;
    }

    @NonNull
    public GlideBuilder setAnimationExecutor(@Nullable GlideExecutor service) {
        this.animationExecutor = service;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@Nullable final RequestOptions requestOptions) {
        return setDefaultRequestOptions(new Glide.RequestOptionsFactory() { // from class: com.bumptech.glide.GlideBuilder.2
            @Override // com.bumptech.glide.Glide.RequestOptionsFactory
            @NonNull
            public RequestOptions build() {
                return requestOptions != null ? requestOptions : new RequestOptions();
            }
        });
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@NonNull Glide.RequestOptionsFactory factory) {
        this.defaultRequestOptionsFactory = (Glide.RequestOptionsFactory) Preconditions.checkNotNull(factory);
        return this;
    }

    @NonNull
    public <T> GlideBuilder setDefaultTransitionOptions(@NonNull Class<T> clazz, @Nullable TransitionOptions<?, T> options) {
        this.defaultTransitionOptions.put(clazz, options);
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@NonNull MemorySizeCalculator.Builder builder) {
        return setMemorySizeCalculator(builder.build());
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@Nullable MemorySizeCalculator calculator) {
        this.memorySizeCalculator = calculator;
        return this;
    }

    @NonNull
    public GlideBuilder setConnectivityMonitorFactory(@Nullable ConnectivityMonitorFactory factory) {
        this.connectivityMonitorFactory = factory;
        return this;
    }

    @NonNull
    public GlideBuilder setLogLevel(int logLevel) {
        if (logLevel < 2 || logLevel > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.logLevel = logLevel;
        return this;
    }

    @NonNull
    public GlideBuilder setIsActiveResourceRetentionAllowed(boolean isActiveResourceRetentionAllowed) {
        this.isActiveResourceRetentionAllowed = isActiveResourceRetentionAllowed;
        return this;
    }

    @NonNull
    public GlideBuilder addGlobalRequestListener(@NonNull RequestListener<Object> listener) {
        if (this.defaultRequestListeners == null) {
            this.defaultRequestListeners = new ArrayList();
        }
        this.defaultRequestListeners.add(listener);
        return this;
    }

    public GlideBuilder setLogRequestOrigins(boolean isEnabled) {
        this.glideExperimentsBuilder.update(new LogRequestOrigins(), isEnabled);
        return this;
    }

    public GlideBuilder setImageDecoderEnabledForBitmaps(boolean isEnabled) {
        this.glideExperimentsBuilder.update(new EnableImageDecoderForBitmaps(), isEnabled && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    void setRequestManagerFactory(@Nullable RequestManagerRetriever.RequestManagerFactory factory) {
        this.requestManagerFactory = factory;
    }

    GlideBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @NonNull
    Glide build(@NonNull Context context) {
        if (this.sourceExecutor == null) {
            this.sourceExecutor = GlideExecutor.newSourceExecutor();
        }
        if (this.diskCacheExecutor == null) {
            this.diskCacheExecutor = GlideExecutor.newDiskCacheExecutor();
        }
        if (this.animationExecutor == null) {
            this.animationExecutor = GlideExecutor.newAnimationExecutor();
        }
        if (this.memorySizeCalculator == null) {
            this.memorySizeCalculator = new MemorySizeCalculator.Builder(context).build();
        }
        if (this.connectivityMonitorFactory == null) {
            this.connectivityMonitorFactory = new DefaultConnectivityMonitorFactory();
        }
        if (this.bitmapPool == null) {
            int size = this.memorySizeCalculator.getBitmapPoolSize();
            if (size > 0) {
                this.bitmapPool = new LruBitmapPool(size);
            } else {
                this.bitmapPool = new BitmapPoolAdapter();
            }
        }
        if (this.arrayPool == null) {
            this.arrayPool = new LruArrayPool(this.memorySizeCalculator.getArrayPoolSizeInBytes());
        }
        if (this.memoryCache == null) {
            this.memoryCache = new LruResourceCache(this.memorySizeCalculator.getMemoryCacheSize());
        }
        if (this.diskCacheFactory == null) {
            this.diskCacheFactory = new InternalCacheDiskCacheFactory(context);
        }
        if (this.engine == null) {
            this.engine = new Engine(this.memoryCache, this.diskCacheFactory, this.diskCacheExecutor, this.sourceExecutor, GlideExecutor.newUnlimitedSourceExecutor(), this.animationExecutor, this.isActiveResourceRetentionAllowed);
        }
        if (this.defaultRequestListeners == null) {
            this.defaultRequestListeners = Collections.emptyList();
        } else {
            this.defaultRequestListeners = Collections.unmodifiableList(this.defaultRequestListeners);
        }
        GlideExperiments experiments = this.glideExperimentsBuilder.build();
        RequestManagerRetriever requestManagerRetriever = new RequestManagerRetriever(this.requestManagerFactory, experiments);
        return new Glide(context, this.engine, this.memoryCache, this.bitmapPool, this.arrayPool, requestManagerRetriever, this.connectivityMonitorFactory, this.logLevel, this.defaultRequestOptionsFactory, this.defaultTransitionOptions, this.defaultRequestListeners, experiments);
    }

    static final class ManualOverrideHardwareBitmapMaxFdCount implements GlideExperiments.Experiment {
        final int fdCount;

        ManualOverrideHardwareBitmapMaxFdCount(int fdCount) {
            this.fdCount = fdCount;
        }
    }

    public static final class WaitForFramesAfterTrimMemory implements GlideExperiments.Experiment {
        private WaitForFramesAfterTrimMemory() {
        }
    }

    static final class EnableImageDecoderForBitmaps implements GlideExperiments.Experiment {
        EnableImageDecoderForBitmaps() {
        }
    }
}
