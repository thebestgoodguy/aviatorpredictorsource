package androidx.constraintlayout.core.widgets;

/* loaded from: classes40.dex */
public class Rectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public void setBounds(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void grow(int w, int h) {
        this.x -= w;
        this.y -= h;
        this.width += w * 2;
        this.height += h * 2;
    }

    boolean intersects(Rectangle bounds) {
        int r0;
        int r1;
        int r02 = this.x;
        int r12 = bounds.x;
        return r02 >= r12 && r02 < r12 + bounds.width && (r0 = this.y) >= (r1 = bounds.y) && r0 < r1 + bounds.height;
    }

    public boolean contains(int x, int y) {
        int r0;
        int r02 = this.x;
        return x >= r02 && x < r02 + this.width && y >= (r0 = this.y) && y < r0 + this.height;
    }

    public int getCenterX() {
        return (this.x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.y + this.height) / 2;
    }
}
