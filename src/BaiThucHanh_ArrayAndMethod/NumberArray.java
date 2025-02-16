package BaiThucHanh_ArrayAndMethod;
import java.util.Scanner;
public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        System.out.print("Nhập kích thước của mảng : ");
        size = sc.nextInt();
        arr = new int[size];
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print("Nhập giá trị của phần tử " + i +" ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là : ");
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        int max = arr[0];
        int index = 1;
        for ( int i = 0 ; i < arr.length; i++){
            if( arr[i] > max ){
                max = arr[i];
                index = i;
            }
        }
        System.out.print("\n");
        System.out.println("Giá trị lớn nhất trong mảng là " + max + " và là phần tử arr["+index+"]");


    }
}
