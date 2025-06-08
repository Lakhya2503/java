
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String adultMsg = "your Adult";
        String notAdultMsg = "your not Adult";
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();
        String adultOrNot = (age >= 18) ? adultMsg : notAdultMsg ;
        System.out.println(adultOrNot + " beacuse your "+ age + " old");



    }
}
