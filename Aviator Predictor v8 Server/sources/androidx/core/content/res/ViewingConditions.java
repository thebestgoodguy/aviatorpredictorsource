package androidx.core.content.res;

/* loaded from: classes6.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT;
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    static {
        float[] fArr = CamUtils.WHITE_POINT_D65;
        double yFromLStar = CamUtils.yFromLStar(50.0f);
        Double.isNaN(yFromLStar);
        DEFAULT = make(fArr, (float) ((yFromLStar * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    float getAw() {
        return this.mAw;
    }

    float getN() {
        return this.mN;
    }

    float getNbb() {
        return this.mNbb;
    }

    float getNcb() {
        return this.mNcb;
    }

    float getC() {
        return this.mC;
    }

    float getNc() {
        return this.mNc;
    }

    float[] getRgbD() {
        return this.mRgbD;
    }

    float getFl() {
        return this.mFl;
    }

    float getFlRoot() {
        return this.mFlRoot;
    }

    float getZ() {
        return this.mZ;
    }

    private ViewingConditions(float n, float aw, float nbb, float ncb, float c, float nc, float[] rgbD, float fl, float fLRoot, float z) {
        this.mN = n;
        this.mAw = aw;
        this.mNbb = nbb;
        this.mNcb = ncb;
        this.mC = c;
        this.mNc = nc;
        this.mRgbD = rgbD;
        this.mFl = fl;
        this.mFlRoot = fLRoot;
        this.mZ = z;
    }

    static ViewingConditions make(float[] whitepoint, float adaptingLuminance, float backgroundLstar, float surround, boolean discountingIlluminant) {
        float[][] matrix = CamUtils.XYZ_TO_CAM16RGB;
        float rW = (whitepoint[0] * matrix[0][0]) + (whitepoint[1] * matrix[0][1]) + (whitepoint[2] * matrix[0][2]);
        float gW = (whitepoint[0] * matrix[1][0]) + (whitepoint[1] * matrix[1][1]) + (whitepoint[2] * matrix[1][2]);
        float bW = (whitepoint[0] * matrix[2][0]) + (whitepoint[1] * matrix[2][1]) + (whitepoint[2] * matrix[2][2]);
        float f = (surround / 10.0f) + 0.8f;
        float c = ((double) f) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f - 0.8f) * 10.0f);
        float d = discountingIlluminant ? 1.0f : (1.0f - (((float) Math.exp(((-adaptingLuminance) - 42.0f) / 92.0f)) * 0.2777778f)) * f;
        float d2 = ((double) d) > 1.0d ? 1.0f : ((double) d) < 0.0d ? 0.0f : d;
        float[] rgbD = {(((100.0f / rW) * d2) + 1.0f) - d2, (((100.0f / gW) * d2) + 1.0f) - d2, (((100.0f / bW) * d2) + 1.0f) - d2};
        float k = 1.0f / ((5.0f * adaptingLuminance) + 1.0f);
        float k4 = k * k * k * k;
        float k4F = 1.0f - k4;
        double d3 = adaptingLuminance;
        Double.isNaN(d3);
        float fl = (k4 * adaptingLuminance) + (0.1f * k4F * k4F * ((float) Math.cbrt(d3 * 5.0d)));
        float n = CamUtils.yFromLStar(backgroundLstar) / whitepoint[1];
        float z = ((float) Math.sqrt(n)) + 1.48f;
        float nbb = 0.725f / ((float) Math.pow(n, 0.2d));
        double d4 = rgbD[0] * fl * rW;
        Double.isNaN(d4);
        double d5 = rgbD[1] * fl * gW;
        Double.isNaN(d5);
        double d6 = rgbD[2] * fl * bW;
        Double.isNaN(d6);
        float[] rgbAFactors = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d)};
        float[] rgbA = {(rgbAFactors[0] * 400.0f) / (rgbAFactors[0] + 27.13f), (rgbAFactors[1] * 400.0f) / (rgbAFactors[1] + 27.13f), (rgbAFactors[2] * 400.0f) / (rgbAFactors[2] + 27.13f)};
        float aw = ((rgbA[0] * 2.0f) + rgbA[1] + (rgbA[2] * 0.05f)) * nbb;
        return new ViewingConditions(n, aw, nbb, nbb, c, f, rgbD, fl, (float) Math.pow(fl, 0.25d), z);
    }
}
