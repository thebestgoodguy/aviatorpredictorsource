package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private final int f198e;

    /* renamed from: f, reason: collision with root package name */
    private final int f199f;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198e = getResources().getDimensionPixelOffset(a.f1089b);
        this.f199f = getResources().getDimensionPixelOffset(a.f1088a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r22, int r32) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f198e * 2), this.f199f), 1073741824), r32);
    }
}
