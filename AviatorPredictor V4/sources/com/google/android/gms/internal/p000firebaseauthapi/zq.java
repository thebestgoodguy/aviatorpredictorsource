package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zq implements Comparator {
    zq() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        hr hrVar = (hr) obj;
        hr hrVar2 = (hr) obj2;
        yq yqVar = new yq(hrVar);
        yq yqVar2 = new yq(hrVar2);
        while (yqVar.hasNext() && yqVar2.hasNext()) {
            int compareTo = Integer.valueOf(yqVar.a() & 255).compareTo(Integer.valueOf(yqVar2.a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(hrVar.q()).compareTo(Integer.valueOf(hrVar2.q()));
    }
}
