package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

@Deprecated
/* loaded from: classes.dex */
public class RefinedSoundex implements StringEncoder {
    public static final char[] US_ENGLISH_MAPPING = null;
    public static final RefinedSoundex US_ENGLISH = null;

    public RefinedSoundex() {
        throw new RuntimeException("Stub!");
    }

    public RefinedSoundex(char[] mapping) {
        throw new RuntimeException("Stub!");
    }

    public int difference(String s1, String s2) throws EncoderException {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object pObject) throws EncoderException {
        throw new RuntimeException("Stub!");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String pString) {
        throw new RuntimeException("Stub!");
    }

    public String soundex(String str) {
        throw new RuntimeException("Stub!");
    }
}
