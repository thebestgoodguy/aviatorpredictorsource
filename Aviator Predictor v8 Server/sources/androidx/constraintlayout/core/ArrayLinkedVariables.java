package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* loaded from: classes40.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    static final int NONE = -1;
    private static float epsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    int currentSize = 0;
    private int ROW_SIZE = 8;
    private SolverVariable candidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable variable, float value) {
        if (value == 0.0f) {
            remove(variable, true);
            return;
        }
        if (this.mHead == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = value;
            this.mArrayIndices[0] = variable.id;
            this.mArrayNextIndices[this.mHead] = -1;
            variable.usageInRowCount++;
            variable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                int r1 = this.mLast + 1;
                this.mLast = r1;
                int[] r2 = this.mArrayIndices;
                if (r1 >= r2.length) {
                    this.mDidFillOnce = true;
                    this.mLast = r2.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int current = this.mHead;
        int previous = -1;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (this.mArrayIndices[current] == variable.id) {
                this.mArrayValues[current] = value;
                return;
            }
            if (this.mArrayIndices[current] < variable.id) {
                previous = current;
            }
            current = this.mArrayNextIndices[current];
        }
        int r6 = this.mLast;
        int availableIndice = r6 + 1;
        if (this.mDidFillOnce) {
            int[] r8 = this.mArrayIndices;
            if (r8[r6] == -1) {
                availableIndice = this.mLast;
            } else {
                availableIndice = r8.length;
            }
        }
        int[] r62 = this.mArrayIndices;
        if (availableIndice >= r62.length && this.currentSize < r62.length) {
            int i = 0;
            while (true) {
                int[] r82 = this.mArrayIndices;
                if (i >= r82.length) {
                    break;
                }
                if (r82[i] != -1) {
                    i++;
                } else {
                    availableIndice = i;
                    break;
                }
            }
        }
        int[] r63 = this.mArrayIndices;
        if (availableIndice >= r63.length) {
            availableIndice = r63.length;
            int r64 = this.ROW_SIZE * 2;
            this.ROW_SIZE = r64;
            this.mDidFillOnce = false;
            this.mLast = availableIndice - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, r64);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[availableIndice] = variable.id;
        this.mArrayValues[availableIndice] = value;
        if (previous != -1) {
            int[] r22 = this.mArrayNextIndices;
            r22[availableIndice] = r22[previous];
            r22[previous] = availableIndice;
        } else {
            this.mArrayNextIndices[availableIndice] = this.mHead;
            this.mHead = availableIndice;
        }
        variable.usageInRowCount++;
        variable.addToRow(this.mRow);
        int r23 = this.currentSize + 1;
        this.currentSize = r23;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] r3 = this.mArrayIndices;
        if (r23 >= r3.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= r3.length) {
            this.mDidFillOnce = true;
            this.mLast = r3.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable variable, float value, boolean removeFromDefinition) {
        float f = epsilon;
        if (value > (-f) && value < f) {
            return;
        }
        if (this.mHead == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = value;
            this.mArrayIndices[0] = variable.id;
            this.mArrayNextIndices[this.mHead] = -1;
            variable.usageInRowCount++;
            variable.addToRow(this.mRow);
            this.currentSize++;
            if (!this.mDidFillOnce) {
                int r0 = this.mLast + 1;
                this.mLast = r0;
                int[] r1 = this.mArrayIndices;
                if (r0 >= r1.length) {
                    this.mDidFillOnce = true;
                    this.mLast = r1.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int current = this.mHead;
        int previous = -1;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            int idx = this.mArrayIndices[current];
            if (idx == variable.id) {
                float[] fArr = this.mArrayValues;
                float v = fArr[current] + value;
                float f2 = epsilon;
                if (v > (-f2) && v < f2) {
                    v = 0.0f;
                }
                fArr[current] = v;
                if (v == 0.0f) {
                    if (current == this.mHead) {
                        this.mHead = this.mArrayNextIndices[current];
                    } else {
                        int[] r12 = this.mArrayNextIndices;
                        r12[previous] = r12[current];
                    }
                    if (removeFromDefinition) {
                        variable.removeFromRow(this.mRow);
                    }
                    if (this.mDidFillOnce) {
                        this.mLast = current;
                    }
                    variable.usageInRowCount--;
                    this.currentSize--;
                    return;
                }
                return;
            }
            if (this.mArrayIndices[current] < variable.id) {
                previous = current;
            }
            current = this.mArrayNextIndices[current];
        }
        int r6 = this.mLast;
        int availableIndice = r6 + 1;
        if (this.mDidFillOnce) {
            int[] r8 = this.mArrayIndices;
            if (r8[r6] == -1) {
                availableIndice = this.mLast;
            } else {
                availableIndice = r8.length;
            }
        }
        int[] r62 = this.mArrayIndices;
        if (availableIndice >= r62.length && this.currentSize < r62.length) {
            int i = 0;
            while (true) {
                int[] r82 = this.mArrayIndices;
                if (i >= r82.length) {
                    break;
                }
                if (r82[i] != -1) {
                    i++;
                } else {
                    availableIndice = i;
                    break;
                }
            }
        }
        int[] r63 = this.mArrayIndices;
        if (availableIndice >= r63.length) {
            availableIndice = r63.length;
            int r64 = this.ROW_SIZE * 2;
            this.ROW_SIZE = r64;
            this.mDidFillOnce = false;
            this.mLast = availableIndice - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, r64);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }
        this.mArrayIndices[availableIndice] = variable.id;
        this.mArrayValues[availableIndice] = value;
        if (previous != -1) {
            int[] r13 = this.mArrayNextIndices;
            r13[availableIndice] = r13[previous];
            r13[previous] = availableIndice;
        } else {
            this.mArrayNextIndices[availableIndice] = this.mHead;
            this.mHead = availableIndice;
        }
        variable.usageInRowCount++;
        variable.addToRow(this.mRow);
        this.currentSize++;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int r14 = this.mLast;
        int[] r2 = this.mArrayIndices;
        if (r14 >= r2.length) {
            this.mDidFillOnce = true;
            this.mLast = r2.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow definition, boolean removeFromDefinition) {
        float value = get(definition.variable);
        remove(definition.variable, removeFromDefinition);
        ArrayRow.ArrayRowVariables definitionVariables = definition.variables;
        int definitionSize = definitionVariables.getCurrentSize();
        for (int i = 0; i < definitionSize; i++) {
            SolverVariable definitionVariable = definitionVariables.getVariable(i);
            float definitionValue = definitionVariables.get(definitionVariable);
            add(definitionVariable, definitionValue * value, removeFromDefinition);
        }
        return value;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable variable, boolean removeFromDefinition) {
        if (this.candidate == variable) {
            this.candidate = null;
        }
        if (this.mHead == -1) {
            return 0.0f;
        }
        int current = this.mHead;
        int previous = -1;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            int idx = this.mArrayIndices[current];
            if (idx == variable.id) {
                if (current == this.mHead) {
                    this.mHead = this.mArrayNextIndices[current];
                } else {
                    int[] r1 = this.mArrayNextIndices;
                    r1[previous] = r1[current];
                }
                if (removeFromDefinition) {
                    variable.removeFromRow(this.mRow);
                }
                variable.usageInRowCount--;
                this.currentSize--;
                this.mArrayIndices[current] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = current;
                }
                return this.mArrayValues[current];
            }
            previous = current;
            current = this.mArrayNextIndices[current];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            SolverVariable variable = this.mCache.mIndexedVariables[this.mArrayIndices[current]];
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
            current = this.mArrayNextIndices[current];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable variable) {
        if (this.mHead == -1) {
            return false;
        }
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (this.mArrayIndices[current] == variable.id) {
                return true;
            }
            current = this.mArrayNextIndices[current];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable variable) {
        if (this.mHead == -1) {
            return -1;
        }
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (this.mArrayIndices[current] == variable.id) {
                return current;
            }
            current = this.mArrayNextIndices[current];
        }
        return -1;
    }

    boolean hasAtLeastOnePositiveVariable() {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (this.mArrayValues[current] > 0.0f) {
                return true;
            }
            current = this.mArrayNextIndices[current];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            float[] fArr = this.mArrayValues;
            fArr[current] = fArr[current] * (-1.0f);
            current = this.mArrayNextIndices[current];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float amount) {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            float[] fArr = this.mArrayValues;
            fArr[current] = fArr[current] / amount;
            current = this.mArrayNextIndices[current];
        }
    }

    public int getHead() {
        return this.mHead;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.currentSize;
    }

    public final int getId(int index) {
        return this.mArrayIndices[index];
    }

    public final float getValue(int index) {
        return this.mArrayValues[index];
    }

    public final int getNextIndice(int index) {
        return this.mArrayNextIndices[index];
    }

    SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.candidate;
        if (solverVariable == null) {
            int current = this.mHead;
            SolverVariable pivot = null;
            for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
                if (this.mArrayValues[current] < 0.0f) {
                    SolverVariable v = this.mCache.mIndexedVariables[this.mArrayIndices[current]];
                    if (pivot == null || pivot.strength < v.strength) {
                        pivot = v;
                    }
                }
                current = this.mArrayNextIndices[current];
            }
            return pivot;
        }
        return solverVariable;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int index) {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (counter == index) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[current]];
            }
            current = this.mArrayNextIndices[current];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int index) {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (counter == index) {
                return this.mArrayValues[current];
            }
            current = this.mArrayNextIndices[current];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable v) {
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            if (this.mArrayIndices[current] == v.id) {
                return this.mArrayValues[current];
            }
            current = this.mArrayNextIndices[current];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        int size = 0 + (this.mArrayIndices.length * 4 * 3);
        return size + 36;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int count = this.currentSize;
        System.out.print("{ ");
        for (int i = 0; i < count; i++) {
            SolverVariable v = getVariable(i);
            if (v != null) {
                System.out.print(v + " = " + getVariableValue(i) + " ");
            }
        }
        System.out.println(" }");
    }

    public String toString() {
        String result = "";
        int current = this.mHead;
        for (int counter = 0; current != -1 && counter < this.currentSize; counter++) {
            result = ((result + " -> ") + this.mArrayValues[current] + " : ") + this.mCache.mIndexedVariables[this.mArrayIndices[current]];
            current = this.mArrayNextIndices[current];
        }
        return result;
    }
}
