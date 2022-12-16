package TextProcessingExercise;

import java.util.Comparator;
import java.util.Scanner;

public class CharacterMultiplier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[]inputArr=input.split("\\s+");
        int totalSum=0;

        String first=inputArr[0];
        String second=inputArr[1];
        if(first.length()>=second.length()){
            for (int i = 0; i <first.length() ; i++) {
               int firstChar=first.charAt(i);
               int secondChar;
               if(i>second.length()-1){
                   secondChar=1;
               }else{
                   secondChar=second.charAt(i);
               }

               totalSum+=firstChar*secondChar;



            }
        }else if(first.length()<=second.length()){
            for (int i = 0; i <second.length() ; i++) {
                int firstChar;
                int secondChar= second.charAt(i);
                if(i>first.length()-1){
                    firstChar=1;
                }else{
                    firstChar=first.charAt(i);
                }
                totalSum+=firstChar*secondChar;

            }

        }

        System.out.println(totalSum);



    }
}
