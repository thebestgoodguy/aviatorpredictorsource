package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: classes53.dex */
public interface JsonDeserializationContext {
    <T> T deserialize(JsonElement jsonElement, Type type) throws JsonParseException;
}
