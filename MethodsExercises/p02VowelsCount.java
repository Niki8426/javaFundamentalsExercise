package MethodsExercises;

import java.util.Locale;
import java.util.Scanner;

public class p02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        printVowestCount(text.toLowerCase()); // vryshta malki bukvi samo!

    }

    static void printVowestCount(String text){
       int count=0;
        for (char symbol:text.toCharArray()) {
            if(symbol=='a'||symbol=='e'||symbol=='i'||symbol=='o'||symbol=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
