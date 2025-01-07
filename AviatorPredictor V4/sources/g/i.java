package g;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public final class i {
    static RemoteInput a(i iVar) {
        throw null;
    }

    static RemoteInput[] b(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[iVarArr.length];
        for (int r12 = 0; r12 < iVarArr.length; r12++) {
            remoteInputArr[r12] = a(iVarArr[r12]);
        }
        return remoteInputArr;
    }
}
