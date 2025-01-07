package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.Locale;
import q2.n;
import r2.j;

/* loaded from: classes.dex */
public class d implements n.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    private final n f4579a;

    /* renamed from: b, reason: collision with root package name */
    private final TextServicesManager f4580b;

    /* renamed from: c, reason: collision with root package name */
    private SpellCheckerSession f4581c;

    /* renamed from: d, reason: collision with root package name */
    j.d f4582d;

    public d(TextServicesManager textServicesManager, n nVar) {
        this.f4580b = textServicesManager;
        this.f4579a = nVar;
        nVar.b(this);
    }

    @Override // q2.n.b
    public void a(String str, String str2, j.d dVar) {
        if (this.f4582d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.f4582d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f4579a.b(null);
        SpellCheckerSession spellCheckerSession = this.f4581c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        str.split("-");
        Locale b5 = s2.a.b(str);
        if (this.f4581c == null) {
            this.f4581c = this.f4580b.newSpellCheckerSession(null, b5, this, true);
        }
        this.f4581c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        j.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f4582d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int r32 = 0; r32 < sentenceSuggestionsInfo.getSuggestionsCount(); r32++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(r32);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(r32);
                    int lengthAt = (sentenceSuggestionsInfo.getLengthAt(r32) + offsetAt) - 1;
                    String str = ("" + String.valueOf(offsetAt) + ".") + String.valueOf(lengthAt) + ".";
                    for (int r7 = 0; r7 < suggestionsCount; r7++) {
                        str = str + suggestionsInfoAt.getSuggestionAt(r7) + "\n";
                    }
                    arrayList.add(str.substring(0, str.length() - 1));
                }
            }
            dVar = this.f4582d;
        }
        dVar.a(arrayList);
        this.f4582d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
