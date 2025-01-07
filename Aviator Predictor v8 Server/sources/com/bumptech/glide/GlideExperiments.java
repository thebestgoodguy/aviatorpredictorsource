package com.bumptech.glide;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes54.dex */
public class GlideExperiments {
    private final Map<Class<?>, Experiment> experiments;

    interface Experiment {
    }

    GlideExperiments(Builder builder) {
        this.experiments = Collections.unmodifiableMap(new HashMap(builder.experiments));
    }

    @Nullable
    <T extends Experiment> T get(Class<T> clazz) {
        return (T) this.experiments.get(clazz);
    }

    public boolean isEnabled(Class<? extends Experiment> clazz) {
        return this.experiments.containsKey(clazz);
    }

    static final class Builder {
        private final Map<Class<?>, Experiment> experiments = new HashMap();

        Builder() {
        }

        Builder update(Experiment experiment, boolean isEnabled) {
            if (isEnabled) {
                add(experiment);
            } else {
                this.experiments.remove(experiment.getClass());
            }
            return this;
        }

        Builder add(Experiment experiment) {
            this.experiments.put(experiment.getClass(), experiment);
            return this;
        }

        GlideExperiments build() {
            return new GlideExperiments(this);
        }
    }
}
