package MethodsExercises;

import java.util.Scanner;

public class p05AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int num1=Integer.parseInt(scanner.nextLine());
         int num2=Integer.parseInt(scanner.nextLine());
         int num3=Integer.parseInt(scanner.nextLine());
         sumAndSubstract(num1,num2,num3);

    }

    static void sumAndSubstract(int n1, int n2, int n3){
        int c=n1+n2;
         int d=c-n3;
        System.out.println(d);
    }


}
