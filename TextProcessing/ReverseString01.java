package TextProcessing;

import java.util.Scanner;

public class ReverseString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();


       while(!input.equals("end")){
           String line="";

           for (int i = input.length()-1; i >=0 ; i--) {
               line+=input.charAt(i);

           }
           System.out.printf("%s = %s%n",input,line);

            input= scanner.nextLine();
        }
    }
}
