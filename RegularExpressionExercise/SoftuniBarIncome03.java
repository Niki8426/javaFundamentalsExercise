package RegularExpressionExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        String regex="%(?<customer>[A-Z]?[a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]+)\\$";
        Pattern pattern=Pattern.compile(regex);
        double totalPrice=0;
        StringBuilder sbName=new StringBuilder();
        StringBuilder sbProduct=new StringBuilder();
        StringBuilder sbCount=new StringBuilder();


         while(!input.contains("end of shift")){
             Matcher matcher= pattern.matcher(input);
             double totalForEachOne=0;

             while(matcher.find()) {
                 String name = matcher.group("customer");
                 String product = matcher.group("product");
                 int count = Integer.parseInt(matcher.group("count"));
                 double price = Double.parseDouble(matcher.group("price"));
                 totalForEachOne = count * price;
                 totalPrice += totalForEachOne;

                 System.out.printf("%s: %s - %.2f%n", name, product, totalForEachOne);
             }





             input= scanner.nextLine();
         }
        System.out.printf("Total income: %.2f",totalPrice);




    }
}
