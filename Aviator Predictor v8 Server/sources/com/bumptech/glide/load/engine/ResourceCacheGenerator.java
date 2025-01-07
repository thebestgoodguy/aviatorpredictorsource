package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* loaded from: classes54.dex */
class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    private File cacheFile;
    private final DataFetcherGenerator.FetcherReadyCallback cb;
    private ResourceCacheKey currentKey;
    private final DecodeHelper<?> helper;
    private volatile ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private List<ModelLoader<File, ?>> modelLoaders;
    private int resourceClassIndex = -1;
    private int sourceIdIndex;
    private Key sourceKey;

    ResourceCacheGenerator(DecodeHelper<?> helper, DataFetcherGenerator.FetcherReadyCallback cb) {
        this.helper = helper;
        this.cb = cb;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public boolean startNext() {
        boolean started = false;
        List<Key> sourceIds = this.helper.getCacheKeys();
        if (!sourceIds.isEmpty()) {
            List<Class<?>> resourceClasses = this.helper.getRegisteredResourceClasses();
            if (!resourceClasses.isEmpty()) {
                while (true) {
                    if (this.modelLoaders == null || !hasNextModelLoader()) {
                        this.resourceClassIndex++;
                        if (this.resourceClassIndex >= resourceClasses.size()) {
                            this.sourceIdIndex++;
                            if (this.sourceIdIndex >= sourceIds.size()) {
                                break;
                            }
                            this.resourceClassIndex = 0;
                        }
                        Key sourceId = sourceIds.get(this.sourceIdIndex);
                        Class<?> resourceClass = resourceClasses.get(this.resourceClassIndex);
                        this.currentKey = new ResourceCacheKey(this.helper.getArrayPool(), sourceId, this.helper.getSignature(), this.helper.getWidth(), this.helper.getHeight(), this.helper.getTransformation(resourceClass), resourceClass, this.helper.getOptions());
                        this.cacheFile = this.helper.getDiskCache().get(this.currentKey);
                        if (this.cacheFile != null) {
                            this.sourceKey = sourceId;
                            this.modelLoaders = this.helper.getModelLoaders(this.cacheFile);
                            this.modelLoaderIndex = 0;
                        }
                    } else {
                        this.loadData = null;
                        started = false;
                        while (!started && hasNextModelLoader()) {
                            List<ModelLoader<File, ?>> list = this.modelLoaders;
                            int r1 = this.modelLoaderIndex;
                            this.modelLoaderIndex = r1 + 1;
                            ModelLoader<File, ?> modelLoader = list.get(r1);
                            this.loadData = modelLoader.buildLoadData(this.cacheFile, this.helper.getWidth(), this.helper.getHeight(), this.helper.getOptions());
                            if (this.loadData != null && this.helper.hasLoadPath(this.loadData.fetcher.getDataClass())) {
                                started = true;
                                this.loadData.fetcher.loadData(this.helper.getPriority(), this);
                            }
                        }
                    }
                }
            } else if (!File.class.equals(this.helper.getTranscodeClass())) {
                throw new IllegalStateException("Failed to find any load path from " + this.helper.getModelClass() + " to " + this.helper.getTranscodeClass());
            }
        }
        return started;
    }

    private boolean hasNextModelLoader() {
        return this.modelLoaderIndex < this.modelLoaders.size();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> local = this.loadData;
        if (local != null) {
            local.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object data) {
        this.cb.onDataFetcherReady(this.sourceKey, data, this.loadData.fetcher, DataSource.RESOURCE_DISK_CACHE, this.currentKey);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(@NonNull Exception e) {
        this.cb.onDataFetcherFailed(this.currentKey, e, this.loadData.fetcher, DataSource.RESOURCE_DISK_CACHE);
    }
}
