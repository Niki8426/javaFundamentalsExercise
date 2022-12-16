package TextProcessing;

import java.util.Scanner;

public class RepeatStrings02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");


        for (String item : inputArr) {
            for (int i = 0; i < item.length(); i++) {
                System.out.print(item);

            }

        }

    }
}
