package a1;

import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.fp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 {
    public static com.google.firebase.auth.i0 a(fp fpVar) {
        if (fpVar == null || TextUtils.isEmpty(fpVar.n0())) {
            return null;
        }
        return new com.google.firebase.auth.s0(fpVar.m0(), fpVar.l0(), fpVar.j0(), w.r.e(fpVar.n0()));
    }

    public static List b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.i0 a5 = a((fp) it.next());
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        return arrayList;
    }
}
