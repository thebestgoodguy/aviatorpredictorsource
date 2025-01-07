package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* loaded from: classes42.dex */
public interface ListUpdateCallback {
    void onChanged(int r1, int r2, @Nullable Object obj);

    void onInserted(int r1, int r2);

    void onMoved(int r1, int r2);

    void onRemoved(int r1, int r2);
}
