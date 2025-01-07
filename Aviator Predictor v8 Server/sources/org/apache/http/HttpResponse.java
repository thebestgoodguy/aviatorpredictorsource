package org.apache.http;

import java.util.Locale;

@Deprecated
/* loaded from: classes.dex */
public interface HttpResponse extends HttpMessage {
    HttpEntity getEntity();

    Locale getLocale();

    StatusLine getStatusLine();

    void setEntity(HttpEntity httpEntity);

    void setLocale(Locale locale);

    void setReasonPhrase(String str) throws IllegalStateException;

    void setStatusCode(int r1) throws IllegalStateException;

    void setStatusLine(ProtocolVersion protocolVersion, int r2);

    void setStatusLine(ProtocolVersion protocolVersion, int r2, String str);

    void setStatusLine(StatusLine statusLine);
}
