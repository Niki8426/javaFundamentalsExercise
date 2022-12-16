package MethodsExercises;

import java.util.Scanner;

public class p04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        passRules(text);

    }

    static void passRules(String txt) {
        numberOfCharacters(txt);
        checkForLettersAndDigitis(txt);
        checkForTwoDigits(txt);
        passwordIsValid(txt);
    }

    static boolean numberOfCharacters(String txt) {
        boolean isTrue = true;
        char[] password = txt.toCharArray();
        if (password.length < 6) {
            System.out.println("Password must be between 6 and 10 characters");
            isTrue = false;

        }
        if (password.length > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isTrue = false;
        }

        if (isTrue) {
            return isTrue;
        } else {
            return isTrue;
        }

    }

    static boolean checkForLettersAndDigitis(String txt) {
        boolean isTrue = true;
        char[] passwords = txt.toCharArray();
        for (int i = 0; i < passwords.length; i++) {
            if ((passwords[i] < 48 || passwords[i] > 57) && (passwords[i] < 65 || passwords[i] > 90) && (passwords[i] < 97 || passwords[i] > 122)) {
                System.out.println("Password must consist only of letters and digits");
                isTrue = false;
                break;
            }

        }
        if (isTrue) {
            return isTrue;
        } else {
            return isTrue;
        }

    }

    static boolean checkForTwoDigits(String txt) {
        boolean isTrue = true;
        int counter = 0;
        char[] passwords = txt.toCharArray();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i] >= 48 && passwords[i] <= 57) {
                counter++;
            }


        }
        if (counter < 2) {
            System.out.println("Password must have at least 2 digits");
            isTrue = false;
        }
        if (isTrue) {
            return isTrue;
        } else {
            return isTrue;
        }


    }

    static void passwordIsValid(String txt) {
        boolean isTrue = true;
        char[] password = txt.toCharArray();
        if (password.length < 6) {

            isTrue = false;

        }
        if (password.length > 10) {

            isTrue = false;
        }

        for (int i = 0; i < password.length; i++) {
            if ((password[i] < 48 || password[i] > 57) && (password[i] < 65 || password[i] > 90) && (password[i] < 97 || password[i] > 122)) {

                isTrue = false;
                break;
            }

            int counter = 0;
            char[] passwords = txt.toCharArray();
            for (int j = 0; j < passwords.length; j++) {
                if (passwords[j] >= 48 && passwords[j] <= 57) {
                    counter++;
                }


            }
            if (counter < 2) {

                isTrue = false;
            }

        }
        if(isTrue){
            System.out.println("Password is valid");

        }
    }
}
