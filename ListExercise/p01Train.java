package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonPassengers = Integer.parseInt(scanner.nextLine());

        String inputStr = scanner.nextLine();
        while (!inputStr.equals("end")) {
            if (inputStr.contains("Add")) {
                String[] inputArr = inputStr.split(" ");
                int num = Integer.parseInt(inputArr[1]);
                wagonList.add(num);

            } else {
                int num = Integer.parseInt(inputStr);

                for (int i = 0; i <= wagonList.size() - 1; i++) {
                    int numbersOfWagonPassengers = wagonList.get(i);
                    if (num + numbersOfWagonPassengers <= maxWagonPassengers) {
                        wagonList.set(i, num + numbersOfWagonPassengers);
                        break;
                    }

                }


            }
            inputStr = scanner.nextLine();
        }

        for (int item : wagonList) {
            System.out.print(item + " ");

        }

    }
}
