package TextProcessing;

import java.util.Scanner;

public class DigitsLettersandOther05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();

        char[] textCharArr=input.toCharArray();

        for (char item:textCharArr) {
            if(item>=33 && item<=47||item>=58&&item<=64||item>=91&&item<=96||item>=123&&item<=126){
                sb1.append(item); // simvoli
            }else if(item>=48&&item<=57){
                sb2.append(item);//chisla
            }else if(item>=65&&item<=90||item>=97&&item<=122){
                sb3.append(item);//bukvi

            }


        }
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println(sb1.toString());



    }
}
