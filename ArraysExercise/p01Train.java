package ArraysExercise;

import java.util.Scanner;

public class p01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int [] array=new int[n];
        int sum=0;
        for (int i = 0; i < array.length ; i++) {

            array[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int element:array) {
            System.out.print(element+" ");
            sum+=element;

        }
        System.out.println("");
        System.out.println(sum);
    }
}
