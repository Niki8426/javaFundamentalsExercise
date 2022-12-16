package Methods;

import java.util.Scanner;

public class p06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());

        System.out.println(area(number1,number2));

    }
     public static int area(int n1, int n2){
        int  calculation=n1*n2;
        return calculation;
     }
}
