package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes40.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomAttribute[] values = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void clear() {
            Arrays.fill(this.keys, EMPTY);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(valueAt(i));
                printStream.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void append(int position, CustomAttribute value) {
            if (this.values[position] != null) {
                remove(position);
            }
            this.values[position] = value;
            int[] r0 = this.keys;
            int r1 = this.count;
            this.count = r1 + 1;
            r0[r1] = position;
            Arrays.sort(r0);
        }

        public void remove(int position) {
            this.values[position] = null;
            int j = 0;
            int i = 0;
            while (true) {
                int r2 = this.count;
                if (i < r2) {
                    int[] r22 = this.keys;
                    if (position == r22[i]) {
                        r22[i] = EMPTY;
                        j++;
                    }
                    if (i != j) {
                        r22[i] = r22[j];
                    }
                    j++;
                    i++;
                } else {
                    this.count = r2 - 1;
                    return;
                }
            }
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomVariable[] values = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void clear() {
            Arrays.fill(this.keys, EMPTY);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(valueAt(i));
                printStream.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void append(int position, CustomVariable value) {
            if (this.values[position] != null) {
                remove(position);
            }
            this.values[position] = value;
            int[] r0 = this.keys;
            int r1 = this.count;
            this.count = r1 + 1;
            r0[r1] = position;
            Arrays.sort(r0);
        }

        public void remove(int position) {
            this.values[position] = null;
            int j = 0;
            int i = 0;
            while (true) {
                int r2 = this.count;
                if (i < r2) {
                    int[] r22 = this.keys;
                    if (position == r22[i]) {
                        r22[i] = EMPTY;
                        j++;
                    }
                    if (i != j) {
                        r22[i] = r22[j];
                    }
                    j++;
                    i++;
                } else {
                    this.count = r2 - 1;
                    return;
                }
            }
        }
    }

    static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        float[][] values = new float[101][];

        public FloatArray() {
            clear();
        }

        public void clear() {
            Arrays.fill(this.keys, EMPTY);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            int i = 0;
            while (i < this.count) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i)));
                printStream.print(sb.toString());
                i++;
            }
            System.out.println("]");
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void append(int position, float[] value) {
            if (this.values[position] != null) {
                remove(position);
            }
            this.values[position] = value;
            int[] r0 = this.keys;
            int r1 = this.count;
            this.count = r1 + 1;
            r0[r1] = position;
            Arrays.sort(r0);
        }

        public void remove(int position) {
            this.values[position] = null;
            int j = 0;
            int i = 0;
            while (true) {
                int r2 = this.count;
                if (i < r2) {
                    int[] r22 = this.keys;
                    if (position == r22[i]) {
                        r22[i] = EMPTY;
                        j++;
                    }
                    if (i != j) {
                        r22[i] = r22[j];
                    }
                    j++;
                    i++;
                } else {
                    this.count = r2 - 1;
                    return;
                }
            }
        }
    }
}
