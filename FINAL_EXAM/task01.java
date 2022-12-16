package FINAL_EXAM;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
  String text= scanner.nextLine();

  String input= scanner.nextLine();
   while(!input.contains("Done")){
       String command=input.split(" ")[0];
       if(input.contains("Change")) {
           String symbol1 = input.split(" ")[1];
           char symbol = symbol1.charAt(0);
           String replace1 = input.split(" ")[2];
           char replace = replace1.charAt(0);
             text = text.replace(symbol, replace);
           System.out.println(text);

       }else if(input.contains("Includes")){
           String substring=input.split(" ")[1];
           if(input.contains(substring)){
               System.out.println("True");
           }else{
               System.out.println("False");
           }


       }else if(input.contains("End")){
           String substring=input.split(" ")[1];
           int lastIndex=text.lastIndexOf(substring);
           String[]textArray=text.split(" ");
           String lastElement=textArray[textArray.length-1];
           int lastElementIndex=text.indexOf(lastElement);

           if(lastIndex==lastElementIndex){
               System.out.println("True");
           }else{
               System.out.println("False");
           }

       }else if(input.contains("Uppercase")){
           text=text.toUpperCase();
           System.out.println(text);

       }else if(input.contains("FindIndex")){
           String index1=input.split(" ")[1];
           char index=index1.charAt(0);
           for (int i = 0; i <text.length() ; i++) {
               char symbol=text.charAt(i);
               if(symbol==index){
                   System.out.println(i);
                   break;
               }

           }



       }else if(input.contains("Cut")){
           int startIndex=Integer.parseInt(input.split(" ")[1]);
           int endIndex=Integer.parseInt(input.split(" ")[2]);
           String substring=text.substring(startIndex,startIndex+endIndex);
           System.out.println(substring);

       }



       input= scanner.nextLine();
   }

    }
}
