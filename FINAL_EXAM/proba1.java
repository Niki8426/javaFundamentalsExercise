package FINAL_EXAM;

import java.util.*;

public class proba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> animalFoodMap = new LinkedHashMap<>();
        Map<String, List<String>> areaAnimalsMap = new LinkedHashMap<>(); //key area value animalName

        while (!input.equals("EndDay")) {
            String[] commandLine = input.split("[: -]+");
            String command = commandLine[0];
            String animalName = commandLine[1];


            if (command.equals("Add")) {
                int foodQuantity = Integer.parseInt(commandLine[2]);
                String area = commandLine[3];
                if (animalFoodMap.containsKey(animalName)) {
                    foodQuantity = animalFoodMap.get(animalName) + foodQuantity;
                }
                animalFoodMap.put(animalName, foodQuantity);
                areaAnimalsMap.putIfAbsent(area, new ArrayList<>()); // !!!!!!!!!!!!!!!!!!!!!
                if(areaAnimalsMap.get(area).contains(animalName)){
                    input = scanner.nextLine();
                    continue;
                }
                else {
                    areaAnimalsMap.get(area).add(animalName);}

            } else if (command.equals("Feed")) {
                int foodQ = Integer.parseInt(commandLine[2]);
                if (animalFoodMap.containsKey(animalName)) {
                    foodQ = animalFoodMap.get(animalName) - foodQ;
                    if (foodQ <= 0) {
                        animalFoodMap.remove(animalName);
                        animalToRemove(areaAnimalsMap,animalName);
                    } else {
                        animalFoodMap.put(animalName, foodQ);
                    }
                }

            }

            input = scanner.nextLine();
        }

        System.out.println("Animals:");
        for (Map.Entry<String, Integer> entry : animalFoodMap.entrySet()) {
            System.out.printf(" %s -> %dg%n",entry.getKey(),entry.getValue());
        }

        System.out.println("Areas with hungry animals:" );
        for (Map.Entry<String, List<String>> entry : areaAnimalsMap.entrySet()) {
            if(entry.getValue().isEmpty()){
                continue;
            }
            System.out.printf(" %s: %d%n",entry.getKey(),entry.getValue().size());

        }


    }
    public static void animalToRemove(Map<String,List<String>> areaMap, String animalToRemove ){
        for (Map.Entry<String, List<String>> entry : areaMap.entrySet()) {
            for (String animal:entry.getValue()) {
                if(animal.equals(animal)){
                    entry.getValue().remove(animalToRemove);
                    break;
                }
            }
        }

        System.out.printf("%s was successfully fed%n", animalToRemove);
    }
}
