package TextProcessing;

import java.util.Scanner;

public class Substring03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first= scanner.nextLine();
        String second= scanner.nextLine();

        //ice
        //kicegiciceeb

        while(second.contains(first)){

           second=second.replaceAll(first,"");

        }
        System.out.println(second);

    }
}
