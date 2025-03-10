package BaiTapCircleVaCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}
    public Cylinder(double height) {
//        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", color=" + color + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}

