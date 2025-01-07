package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes54.dex */
public interface ModelLoader<Model, Data> {
    @Nullable
    LoadData<Data> buildLoadData(@NonNull Model model, int r2, int r3, @NonNull Options options);

    boolean handles(@NonNull Model model);

    public static class LoadData<Data> {
        public final List<Key> alternateKeys;
        public final DataFetcher<Data> fetcher;
        public final Key sourceKey;

        public LoadData(@NonNull Key sourceKey, @NonNull DataFetcher<Data> fetcher) {
            this(sourceKey, Collections.emptyList(), fetcher);
        }

        public LoadData(@NonNull Key sourceKey, @NonNull List<Key> alternateKeys, @NonNull DataFetcher<Data> fetcher) {
            this.sourceKey = (Key) Preconditions.checkNotNull(sourceKey);
            this.alternateKeys = (List) Preconditions.checkNotNull(alternateKeys);
            this.fetcher = (DataFetcher) Preconditions.checkNotNull(fetcher);
        }
    }
}
