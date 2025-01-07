package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes40.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = USE_RESOLUTION;
    private int mMargin = 0;
    boolean resolved = false;

    public Barrier() {
    }

    public Barrier(String debugName) {
        setDebugName(debugName);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return USE_RESOLUTION;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public void setBarrierType(int barrierType) {
        this.mBarrierType = barrierType;
    }

    public void setAllowsGoneWidget(boolean allowsGoneWidget) {
        this.mAllowsGoneWidget = allowsGoneWidget;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.resolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.resolved;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget src, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(src, map);
        Barrier srcBarrier = (Barrier) src;
        this.mBarrierType = srcBarrier.mBarrierType;
        this.mAllowsGoneWidget = srcBarrier.mAllowsGoneWidget;
        this.mMargin = srcBarrier.mMargin;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String debug = "[Barrier] " + getDebugName() + " {";
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget widget = this.mWidgets[i];
            if (i > 0) {
                debug = debug + ", ";
            }
            debug = debug + widget.getDebugName();
        }
        return debug + "}";
    }

    protected void markWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget widget = this.mWidgets[i];
            if (this.mAllowsGoneWidget || widget.allowedInBarrier()) {
                int r2 = this.mBarrierType;
                if (r2 == 0 || r2 == 1) {
                    widget.setInBarrier(0, USE_RESOLUTION);
                } else if (r2 == 2 || r2 == 3) {
                    widget.setInBarrier(1, USE_RESOLUTION);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem system, boolean optimize) {
        int r10;
        this.mListAnchors[0] = this.mLeft;
        this.mListAnchors[2] = this.mTop;
        this.mListAnchors[1] = this.mRight;
        this.mListAnchors[3] = this.mBottom;
        for (int i = 0; i < this.mListAnchors.length; i++) {
            this.mListAnchors[i].mSolverVariable = system.createObjectVariable(this.mListAnchors[i]);
        }
        int i2 = this.mBarrierType;
        if (i2 >= 0 && i2 < 4) {
            ConstraintAnchor position = this.mListAnchors[this.mBarrierType];
            if (!this.resolved) {
                allSolved();
            }
            if (this.resolved) {
                this.resolved = false;
                int r3 = this.mBarrierType;
                if (r3 == 0 || r3 == 1) {
                    system.addEquality(this.mLeft.mSolverVariable, this.mX);
                    system.addEquality(this.mRight.mSolverVariable, this.mX);
                    return;
                } else {
                    if (r3 == 2 || r3 == 3) {
                        system.addEquality(this.mTop.mSolverVariable, this.mY);
                        system.addEquality(this.mBottom.mSolverVariable, this.mY);
                        return;
                    }
                    return;
                }
            }
            boolean hasMatchConstraintWidgets = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.mWidgetsCount) {
                    break;
                }
                ConstraintWidget widget = this.mWidgets[i3];
                if (this.mAllowsGoneWidget || widget.allowedInBarrier()) {
                    int r102 = this.mBarrierType;
                    if ((r102 == 0 || r102 == 1) && widget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widget.mLeft.mTarget != null && widget.mRight.mTarget != null) {
                        hasMatchConstraintWidgets = USE_RESOLUTION;
                        break;
                    }
                    int r103 = this.mBarrierType;
                    if ((r103 == 2 || r103 == 3) && widget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widget.mTop.mTarget != null && widget.mBottom.mTarget != null) {
                        hasMatchConstraintWidgets = USE_RESOLUTION;
                        break;
                    }
                }
                i3++;
            }
            boolean mHasHorizontalCenteredDependents = (this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents()) ? USE_RESOLUTION : false;
            boolean mHasVerticalCenteredDependents = (this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents()) ? USE_RESOLUTION : false;
            boolean applyEqualityOnReferences = (hasMatchConstraintWidgets || !(((r10 = this.mBarrierType) == 0 && mHasHorizontalCenteredDependents) || ((r10 == 2 && mHasVerticalCenteredDependents) || ((r10 == 1 && mHasHorizontalCenteredDependents) || (r10 == 3 && mHasVerticalCenteredDependents))))) ? false : USE_RESOLUTION;
            int equalityOnReferencesStrength = 5;
            if (!applyEqualityOnReferences) {
                equalityOnReferencesStrength = 4;
            }
            for (int i4 = 0; i4 < this.mWidgetsCount; i4++) {
                ConstraintWidget widget2 = this.mWidgets[i4];
                if (this.mAllowsGoneWidget || widget2.allowedInBarrier()) {
                    SolverVariable target = system.createObjectVariable(widget2.mListAnchors[this.mBarrierType]);
                    widget2.mListAnchors[this.mBarrierType].mSolverVariable = target;
                    int margin = 0;
                    if (widget2.mListAnchors[this.mBarrierType].mTarget != null && widget2.mListAnchors[this.mBarrierType].mTarget.mOwner == this) {
                        margin = 0 + widget2.mListAnchors[this.mBarrierType].mMargin;
                    }
                    int r6 = this.mBarrierType;
                    if (r6 == 0 || r6 == 2) {
                        system.addLowerBarrier(position.mSolverVariable, target, this.mMargin - margin, hasMatchConstraintWidgets);
                    } else {
                        system.addGreaterBarrier(position.mSolverVariable, target, this.mMargin + margin, hasMatchConstraintWidgets);
                    }
                    system.addEquality(position.mSolverVariable, target, this.mMargin + margin, equalityOnReferencesStrength);
                }
            }
            int r12 = this.mBarrierType;
            if (r12 == 0) {
                system.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
                system.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
                system.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 0);
                return;
            }
            if (r12 == 1) {
                system.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
                system.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
                system.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 0);
            } else if (r12 == 2) {
                system.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
                system.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
                system.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 0);
            } else if (r12 == 3) {
                system.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
                system.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
                system.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 0);
            }
        }
    }

    public void setMargin(int margin) {
        this.mMargin = margin;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        switch (this.mBarrierType) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            default:
                return -1;
        }
    }

    public boolean allSolved() {
        boolean hasAllWidgetsResolved = USE_RESOLUTION;
        for (int i = 0; i < this.mWidgetsCount; i++) {
            ConstraintWidget widget = this.mWidgets[i];
            if (this.mAllowsGoneWidget || widget.allowedInBarrier()) {
                int r6 = this.mBarrierType;
                if ((r6 == 0 || r6 == 1) && !widget.isResolvedHorizontally()) {
                    hasAllWidgetsResolved = false;
                } else {
                    int r5 = this.mBarrierType;
                    if ((r5 == 2 || r5 == 3) && !widget.isResolvedVertically()) {
                        hasAllWidgetsResolved = false;
                    }
                }
            }
        }
        if (hasAllWidgetsResolved && this.mWidgetsCount > 0) {
            int barrierPosition = 0;
            boolean initialized = false;
            for (int i2 = 0; i2 < this.mWidgetsCount; i2++) {
                ConstraintWidget widget2 = this.mWidgets[i2];
                if (this.mAllowsGoneWidget || widget2.allowedInBarrier()) {
                    if (!initialized) {
                        int r8 = this.mBarrierType;
                        if (r8 == 0) {
                            barrierPosition = widget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                        } else if (r8 == 1) {
                            barrierPosition = widget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                        } else if (r8 == 2) {
                            barrierPosition = widget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                        } else if (r8 == 3) {
                            barrierPosition = widget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                        }
                        initialized = USE_RESOLUTION;
                    }
                    int r82 = this.mBarrierType;
                    if (r82 == 0) {
                        barrierPosition = Math.min(barrierPosition, widget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                    } else if (r82 == 1) {
                        barrierPosition = Math.max(barrierPosition, widget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                    } else if (r82 == 2) {
                        barrierPosition = Math.min(barrierPosition, widget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                    } else if (r82 == 3) {
                        barrierPosition = Math.max(barrierPosition, widget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                    }
                }
            }
            int barrierPosition2 = barrierPosition + this.mMargin;
            int r3 = this.mBarrierType;
            if (r3 == 0 || r3 == 1) {
                setFinalHorizontal(barrierPosition2, barrierPosition2);
            } else {
                setFinalVertical(barrierPosition2, barrierPosition2);
            }
            this.resolved = USE_RESOLUTION;
            return USE_RESOLUTION;
        }
        return false;
    }
}
