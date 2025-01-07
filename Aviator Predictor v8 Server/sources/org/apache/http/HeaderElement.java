package org.apache.http;

@Deprecated
/* loaded from: classes.dex */
public interface HeaderElement {
    String getName();

    NameValuePair getParameter(int r1);

    NameValuePair getParameterByName(String str);

    int getParameterCount();

    NameValuePair[] getParameters();

    String getValue();
}
