package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;

/* loaded from: classes6.dex */
class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    float getHue() {
        return this.mHue;
    }

    float getChroma() {
        return this.mChroma;
    }

    float getJ() {
        return this.mJ;
    }

    float getQ() {
        return this.mQ;
    }

    float getM() {
        return this.mM;
    }

    float getS() {
        return this.mS;
    }

    float getJStar() {
        return this.mJstar;
    }

    float getAStar() {
        return this.mAstar;
    }

    float getBStar() {
        return this.mBstar;
    }

    CamColor(float hue, float chroma, float j, float q, float m, float s, float jStar, float aStar, float bStar) {
        this.mHue = hue;
        this.mChroma = chroma;
        this.mJ = j;
        this.mQ = q;
        this.mM = m;
        this.mS = s;
        this.mJstar = jStar;
        this.mAstar = aStar;
        this.mBstar = bStar;
    }

    static int toColor(float hue, float chroma, float lStar) {
        return toColor(hue, chroma, lStar, ViewingConditions.DEFAULT);
    }

    static CamColor fromColor(int color) {
        return fromColorInViewingConditions(color, ViewingConditions.DEFAULT);
    }

    static CamColor fromColorInViewingConditions(int color, ViewingConditions viewingConditions) {
        float f;
        float[] xyz = CamUtils.xyzFromInt(color);
        float[][] matrix = CamUtils.XYZ_TO_CAM16RGB;
        float rT = (xyz[0] * matrix[0][0]) + (xyz[1] * matrix[0][1]) + (xyz[2] * matrix[0][2]);
        float gT = (xyz[0] * matrix[1][0]) + (xyz[1] * matrix[1][1]) + (xyz[2] * matrix[1][2]);
        float bT = (xyz[0] * matrix[2][0]) + (xyz[1] * matrix[2][1]) + (xyz[2] * matrix[2][2]);
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
        double aw = ac / viewingConditions.getAw();
        float gT2 = viewingConditions.getC() * viewingConditions.getZ();
        float j = ((float) Math.pow(aw, gT2)) * 100.0f;
        float q = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(j / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float huePrime = ((double) hue) < 20.14d ? hue + 360.0f : hue;
        double d7 = huePrime;
        Double.isNaN(d7);
        float eHue = ((float) (Math.cos(((d7 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f;
        float p1 = 3846.1538f * eHue * viewingConditions.getNc() * viewingConditions.getNcb();
        float t = (((float) Math.sqrt((a * a) + (b * b))) * p1) / (0.305f + u);
        float eHue2 = viewingConditions.getN();
        float alpha = ((float) Math.pow(1.64d - Math.pow(0.29d, eHue2), 0.73d)) * ((float) Math.pow(t, 0.9d));
        double d8 = j;
        Double.isNaN(d8);
        float c = ((float) Math.sqrt(d8 / 100.0d)) * alpha;
        float m = viewingConditions.getFlRoot() * c;
        float s = ((float) Math.sqrt((viewingConditions.getC() * alpha) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float jstar = (1.7f * j) / ((0.007f * j) + 1.0f);
        float t2 = (0.0228f * m) + 1.0f;
        float mstar = ((float) Math.log(t2)) * 43.85965f;
        float astar = ((float) Math.cos(hueRadians)) * mstar;
        float bstar = ((float) Math.sin(hueRadians)) * mstar;
        return new CamColor(hue, c, j, q, m, s, jstar, astar, bstar);
    }

    private static CamColor fromJch(float j, float c, float h) {
        return fromJchInFrame(j, c, h, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float j, float c, float h, ViewingConditions viewingConditions) {
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
        float mstar = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        float astar = mstar * ((float) Math.cos(hueRadians));
        float bstar = mstar * ((float) Math.sin(hueRadians));
        return new CamColor(h, c, j, q, m, s, jstar, astar, bstar);
    }

    float distance(CamColor other) {
        float dJ = getJStar() - other.getJStar();
        float dA = getAStar() - other.getAStar();
        float dB = getBStar() - other.getBStar();
        double dEPrime = Math.sqrt((dJ * dJ) + (dA * dA) + (dB * dB));
        double dE = Math.pow(dEPrime, 0.63d) * 1.41d;
        return (float) dE;
    }

    int viewedInSrgb() {
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
        float[][] matrix = CamUtils.CAM16RGB_TO_XYZ;
        float x = (matrix[0][0] * rF) + (matrix[0][1] * gF) + (matrix[0][2] * bF);
        float y = (matrix[1][0] * rF) + (matrix[1][1] * gF) + (matrix[1][2] * bF);
        float rCBase2 = (matrix[2][0] * rF) + (matrix[2][1] * gF) + (matrix[2][2] * bF);
        int argb = ColorUtils.XYZToColor(x, y, rCBase2);
        return argb;
    }

    static int toColor(float hue, float chroma, float lstar, ViewingConditions viewingConditions) {
        if (chroma < 1.0d || Math.round(lstar) <= 0.0d || Math.round(lstar) >= 100.0d) {
            return CamUtils.intFromLStar(lstar);
        }
        float hue2 = hue >= 0.0f ? Math.min(360.0f, hue) : 0.0f;
        float high = chroma;
        float mid = chroma;
        float low = 0.0f;
        boolean isFirstLoop = true;
        CamColor answer = null;
        while (Math.abs(low - high) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor possibleAnswer = findCamByJ(hue2, mid, lstar);
            if (isFirstLoop) {
                if (possibleAnswer != null) {
                    return possibleAnswer.viewed(viewingConditions);
                }
                isFirstLoop = false;
                mid = low + ((high - low) / 2.0f);
            } else {
                if (possibleAnswer == null) {
                    high = mid;
                } else {
                    answer = possibleAnswer;
                    low = mid;
                }
                mid = low + ((high - low) / 2.0f);
            }
        }
        if (answer == null) {
            return CamUtils.intFromLStar(lstar);
        }
        return answer.viewed(viewingConditions);
    }

    private static CamColor findCamByJ(float hue, float chroma, float lstar) {
        float low = 0.0f;
        float high = 100.0f;
        float bestdL = 1000.0f;
        float bestdE = 1000.0f;
        CamColor bestCam = null;
        while (Math.abs(low - high) > LIGHTNESS_SEARCH_ENDPOINT) {
            float mid = low + ((high - low) / 2.0f);
            CamColor camBeforeClip = fromJch(mid, chroma, hue);
            int clipped = camBeforeClip.viewedInSrgb();
            float clippedLstar = CamUtils.lStarFromInt(clipped);
            float dL = Math.abs(lstar - clippedLstar);
            if (dL < 0.2f) {
                CamColor camClipped = fromColor(clipped);
                float dE = camClipped.distance(fromJch(camClipped.getJ(), camClipped.getChroma(), hue));
                if (dE <= 1.0f) {
                    bestdL = dL;
                    bestdE = dE;
                    bestCam = camClipped;
                }
            }
            if (bestdL == 0.0f && bestdE == 0.0f) {
                break;
            }
            if (clippedLstar < lstar) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return bestCam;
    }
}
