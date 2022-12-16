package Methods;

import java.util.Scanner;

public class p11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int num2 = Integer.parseInt(scanner.nextLine());
        int multiply = 0;
        int divide = 0;
        int add = 0;
        int substract = 0;
        if (input.equals("*")) {
            multiply = 1;
            System.out.println(mathOperation(num1, multiply, num2));


        } else if (input.equals("/")) {
            divide = 2;
            System.out.println(mathOperation(num1, divide, num2));

        } else if (input.equals("+")) {

            add = 3;
            System.out.println(mathOperation(num1, add, num2));

        } else if (input.equals("-")) {
            substract = 4;
            System.out.println(mathOperation(num1, substract, num2));

        }

    }

    static int mathOperation(int num1, int String, int num2) {
        if (String == 1) {
            return multiply(num1, num2);


        } else if (String == 2) {
            return divide(num1, num2);
        } else if (String == 3) {
            return add(num1, num2);
        } else if (String == 4) {
            return substract(num1, num2);
        }


        return 0;
    }

    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return multiply;
    }

    static int substract(int num1, int num2) {
        int substract = num1 - num2;
        return substract;
    }

    static int divide(int num1, int num2) {
        int divide = num1 / num2;
        return divide;
    }

}
