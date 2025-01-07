package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

/* loaded from: classes54.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    private static final String TAG = "BitmapEncoder";

    @Nullable
    private final ArrayPool arrayPool;
    public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public BitmapEncoder(@NonNull ArrayPool arrayPool) {
        this.arrayPool = arrayPool;
    }

    @Deprecated
    public BitmapEncoder() {
        this.arrayPool = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #7 {all -> 0x00da, blocks: (B:3:0x0023, B:21:0x0056, B:14:0x0059, B:16:0x0062, B:43:0x00d6, B:41:0x00d9, B:35:0x00cd), top: B:2:0x0023 }] */
    @Override // com.bumptech.glide.load.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean encode(@androidx.annotation.NonNull com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r17, @androidx.annotation.NonNull java.io.File r18, @androidx.annotation.NonNull com.bumptech.glide.load.Options r19) {
        /*
            r16 = this;
            java.lang.Object r2 = r17.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0 = r16
            r1 = r19
            android.graphics.Bitmap$CompressFormat r4 = r0.getFormat(r2, r1)
            java.lang.String r11 = "encode: [%dx%d] %s"
            int r12 = r2.getWidth()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r13 = r2.getHeight()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.bumptech.glide.util.pool.GlideTrace.beginSectionFormat(r11, r12, r13, r4)
            long r8 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> Lda
            com.bumptech.glide.load.Option<java.lang.Integer> r11 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_QUALITY     // Catch: java.lang.Throwable -> Lda
            r0 = r19
            java.lang.Object r11 = r0.get(r11)     // Catch: java.lang.Throwable -> Lda
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> Lda
            int r7 = r11.intValue()     // Catch: java.lang.Throwable -> Lda
            r10 = 0
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lba java.lang.Throwable -> Ld3
            r0 = r18
            r6.<init>(r0)     // Catch: java.io.IOException -> Lba java.lang.Throwable -> Ld3
            r0 = r16
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r11 = r0.arrayPool     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> Le7
            if (r11 == 0) goto Lea
            com.bumptech.glide.load.data.BufferedOutputStream r5 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> Le7
            r0 = r16
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r11 = r0.arrayPool     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> Le7
            r5.<init>(r6, r11)     // Catch: java.lang.Throwable -> Le4 java.io.IOException -> Le7
        L4d:
            r2.compress(r4, r7, r5)     // Catch: java.io.IOException -> Lba java.lang.Throwable -> Ld3
            r5.close()     // Catch: java.io.IOException -> Lba java.lang.Throwable -> Ld3
            r10 = 1
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.lang.Throwable -> Lda java.io.IOException -> Ldf
        L59:
            java.lang.String r11 = "BitmapEncoder"
            r12 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r12)     // Catch: java.lang.Throwable -> Lda
            if (r11 == 0) goto Lb6
            java.lang.String r11 = "BitmapEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r12.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = "Compressed with type: "
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r12 = r12.append(r4)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = " of size "
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            int r13 = com.bumptech.glide.util.Util.getBitmapByteSize(r2)     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = " in "
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            double r14 = com.bumptech.glide.util.LogTime.getElapsedMillis(r8)     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r12 = r12.append(r14)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = ", options format: "
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r13 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT     // Catch: java.lang.Throwable -> Lda
            r0 = r19
            java.lang.Object r13 = r0.get(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = ", hasAlpha: "
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            boolean r13 = r2.hasAlpha()     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lda
            android.util.Log.v(r11, r12)     // Catch: java.lang.Throwable -> Lda
        Lb6:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r10
        Lba:
            r3 = move-exception
        Lbb:
            java.lang.String r11 = "BitmapEncoder"
            r12 = 3
            boolean r11 = android.util.Log.isLoggable(r11, r12)     // Catch: java.lang.Throwable -> Ld3
            if (r11 == 0) goto Lcb
            java.lang.String r11 = "BitmapEncoder"
            java.lang.String r12 = "Failed to encode Bitmap"
            android.util.Log.d(r11, r12, r3)     // Catch: java.lang.Throwable -> Ld3
        Lcb:
            if (r5 == 0) goto L59
            r5.close()     // Catch: java.io.IOException -> Ld1 java.lang.Throwable -> Lda
            goto L59
        Ld1:
            r11 = move-exception
            goto L59
        Ld3:
            r11 = move-exception
        Ld4:
            if (r5 == 0) goto Ld9
            r5.close()     // Catch: java.lang.Throwable -> Lda java.io.IOException -> Le2
        Ld9:
            throw r11     // Catch: java.lang.Throwable -> Lda
        Lda:
            r11 = move-exception
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r11
        Ldf:
            r11 = move-exception
            goto L59
        Le2:
            r12 = move-exception
            goto Ld9
        Le4:
            r11 = move-exception
            r5 = r6
            goto Ld4
        Le7:
            r3 = move-exception
            r5 = r6
            goto Lbb
        Lea:
            r5 = r6
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.BitmapEncoder.encode(com.bumptech.glide.load.engine.Resource, java.io.File, com.bumptech.glide.load.Options):boolean");
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options) {
        Bitmap.CompressFormat format = (Bitmap.CompressFormat) options.get(COMPRESSION_FORMAT);
        if (format == null) {
            if (bitmap.hasAlpha()) {
                return Bitmap.CompressFormat.PNG;
            }
            return Bitmap.CompressFormat.JPEG;
        }
        return format;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options) {
        return EncodeStrategy.TRANSFORMED;
    }
}
