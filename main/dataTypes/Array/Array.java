package dataTypes.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
      /*  int[] marks = new int[5];
        marks[0] = 3;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 77;
        marks[4] = 49;

        for (int i = 0; i< marks.length; i++) {
            System.out.println(marks[i]);
        } */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int size = sc.nextInt();
        int [] marks = new  int[size];


        //input
        for (int i = 0; i< marks.length; i++) {
            System.out.print("Enter a " + i + " index : ");
                marks[i] = sc.nextInt();
                }

        //output
        for (int i = 0; i< marks.length; i++) {
                    System.out.println("Your " + i + " index value is: " + marks[i]);
                }

    }

}
