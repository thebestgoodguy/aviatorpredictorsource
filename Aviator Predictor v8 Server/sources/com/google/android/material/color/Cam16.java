package com.google.android.material.color;

/* loaded from: classes37.dex */
final class Cam16 {
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;
    private final float j;
    private final float jstar;
    private final float m;
    private final float q;
    private final float s;
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    float distance(Cam16 other) {
        float dJ = getJStar() - other.getJStar();
        float dA = getAStar() - other.getAStar();
        float dB = getBStar() - other.getBStar();
        double dEPrime = Math.sqrt((dJ * dJ) + (dA * dA) + (dB * dB));
        double dE = Math.pow(dEPrime, 0.63d) * 1.41d;
        return (float) dE;
    }

    public float getHue() {
        return this.hue;
    }

    public float getChroma() {
        return this.chroma;
    }

    public float getJ() {
        return this.j;
    }

    public float getQ() {
        return this.q;
    }

    public float getM() {
        return this.m;
    }

    public float getS() {
        return this.s;
    }

    public float getJStar() {
        return this.jstar;
    }

    public float getAStar() {
        return this.astar;
    }

    public float getBStar() {
        return this.bstar;
    }

    private Cam16(float hue, float chroma, float j, float q, float m, float s, float jstar, float astar, float bstar) {
        this.hue = hue;
        this.chroma = chroma;
        this.j = j;
        this.q = q;
        this.m = m;
        this.s = s;
        this.jstar = jstar;
        this.astar = astar;
        this.bstar = bstar;
    }

    public static Cam16 fromInt(int argb) {
        return fromIntInViewingConditions(argb, ViewingConditions.DEFAULT);
    }

    static Cam16 fromIntInViewingConditions(int argb, ViewingConditions viewingConditions) {
        float f;
        int red = (16711680 & argb) >> 16;
        int green = (65280 & argb) >> 8;
        int blue = argb & 255;
        float redL = ColorUtils.linearized(red / 255.0f) * 100.0f;
        float greenL = ColorUtils.linearized(green / 255.0f) * 100.0f;
        float blueL = ColorUtils.linearized(blue / 255.0f) * 100.0f;
        float x = (0.41233894f * redL) + (0.35762063f * greenL) + (0.18051042f * blueL);
        float y = (0.2126f * redL) + (0.7152f * greenL) + (0.0722f * blueL);
        float z = (0.01932141f * redL) + (0.11916382f * greenL) + (0.9503448f * blueL);
        float[][] matrix = XYZ_TO_CAM16RGB;
        float rT = (matrix[0][0] * x) + (matrix[0][1] * y) + (matrix[0][2] * z);
        float gT = (matrix[1][0] * x) + (matrix[1][1] * y) + (matrix[1][2] * z);
        float bT = (matrix[2][0] * x) + (matrix[2][1] * y) + (matrix[2][2] * z);
        float rD = viewingConditions.getRgbD()[0] * rT;
        float gD = viewingConditions.getRgbD()[1] * gT;
        float bD = viewingConditions.getRgbD()[2] * bT;
        double fl = viewingConditions.getFl() * Math.abs(rD);
        Double.isNaN(fl);
        float rAF = (float) Math.pow(fl / 100.0d, 0.42d);
        double fl2 = viewingConditions.getFl() * Math.abs(gD);
        Double.isNaN(fl2);
        float gAF = (float) Math.pow(fl2 / 100.0d, 0.42d);
        double fl3 = viewingConditions.getFl() * Math.abs(bD);
        Double.isNaN(fl3);
        float bAF = (float) Math.pow(fl3 / 100.0d, 0.42d);
        float rA = ((Math.signum(rD) * 400.0f) * rAF) / (rAF + 27.13f);
        float gA = ((Math.signum(gD) * 400.0f) * gAF) / (gAF + 27.13f);
        float bA = ((Math.signum(bD) * 400.0f) * bAF) / (27.13f + bAF);
        double d = rA;
        Double.isNaN(d);
        double d2 = gA;
        Double.isNaN(d2);
        double d3 = (d * 11.0d) + (d2 * (-12.0d));
        double d4 = bA;
        Double.isNaN(d4);
        float a = ((float) (d3 + d4)) / 11.0f;
        double d5 = rA + gA;
        double d6 = bA;
        Double.isNaN(d6);
        Double.isNaN(d5);
        float b = ((float) (d5 - (d6 * 2.0d))) / 9.0f;
        float u = (((rA * 20.0f) + (gA * 20.0f)) + (21.0f * bA)) / 20.0f;
        float p2 = (((40.0f * rA) + (gA * 20.0f)) + bA) / 20.0f;
        float atan2 = (float) Math.atan2(b, a);
        float atanDegrees = (atan2 * 180.0f) / 3.1415927f;
        if (atanDegrees >= 0.0f) {
            f = atanDegrees >= 360.0f ? atanDegrees - 360.0f : atanDegrees;
        } else {
            f = atanDegrees + 360.0f;
        }
        float hue = f;
        float hueRadians = (hue * 3.1415927f) / 180.0f;
        float ac = viewingConditions.getNbb() * p2;
        float p22 = ac / viewingConditions.getAw();
        float j = ((float) Math.pow(p22, viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float q = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(j / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float huePrime = ((double) hue) < 20.14d ? hue + 360.0f : hue;
        float eHue = ((float) (Math.cos(Math.toRadians(huePrime) + 2.0d) + 3.8d)) * 0.25f;
        float p1 = 3846.1538f * eHue * viewingConditions.getNc() * viewingConditions.getNcb();
        float t = (((float) Math.hypot(a, b)) * p1) / (0.305f + u);
        float alpha = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow(t, 0.9d));
        double d7 = j;
        Double.isNaN(d7);
        float c = ((float) Math.sqrt(d7 / 100.0d)) * alpha;
        float m = viewingConditions.getFlRoot() * c;
        float s = ((float) Math.sqrt((viewingConditions.getC() * alpha) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float jstar = (1.7f * j) / ((0.007f * j) + 1.0f);
        float mstar = ((float) Math.log1p(m * 0.0228f)) * 43.85965f;
        float astar = ((float) Math.cos(hueRadians)) * mstar;
        float bstar = ((float) Math.sin(hueRadians)) * mstar;
        return new Cam16(hue, c, j, q, m, s, jstar, astar, bstar);
    }

    static Cam16 fromJch(float j, float c, float h) {
        return fromJchInViewingConditions(j, c, h, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(float j, float c, float h, ViewingConditions viewingConditions) {
        float c2 = 4.0f / viewingConditions.getC();
        double d = j;
        Double.isNaN(d);
        float q = c2 * ((float) Math.sqrt(d / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float m = c * viewingConditions.getFlRoot();
        double d2 = j;
        Double.isNaN(d2);
        float alpha = c / ((float) Math.sqrt(d2 / 100.0d));
        float s = ((float) Math.sqrt((viewingConditions.getC() * alpha) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float hueRadians = (3.1415927f * h) / 180.0f;
        float jstar = (1.7f * j) / ((0.007f * j) + 1.0f);
        double d3 = m;
        Double.isNaN(d3);
        float mstar = ((float) Math.log1p(d3 * 0.0228d)) * 43.85965f;
        float astar = mstar * ((float) Math.cos(hueRadians));
        float bstar = mstar * ((float) Math.sin(hueRadians));
        return new Cam16(h, c, j, q, m, s, jstar, astar, bstar);
    }

    public static Cam16 fromUcs(float jstar, float astar, float bstar) {
        return fromUcsInViewingConditions(jstar, astar, bstar, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(float jstar, float astar, float bstar, ViewingConditions viewingConditions) {
        double m = Math.hypot(astar, bstar);
        double m2 = Math.expm1(m * 0.02280000038444996d) / 0.02280000038444996d;
        double flRoot = viewingConditions.getFlRoot();
        Double.isNaN(flRoot);
        double c = m2 / flRoot;
        double h = Math.atan2(bstar, astar) * 57.29577951308232d;
        if (h < 0.0d) {
            h += 360.0d;
        }
        float j = jstar / (1.0f - ((jstar - 100.0f) * 0.007f));
        return fromJchInViewingConditions(j, (float) c, (float) h, viewingConditions);
    }

    public int getInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    int viewed(ViewingConditions viewingConditions) {
        float alpha;
        if (getChroma() == 0.0d || getJ() == 0.0d) {
            alpha = 0.0f;
        } else {
            float chroma = getChroma();
            double j = getJ();
            Double.isNaN(j);
            alpha = chroma / ((float) Math.sqrt(j / 100.0d));
        }
        double d = alpha;
        double pow = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        Double.isNaN(d);
        float t = (float) Math.pow(d / pow, 1.1111111111111112d);
        float hRad = (getHue() * 3.1415927f) / 180.0f;
        double d2 = hRad;
        Double.isNaN(d2);
        float eHue = ((float) (Math.cos(d2 + 2.0d) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw();
        double j2 = getJ();
        Double.isNaN(j2);
        double c = viewingConditions.getC();
        Double.isNaN(c);
        double d3 = 1.0d / c;
        double z = viewingConditions.getZ();
        Double.isNaN(z);
        float ac = aw * ((float) Math.pow(j2 / 100.0d, d3 / z));
        float p1 = 3846.1538f * eHue * viewingConditions.getNc() * viewingConditions.getNcb();
        float p2 = ac / viewingConditions.getNbb();
        float hSin = (float) Math.sin(hRad);
        float hCos = (float) Math.cos(hRad);
        float gamma = (((0.305f + p2) * 23.0f) * t) / (((23.0f * p1) + ((11.0f * t) * hCos)) + ((108.0f * t) * hSin));
        float a = gamma * hCos;
        float b = gamma * hSin;
        float rA = (((p2 * 460.0f) + (451.0f * a)) + (288.0f * b)) / 1403.0f;
        float gA = (((p2 * 460.0f) - (891.0f * a)) - (261.0f * b)) / 1403.0f;
        float bA = (((460.0f * p2) - (220.0f * a)) - (6300.0f * b)) / 1403.0f;
        double abs = Math.abs(rA);
        Double.isNaN(abs);
        float alpha2 = Math.abs(rA);
        double d4 = alpha2;
        Double.isNaN(d4);
        float rCBase = (float) Math.max(0.0d, (abs * 27.13d) / (400.0d - d4));
        float rC = Math.signum(rA) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow(rCBase, 2.380952380952381d));
        double abs2 = Math.abs(gA);
        Double.isNaN(abs2);
        double abs3 = Math.abs(gA);
        Double.isNaN(abs3);
        float gCBase = (float) Math.max(0.0d, (abs2 * 27.13d) / (400.0d - abs3));
        float gC = Math.signum(gA) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow(gCBase, 2.380952380952381d));
        double abs4 = Math.abs(bA);
        Double.isNaN(abs4);
        double abs5 = Math.abs(bA);
        Double.isNaN(abs5);
        float bCBase = (float) Math.max(0.0d, (abs4 * 27.13d) / (400.0d - abs5));
        float bC = Math.signum(bA) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow(bCBase, 2.380952380952381d));
        float rF = rC / viewingConditions.getRgbD()[0];
        float gF = gC / viewingConditions.getRgbD()[1];
        float bF = bC / viewingConditions.getRgbD()[2];
        float[][] matrix = CAM16RGB_TO_XYZ;
        float x = (matrix[0][0] * rF) + (matrix[0][1] * gF) + (matrix[0][2] * bF);
        float y = (matrix[1][0] * rF) + (matrix[1][1] * gF) + (matrix[1][2] * bF);
        float rCBase2 = (matrix[2][0] * rF) + (matrix[2][1] * gF) + (matrix[2][2] * bF);
        return ColorUtils.intFromXyzComponents(x, y, rCBase2);
    }
}
