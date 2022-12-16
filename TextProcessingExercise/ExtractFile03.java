package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[] inputArr=input.split("\\\\");
        //създавам втори масив който обработва последния елемент от първия масив и го сплитва по точка
        String second=inputArr[inputArr.length-1];
        String []secondArr=second.split("\\.");

        System.out.printf("File name: %s%n",secondArr[0]);
        System.out.printf("File extension: %s",secondArr[1]);



    }
}
