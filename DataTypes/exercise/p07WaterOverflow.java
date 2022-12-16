package DataTypes.exercise;

import java.util.Scanner;

public class p07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterTank=255;
        int n=Integer.parseInt(scanner.nextLine());
        int sumWater=0;
        for (int i = 0; i <n ; i++) {
            int liters=Integer.parseInt(scanner.nextLine());
            sumWater+=liters;
            if(sumWater>waterTank){
                System.out.println("Insufficient capacity!");

                    sumWater-=liters;
            }


        }
        System.out.println(sumWater);
    }
}
