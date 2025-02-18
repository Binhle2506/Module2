public class Rectangle {
    //THuộc tính
    double width, height;
    //Constructor
    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //method
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
