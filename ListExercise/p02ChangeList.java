package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputOrder = input.split(" ");
            int num = Integer.parseInt(inputOrder[1]);

            if (input.contains("Delete")) {
                for (int i = 0; i <=numbersList.size()-1; i++) {
                    int numList = numbersList.get(i);
                    if (num == numList) {
                        numbersList.remove(i);

                    }


                }

            }else if (input.contains("Insert")) {
                int num1=Integer.parseInt(inputOrder[2]);
                numbersList.add(num1,num);


            }
            input = scanner.nextLine();
        }


        for (int item:numbersList) {
            System.out.print(item+" ");

        }



    }

}

