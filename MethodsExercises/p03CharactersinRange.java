package MethodsExercises;

import java.util.Scanner;

public class p03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        printChar(one, two);

    }

    static void printChar(char a, char b) {

        if (a < b) {
            for (int i = a + 1; i <= b - 1; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = b + 1; i <= a - 1; i++) {
                System.out.print((char) i + " ");

            }

        }


    }
}

