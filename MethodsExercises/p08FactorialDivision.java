package MethodsExercises;

import java.util.Scanner;

public class p08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",factorialDivide(num1,num2));


    }

    static double factorialDivide(int n1, int n2) {
        double multiply1 = 1;
        double multiply2 = 1;
        for (int i = 1; i <= n1; i++) {
            multiply1 *= i;

        }
        for (int j = 1; j <= n2; j++) {
            multiply2 *= j;

        }
        double multiplyDivide = multiply1 / multiply2;
        return multiplyDivide;

    }
}
