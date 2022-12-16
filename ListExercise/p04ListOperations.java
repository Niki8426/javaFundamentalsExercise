package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                String[] commandArr = command.split("\\s+");
                int numberToAdd = Integer.parseInt(commandArr[1]);

                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {
                String[] commandArr = command.split("\\s+");
                int numberToInsert = Integer.parseInt(commandArr[1]);
                int index = Integer.parseInt(commandArr[2]);
                if (index > numbers.size() - 1 || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.add(index, numberToInsert);
                }


            } else if (command.contains("Remove")) {

                String[] commandArr = command.split("\\s+");
                int index = Integer.parseInt(commandArr[1]);
                if (index > numbers.size() - 1 || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }


            } else if (command.contains("Shift left")) {
                String[] commandArr = command.split("\\s+");
                int countShiftLeft = Integer.parseInt(commandArr[2]);
                for (int time = 1; time <= countShiftLeft; time++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }


            } else if (command.contains("Shift right")) {
                String[] commandArr = command.split("\\s+");
                int countShiftright = Integer.parseInt(commandArr[2]);
                for (int time = 1; time <= countShiftright; time++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);

                }


            }


            command = scanner.nextLine();
        }
        for (int item : numbers) {
            System.out.print(item + " ");

        }


    }
}

