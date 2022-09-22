package PregovorExercise;

import java.util.Scanner;

public class p04PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = num1; i <=num2 ; i++) {
            System.out.print(i+" ");

            sum=sum+i;


        }
        System.out.println("");
        System.out.printf("Sum: %d",sum);
    }
}
