package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes53.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<ExclusionStrategy> serializationStrategies = Collections.emptyList();
    private List<ExclusionStrategy> deserializationStrategies = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m13clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Excluder withVersion(double ignoreVersionsAfter) {
        Excluder result = m13clone();
        result.version = ignoreVersionsAfter;
        return result;
    }

    public Excluder withModifiers(int... modifiers) {
        Excluder result = m13clone();
        result.modifiers = 0;
        for (int modifier : modifiers) {
            result.modifiers |= modifier;
        }
        return result;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder result = m13clone();
        result.serializeInnerClasses = false;
        return result;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder result = m13clone();
        result.requireExpose = true;
        return result;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean serialization, boolean deserialization) {
        Excluder result = m13clone();
        if (serialization) {
            result.serializationStrategies = new ArrayList(this.serializationStrategies);
            result.serializationStrategies.add(exclusionStrategy);
        }
        if (deserialization) {
            result.deserializationStrategies = new ArrayList(this.deserializationStrategies);
            result.deserializationStrategies.add(exclusionStrategy);
        }
        return result;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        Class<?> rawType = type.getRawType();
        boolean excludeClass = excludeClassChecks(rawType);
        final boolean skipSerialize = excludeClass || excludeClassInStrategy(rawType, true);
        final boolean skipDeserialize = excludeClass || excludeClassInStrategy(rawType, false);
        if (!skipSerialize && !skipDeserialize) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
            private TypeAdapter<T> delegate;

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public T read2(JsonReader in) throws IOException {
                if (!skipDeserialize) {
                    return delegate().read2(in);
                }
                in.skipValue();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter out, T value) throws IOException {
                if (skipSerialize) {
                    out.nullValue();
                } else {
                    delegate().write(out, value);
                }
            }

            private TypeAdapter<T> delegate() {
                TypeAdapter<T> d = this.delegate;
                if (d != null) {
                    return d;
                }
                TypeAdapter<T> d2 = gson.getDelegateAdapter(Excluder.this, type);
                this.delegate = d2;
                return d2;
            }
        };
    }

    public boolean excludeField(Field field, boolean serialize) {
        Expose annotation;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version == IGNORE_VERSIONS || isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) && !field.isSynthetic()) {
            if (this.requireExpose && ((annotation = (Expose) field.getAnnotation(Expose.class)) == null || (!serialize ? annotation.deserialize() : annotation.serialize()))) {
                return true;
            }
            if ((this.serializeInnerClasses || !isInnerClass(field.getType())) && !isAnonymousOrLocal(field.getType())) {
                List<ExclusionStrategy> list = serialize ? this.serializationStrategies : this.deserializationStrategies;
                if (!list.isEmpty()) {
                    FieldAttributes fieldAttributes = new FieldAttributes(field);
                    for (ExclusionStrategy exclusionStrategy : list) {
                        if (exclusionStrategy.shouldSkipField(fieldAttributes)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean excludeClassChecks(Class<?> clazz) {
        if (this.version == IGNORE_VERSIONS || isValidVersion((Since) clazz.getAnnotation(Since.class), (Until) clazz.getAnnotation(Until.class))) {
            return (!this.serializeInnerClasses && isInnerClass(clazz)) || isAnonymousOrLocal(clazz);
        }
        return true;
    }

    public boolean excludeClass(Class<?> clazz, boolean serialize) {
        return excludeClassChecks(clazz) || excludeClassInStrategy(clazz, serialize);
    }

    private boolean excludeClassInStrategy(Class<?> clazz, boolean serialize) {
        List<ExclusionStrategy> list = serialize ? this.serializationStrategies : this.deserializationStrategies;
        for (ExclusionStrategy exclusionStrategy : list) {
            if (exclusionStrategy.shouldSkipClass(clazz)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrLocal(Class<?> clazz) {
        return !Enum.class.isAssignableFrom(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
    }

    private boolean isInnerClass(Class<?> clazz) {
        return clazz.isMemberClass() && !isStatic(clazz);
    }

    private boolean isStatic(Class<?> clazz) {
        return (clazz.getModifiers() & 8) != 0;
    }

    private boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    private boolean isValidSince(Since annotation) {
        if (annotation != null) {
            double annotationVersion = annotation.value();
            if (annotationVersion > this.version) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidUntil(Until annotation) {
        if (annotation != null) {
            double annotationVersion = annotation.value();
            if (annotationVersion <= this.version) {
                return false;
            }
        }
        return true;
    }
}
