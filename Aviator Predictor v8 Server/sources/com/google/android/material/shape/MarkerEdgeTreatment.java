package com.google.android.material.shape;

/* loaded from: classes37.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float radius) {
        this.radius = radius - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float length, float center, float interpolation, ShapePath shapePath) {
        double d = this.radius;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        float side = (float) ((d * sqrt) / 2.0d);
        float side2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(side, 2.0d));
        double d2 = this.radius;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt2;
        double d4 = this.radius;
        Double.isNaN(d4);
        shapePath.reset(center - side, ((float) (-(d3 - d4))) + side2);
        double d5 = this.radius;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt3;
        double d7 = this.radius;
        Double.isNaN(d7);
        shapePath.lineTo(center, (float) (-(d6 - d7)));
        double d8 = this.radius;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt4;
        double d10 = this.radius;
        Double.isNaN(d10);
        shapePath.lineTo(center + side, ((float) (-(d9 - d10))) + side2);
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean forceIntersection() {
        return true;
    }
}
