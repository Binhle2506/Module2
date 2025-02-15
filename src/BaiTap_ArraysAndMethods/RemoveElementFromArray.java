package BaiTap_ArraysAndMethods;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 44, 5, 6, 44, 8, 9, 10};

        System.out.println("Enter the element to be removed:");
        int X = input.nextInt();

        // Đếm số lượng phần tử X trong mảng
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                count++;
            }
        }

        // Nếu không tìm thấy phần tử X, thông báo và kết thúc chương trình
        if (count == 0) {
            System.out.println("Element not found in the array.");
            return;
        }

        // Tạo mảng mới với kích thước nhỏ hơn
        int[] newArray = new int[array.length - count];
        int index = 0;

        // Sao chép các phần tử không phải X vào mảng mới
        for (int i = 0; i < array.length; i++) {  // Sử dụng for thay vì for-each
            if (array[i] != X) {
                newArray[index++] = array[i];
            }
        }

        // In ra mảng sau khi xóa
        System.out.println("Array after removal: " + Arrays.toString(newArray));
    }
}

