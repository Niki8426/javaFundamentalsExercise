package PregovorExercise;

import java.util.Scanner;

public class p06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());
        int startNumber=number;
         int fact=1;
         int sumFact=0;
        while(number>0){
            int lastdigit=number%10;
            fact=1;
            for (int i = 1; i <=lastdigit ; i++) {

                fact*=i;
            }
            sumFact+=fact;


            number=number/10;

        }
        if(sumFact==startNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
