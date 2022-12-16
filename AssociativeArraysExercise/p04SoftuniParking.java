package AssociativeArraysExercise;

import java.util.*;

public class p04SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = "";
        String userName = "";
        String plateNumber = "";

        Map<String, String> parkingRegistMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            if (inputArr[0].equals("unregister")) {
                command = inputArr[0];
                userName = inputArr[1];
            } else {


                command = inputArr[0];
                userName = inputArr[1];
                plateNumber = inputArr[2];
            }

            if (command.equals("register")) { //първа команда register!

                if (!parkingRegistMap.containsKey(userName)) {//ако няма регистрация
                    parkingRegistMap.put(userName, plateNumber);

                    System.out.printf("%s registered %s successfully%n", userName, plateNumber);
                } else { // ако има регистрация

                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);

                }


            }
            if (command.equals("unregister")) {
                if (!parkingRegistMap.containsKey(userName)) {//ако не се намери такъв запис
                    System.out.printf("ERROR: user %s not found%n", userName);
                } else {//ако проверката мине успешно
                    System.out.printf("%s unregistered successfully%n", userName);
                    parkingRegistMap.remove(userName);
                }

            }

        }

        for (Map.Entry<String, String> entry : parkingRegistMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
