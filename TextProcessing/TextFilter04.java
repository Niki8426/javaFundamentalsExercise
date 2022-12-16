package TextProcessing;

import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannWordsArr=scanner.nextLine().split(", ");
        String text=scanner.nextLine();


        for (String banword: bannWordsArr) {
            text=text.replaceAll(banword,repeatString("*",banword.length()));


        }

        System.out.println(text);


    }
    public static String repeatString(String s, int count){
        String result="";
        for (int i = 0; i <count ; i++) {
            result+=s;
        }
     return  result;
    }
}
