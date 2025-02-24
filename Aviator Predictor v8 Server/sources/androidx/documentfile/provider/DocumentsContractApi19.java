package androidx.documentfile.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: classes46.dex */
class DocumentsContractApi19 {
    private static final int FLAG_VIRTUAL_DOCUMENT = 512;
    private static final String TAG = "DocumentFile";

    public static boolean isVirtual(Context context, Uri uri) {
        if (DocumentsContract.isDocumentUri(context, uri)) {
            return (getFlags(context, uri) & 512) != 0;
        }
        return false;
    }

    @Nullable
    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    @Nullable
    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    @Nullable
    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static long getFlags(Context context, Uri uri) {
        return queryForLong(context, uri, "flags", 0L);
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        return ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) ? false : true;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0L);
    }

    public static boolean canRead(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(getRawType(context, uri))) {
            return true;
        }
        return false;
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((queryForInt & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(rawType) && (queryForInt & 8) != 0) {
            return true;
        }
        if (!TextUtils.isEmpty(rawType) && (queryForInt & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean exists(Context context, Uri uri) {
        boolean z;
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                boolean z2 = cursor.getCount() > 0;
                closeQuietly(cursor);
                z = z2;
            } catch (Exception e) {
                Log.w(TAG, "Failed query: " + e);
                closeQuietly(cursor);
                z = false;
            }
            return z;
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }

    @Nullable
    private static String queryForString(Context context, Uri uri, String str, @Nullable String str2) {
        String str3;
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    String string = cursor.getString(0);
                    closeQuietly(cursor);
                    str3 = string;
                } else {
                    closeQuietly(cursor);
                    str3 = str2;
                }
            } catch (Exception e) {
                Log.w(TAG, "Failed query: " + e);
                closeQuietly(cursor);
                str3 = str2;
            }
            return str3;
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }

    private static int queryForInt(Context context, Uri uri, String str, int r12) {
        return (int) queryForLong(context, uri, str, r12);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j) {
        long j2;
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j3 = cursor.getLong(0);
                    closeQuietly(cursor);
                    j2 = j3;
                } else {
                    closeQuietly(cursor);
                    j2 = j;
                }
            } catch (Exception e) {
                Log.w(TAG, "Failed query: " + e);
                closeQuietly(cursor);
                j2 = j;
            }
            return j2;
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    private DocumentsContractApi19() {
    }
}
