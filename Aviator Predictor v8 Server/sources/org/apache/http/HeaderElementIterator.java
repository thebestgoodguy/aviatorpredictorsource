package org.apache.http;

import java.util.Iterator;

@Deprecated
/* loaded from: classes.dex */
public interface HeaderElementIterator extends Iterator {
    @Override // java.util.Iterator
    boolean hasNext();

    HeaderElement nextElement();
}
