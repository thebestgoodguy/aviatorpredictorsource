package androidx.core.net;

/* loaded from: classes6.dex */
public class ParseException extends RuntimeException {
    public final String response;

    ParseException(String response) {
        super(response);
        this.response = response;
    }
}
