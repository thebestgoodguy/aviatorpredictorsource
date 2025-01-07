package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes40.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    StepCurve(String configString) {
        this.str = configString;
        double[] values = new double[this.str.length() / 2];
        int start = configString.indexOf(40) + 1;
        int off1 = configString.indexOf(44, start);
        int count = 0;
        while (off1 != -1) {
            String tmp = configString.substring(start, off1).trim();
            int count2 = count + 1;
            values[count] = Double.parseDouble(tmp);
            int r4 = off1 + 1;
            start = r4;
            off1 = configString.indexOf(44, r4);
            count = count2;
        }
        int off12 = configString.indexOf(41, start);
        String tmp2 = configString.substring(start, off12).trim();
        values[count] = Double.parseDouble(tmp2);
        this.mCurveFit = genSpline(Arrays.copyOf(values, count + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] sp = str.split("\\s+");
        double[] values = new double[sp.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(sp[i]);
        }
        return genSpline(values);
    }

    private static MonotonicCurveFit genSpline(double[] values) {
        int length = (values.length * 3) - 2;
        int len = values.length - 1;
        double d = len;
        Double.isNaN(d);
        double gap = 1.0d / d;
        double[][] points = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] time = new double[length];
        for (int i = 0; i < values.length; i++) {
            double v = values[i];
            points[i + len][0] = v;
            double d2 = i;
            Double.isNaN(d2);
            time[i + len] = d2 * gap;
            if (i > 0) {
                points[(len * 2) + i][0] = v + 1.0d;
                double d3 = i;
                Double.isNaN(d3);
                time[(len * 2) + i] = (d3 * gap) + 1.0d;
                points[i - 1][0] = (v - 1.0d) - gap;
                Double.isNaN(i);
                time[i - 1] = ((r14 * gap) - 1.0d) - gap;
            }
        }
        MonotonicCurveFit ms = new MonotonicCurveFit(time, points);
        System.out.println(" 0 " + ms.getPos(0.0d, 0));
        System.out.println(" 1 " + ms.getPos(1.0d, 0));
        return ms;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double x) {
        return this.mCurveFit.getSlope(x, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double x) {
        return this.mCurveFit.getPos(x, 0);
    }
}
