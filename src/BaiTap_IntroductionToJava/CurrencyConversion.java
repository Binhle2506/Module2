package BaiTap_IntroductionToJava;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 2;

        System.out.println("Enter option 1 (VND -> USD) or 2 (USD -> VND):");
        int c = scanner.nextInt();

        double vnd;
        double dollar;
        double result; // Thêm biến result để lưu kết quả

        if (c == a) {
            System.out.print("Please enter the amount in Vietnamese Dong (VND): ");
            vnd = scanner.nextDouble();
            result = vnd / 23000.0;
            System.out.println("Converted amount: " + result + " USD");
        } else if (c == b) {
            System.out.print("Please enter the amount in US dollars (USD): ");
            dollar = scanner.nextDouble();
            result = dollar * 23000;
            System.out.println("Converted amount: " + result + " VND");
        } else {
            System.out.println("Invalid option! Please enter 1 or 2.");
        }

        scanner.close();
    }
}
