package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes42.dex */
public interface ItemTouchUIUtil {
    void clearView(View view);

    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int r6, boolean z);

    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int r6, boolean z);

    void onSelected(View view);
}
