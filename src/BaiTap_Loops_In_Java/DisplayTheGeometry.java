package BaiTap_Loops_In_Java;

import java.util.Scanner;
public class DisplayTheGeometry {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle ");
        System.out.println("2. Draw a right triangle with the right angle at the bottom-left ");
        System.out.println("3. Draw a right triangle, with the right angle at the top-left ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                for( int i = 1 ; i < 4 ; i++ ){
                    System.out.print("\n");
                    for( int j = 1 ; j < 8 ; j++){
                        System.out.print(" * ");
                    }
                }
                break;
            case 2:
                for ( int i = 1 ; i <= 6 ; i++ ){
                    System.out.println("\n");
                    for( int j = 1 ; j < i ; j+=1 ){
                        System.out.print(" * ");
                    }
                }
                break;
            case 3:
                for( int i = 1 ; i <= 5 ; i++){
                    System.out.println("\n");
                    for( int j = i ; j<=5 ; j+=1 )
                        System.out.print(" * ");
                }

        }
    }
}
