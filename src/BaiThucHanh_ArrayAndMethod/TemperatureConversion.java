package BaiThucHanh_ArrayAndMethod;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Nhập nhiệt độ F cần chuyển đổi : ");
                double fahrenheit = sc.nextDouble();
                System.out.printf("kết quả: %.2f%n",fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.print("Nhập nhiệt độ C cần chuyển đổi : ");
                double celsius = sc.nextDouble();
                System.out.printf("Kết quả : %.2f%n",celsiusToFahrenheit(celsius));
                break;
            case 3:
                System.exit(0);


        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
