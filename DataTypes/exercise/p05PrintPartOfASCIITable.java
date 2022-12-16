package DataTypes.exercise;

import java.util.Scanner;

public class p05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPoint=Integer.parseInt(scanner.nextLine());
        int endPoint=Integer.parseInt(scanner.nextLine());
        for (int i = startPoint; i <=endPoint ; i++) {
            System.out.print((char)i+" ");


        }
    }
}
