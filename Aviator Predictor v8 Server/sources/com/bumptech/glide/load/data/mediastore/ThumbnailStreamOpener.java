package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes54.dex */
class ThumbnailStreamOpener {
    private static final FileService DEFAULT_SERVICE = new FileService();
    private static final String TAG = "ThumbStreamOpener";
    private final ArrayPool byteArrayPool;
    private final ContentResolver contentResolver;
    private final List<ImageHeaderParser> parsers;
    private final ThumbnailQuery query;
    private final FileService service;

    ThumbnailStreamOpener(List<ImageHeaderParser> parsers, ThumbnailQuery query, ArrayPool byteArrayPool, ContentResolver contentResolver) {
        this(parsers, DEFAULT_SERVICE, query, byteArrayPool, contentResolver);
    }

    ThumbnailStreamOpener(List<ImageHeaderParser> parsers, FileService service, ThumbnailQuery query, ArrayPool byteArrayPool, ContentResolver contentResolver) {
        this.service = service;
        this.query = query;
        this.byteArrayPool = byteArrayPool;
        this.contentResolver = contentResolver;
        this.parsers = parsers;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0020 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:3:0x0001, B:23:0x0017, B:25:0x0020), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int getOrientation(android.net.Uri r6) {
        /*
            r5 = this;
            r1 = 0
            android.content.ContentResolver r2 = r5.contentResolver     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L3f java.lang.NullPointerException -> L46
            java.io.InputStream r1 = r2.openInputStream(r6)     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L3f java.lang.NullPointerException -> L46
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2 = r5.parsers     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L3f java.lang.NullPointerException -> L46
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = r5.byteArrayPool     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L3f java.lang.NullPointerException -> L46
            int r2 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r2, r1, r3)     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L3f java.lang.NullPointerException -> L46
            if (r1 == 0) goto L14
            r1.close()     // Catch: java.io.IOException -> L49
        L14:
            return r2
        L15:
            r2 = move-exception
            r0 = r2
        L17:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L38
            java.lang.String r2 = "ThumbStreamOpener"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "Failed to open uri: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.d(r2, r3, r0)     // Catch: java.lang.Throwable -> L3f
        L38:
            if (r1 == 0) goto L3d
            r1.close()     // Catch: java.io.IOException -> L4b
        L3d:
            r2 = -1
            goto L14
        L3f:
            r2 = move-exception
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L4d
        L45:
            throw r2
        L46:
            r2 = move-exception
            r0 = r2
            goto L17
        L49:
            r3 = move-exception
            goto L14
        L4b:
            r2 = move-exception
            goto L3d
        L4d:
            r3 = move-exception
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener.getOrientation(android.net.Uri):int");
    }

    public InputStream open(Uri uri) throws FileNotFoundException {
        String path = getPath(uri);
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        File file = this.service.get(path);
        if (!isValid(file)) {
            return null;
        }
        Uri thumbnailUri = Uri.fromFile(file);
        try {
            return this.contentResolver.openInputStream(thumbnailUri);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + thumbnailUri).initCause(e));
        }
    }

    @Nullable
    private String getPath(@NonNull Uri uri) {
        String str = null;
        Cursor cursor = null;
        try {
            try {
                cursor = this.query.query(uri);
                if (cursor != null && cursor.moveToFirst()) {
                    str = cursor.getString(0);
                } else if (cursor != null) {
                    cursor.close();
                }
            } catch (SecurityException e) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Failed to query for thumbnail for Uri: " + uri, e);
                }
                if (cursor != null) {
                    cursor.close();
                }
            }
            return str;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private boolean isValid(File file) {
        return this.service.exists(file) && 0 < this.service.length(file);
    }
}
