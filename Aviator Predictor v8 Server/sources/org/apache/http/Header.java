package org.apache.http;

@Deprecated
/* loaded from: classes.dex */
public interface Header {
    HeaderElement[] getElements() throws ParseException;

    String getName();

    String getValue();
}
