package Methods;

import java.util.Scanner;

public class p05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String food= scanner.nextLine();
        int amount=Integer.parseInt(scanner.nextLine());

        if(food.equals("coffee")){
            double price=1.50;
            calculatePriceOfAmount(amount,price);

        }else if(food.equals("water")){
                double price=1.0;
                calculatePriceOfAmount(amount,price);

        }else if(food.equals("coke")){
            double price=1.40;
            calculatePriceOfAmount(amount, price);

        }else if(food.equals("snacks")){
            double price=2.0;
            calculatePriceOfAmount(amount,price);


        }

    }

    public static void calculatePriceOfAmount(int n1,double n2){
        System.out.printf("%.2f",n1*n2);


    }

}
