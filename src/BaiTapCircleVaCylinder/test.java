package BaiTapCircleVaCylinder;

public class test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"red");
        System.out.println(circle1.toString());
        Cylinder cy1 = new Cylinder();
        cy1.setRadius(10);
        cy1.setRadius(5);
        cy1.setHeight(10);
        System.out.println(cy1.getVolume());
        System.out.println(cy1.toString());

    }
}
