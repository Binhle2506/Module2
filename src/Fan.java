public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // Constructor không tham số
    public Fan() {
    }

    // Getter
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Override toString()
    @Override
    public String toString() {
        if (on) { // Nếu bật
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", fan is on";
        } else { // Nếu tắt
            return "Color: " + color + ", Radius: " + radius + ", fan is off";
        }
    }
}
