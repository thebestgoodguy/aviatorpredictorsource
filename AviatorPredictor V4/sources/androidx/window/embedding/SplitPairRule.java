package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import l3.q;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, boolean z4, boolean z5, boolean z6, int r6, int r7, float f5, int r9) {
        super(r6, r7, f5, r9);
        Set<SplitPairFilter> t4;
        i.d(set, "filters");
        this.finishPrimaryWithSecondary = z4;
        this.finishSecondaryWithPrimary = z5;
        this.clearTop = z6;
        t4 = q.t(set);
        this.filters = t4;
    }

    public /* synthetic */ SplitPairRule(Set set, boolean z4, boolean z5, boolean z6, int r12, int r13, float f5, int r15, int r16, kotlin.jvm.internal.e eVar) {
        this(set, (r16 & 2) != 0 ? false : z4, (r16 & 4) != 0 ? true : z5, (r16 & 8) != 0 ? false : z6, (r16 & 16) != 0 ? 0 : r12, (r16 & 32) == 0 ? r13 : 0, (r16 & 64) != 0 ? 0.5f : f5, (r16 & 128) != 0 ? 3 : r15);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return i.a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + a.a(this.finishPrimaryWithSecondary)) * 31) + a.a(this.finishSecondaryWithPrimary)) * 31) + a.a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter splitPairFilter) {
        Set t4;
        i.d(splitPairFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        t4 = q.t(linkedHashSet);
        return new SplitPairRule(t4, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
