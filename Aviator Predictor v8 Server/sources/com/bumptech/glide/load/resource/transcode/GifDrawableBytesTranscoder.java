package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;
import java.nio.ByteBuffer;

/* loaded from: classes54.dex */
public class GifDrawableBytesTranscoder implements ResourceTranscoder<GifDrawable, byte[]> {
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource<byte[]> transcode(@NonNull Resource<GifDrawable> toTranscode, @NonNull Options options) {
        GifDrawable gifData = toTranscode.get();
        ByteBuffer byteBuffer = gifData.getBuffer();
        return new BytesResource(ByteBufferUtil.toBytes(byteBuffer));
    }
}
