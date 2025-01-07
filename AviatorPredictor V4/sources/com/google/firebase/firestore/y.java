package com.google.firebase.firestore;

/* loaded from: classes.dex */
public class y implements Comparable<y> {

    /* renamed from: e, reason: collision with root package name */
    private final double f2774e;

    /* renamed from: f, reason: collision with root package name */
    private final double f2775f;

    public y(double d5, double d6) {
        if (Double.isNaN(d5) || d5 < -90.0d || d5 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d6) || d6 < -180.0d || d6 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f2774e = d5;
        this.f2775f = d6;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(y yVar) {
        int j4 = p1.g0.j(this.f2774e, yVar.f2774e);
        return j4 == 0 ? p1.g0.j(this.f2775f, yVar.f2775f) : j4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f2774e == yVar.f2774e && this.f2775f == yVar.f2775f;
    }

    public double g() {
        return this.f2774e;
    }

    public double h() {
        return this.f2775f;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2774e);
        int r12 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2775f);
        return (r12 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f2774e + ", longitude=" + this.f2775f + " }";
    }
}
