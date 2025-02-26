package TenDuAn;

public class Shape  {
    // Gia tri mac dinh
    protected String color = "green";
    protected boolean filled = true;
    // constructor mac dinh
    public Shape(){

    }
    // constructor doi so
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    // getter
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    // setter

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
