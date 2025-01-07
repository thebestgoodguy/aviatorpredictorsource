package androidx.core.widget;

import android.os.Build;

/* loaded from: classes6.dex */
public interface AutoSizeableTextView {
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int r1);

    static {
        PLATFORM_SUPPORTS_AUTOSIZE = Build.VERSION.SDK_INT >= 27;
    }
}
