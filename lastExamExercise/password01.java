package lastExamExercise;

import java.util.Scanner;

public class password01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {

            if (input.equals("TakeOdd")) {
                password = takeOddPass(password);

                System.out.println(password);

            } else if (input.contains("Cut")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int length = Integer.parseInt(input.split("\\s+")[2]);
                String substring=password.substring(index,index+length);
                password=password.replaceFirst(substring,"");
                System.out.println(password);


            } else if (input.contains("Substitute")) {
                    String substring=input.split("\\s+")[1];
                    String subtitute=input.split("\\s+")[2];
                    if(password.contains(substring)){
                        password=password.replaceAll(substring,subtitute);
                        System.out.println(password);
                    }else{
                        System.out.println("Nothing to replace!");
                    }

            }

            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);


    }

    private static String takeOddPass(String password) {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i <= password.length() - 1; i++) {

            char symbol = password.charAt(i);
            if (i % 2 != 0) {
                sb1.append(symbol);

            }

        }
        return sb1.toString();
    }
}

