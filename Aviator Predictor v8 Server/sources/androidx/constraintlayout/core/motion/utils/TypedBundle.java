package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes40.dex */
public class TypedBundle {
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    int[] mTypeInt = new int[10];
    int[] mValueInt = new int[10];
    int mCountInt = 0;
    int[] mTypeFloat = new int[10];
    float[] mValueFloat = new float[10];
    int mCountFloat = 0;
    int[] mTypeString = new int[5];
    String[] mValueString = new String[5];
    int mCountString = 0;
    int[] mTypeBoolean = new int[4];
    boolean[] mValueBoolean = new boolean[4];
    int mCountBoolean = 0;

    public int getInteger(int type) {
        for (int i = 0; i < this.mCountInt; i++) {
            if (this.mTypeInt[i] == type) {
                return this.mValueInt[i];
            }
        }
        return -1;
    }

    public void add(int type, int value) {
        int r0 = this.mCountInt;
        int[] r1 = this.mTypeInt;
        if (r0 >= r1.length) {
            this.mTypeInt = Arrays.copyOf(r1, r1.length * 2);
            int[] r02 = this.mValueInt;
            this.mValueInt = Arrays.copyOf(r02, r02.length * 2);
        }
        int[] r03 = this.mTypeInt;
        int r12 = this.mCountInt;
        r03[r12] = type;
        int[] r04 = this.mValueInt;
        this.mCountInt = r12 + 1;
        r04[r12] = value;
    }

    public void add(int type, float value) {
        int r0 = this.mCountFloat;
        int[] r1 = this.mTypeFloat;
        if (r0 >= r1.length) {
            this.mTypeFloat = Arrays.copyOf(r1, r1.length * 2);
            float[] fArr = this.mValueFloat;
            this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] r02 = this.mTypeFloat;
        int r12 = this.mCountFloat;
        r02[r12] = type;
        float[] fArr2 = this.mValueFloat;
        this.mCountFloat = r12 + 1;
        fArr2[r12] = value;
    }

    public void addIfNotNull(int type, String value) {
        if (value != null) {
            add(type, value);
        }
    }

    public void add(int type, String value) {
        int r0 = this.mCountString;
        int[] r1 = this.mTypeString;
        if (r0 >= r1.length) {
            this.mTypeString = Arrays.copyOf(r1, r1.length * 2);
            String[] strArr = this.mValueString;
            this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] r02 = this.mTypeString;
        int r12 = this.mCountString;
        r02[r12] = type;
        String[] strArr2 = this.mValueString;
        this.mCountString = r12 + 1;
        strArr2[r12] = value;
    }

    public void add(int type, boolean value) {
        int r0 = this.mCountBoolean;
        int[] r1 = this.mTypeBoolean;
        if (r0 >= r1.length) {
            this.mTypeBoolean = Arrays.copyOf(r1, r1.length * 2);
            boolean[] zArr = this.mValueBoolean;
            this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] r02 = this.mTypeBoolean;
        int r12 = this.mCountBoolean;
        r02[r12] = type;
        boolean[] zArr2 = this.mValueBoolean;
        this.mCountBoolean = r12 + 1;
        zArr2[r12] = value;
    }

    public void applyDelta(TypedValues values) {
        for (int i = 0; i < this.mCountInt; i++) {
            values.setValue(this.mTypeInt[i], this.mValueInt[i]);
        }
        for (int i2 = 0; i2 < this.mCountFloat; i2++) {
            values.setValue(this.mTypeFloat[i2], this.mValueFloat[i2]);
        }
        for (int i3 = 0; i3 < this.mCountString; i3++) {
            values.setValue(this.mTypeString[i3], this.mValueString[i3]);
        }
        for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
            values.setValue(this.mTypeBoolean[i4], this.mValueBoolean[i4]);
        }
    }

    public void applyDelta(TypedBundle values) {
        for (int i = 0; i < this.mCountInt; i++) {
            values.add(this.mTypeInt[i], this.mValueInt[i]);
        }
        for (int i2 = 0; i2 < this.mCountFloat; i2++) {
            values.add(this.mTypeFloat[i2], this.mValueFloat[i2]);
        }
        for (int i3 = 0; i3 < this.mCountString; i3++) {
            values.add(this.mTypeString[i3], this.mValueString[i3]);
        }
        for (int i4 = 0; i4 < this.mCountBoolean; i4++) {
            values.add(this.mTypeBoolean[i4], this.mValueBoolean[i4]);
        }
    }

    public void clear() {
        this.mCountBoolean = 0;
        this.mCountString = 0;
        this.mCountFloat = 0;
        this.mCountInt = 0;
    }
}
