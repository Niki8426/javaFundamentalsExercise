package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
         String second="";

         char first=input.charAt(0);
         second+=first;

        for (int i = 0; i <input.length() ; i++) {
            char symbol=input.charAt(i);
            if(symbol!=first){
                second+=symbol;
                first=symbol;
            }


        }
        System.out.println(second);
    }
}
