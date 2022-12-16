package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(", ");


        boolean isTrue = false;

        for (String item : inputArr) {
           if(check(item)){
               System.out.println(item);
           }
        }
    }
    public static boolean check(String item){

        boolean isValidLenght=item.length()>=3&&item.length()<=16;

        boolean isValidContain=false;
        for (char element:item.toCharArray()) {
            if(!Character.isLetterOrDigit(element)&&element!='-'&&element!='_'){
                return false;
            }

        }
        isValidContain=true;
        return isValidContain&&isValidLenght;
    }

}
