package DataTypes.exercise;

import java.util.Scanner;

public class p08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        double maxVolume=Double.MIN_VALUE;
        String maxModelKeg = "";
        for (int i = 0; i < n; i++) {
           String keg= scanner.nextLine();
           double radius=Double.parseDouble(scanner.nextLine());
           int height=Integer.parseInt(scanner.nextLine());
           double sizeKeg=Math.PI*(radius*radius)*height;

           if(sizeKeg>maxVolume){
               maxVolume=sizeKeg;
               maxModelKeg=keg;
           }



        }
        System.out.println(maxModelKeg);
    }
}
