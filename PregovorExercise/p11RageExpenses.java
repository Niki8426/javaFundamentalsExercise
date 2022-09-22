package PregovorExercise;

import java.util.Scanner;

public class p11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());

        int countHeadset=lostGames/2;
        int countMouse=lostGames/3;
        int countkeyboard=lostGames/6;
        int countDisplay=lostGames/12;

        double finalSum=(countHeadset*headsetPrice)+(countMouse*mousePrice)+(countkeyboard*keyboardPrice)+(countDisplay*displayPrice);
        System.out.printf("Rage expenses: %.2f lv.",finalSum);


    }
}
