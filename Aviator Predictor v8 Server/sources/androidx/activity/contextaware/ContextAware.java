package androidx.activity.contextaware;

import android.content.Context;

/* loaded from: classes3.dex */
public interface ContextAware {
    void addOnContextAvailableListener(OnContextAvailableListener listener);

    Context peekAvailableContext();

    void removeOnContextAvailableListener(OnContextAvailableListener listener);
}
