package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes6.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    private static final int MIN_DELAY_MS = 500;
    private static final int MIN_SHOW_TIME_MS = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    public /* synthetic */ void lambda$new$0$ContentLoadingProgressBar() {
        this.mPostedHide = false;
        this.mStartTime = -1L;
        setVisibility(8);
    }

    public /* synthetic */ void lambda$new$1$ContentLoadingProgressBar() {
        this.mPostedShow = false;
        if (!this.mDismissed) {
            this.mStartTime = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.lambda$new$0$ContentLoadingProgressBar();
            }
        };
        this.mDelayedShow = new Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.lambda$new$1$ContentLoadingProgressBar();
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    public void hide() {
        post(new Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.hideOnUiThread();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideOnUiThread() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        this.mPostedShow = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mStartTime;
        long diff = currentTimeMillis - j;
        if (diff >= 500 || j == -1) {
            setVisibility(8);
        } else if (!this.mPostedHide) {
            postDelayed(this.mDelayedHide, 500 - diff);
            this.mPostedHide = true;
        }
    }

    public void show() {
        post(new Runnable() { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.showOnUiThread();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showOnUiThread() {
        this.mStartTime = -1L;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        this.mPostedHide = false;
        if (!this.mPostedShow) {
            postDelayed(this.mDelayedShow, 500L);
            this.mPostedShow = true;
        }
    }
}
