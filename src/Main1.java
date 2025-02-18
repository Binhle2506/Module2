import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a : ");
        double a = sc.nextDouble();
        System.out.println("Enter number b : ");
        double b = sc.nextDouble();
        System.out.println("Enter number c : ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        System.out.println("delta = " + delta);
        if (delta > 0 ){
            System.out.println("root1 : " + equation.getRoot1());
            System.out.println("root2 : " + equation.getRoot2());
        }else if (delta == 0){
            System.out.println("Result : " + equation.getResult());
        }else{
            System.out.println("Inexperienced");
        }
    }
}
