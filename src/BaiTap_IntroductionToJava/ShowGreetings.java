package BaiTap_IntroductionToJava;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner nhapTen = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = nhapTen.nextLine();
        System.out.println("Hello: " + name);
    }
}
