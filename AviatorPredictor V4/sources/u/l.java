package u;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class l {
    public static <TResult> void a(Status status, TResult tresult, o0.i<TResult> iVar) {
        if (status.n0()) {
            iVar.c(tresult);
        } else {
            iVar.b(new t.b(status));
        }
    }

    public static void b(Status status, o0.i<Void> iVar) {
        a(status, null, iVar);
    }
}
