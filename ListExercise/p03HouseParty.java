package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guestNames = new ArrayList<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();
            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = commandParts.get(0);
            if (command.contains("is going!")) {//is going
                if (guestNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestNames.add(name);
                }


            } else if (command.contains("is not going!")) {//not going
                if (guestNames.contains(name)) {
                    guestNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }


        }
        for (String name:guestNames) {
            System.out.println(name);

        }

    }
}
