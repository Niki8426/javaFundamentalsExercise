package ExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantMap = new LinkedHashMap<>();
        Map<String, Double> rateMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] plantrarityArr = input.split("<->");
            String plant = plantrarityArr[0];
            int rarity = Integer.parseInt(plantrarityArr[1]);
            plantMap.put(plant, rarity);
            rateMap.put(plant, 0.0);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            if (!plantMap.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double value = Double.parseDouble(tokens[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, value);
                        } else {
                            double newRate = (rateMap.get(plant) + value) / 2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(tokens[2]);
                        plantMap.put(plant, rarity);


                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);
                        break;
                }
            }

            input= scanner.nextLine();

        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),rateMap.get(entry.getKey()));
        }

    }
}