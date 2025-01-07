package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import l3.q;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, int r4, int r5, float f5, int r7) {
        super(r4, r5, f5, r7);
        Set<ActivityFilter> t4;
        i.d(set, "filters");
        i.d(intent, "placeholderIntent");
        this.placeholderIntent = intent;
        t4 = q.t(set);
        this.filters = t4;
    }

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int r12, int r13, float f5, int r15, int r16, kotlin.jvm.internal.e eVar) {
        this(set, intent, (r16 & 4) != 0 ? 0 : r12, (r16 & 8) != 0 ? 0 : r13, (r16 & 16) != 0 ? 0.5f : f5, (r16 & 32) != 0 ? 3 : r15);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return i.a(this.filters, splitPlaceholderRule.filters) && i.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        Set t4;
        i.d(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        t4 = q.t(linkedHashSet);
        return new SplitPlaceholderRule(t4, this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
