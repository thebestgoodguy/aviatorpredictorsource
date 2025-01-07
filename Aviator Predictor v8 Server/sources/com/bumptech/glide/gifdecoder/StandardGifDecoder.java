package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes57.dex */
public class StandardGifDecoder implements GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;

    @ColorInt
    private static final int COLOR_TRANSPARENT_BLACK = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    private static final String TAG = StandardGifDecoder.class.getSimpleName();

    @ColorInt
    private int[] act;

    @NonNull
    private Bitmap.Config bitmapConfig;
    private final GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;

    @Nullable
    private Boolean isFirstFrameTransparent;
    private byte[] mainPixels;

    @ColorInt
    private int[] mainScratch;
    private GifHeaderParser parser;

    @ColorInt
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider provider, GifHeader gifHeader, ByteBuffer rawData) {
        this(provider, gifHeader, rawData, 1);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider provider, GifHeader gifHeader, ByteBuffer rawData, int sampleSize) {
        this(provider);
        setData(gifHeader, rawData, sampleSize);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider provider) {
        this.pct = new int[256];
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.bitmapProvider = provider;
        this.header = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.header.width;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.header.height;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public ByteBuffer getData() {
        return this.rawData;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.framePointer = (this.framePointer + 1) % this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int n) {
        if (n < 0 || n >= this.header.frameCount) {
            return -1;
        }
        int delay = this.header.frames.get(n).delay;
        return delay;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        if (this.header.frameCount <= 0 || this.framePointer < 0) {
            return 0;
        }
        return getDelay(this.framePointer);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        if (this.header.loopCount == 0) {
            return 0;
        }
        return this.header.loopCount + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.rawData.limit() + this.mainPixels.length + (this.mainScratch.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    public synchronized Bitmap getNextFrame() {
        Bitmap bitmap = null;
        synchronized (this) {
            if (this.header.frameCount <= 0 || this.framePointer < 0) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Unable to decode frame, frameCount=" + this.header.frameCount + ", framePointer=" + this.framePointer);
                }
                this.status = 1;
            }
            if (this.status == 1 || this.status == 2) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Unable to decode frame, status=" + this.status);
                }
            } else {
                this.status = 0;
                if (this.block == null) {
                    this.block = this.bitmapProvider.obtainByteArray(255);
                }
                GifFrame currentFrame = this.header.frames.get(this.framePointer);
                GifFrame previousFrame = null;
                int previousIndex = this.framePointer - 1;
                if (previousIndex >= 0) {
                    GifFrame previousFrame2 = this.header.frames.get(previousIndex);
                    previousFrame = previousFrame2;
                }
                this.act = currentFrame.lct != null ? currentFrame.lct : this.header.gct;
                if (this.act == null) {
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "No valid color table found for frame #" + this.framePointer);
                    }
                    this.status = 1;
                } else {
                    if (currentFrame.transparency) {
                        System.arraycopy(this.act, 0, this.pct, 0, this.act.length);
                        this.act = this.pct;
                        this.act[currentFrame.transIndex] = 0;
                        if (currentFrame.dispose == 2 && this.framePointer == 0) {
                            this.isFirstFrameTransparent = true;
                        }
                    }
                    bitmap = setPixels(currentFrame, previousFrame);
                }
            }
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@Nullable InputStream is, int contentLength) {
        if (is != null) {
            int capacity = contentLength > 0 ? contentLength + 4096 : 16384;
            try {
                ByteArrayOutputStream buffer = new ByteArrayOutputStream(capacity);
                byte[] data = new byte[16384];
                while (true) {
                    int nRead = is.read(data, 0, data.length);
                    if (nRead == -1) {
                        break;
                    }
                    buffer.write(data, 0, nRead);
                }
                buffer.flush();
                read(buffer.toByteArray());
            } catch (IOException e) {
                Log.w(TAG, "Error reading data from stream", e);
            }
        } else {
            this.status = 2;
        }
        if (is != null) {
            try {
                is.close();
            } catch (IOException e2) {
                Log.w(TAG, "Error closing stream", e2);
            }
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.header = null;
        if (this.mainPixels != null) {
            this.bitmapProvider.release(this.mainPixels);
        }
        if (this.mainScratch != null) {
            this.bitmapProvider.release(this.mainScratch);
        }
        if (this.previousImage != null) {
            this.bitmapProvider.release(this.previousImage);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = null;
        if (this.block != null) {
            this.bitmapProvider.release(this.block);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader header, @NonNull byte[] data) {
        setData(header, ByteBuffer.wrap(data));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader header, @NonNull ByteBuffer buffer) {
        setData(header, buffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader header, @NonNull ByteBuffer buffer, int sampleSize) {
        if (sampleSize <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + sampleSize);
        }
        int sampleSize2 = Integer.highestOneBit(sampleSize);
        this.status = 0;
        this.header = header;
        this.framePointer = -1;
        this.rawData = buffer.asReadOnlyBuffer();
        this.rawData.position(0);
        this.rawData.order(ByteOrder.LITTLE_ENDIAN);
        this.savePrevious = false;
        Iterator<GifFrame> it = header.frames.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GifFrame frame = it.next();
            if (frame.dispose == 3) {
                this.savePrevious = true;
                break;
            }
        }
        this.sampleSize = sampleSize2;
        this.downsampledWidth = header.width / sampleSize2;
        this.downsampledHeight = header.height / sampleSize2;
        this.mainPixels = this.bitmapProvider.obtainByteArray(header.width * header.height);
        this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
    }

    @NonNull
    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@Nullable byte[] data) {
        this.header = getHeaderParser().setData(data).parseHeader();
        if (data != null) {
            setData(this.header, data);
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(@NonNull Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.bitmapConfig = config;
    }

    private Bitmap setPixels(GifFrame currentFrame, GifFrame previousFrame) {
        int[] dest = this.mainScratch;
        if (previousFrame == null) {
            if (this.previousImage != null) {
                this.bitmapProvider.release(this.previousImage);
            }
            this.previousImage = null;
            Arrays.fill(dest, 0);
        }
        if (previousFrame != null && previousFrame.dispose == 3 && this.previousImage == null) {
            Arrays.fill(dest, 0);
        }
        if (previousFrame != null && previousFrame.dispose > 0) {
            if (previousFrame.dispose == 2) {
                int c = 0;
                if (!currentFrame.transparency) {
                    c = this.header.bgColor;
                    if (currentFrame.lct != null && this.header.bgIndex == currentFrame.transIndex) {
                        c = 0;
                    }
                }
                int downsampledIH = previousFrame.ih / this.sampleSize;
                int downsampledIY = previousFrame.iy / this.sampleSize;
                int downsampledIW = previousFrame.iw / this.sampleSize;
                int downsampledIX = previousFrame.ix / this.sampleSize;
                int topLeft = (this.downsampledWidth * downsampledIY) + downsampledIX;
                int bottomLeft = topLeft + (this.downsampledWidth * downsampledIH);
                int left = topLeft;
                while (left < bottomLeft) {
                    int right = left + downsampledIW;
                    for (int pointer = left; pointer < right; pointer++) {
                        dest[pointer] = c;
                    }
                    left += this.downsampledWidth;
                }
            } else if (previousFrame.dispose == 3 && this.previousImage != null) {
                this.previousImage.getPixels(dest, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
            }
        }
        decodeBitmapData(currentFrame);
        if (currentFrame.interlace || this.sampleSize != 1) {
            copyCopyIntoScratchRobust(currentFrame);
        } else {
            copyIntoScratchFast(currentFrame);
        }
        if (this.savePrevious && (currentFrame.dispose == 0 || currentFrame.dispose == 1)) {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            this.previousImage.setPixels(dest, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
        }
        Bitmap result = getNextBitmap();
        result.setPixels(dest, 0, this.downsampledWidth, 0, 0, this.downsampledWidth, this.downsampledHeight);
        return result;
    }

    private void copyIntoScratchFast(GifFrame currentFrame) {
        int[] dest = this.mainScratch;
        int downsampledIH = currentFrame.ih;
        int downsampledIY = currentFrame.iy;
        int downsampledIW = currentFrame.iw;
        int downsampledIX = currentFrame.ix;
        boolean isFirstFrame = this.framePointer == 0;
        int width = this.downsampledWidth;
        byte[] mainPixels = this.mainPixels;
        int[] act = this.act;
        byte transparentColorIndex = -1;
        for (int i = 0; i < downsampledIH; i++) {
            int line = i + downsampledIY;
            int k = line * width;
            int dx = k + downsampledIX;
            int dlim = dx + downsampledIW;
            if (k + width < dlim) {
                dlim = k + width;
            }
            int sx = i * currentFrame.iw;
            while (dx < dlim) {
                byte byteCurrentColorIndex = mainPixels[sx];
                int currentColorIndex = byteCurrentColorIndex & 255;
                if (currentColorIndex != transparentColorIndex) {
                    int color = act[currentColorIndex];
                    if (color != 0) {
                        dest[dx] = color;
                    } else {
                        transparentColorIndex = byteCurrentColorIndex;
                    }
                }
                sx++;
                dx++;
            }
        }
        this.isFirstFrameTransparent = Boolean.valueOf((this.isFirstFrameTransparent != null && this.isFirstFrameTransparent.booleanValue()) || (this.isFirstFrameTransparent == null && isFirstFrame && transparentColorIndex != -1));
    }

    private void copyCopyIntoScratchRobust(GifFrame currentFrame) {
        int[] dest = this.mainScratch;
        int downsampledIH = currentFrame.ih / this.sampleSize;
        int downsampledIY = currentFrame.iy / this.sampleSize;
        int downsampledIW = currentFrame.iw / this.sampleSize;
        int downsampledIX = currentFrame.ix / this.sampleSize;
        int pass = 1;
        int inc = 8;
        int iline = 0;
        boolean isFirstFrame = this.framePointer == 0;
        int sampleSize = this.sampleSize;
        int downsampledWidth = this.downsampledWidth;
        int downsampledHeight = this.downsampledHeight;
        byte[] mainPixels = this.mainPixels;
        int[] act = this.act;
        Boolean isFirstFrameTransparent = this.isFirstFrameTransparent;
        for (int i = 0; i < downsampledIH; i++) {
            int line = i;
            if (currentFrame.interlace) {
                if (iline >= downsampledIH) {
                    pass++;
                    switch (pass) {
                        case 2:
                            iline = 4;
                            break;
                        case 3:
                            iline = 2;
                            inc = 4;
                            break;
                        case 4:
                            iline = 1;
                            inc = 2;
                            break;
                    }
                }
                line = iline;
                iline += inc;
            }
            int line2 = line + downsampledIY;
            boolean isNotDownsampling = sampleSize == 1;
            if (line2 < downsampledHeight) {
                int k = line2 * downsampledWidth;
                int dx = k + downsampledIX;
                int dlim = dx + downsampledIW;
                if (k + downsampledWidth < dlim) {
                    dlim = k + downsampledWidth;
                }
                int sx = i * sampleSize * currentFrame.iw;
                if (isNotDownsampling) {
                    while (dx < dlim) {
                        int currentColorIndex = mainPixels[sx] & 255;
                        int averageColor = act[currentColorIndex];
                        if (averageColor != 0) {
                            dest[dx] = averageColor;
                        } else if (isFirstFrame && isFirstFrameTransparent == null) {
                            isFirstFrameTransparent = true;
                        }
                        sx += sampleSize;
                        dx++;
                    }
                } else {
                    int maxPositionInSource = sx + ((dlim - dx) * sampleSize);
                    while (dx < dlim) {
                        int averageColor2 = averageColorsNear(sx, maxPositionInSource, currentFrame.iw);
                        if (averageColor2 != 0) {
                            dest[dx] = averageColor2;
                        } else if (isFirstFrame && isFirstFrameTransparent == null) {
                            isFirstFrameTransparent = true;
                        }
                        sx += sampleSize;
                        dx++;
                    }
                }
            }
        }
        if (this.isFirstFrameTransparent == null) {
            this.isFirstFrameTransparent = Boolean.valueOf(isFirstFrameTransparent == null ? false : isFirstFrameTransparent.booleanValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        return 0;
     */
    @androidx.annotation.ColorInt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int averageColorsNear(int r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            r6 = 0
            r4 = 0
            r1 = 0
            r7 = 0
            r5 = r11
        L6:
            int r8 = r10.sampleSize
            int r8 = r8 + r11
            if (r5 >= r8) goto L35
            byte[] r8 = r10.mainPixels
            int r8 = r8.length
            if (r5 >= r8) goto L35
            if (r5 >= r12) goto L35
            byte[] r8 = r10.mainPixels
            r8 = r8[r5]
            r3 = r8 & 255(0xff, float:3.57E-43)
            int[] r8 = r10.act
            r2 = r8[r3]
            if (r2 == 0) goto L32
            int r8 = r2 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r8
            int r8 = r2 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r8
            int r8 = r2 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r8
            r8 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r8
            int r7 = r7 + 1
        L32:
            int r5 = r5 + 1
            goto L6
        L35:
            int r5 = r11 + r13
        L37:
            int r8 = r11 + r13
            int r9 = r10.sampleSize
            int r8 = r8 + r9
            if (r5 >= r8) goto L68
            byte[] r8 = r10.mainPixels
            int r8 = r8.length
            if (r5 >= r8) goto L68
            if (r5 >= r12) goto L68
            byte[] r8 = r10.mainPixels
            r8 = r8[r5]
            r3 = r8 & 255(0xff, float:3.57E-43)
            int[] r8 = r10.act
            r2 = r8[r3]
            if (r2 == 0) goto L65
            int r8 = r2 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r8
            int r8 = r2 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r8
            int r8 = r2 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r8
            r8 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r8
            int r7 = r7 + 1
        L65:
            int r5 = r5 + 1
            goto L37
        L68:
            if (r7 != 0) goto L6c
            r8 = 0
        L6b:
            return r8
        L6c:
            int r8 = r0 / r7
            int r8 = r8 << 24
            int r9 = r6 / r7
            int r9 = r9 << 16
            r8 = r8 | r9
            int r9 = r4 / r7
            int r9 = r9 << 8
            r8 = r8 | r9
            int r9 = r1 / r7
            r8 = r8 | r9
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.averageColorsNear(int, int, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [short] */
    /* JADX WARN: Type inference failed for: r9v6 */
    private void decodeBitmapData(GifFrame gifFrame) {
        if (gifFrame != null) {
            this.rawData.position(gifFrame.bufferFrameStart);
        }
        int r20 = gifFrame == null ? this.header.width * this.header.height : gifFrame.iw * gifFrame.ih;
        if (this.mainPixels == null || this.mainPixels.length < r20) {
            this.mainPixels = this.bitmapProvider.obtainByteArray(r20);
        }
        byte[] bArr = this.mainPixels;
        if (this.prefix == null) {
            this.prefix = new short[4096];
        }
        short[] sArr = this.prefix;
        if (this.suffix == null) {
            this.suffix = new byte[4096];
        }
        byte[] bArr2 = this.suffix;
        if (this.pixelStack == null) {
            this.pixelStack = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr3 = this.pixelStack;
        int readByte = readByte();
        int r8 = 1 << readByte;
        int r15 = r8 + 1;
        int r4 = r8 + 2;
        int r21 = -1;
        int r11 = readByte + 1;
        int r10 = (1 << r11) - 1;
        for (int r9 = 0; r9 < r8; r9++) {
            sArr[r9] = 0;
            bArr2[r9] = (byte) r9;
        }
        byte[] bArr4 = this.block;
        int r5 = 0;
        int r22 = 0;
        int r26 = 0;
        int r16 = 0;
        int r12 = 0;
        int r6 = 0;
        int r14 = 0;
        int r17 = 0;
        while (true) {
            if (r17 >= r20) {
                break;
            }
            if (r12 == 0) {
                r12 = readBlock();
                if (r12 <= 0) {
                    this.status = 3;
                    break;
                }
                r5 = 0;
            }
            r14 += (bArr4[r5] & 255) << r6;
            r6 += 8;
            r5++;
            r12--;
            while (r6 >= r11) {
                int r92 = r14 & r10;
                r14 >>= r11;
                r6 -= r11;
                if (r92 == r8) {
                    r11 = readByte + 1;
                    r10 = (1 << r11) - 1;
                    r4 = r8 + 2;
                    r21 = -1;
                } else if (r92 != r15) {
                    if (r21 == -1) {
                        bArr[r22] = bArr2[r92 == true ? 1 : 0];
                        r22++;
                        r17++;
                        r21 = r92 == true ? 1 : 0;
                        r16 = r92 == true ? 1 : 0;
                    } else {
                        short s = r92;
                        if (r92 >= r4) {
                            bArr3[r26] = (byte) r16;
                            r26++;
                            s = r21;
                        }
                        while (s >= r8) {
                            bArr3[r26] = bArr2[s];
                            r26++;
                            s = sArr[s];
                        }
                        r16 = bArr2[s] & 255;
                        bArr[r22] = (byte) r16;
                        r22++;
                        r17++;
                        while (r26 > 0) {
                            r26--;
                            bArr[r22] = bArr3[r26];
                            r22++;
                            r17++;
                        }
                        if (r4 < 4096) {
                            sArr[r4] = (short) r21;
                            bArr2[r4] = (byte) r16;
                            r4++;
                            if ((r4 & r10) == 0 && r4 < 4096) {
                                r11++;
                                r10 += r4;
                            }
                        }
                        r21 = r92 == true ? 1 : 0;
                    }
                }
            }
        }
        Arrays.fill(bArr, r22, r20, (byte) 0);
    }

    private int readByte() {
        return this.rawData.get() & 255;
    }

    private int readBlock() {
        int blockSize = readByte();
        if (blockSize > 0) {
            this.rawData.get(this.block, 0, Math.min(blockSize, this.rawData.remaining()));
        }
        return blockSize;
    }

    private Bitmap getNextBitmap() {
        Bitmap.Config config = (this.isFirstFrameTransparent == null || this.isFirstFrameTransparent.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.bitmapConfig;
        Bitmap result = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, config);
        result.setHasAlpha(true);
        return result;
    }
}
