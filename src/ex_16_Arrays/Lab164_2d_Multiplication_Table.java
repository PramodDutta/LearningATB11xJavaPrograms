package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2d_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int Size_of_the_Table = scanner.nextInt();

        for (int i = 0; i < Size_of_the_Table; i++) {
            for (int j = 0; j < Size_of_the_Table; j++) {
//                System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
