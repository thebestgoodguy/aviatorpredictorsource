package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes40.dex */
public class HorizontalChainReference extends ChainReference {
    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ConstraintReference first = null;
        ConstraintReference previous = null;
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            this.mState.constraints(key).clearHorizontal();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        while (it2.hasNext()) {
            Object key2 = it2.next();
            ConstraintReference reference = this.mState.constraints(key2);
            if (first == null) {
                first = reference;
                if (this.mStartToStart != null) {
                    first.startToStart(this.mStartToStart).margin(this.mMarginStart);
                } else if (this.mStartToEnd != null) {
                    first.startToEnd(this.mStartToEnd).margin(this.mMarginStart);
                } else {
                    first.startToStart(State.PARENT);
                }
            }
            if (previous != null) {
                previous.endToStart(reference.getKey());
                reference.startToEnd(previous.getKey());
            }
            previous = reference;
        }
        if (previous != null) {
            if (this.mEndToStart != null) {
                previous.endToStart(this.mEndToStart).margin(this.mMarginEnd);
            } else if (this.mEndToEnd != null) {
                previous.endToEnd(this.mEndToEnd).margin(this.mMarginEnd);
            } else {
                previous.endToEnd(State.PARENT);
            }
        }
        if (first == null) {
        }
        if (this.mBias != 0.5f) {
            first.horizontalBias(this.mBias);
        }
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()]) {
            case 1:
                first.setHorizontalChainStyle(0);
                break;
            case 2:
                first.setHorizontalChainStyle(1);
                break;
            case 3:
                first.setHorizontalChainStyle(2);
                break;
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] r0 = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = r0;
            try {
                r0[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }
}
