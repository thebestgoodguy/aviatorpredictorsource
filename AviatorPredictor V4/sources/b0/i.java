package b0;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* loaded from: classes.dex */
public final class i {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
