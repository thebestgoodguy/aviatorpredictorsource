package com.google.android.material.color;

/* loaded from: classes37.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    ColorRoles(int accent, int onAccent, int accentContainer, int onAccentContainer) {
        this.accent = accent;
        this.onAccent = onAccent;
        this.accentContainer = accentContainer;
        this.onAccentContainer = onAccentContainer;
    }

    public int getAccent() {
        return this.accent;
    }

    public int getOnAccent() {
        return this.onAccent;
    }

    public int getAccentContainer() {
        return this.accentContainer;
    }

    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
