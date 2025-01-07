package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes54.dex */
public final class ImageHeaderParserUtils {
    private static final int MARK_READ_LIMIT = 5242880;

    private interface OrientationReader {
        int getOrientation(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private interface TypeReader {
        ImageHeaderParser.ImageType getType(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private ImageHeaderParserUtils() {
    }

    @NonNull
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> parsers, @Nullable InputStream is, @NonNull ArrayPool byteArrayPool) throws IOException {
        if (is == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!is.markSupported()) {
            is = new RecyclableBufferedInputStream(is, byteArrayPool);
        }
        is.mark(MARK_READ_LIMIT);
        final InputStream finalIs = is;
        return getTypeInternal(parsers, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.1
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getType(ImageHeaderParser parser) throws IOException {
                try {
                    return parser.getType(finalIs);
                } finally {
                    finalIs.reset();
                }
            }
        });
    }

    @NonNull
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> parsers, @Nullable final ByteBuffer buffer) throws IOException {
        return buffer == null ? ImageHeaderParser.ImageType.UNKNOWN : getTypeInternal(parsers, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.2
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getType(ImageHeaderParser parser) throws IOException {
                return parser.getType(buffer);
            }
        });
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> parsers, @NonNull final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull final ArrayPool byteArrayPool) throws IOException {
        return getTypeInternal(parsers, new TypeReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.3
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.TypeReader
            public ImageHeaderParser.ImageType getType(ImageHeaderParser parser) throws IOException {
                InputStream is = null;
                try {
                    InputStream is2 = new RecyclableBufferedInputStream(new FileInputStream(ParcelFileDescriptorRewinder.this.rewindAndGet().getFileDescriptor()), byteArrayPool);
                    try {
                        ImageHeaderParser.ImageType type = parser.getType(is2);
                        if (is2 != null) {
                            try {
                                is2.close();
                            } catch (IOException e) {
                            }
                        }
                        ParcelFileDescriptorRewinder.this.rewindAndGet();
                        return type;
                    } catch (Throwable th) {
                        th = th;
                        is = is2;
                        if (is != null) {
                            try {
                                is.close();
                            } catch (IOException e2) {
                            }
                        }
                        ParcelFileDescriptorRewinder.this.rewindAndGet();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    @NonNull
    private static ImageHeaderParser.ImageType getTypeInternal(@NonNull List<ImageHeaderParser> parsers, TypeReader reader) throws IOException {
        int size = parsers.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser parser = parsers.get(i);
            ImageHeaderParser.ImageType type = reader.getType(parser);
            if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                return type;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int getOrientation(@NonNull List<ImageHeaderParser> parsers, @Nullable InputStream is, @NonNull final ArrayPool byteArrayPool) throws IOException {
        if (is == null) {
            return -1;
        }
        if (!is.markSupported()) {
            is = new RecyclableBufferedInputStream(is, byteArrayPool);
        }
        is.mark(MARK_READ_LIMIT);
        final InputStream finalIs = is;
        return getOrientationInternal(parsers, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.4
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientation(ImageHeaderParser parser) throws IOException {
                try {
                    return parser.getOrientation(finalIs, byteArrayPool);
                } finally {
                    finalIs.reset();
                }
            }
        });
    }

    @RequiresApi(21)
    public static int getOrientation(@NonNull List<ImageHeaderParser> parsers, @NonNull final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull final ArrayPool byteArrayPool) throws IOException {
        return getOrientationInternal(parsers, new OrientationReader() { // from class: com.bumptech.glide.load.ImageHeaderParserUtils.5
            @Override // com.bumptech.glide.load.ImageHeaderParserUtils.OrientationReader
            public int getOrientation(ImageHeaderParser parser) throws IOException {
                InputStream is = null;
                try {
                    InputStream is2 = new RecyclableBufferedInputStream(new FileInputStream(ParcelFileDescriptorRewinder.this.rewindAndGet().getFileDescriptor()), byteArrayPool);
                    try {
                        int orientation = parser.getOrientation(is2, byteArrayPool);
                        if (is2 != null) {
                            try {
                                is2.close();
                            } catch (IOException e) {
                            }
                        }
                        ParcelFileDescriptorRewinder.this.rewindAndGet();
                        return orientation;
                    } catch (Throwable th) {
                        th = th;
                        is = is2;
                        if (is != null) {
                            try {
                                is.close();
                            } catch (IOException e2) {
                            }
                        }
                        ParcelFileDescriptorRewinder.this.rewindAndGet();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        });
    }

    private static int getOrientationInternal(@NonNull List<ImageHeaderParser> parsers, OrientationReader reader) throws IOException {
        int size = parsers.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser parser = parsers.get(i);
            int orientation = reader.getOrientation(parser);
            if (orientation != -1) {
                return orientation;
            }
        }
        return -1;
    }
}
