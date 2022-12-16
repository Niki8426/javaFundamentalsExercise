package ArraysExercise;

import java.util.Scanner;

public class p033ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());

        String[]firstArray=new String[rows];
        String[]secondArray=new String[rows];

        for (int i = 1; i <=rows ; i++) {

            String []numbers=scanner.nextLine().split(" ");
            String firstNumber=numbers[0];
            String secondNumber=numbers[1];
            if(i%2==0){
                secondArray[i-1]=firstNumber;
                firstArray[i-1]=secondNumber;

            }else{
                firstArray[i-1]=firstNumber;
                secondArray[i-1]=secondNumber;


            }

        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));


    }
}
