package MethodsExercises;

import java.util.Scanner;

public class p01SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

        smallestNumber(num1,num2,num3);
    }

    static void smallestNumber(int n1, int n2, int n3){
        int smallestnumb=Integer.MAX_VALUE;

        if(n1<=smallestnumb){
            smallestnumb=n1;
        }
        if(n2<=smallestnumb){
            smallestnumb=n2;
        }
        if(n3<=smallestnumb){
            smallestnumb=n3;

        }
        System.out.println(smallestnumb);


    }
}
