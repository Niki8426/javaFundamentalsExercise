package lection1Pregovor;

import java.util.Scanner;

public class probapo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        int sum=0;
        int i=1;

        while(i<=10) {
            sum=i*n;
            System.out.printf("%d X %d = %d%n",n,i,sum);

            i++;

        }

    }
}