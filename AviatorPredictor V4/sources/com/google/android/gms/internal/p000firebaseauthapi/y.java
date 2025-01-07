package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class y {
    y() {
    }

    public static final int a(int r02, Object obj, Object obj2) {
        x xVar = (x) obj;
        if (xVar.isEmpty()) {
            return 0;
        }
        Iterator it = xVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((x) obj).e();
    }

    public static final Object c(Object obj, Object obj2) {
        x xVar = (x) obj;
        x xVar2 = (x) obj2;
        if (!xVar2.isEmpty()) {
            if (!xVar.e()) {
                xVar = xVar.b();
            }
            xVar.d(xVar2);
        }
        return xVar;
    }
}
