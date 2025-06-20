package Recursion;

public class Five {
    public static int CalculatePower (int x , int  n) {
        if (x  == 1) {
            return  0;
        }

        if (n == 0) {
            return 1;
        }

      int calculate_n_one =  CalculatePower( x , n - 1);
      int caluculate_final = calculate_n_one * x;
      return  caluculate_final;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 9;
        int result = CalculatePower( x , n);
        System.out.println("The Power of x^n is : " + result);
    }
}
