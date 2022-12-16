package DataTypes.exercise;

import java.util.Scanner;

public class p02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int sum=0;

        while(number>0){
          int digits= number%10;
          sum+=digits;
          number=number/10;
        }
        System.out.println(sum);
    }
}
