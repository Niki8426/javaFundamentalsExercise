package PregovorExercise;

import java.util.Scanner;

public class p07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String insert=scanner.nextLine();
        double sum=0;
        double coin;

        while(!insert.equals("Start")){
            while(!insert.equals("Start")){
                coin=Double.parseDouble(insert);
                if(coin==0.1){
                    sum+=coin;
                }else if(coin==0.2){
                    sum+=coin;
                }else if(coin==0.5){
                    sum+=coin;

                }else if(coin==1){
                    sum+=coin;;
                }else if(coin==2){
                    sum+=coin;
                }else{
                    System.out.printf("Cannot accept %.2f\n",coin);
                }

                insert=scanner.nextLine();

            }



        }
        while(!insert.equals("End")){



            if(insert.equals("Water")){
                if(sum>=0.7){
                    sum=sum-0.7;
                    System.out.println("Purchased Water");
                }else {
                    System.out.println("Sorry, not enough money");

                }


            }else if(insert.equals("Soda")){
                if(sum>=0.8){
                    sum=sum-0.8;
                    System.out.println("Purchased Soda");
                }else{
                    System.out.println("Sorry, not enough money");

                }


            }else if(insert.equals("Coke")){
                if(sum>=1.0){
                    sum=sum-1.0;
                    System.out.println("Purchased Coke");
                }else{
                    System.out.println("Sorry, not enough money");


                }

            }else if(insert.equals("Crisps")){
                if(sum>=1.5){
                    sum=sum-1.5;
                    System.out.println("Purchased Crisps");

                }else{
                    System.out.println("Sorry, not enough money");


                }


            }else if(insert.equals("Nuts")){
                if(sum>=2.0){
                    sum=sum-2.0;
                    System.out.println("Purchased Nuts");
                }else{
                    System.out.println("Sorry, not enough money");

                }


            }else if(insert.equals("Start")){


            }else if(insert.equals("End")){

                break;


            }else{
                System.out.println("Invalid product");
            }


            insert= scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);

    }
}
