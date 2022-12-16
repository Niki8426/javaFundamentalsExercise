package Methods;

import java.util.Scanner;

public class p03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        trianglePrint(Integer.parseInt(scanner.nextLine()));


    }
    public static  void  trianglePrint(int num){
        for (int i = 1; i <=num; i++) {
           println(1,i);

        }
        for (int i = num-1; i >=1 ; i--) {
            println(1,i);

        }

    }
    public static void println(int start, int end){
        for (int i =start; i <=end ; i++) {
            System.out.print(i +" ");

        }
        System.out.println("");
    }



}
