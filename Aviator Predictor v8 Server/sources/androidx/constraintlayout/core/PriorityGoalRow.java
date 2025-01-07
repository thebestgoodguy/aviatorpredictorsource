package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes40.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    GoalVariableAccessor accessor;
    private SolverVariable[] arrayGoals;
    Cache mCache;
    private int numGoals;
    private SolverVariable[] sortArray;

    class GoalVariableAccessor {
        PriorityGoalRow row;
        SolverVariable variable;

        public GoalVariableAccessor(PriorityGoalRow row) {
            this.row = row;
        }

        public void init(SolverVariable variable) {
            this.variable = variable;
        }

        public boolean addToGoal(SolverVariable other, float value) {
            if (this.variable.inGoal) {
                boolean empty = true;
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.variable.goalStrengthVector;
                    fArr[i] = fArr[i] + (other.goalStrengthVector[i] * value);
                    if (Math.abs(this.variable.goalStrengthVector[i]) < 1.0E-4f) {
                        this.variable.goalStrengthVector[i] = 0.0f;
                    } else {
                        empty = false;
                    }
                }
                if (empty) {
                    PriorityGoalRow.this.removeGoal(this.variable);
                    return false;
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float strength = other.goalStrengthVector[i2];
                if (strength != 0.0f) {
                    float v = value * strength;
                    if (Math.abs(v) < 1.0E-4f) {
                        v = 0.0f;
                    }
                    this.variable.goalStrengthVector[i2] = v;
                } else {
                    this.variable.goalStrengthVector[i2] = 0.0f;
                }
            }
            return true;
        }

        public void add(SolverVariable other) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i] = fArr[i] + other.goalStrengthVector[i];
                float value = this.variable.goalStrengthVector[i];
                if (Math.abs(value) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i] = 0.0f;
                }
            }
        }

        public final boolean isNegative() {
            for (int i = 8; i >= 0; i--) {
                float value = this.variable.goalStrengthVector[i];
                if (value > 0.0f) {
                    return false;
                }
                if (value < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isSmallerThan(SolverVariable other) {
            for (int i = 8; i >= 0; i--) {
                float comparedValue = other.goalStrengthVector[i];
                float value = this.variable.goalStrengthVector[i];
                if (value != comparedValue) {
                    return value < comparedValue;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i = 0; i < 9; i++) {
                if (this.variable.goalStrengthVector[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public void reset() {
            Arrays.fill(this.variable.goalStrengthVector, 0.0f);
        }

        public String toString() {
            String result = "[ ";
            if (this.variable != null) {
                for (int i = 0; i < 9; i++) {
                    result = result + this.variable.goalStrengthVector[i] + " ";
                }
            }
            return result + "] " + this.variable;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.numGoals = 0;
        this.constantValue = 0.0f;
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.TABLE_SIZE = 128;
        this.arrayGoals = new SolverVariable[128];
        this.sortArray = new SolverVariable[128];
        this.numGoals = 0;
        this.accessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.numGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem system, boolean[] avoid) {
        int pivot = -1;
        for (int i = 0; i < this.numGoals; i++) {
            SolverVariable variable = this.arrayGoals[i];
            if (!avoid[variable.id]) {
                this.accessor.init(variable);
                if (pivot == -1) {
                    if (this.accessor.isNegative()) {
                        pivot = i;
                    }
                } else if (this.accessor.isSmallerThan(this.arrayGoals[pivot])) {
                    pivot = i;
                }
            }
        }
        if (pivot == -1) {
            return null;
        }
        return this.arrayGoals[pivot];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable error) {
        this.accessor.init(error);
        this.accessor.reset();
        error.goalStrengthVector[error.strength] = 1.0f;
        addToGoal(error);
    }

    private final void addToGoal(SolverVariable variable) {
        int r2;
        int r0 = this.numGoals + 1;
        SolverVariable[] solverVariableArr = this.arrayGoals;
        if (r0 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.arrayGoals = solverVariableArr2;
            this.sortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.arrayGoals;
        int r22 = this.numGoals;
        solverVariableArr3[r22] = variable;
        int r23 = r22 + 1;
        this.numGoals = r23;
        if (r23 > 1 && solverVariableArr3[r23 - 1].id > variable.id) {
            int i = 0;
            while (true) {
                r2 = this.numGoals;
                if (i >= r2) {
                    break;
                }
                this.sortArray[i] = this.arrayGoals[i];
                i++;
            }
            Arrays.sort(this.sortArray, 0, r2, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable variable1, SolverVariable variable2) {
                    return variable1.id - variable2.id;
                }
            });
            for (int i2 = 0; i2 < this.numGoals; i2++) {
                this.arrayGoals[i2] = this.sortArray[i2];
            }
        }
        variable.inGoal = true;
        variable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGoal(SolverVariable variable) {
        for (int i = 0; i < this.numGoals; i++) {
            if (this.arrayGoals[i] == variable) {
                int j = i;
                while (true) {
                    int r2 = this.numGoals;
                    if (j < r2 - 1) {
                        SolverVariable[] solverVariableArr = this.arrayGoals;
                        solverVariableArr[j] = solverVariableArr[j + 1];
                        j++;
                    } else {
                        this.numGoals = r2 - 1;
                        variable.inGoal = false;
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem system, ArrayRow definition, boolean removeFromDefinition) {
        SolverVariable goalVariable = definition.variable;
        if (goalVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables rowVariables = definition.variables;
        int currentSize = rowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            SolverVariable solverVariable = rowVariables.getVariable(i);
            float value = rowVariables.getVariableValue(i);
            this.accessor.init(solverVariable);
            if (this.accessor.addToGoal(goalVariable, value)) {
                addToGoal(solverVariable);
            }
            this.constantValue += definition.constantValue * value;
        }
        removeGoal(goalVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String result = " goal -> (" + this.constantValue + ") : ";
        for (int i = 0; i < this.numGoals; i++) {
            SolverVariable v = this.arrayGoals[i];
            this.accessor.init(v);
            result = result + this.accessor + " ";
        }
        return result;
    }
}
