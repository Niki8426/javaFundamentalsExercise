package Methods;

import java.util.Scanner;

public class p07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        int num=Integer.parseInt(scanner.nextLine());
        System.out.println(repeating(input,num));

    }
    public static String repeating(String something, int n){
        String repeating="";
        for (int i = 0; i <n ; i++) {
             repeating+=something;



        }
        return repeating;
    }
}
