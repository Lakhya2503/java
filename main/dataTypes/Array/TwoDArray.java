package dataTypes.Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of rows: ");
        int rows  = sc.nextInt();
        System.out.print("Enter a number of columns: ");
        int colum  = sc.nextInt();
        int[][] numbers = new int[rows][colum];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                numbers[i][j] =sc.nextInt();
            }
        }

        for (int i = 0; i< rows; i++) {
            for (int  j = 0; j < colum; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
