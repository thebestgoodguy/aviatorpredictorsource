package androidx.core.os;

import java.util.Locale;

/* loaded from: classes6.dex */
interface LocaleListInterface {
    Locale get(int r1);

    Locale getFirstMatch(String[] strArr);

    Object getLocaleList();

    int indexOf(Locale locale);

    boolean isEmpty();

    int size();

    String toLanguageTags();
}
