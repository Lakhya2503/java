package Recursion;

public class Four {
    public static void PrintFIb(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a  + b ;
        System.out.println(c);
        PrintFIb( b ,  c  , n - 1);

    }


    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        PrintFIb(a, b , n - 2);
    }
}
