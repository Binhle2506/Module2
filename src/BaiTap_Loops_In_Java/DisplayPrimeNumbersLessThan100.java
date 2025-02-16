package BaiTap_Loops_In_Java;

public class DisplayPrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int count = 0 ;
        int number = 2 ;
        while ( count < 99 ){
            if ( DisplayFirst20PrimeNumbers.isPrime(number) ){
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

    }
}
