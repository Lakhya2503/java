package Recursion;

public class Three {
    public static  int calculateFactorial(int n){
        if ( n == 1 || n == 0) {
            return 1;
        }

        int factor_n_minus_one  = calculateFactorial(n - 1);
        int facto = n *  factor_n_minus_one;
        return facto;
    }

    public static void main(String[] args) {
        int n = 5;
        int result =  calculateFactorial(n);
        System.out.println("The factorial of " + n + " is : " + result);
    }
}
