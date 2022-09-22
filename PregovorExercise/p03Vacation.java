package PregovorExercise;

import java.util.Scanner;

public class p03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
        //•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
        //•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%

        int numberTourist=Integer.parseInt(scanner.nextLine());
        String group= scanner.nextLine();
        String day=scanner.nextLine();
        double price;

        if(day.equals("Friday")){
            if(group.equals("Students")){
                if(numberTourist>=30){
                    price=numberTourist*(8.45-(0.15*8.45));

                }else{
                    price=numberTourist*8.45;
                }
                System.out.printf("Total price: %.2f",price);

            }else if(group.equals("Business")){
                if(numberTourist>=100){
                    price=(numberTourist-10)*10.90;
                }else{
                    price=numberTourist*10.90;
                }
                System.out.printf("Total price: %.2f",price);


            }else if(group.equals("Regular")){
                if(numberTourist>=10&&numberTourist<=20){
                    price=numberTourist*(15-(0.05*15));
                }else{
                    price=numberTourist*15;
                }
                System.out.printf("Total price: %.2f",price);

            }

        }else if(day.equals("Saturday")){
            if(group.equals("Students")){
                if(numberTourist>=30){
                    price=numberTourist*(9.80-(0.15*9.80));

                }else{
                    price=numberTourist*9.80;
                }
                System.out.printf("Total price: %.2f",price);

            }else if(group.equals("Business")){
                if(numberTourist>=100){
                    price=(numberTourist-10)*15.60;
                }else{
                    price=numberTourist*15.60;
                }
                System.out.printf("Total price: %.2f",price);

            }else if(group.equals("Regular")){
                if(numberTourist>=10&&numberTourist<=20){
                    price=numberTourist*(20-(0.05*20));
                }else{
                    price=numberTourist*20;
                }
                System.out.printf("Total price: %.2f",price);

            }

        }else if(day.equals("Sunday")){
            if(group.equals("Students")){
                if(numberTourist>=30){
                    price=numberTourist*(10.46-(0.15*10.46));

                }else{
                    price=numberTourist*10.46;
                }
                System.out.printf("Total price: %.2f",price);

            }else if(group.equals("Business")){
                if(numberTourist>=100){
                    price=(numberTourist-10)*(16*1.00);
                }else{
                    price=numberTourist*10.90;
                }
                System.out.printf("Total price: %.2f",price);

            }else if(group.equals("Regular")){
                if(numberTourist>=10&&numberTourist<=20){
                    price=numberTourist*(22.50-(0.05*22.50));
                }else{
                    price=numberTourist*22.50;
                }
                System.out.printf("Total price: %.2f",price);

            }

        }
    }
}
