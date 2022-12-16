package RegularExpressionExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        double totalPrice = 0;
        List<String> nameProductList = new ArrayList<>();


        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {

                String nameProduct = matcher.group("furniture");
                nameProductList.add(nameProduct);
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                totalPrice += price * quantity;
            }


            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String element : nameProductList) {
            System.out.println(element);

        }
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
