package BaiTap_Loops_In_Java;

public class DisplayFirst20PrimeNumbers {
    public static void main(String[] args) {
        int count = 0 ;
        int num = 2;

        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

