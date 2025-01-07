package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes54.dex */
public class Registry {
    private static final String BUCKET_APPEND_ALL = "legacy_append";
    public static final String BUCKET_BITMAP = "Bitmap";
    public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";
    public static final String BUCKET_GIF = "Gif";
    private static final String BUCKET_PREPEND_ALL = "legacy_prepend_all";
    private final ModelToResourceClassCache modelToResourceClassCache = new ModelToResourceClassCache();
    private final LoadPathCache loadPathCache = new LoadPathCache();
    private final Pools.Pool<List<Throwable>> throwableListPool = FactoryPools.threadSafeList();
    private final ModelLoaderRegistry modelLoaderRegistry = new ModelLoaderRegistry(this.throwableListPool);
    private final EncoderRegistry encoderRegistry = new EncoderRegistry();
    private final ResourceDecoderRegistry decoderRegistry = new ResourceDecoderRegistry();
    private final ResourceEncoderRegistry resourceEncoderRegistry = new ResourceEncoderRegistry();
    private final DataRewinderRegistry dataRewinderRegistry = new DataRewinderRegistry();
    private final TranscoderRegistry transcoderRegistry = new TranscoderRegistry();
    private final ImageHeaderParserRegistry imageHeaderParserRegistry = new ImageHeaderParserRegistry();

    public Registry() {
        setResourceDecoderBucketPriorityList(Arrays.asList(BUCKET_GIF, BUCKET_BITMAP, BUCKET_BITMAP_DRAWABLE));
    }

    @NonNull
    @Deprecated
    public <Data> Registry register(@NonNull Class<Data> dataClass, @NonNull Encoder<Data> encoder) {
        return append(dataClass, encoder);
    }

    @NonNull
    public <Data> Registry append(@NonNull Class<Data> dataClass, @NonNull Encoder<Data> encoder) {
        this.encoderRegistry.append(dataClass, encoder);
        return this;
    }

    @NonNull
    public <Data> Registry prepend(@NonNull Class<Data> dataClass, @NonNull Encoder<Data> encoder) {
        this.encoderRegistry.prepend(dataClass, encoder);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry append(@NonNull Class<Data> dataClass, @NonNull Class<TResource> resourceClass, @NonNull ResourceDecoder<Data, TResource> decoder) {
        append(BUCKET_APPEND_ALL, dataClass, resourceClass, decoder);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry append(@NonNull String bucket, @NonNull Class<Data> dataClass, @NonNull Class<TResource> resourceClass, @NonNull ResourceDecoder<Data, TResource> decoder) {
        this.decoderRegistry.append(bucket, decoder, dataClass, resourceClass);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry prepend(@NonNull Class<Data> dataClass, @NonNull Class<TResource> resourceClass, @NonNull ResourceDecoder<Data, TResource> decoder) {
        prepend(BUCKET_PREPEND_ALL, dataClass, resourceClass, decoder);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry prepend(@NonNull String bucket, @NonNull Class<Data> dataClass, @NonNull Class<TResource> resourceClass, @NonNull ResourceDecoder<Data, TResource> decoder) {
        this.decoderRegistry.prepend(bucket, decoder, dataClass, resourceClass);
        return this;
    }

    @NonNull
    public final Registry setResourceDecoderBucketPriorityList(@NonNull List<String> buckets) {
        List<String> modifiedBuckets = new ArrayList<>(buckets.size());
        modifiedBuckets.add(BUCKET_PREPEND_ALL);
        for (String bucket : buckets) {
            modifiedBuckets.add(bucket);
        }
        modifiedBuckets.add(BUCKET_APPEND_ALL);
        this.decoderRegistry.setBucketPriorityList(modifiedBuckets);
        return this;
    }

    @NonNull
    @Deprecated
    public <TResource> Registry register(@NonNull Class<TResource> resourceClass, @NonNull ResourceEncoder<TResource> encoder) {
        return append((Class) resourceClass, (ResourceEncoder) encoder);
    }

    @NonNull
    public <TResource> Registry append(@NonNull Class<TResource> resourceClass, @NonNull ResourceEncoder<TResource> encoder) {
        this.resourceEncoderRegistry.append(resourceClass, encoder);
        return this;
    }

    @NonNull
    public <TResource> Registry prepend(@NonNull Class<TResource> resourceClass, @NonNull ResourceEncoder<TResource> encoder) {
        this.resourceEncoderRegistry.prepend(resourceClass, encoder);
        return this;
    }

    @NonNull
    public Registry register(@NonNull DataRewinder.Factory<?> factory) {
        this.dataRewinderRegistry.register(factory);
        return this;
    }

    @NonNull
    public <TResource, Transcode> Registry register(@NonNull Class<TResource> resourceClass, @NonNull Class<Transcode> transcodeClass, @NonNull ResourceTranscoder<TResource, Transcode> transcoder) {
        this.transcoderRegistry.register(resourceClass, transcodeClass, transcoder);
        return this;
    }

    @NonNull
    public Registry register(@NonNull ImageHeaderParser parser) {
        this.imageHeaderParserRegistry.add(parser);
        return this;
    }

    @NonNull
    public <Model, Data> Registry append(@NonNull Class<Model> modelClass, @NonNull Class<Data> dataClass, @NonNull ModelLoaderFactory<Model, Data> factory) {
        this.modelLoaderRegistry.append(modelClass, dataClass, factory);
        return this;
    }

    @NonNull
    public <Model, Data> Registry prepend(@NonNull Class<Model> modelClass, @NonNull Class<Data> dataClass, @NonNull ModelLoaderFactory<Model, Data> factory) {
        this.modelLoaderRegistry.prepend(modelClass, dataClass, factory);
        return this;
    }

    @NonNull
    public <Model, Data> Registry replace(@NonNull Class<Model> modelClass, @NonNull Class<Data> dataClass, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> factory) {
        this.modelLoaderRegistry.replace(modelClass, dataClass, factory);
        return this;
    }

    @Nullable
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> getLoadPath(@NonNull Class<Data> dataClass, @NonNull Class<TResource> resourceClass, @NonNull Class<Transcode> transcodeClass) {
        LoadPath<Data, TResource, Transcode> result = this.loadPathCache.get(dataClass, resourceClass, transcodeClass);
        if (this.loadPathCache.isEmptyLoadPath(result)) {
            return null;
        }
        if (result == null) {
            List<DecodePath<Data, TResource, Transcode>> decodePaths = getDecodePaths(dataClass, resourceClass, transcodeClass);
            if (decodePaths.isEmpty()) {
                result = null;
            } else {
                result = new LoadPath<>(dataClass, resourceClass, transcodeClass, decodePaths, this.throwableListPool);
            }
            this.loadPathCache.put(dataClass, resourceClass, transcodeClass, result);
        }
        return result;
    }

    @NonNull
    private <Data, TResource, Transcode> List<DecodePath<Data, TResource, Transcode>> getDecodePaths(@NonNull Class<Data> dataClass, @NonNull Class<TResource> resourceClass, @NonNull Class<Transcode> transcodeClass) {
        List<DecodePath<Data, TResource, Transcode>> decodePaths = new ArrayList<>();
        List<Class<TResource>> registeredResourceClasses = this.decoderRegistry.getResourceClasses(dataClass, resourceClass);
        for (Class<TResource> registeredResourceClass : registeredResourceClasses) {
            List<Class<Transcode>> registeredTranscodeClasses = this.transcoderRegistry.getTranscodeClasses(registeredResourceClass, transcodeClass);
            for (Class<Transcode> registeredTranscodeClass : registeredTranscodeClasses) {
                List<ResourceDecoder<Data, TResource>> decoders = this.decoderRegistry.getDecoders(dataClass, registeredResourceClass);
                ResourceTranscoder<TResource, Transcode> transcoder = this.transcoderRegistry.get(registeredResourceClass, registeredTranscodeClass);
                DecodePath<Data, TResource, Transcode> path = new DecodePath<>(dataClass, registeredResourceClass, registeredTranscodeClass, decoders, transcoder, this.throwableListPool);
                decodePaths.add(path);
            }
        }
        return decodePaths;
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> getRegisteredResourceClasses(@NonNull Class<Model> modelClass, @NonNull Class<TResource> resourceClass, @NonNull Class<Transcode> transcodeClass) {
        List<Class<?>> result = this.modelToResourceClassCache.get(modelClass, resourceClass, transcodeClass);
        if (result == null) {
            result = new ArrayList<>();
            List<Class<?>> dataClasses = this.modelLoaderRegistry.getDataClasses(modelClass);
            for (Class<?> dataClass : dataClasses) {
                List<? extends Class<?>> registeredResourceClasses = this.decoderRegistry.getResourceClasses(dataClass, resourceClass);
                for (Class<?> registeredResourceClass : registeredResourceClasses) {
                    List<Class<Transcode>> registeredTranscodeClasses = this.transcoderRegistry.getTranscodeClasses(registeredResourceClass, transcodeClass);
                    if (!registeredTranscodeClasses.isEmpty() && !result.contains(registeredResourceClass)) {
                        result.add(registeredResourceClass);
                    }
                }
            }
            this.modelToResourceClassCache.put(modelClass, resourceClass, transcodeClass, Collections.unmodifiableList(result));
        }
        return result;
    }

    public boolean isResourceEncoderAvailable(@NonNull Resource<?> resource) {
        return this.resourceEncoderRegistry.get(resource.getResourceClass()) != null;
    }

    @NonNull
    public <X> ResourceEncoder<X> getResultEncoder(@NonNull Resource<X> resource) throws NoResultEncoderAvailableException {
        ResourceEncoder<X> resourceEncoder = this.resourceEncoderRegistry.get(resource.getResourceClass());
        if (resourceEncoder != null) {
            return resourceEncoder;
        }
        throw new NoResultEncoderAvailableException(resource.getResourceClass());
    }

    @NonNull
    public <X> Encoder<X> getSourceEncoder(@NonNull X data) throws NoSourceEncoderAvailableException {
        Encoder<X> encoder = this.encoderRegistry.getEncoder(data.getClass());
        if (encoder != null) {
            return encoder;
        }
        throw new NoSourceEncoderAvailableException(data.getClass());
    }

    @NonNull
    public <X> DataRewinder<X> getRewinder(@NonNull X data) {
        return this.dataRewinderRegistry.build(data);
    }

    @NonNull
    public <Model> List<ModelLoader<Model, ?>> getModelLoaders(@NonNull Model model) {
        return this.modelLoaderRegistry.getModelLoaders(model);
    }

    @NonNull
    public List<ImageHeaderParser> getImageHeaderParsers() {
        List<ImageHeaderParser> result = this.imageHeaderParserRegistry.getParsers();
        if (result.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return result;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object model) {
            super("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M model, @NonNull List<ModelLoader<M, ?>> matchingButNotHandlingModelLoaders) {
            super("Found ModelLoaders for model class: " + matchingButNotHandlingModelLoaders + ", but none that handle this specific model instance: " + model);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> modelClass, @NonNull Class<?> dataClass) {
            super("Failed to find any ModelLoaders for model: " + modelClass + " and data: " + dataClass);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> resourceClass) {
            super("Failed to find result encoder for resource class: " + resourceClass + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> dataClass) {
            super("Failed to find source encoder for data class: " + dataClass);
        }
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String message) {
            super(message);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }
}
