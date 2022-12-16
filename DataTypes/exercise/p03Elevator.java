package DataTypes.exercise;

import java.util.Scanner;

public class p03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person=Integer.parseInt(scanner.nextLine());
        int capacity=Integer.parseInt(scanner.nextLine());
        int course= person/capacity;
        double coursePlus=person%capacity;
        if(coursePlus>0){
            System.out.println(course+1);

        }
        else{
            System.out.println(course);

        }





    }
}
