package exam;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPr = Double.parseDouble(scanner.nextLine());
        double eggPr = Double.parseDouble(scanner.nextLine());
        double apronPr = Double.parseDouble(scanner.nextLine());

        //  double apronsPrice = students * apronPr;
        double apronsTotal =Math.ceil(students+(students*0.20));
        double apronsTotalPrice = apronsTotal*apronPr;
        double eggTotalPrice = (10 * students) * eggPr;
        int flourDiscount = students / 5;
        double flourTotalPrice = (students - flourDiscount) * flourPr;

        double total = apronsTotalPrice + eggTotalPrice + flourTotalPrice;

        double neededMoney = budget - total;
        if (total <= budget) {
            System.out.printf("Items purchased for %.2f$.", total);
        } else {
            System.out.printf("%.2f$ more needed",Math.abs(neededMoney));
        }
    }
}