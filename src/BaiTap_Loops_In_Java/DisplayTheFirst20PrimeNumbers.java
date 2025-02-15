package BaiTap_Loops_In_Java;

import java.util.Scanner;

public class DisplayTheFirst20PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if ( number < 2 ){
            System.out.println("Not a prime number");
        }else {
            for ( int i = 2 ; i <= Math.sqrt(number); i++ ){
                if( number % i == 0 ){
                    System.out.println(" Not a prime number");
                    return;
                }
            }
            System.out.println(" Is a prime number");
        }

    }
}
