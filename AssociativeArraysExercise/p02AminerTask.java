package AssociativeArraysExercise;

import java.util.*;

public class p02AminerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        Map<String, List<Integer>> minerMap=new LinkedHashMap<>();
        List<Integer> quantityList=new ArrayList<>();


        while (!input.equals("stop")){
            String resource=input;
            int quantity=Integer.parseInt(scanner.nextLine());


            if(!minerMap.containsKey(input)){
                minerMap.put(input,new ArrayList<>());
            }

            minerMap.get(input).add(quantity);


            input= scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : minerMap.entrySet()) {

            List<Integer> printList=entry.getValue();
            int number=0;
            for (int item:printList) {
                number+=item;


            }

            System.out.printf("%s -> %d%n",entry.getKey(),number);
        }


    }
}
