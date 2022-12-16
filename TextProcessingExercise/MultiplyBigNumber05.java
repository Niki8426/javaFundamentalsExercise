package TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine().replaceFirst("^0+(?!$)","");

        int n=Integer.parseInt(scanner.nextLine());

        StringBuilder sb=new StringBuilder();

        int reminder=0;


        String[]inputArr=input.split("");
        for (int i = inputArr.length-1; i >= 0 ; i--) {

            int  multiply=0;

            int num=Integer.parseInt(inputArr[i]);
            multiply=(num*n)+reminder;
            if(!(i==0)){
                if(!(multiply<10)){
                    sb.append(multiply%10);
                    reminder=multiply/10;
                }else{
                    sb.append(multiply);
                    reminder=0;
                }

            }else{
                if(!(multiply<10)){
                    sb.append(multiply%10);
                    sb.append(multiply/10);
                }else{
                   if(multiply<10){
                       sb.append(multiply);
                   }

                }

            }





        }

        sb.reverse();
        System.out.println(sb.toString());
    }
}
