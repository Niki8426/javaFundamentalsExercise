package Methods;

import java.util.Scanner;

public class p044Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        switch (input){
            case "add":
                add(num1,num2);
                break;
            case"multiply":
                multiply(num1,num2);
                break;
            case"substract":
                substract(num1,num2);

                break;
            case"divide":
                devide(num1,num2);
                break;
        }



    }
     public static void  add(int n1, int n2){
        int add=n1+n2;
         System.out.print(add);
     }

     public static void multiply(int n1,int n2){
        int multiply=n1*n2;
         System.out.print(multiply);
     }

     public static void substract(int n1, int n2){
        int  substract=n1-n2;
         System.out.print(substract);
     }

     public static void devide(int n1,int n2){
        int devide=n1/n2;
         System.out.print(devide);
     }
}
