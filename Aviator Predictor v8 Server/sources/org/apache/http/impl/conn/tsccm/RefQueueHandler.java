package org.apache.http.impl.conn.tsccm;

import java.lang.ref.Reference;

@Deprecated
/* loaded from: classes.dex */
public interface RefQueueHandler {
    void handleReference(Reference<?> reference);
}
