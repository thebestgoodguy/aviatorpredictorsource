package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes54.dex */
public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {
    private static final String TAG = "ByteBufferFileLoader";

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<ByteBuffer> buildLoadData(@NonNull File file, int width, int height, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(file), new ByteBufferFetcher(file));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull File file) {
        return true;
    }

    public static class Factory implements ModelLoaderFactory<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader<File, ByteBuffer> build(@NonNull MultiModelLoaderFactory multiFactory) {
            return new ByteBufferFileLoader();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    private static final class ByteBufferFetcher implements DataFetcher<ByteBuffer> {
        private final File file;

        ByteBufferFetcher(File file) {
            this.file = file;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super ByteBuffer> callback) {
            try {
                ByteBuffer result = ByteBufferUtil.fromFile(this.file);
                callback.onDataReady(result);
            } catch (IOException e) {
                if (Log.isLoggable(ByteBufferFileLoader.TAG, 3)) {
                    Log.d(ByteBufferFileLoader.TAG, "Failed to obtain ByteBuffer for file", e);
                }
                callback.onLoadFailed(e);
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }
}
