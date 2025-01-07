package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f4550a;

    public a(FlutterJNI flutterJNI) {
        this.f4550a = flutterJNI;
    }

    public int a(CharSequence charSequence, int r11) {
        int length = charSequence.length();
        int r12 = length - 1;
        if (r11 >= r12) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, r11);
        int charCount = Character.charCount(codePointAt);
        int r4 = r11 + charCount;
        int r5 = 0;
        if (r4 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, r4) == 13) {
                charCount++;
            }
            return r11 + charCount;
        }
        if (g(codePointAt)) {
            if (r4 >= r12 || !g(Character.codePointAt(charSequence, r4))) {
                return r4;
            }
            int r02 = r11;
            while (r02 > 0 && g(Character.codePointBefore(charSequence, r11))) {
                r02 -= Character.charCount(Character.codePointBefore(charSequence, r11));
                r5++;
            }
            if (r5 % 2 == 0) {
                charCount += 2;
            }
            return r11 + charCount;
        }
        if (f(codePointAt)) {
            charCount += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, r4);
            int charCount2 = r4 + Character.charCount(codePointBefore);
            if (charCount2 < length && i(codePointBefore)) {
                int codePointAt2 = Character.codePointAt(charSequence, charCount2);
                if (f(codePointAt2)) {
                    charCount += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                }
            } else if (f(codePointBefore)) {
                charCount += Character.charCount(codePointBefore);
            }
            return r11 + charCount;
        }
        if (c(codePointAt)) {
            boolean z4 = false;
            int r7 = 0;
            do {
                if (z4) {
                    charCount += Character.charCount(codePointAt) + r7 + 1;
                    z4 = false;
                }
                if (d(codePointAt)) {
                    break;
                }
                if (r4 < length) {
                    codePointAt = Character.codePointAt(charSequence, r4);
                    r4 += Character.charCount(codePointAt);
                    if (codePointAt != 8419) {
                        if (!d(codePointAt) && !i(codePointAt)) {
                            if (codePointAt == 8205) {
                                codePointAt = Character.codePointAt(charSequence, r4);
                                r4 += Character.charCount(codePointAt);
                                if (r4 < length && i(codePointAt)) {
                                    codePointAt = Character.codePointAt(charSequence, r4);
                                    int charCount3 = Character.charCount(codePointAt);
                                    r4 += Character.charCount(codePointAt);
                                    r7 = charCount3;
                                    z4 = true;
                                    if (r4 < length || !z4) {
                                        break;
                                        break;
                                    }
                                } else {
                                    z4 = true;
                                }
                            }
                        } else {
                            charCount += Character.charCount(codePointAt) + 0;
                            break;
                        }
                    } else {
                        int codePointBefore2 = Character.codePointBefore(charSequence, r4);
                        int charCount4 = r4 + Character.charCount(codePointBefore2);
                        if (charCount4 < length && i(codePointBefore2)) {
                            int codePointAt3 = Character.codePointAt(charSequence, charCount4);
                            if (f(codePointAt3)) {
                                charCount += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                            }
                        } else if (f(codePointBefore2)) {
                            charCount += Character.charCount(codePointBefore2);
                        }
                        return r11 + charCount;
                    }
                }
                r7 = 0;
                if (r4 < length) {
                    break;
                }
            } while (c(codePointAt));
        }
        return r11 + charCount;
    }

    public int b(CharSequence charSequence, int r10) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int r02 = 0;
        int r12 = 1;
        if (r10 <= 1 || (charCount2 = r10 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, r10))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return r10 - charCount;
        }
        if (g(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount3 > 0 && g(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                charCount3 -= Character.charCount(codePointBefore2);
                r12++;
            }
            if (r12 % 2 == 0) {
                charCount += 2;
            }
            return r10 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount4 > 0 && i(codePointBefore3)) {
                int codePointBefore4 = Character.codePointBefore(charSequence, charCount4);
                if (f(codePointBefore4)) {
                    charCount += Character.charCount(codePointBefore3) + Character.charCount(codePointBefore4);
                }
            } else if (f(codePointBefore3)) {
                charCount += Character.charCount(codePointBefore3);
            }
            return r10 - charCount;
        }
        if (codePointBefore == 917631) {
            while (true) {
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount2 -= Character.charCount(codePointBefore);
                if (charCount2 <= 0 || !h(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
            }
            if (!c(codePointBefore)) {
                return r10 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (i(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!c(codePointBefore)) {
                return r10 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (c(codePointBefore)) {
            boolean z4 = false;
            int r6 = 0;
            while (true) {
                if (z4) {
                    charCount += Character.charCount(codePointBefore) + r6 + 1;
                    z4 = false;
                }
                if (d(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount5 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount5 > 0 && i(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount5);
                        if (!c(codePointBefore5)) {
                            return r10 - charCount;
                        }
                        r02 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (e(codePointBefore5)) {
                        charCount += r02 + Character.charCount(codePointBefore5);
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 > 0 && i(codePointBefore)) {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount6 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                r6 = charCount6;
                                z4 = true;
                                if (charCount2 != 0 || !z4 || !c(codePointBefore)) {
                                    break;
                                    break;
                                }
                            } else {
                                z4 = true;
                            }
                        }
                    }
                    r6 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return r10 - charCount;
    }

    public boolean c(int r22) {
        return this.f4550a.isCodePointEmoji(r22);
    }

    public boolean d(int r22) {
        return this.f4550a.isCodePointEmojiModifier(r22);
    }

    public boolean e(int r22) {
        return this.f4550a.isCodePointEmojiModifierBase(r22);
    }

    public boolean f(int r22) {
        return (48 <= r22 && r22 <= 57) || r22 == 35 || r22 == 42;
    }

    public boolean g(int r22) {
        return this.f4550a.isCodePointRegionalIndicator(r22);
    }

    public boolean h(int r22) {
        return 917536 <= r22 && r22 <= 917630;
    }

    public boolean i(int r22) {
        return this.f4550a.isCodePointVariantSelector(r22);
    }
}
