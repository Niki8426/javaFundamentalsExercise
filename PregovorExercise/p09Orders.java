package PregovorExercise;

import java.util.Scanner;

public class p09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double orderPrice;
        double sum=0.00;

        int N=Integer.parseInt(scanner.nextLine()); // броя на поръчките , които магазина ще получи
        for (int i = 1; i <=N ; i++) {
            double priceCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsuleCount=Integer.parseInt(scanner.nextLine());
            orderPrice=capsuleCount*days*priceCapsule;
            System.out.printf("The price for the coffee is: $%.2f",orderPrice);
            System.out.println("");
            sum+=orderPrice;


        }
        System.out.printf("Total: $%.2f",sum);

    }
}
