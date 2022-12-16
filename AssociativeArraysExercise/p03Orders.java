package AssociativeArraysExercise;

import java.util.*;

public class p03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        Map<String, List<Double>> productMap = new LinkedHashMap<>();

        List<Double> priceQuantityList = new ArrayList<>();
        double price1 = 0;
        double quantity1 = 0;

        while (!inputArr[0].equals("buy")) {
            String nameProduct = inputArr[0];
            double price = Double.parseDouble(inputArr[1]);
            double quantity = Double.parseDouble(inputArr[2]);
            price1 = price;


            if (!productMap.containsKey(nameProduct)) { //създаваща мапа според входните данни през цикъл
                productMap.put(nameProduct, new ArrayList<>());
            } else { //конструкция за промяна на цени и количества


            }
            productMap.get(nameProduct).add(price);
            productMap.get(nameProduct).add(quantity);


            inputArr = scanner.nextLine().split(" ");

        }

        for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
            double price = 1;
            double quantity = 0;

            List<Double> printList = entry.getValue();
            for (int i = 0; i < printList.size(); i++) {

                if (i % 2 == 0) {
                    price = printList.get(i);

                } else {
                    quantity += printList.get(i);
                }


            }
            System.out.printf("%s -> %.2f%n",entry.getKey(),price*quantity);

        }


    }
}
