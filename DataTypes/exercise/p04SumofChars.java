package DataTypes.exercise;

import java.util.Scanner;

public class p04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        String s;

        for (int i = 1; i <=n ; i++) {
           // s= scanner.nextLine();
            char c=scanner.nextLine().charAt(0);
            sum+=(int)c;


        }
        System.out.printf("The sum equals: %d",sum);
    }

}
