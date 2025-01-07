package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.resource.ImageDecoderResourceDecoder;
import java.io.IOException;

@RequiresApi(api = 28)
/* loaded from: classes54.dex */
public final class BitmapImageDecoderResourceDecoder extends ImageDecoderResourceDecoder<Bitmap> {
    private static final String TAG = "BitmapImageDecoder";
    private final BitmapPool bitmapPool = new BitmapPoolAdapter();

    @Override // com.bumptech.glide.load.resource.ImageDecoderResourceDecoder
    protected Resource<Bitmap> decode(ImageDecoder.Source source, int requestedResourceWidth, int requestedResourceHeight, ImageDecoder.OnHeaderDecodedListener listener) throws IOException {
        Bitmap result = ImageDecoder.decodeBitmap(source, listener);
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Decoded [" + result.getWidth() + "x" + result.getHeight() + "] for [" + requestedResourceWidth + "x" + requestedResourceHeight + "]");
        }
        return new BitmapResource(result, this.bitmapPool);
    }
}
