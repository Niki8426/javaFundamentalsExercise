package ArraysLection;

import java.util.Scanner;

public class p02PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
         int[] numbArr=new int[n];
        for (int i = 0; i <n ; i++){
            numbArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbArr.length-1; i >=0 ; i--) {
            System.out.print(numbArr[i]+" ");

        }




    }
}
