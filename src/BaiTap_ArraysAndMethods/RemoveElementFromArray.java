package BaiTap_ArraysAndMethods;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 44, 5, 6, 44, 8, 9, 10};

        System.out.println("Enter the element to be removed:");
        int X = input.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                count++;
            }
        }


        if (count == 0) {
            System.out.println("Element not found in the array.");
            return;
        }


        int[] newArray = new int[array.length - count];
        int index = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] != X) {
                newArray[index++] = array[i];
            }
        }


        System.out.println("Array after removal: " + Arrays.toString(newArray));
    }
}

