package Recursion;

public class Six {
    public static int CalculatePower (int x , int  n) {
        if (x  == 1) {
            return  0;
        }

        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return  CalculatePower( x, n/2 ) * CalculatePower( x, n/2 );
        } else {
            return  CalculatePower( x, n/2 ) * CalculatePower( x, n/2 ) * x ;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 9;
        int result = CalculatePower( x , n);
        System.out.println( result );
    }
}
