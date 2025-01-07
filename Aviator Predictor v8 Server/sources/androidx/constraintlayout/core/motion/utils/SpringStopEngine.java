package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes40.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String desc, float time) {
        return null;
    }

    void log(String str) {
        StackTraceElement s = new Throwable().getStackTrace()[1];
        String line = ".(" + s.getFileName() + ":" + s.getLineNumber() + ") " + s.getMethodName() + "() ";
        System.out.println(line + str);
    }

    public void springConfig(float currentPos, float target, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        this.mTargetPos = target;
        this.mDamping = damping;
        this.mInitialized = false;
        this.mPos = currentPos;
        this.mLastVelocity = currentVelocity;
        this.mStiffness = stiffness;
        this.mMass = mass;
        this.mStopThreshold = stopThreshold;
        this.mBoundaryMode = boundaryMode;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float t) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float time) {
        compute(time - this.mLastTime);
        this.mLastTime = time;
        return this.mPos;
    }

    public float getAcceleration() {
        double k = this.mStiffness;
        double c = this.mDamping;
        double d = this.mPos;
        double d2 = this.mTargetPos;
        Double.isNaN(d);
        double x = d - d2;
        double d3 = this.mV;
        Double.isNaN(d3);
        return ((float) (((-k) * x) - (d3 * c))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = this.mPos;
        double d2 = this.mTargetPos;
        Double.isNaN(d);
        double x = d - d2;
        double k = this.mStiffness;
        double v = this.mV;
        double m = this.mMass;
        Double.isNaN(v);
        Double.isNaN(v);
        Double.isNaN(m);
        double energy = (v * v * m) + (k * x * x);
        double max_def = Math.sqrt(energy / k);
        return max_def <= ((double) this.mStopThreshold);
    }

    private void compute(double dt) {
        double k = this.mStiffness;
        double c = this.mDamping;
        double d = this.mStiffness;
        double d2 = this.mMass;
        Double.isNaN(d2);
        int overSample = (int) ((9.0d / ((Math.sqrt(d / d2) * dt) * 4.0d)) + 1.0d);
        double d3 = overSample;
        Double.isNaN(d3);
        double dt2 = dt / d3;
        int i = 0;
        while (i < overSample) {
            float f = this.mPos;
            double d4 = f;
            double d5 = this.mTargetPos;
            Double.isNaN(d4);
            double d6 = (-k) * (d4 - d5);
            int overSample2 = overSample;
            float f2 = this.mV;
            double x = f2;
            Double.isNaN(x);
            double d7 = d6 - (x * c);
            float f3 = this.mMass;
            double c2 = c;
            double c3 = f3;
            Double.isNaN(c3);
            double a = d7 / c3;
            double d8 = f2;
            Double.isNaN(d8);
            double avgV = d8 + ((a * dt2) / 2.0d);
            double a2 = f;
            Double.isNaN(a2);
            double avgX = (a2 + ((dt2 * avgV) / 2.0d)) - d5;
            double d9 = ((-avgX) * k) - (avgV * c2);
            double k2 = k;
            double k3 = f3;
            Double.isNaN(k3);
            double a3 = d9 / k3;
            double dv = a3 * dt2;
            double avgV2 = f2;
            Double.isNaN(avgV2);
            double d10 = f2;
            Double.isNaN(d10);
            float f4 = (float) (d10 + dv);
            this.mV = f4;
            double d11 = f;
            Double.isNaN(d11);
            float f5 = (float) (d11 + ((avgV2 + (dv / 2.0d)) * dt2));
            this.mPos = f5;
            int r10 = this.mBoundaryMode;
            if (r10 > 0) {
                if (f5 < 0.0f && (r10 & 1) == 1) {
                    this.mPos = -f5;
                    this.mV = -f4;
                }
                float f6 = this.mPos;
                if (f6 > 1.0f && (r10 & 2) == 2) {
                    this.mPos = 2.0f - f6;
                    this.mV = -this.mV;
                }
            }
            i++;
            overSample = overSample2;
            c = c2;
            k = k2;
        }
    }
}
