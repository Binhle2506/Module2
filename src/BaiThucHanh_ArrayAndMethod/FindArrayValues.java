package BaiThucHanh_ArrayAndMethod;
import java.util.Scanner;

public class FindArrayValues {
    public static void main(String[] args) {
        String[] students = {"Le Duc Binh","Le Binh Minh","Le Van Quang","Le Hoang An","Le Duc Anh"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên ");
        String name = sc.nextLine();
        boolean isExist = false;
        for ( int i = 0 ; i < students.length ; i++ ) {
            if ( students[i].equals(name)){
                System.out.println("Vị trí của sinh viên "+ name +" trong danh sách là " + (i+1) );
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Không tìm thấy " + name + "trong danh sách");

        }
    }
}
