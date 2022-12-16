package MethodsExercises;

import java.util.Scanner;

public class p07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        matrix(num);
    }

    static void matrix(int n) {
        int[] array = new int[n];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                array[i] = n;
                System.out.print(array[i] + " ");


            }
            System.out.println("");

        }
    }
}




