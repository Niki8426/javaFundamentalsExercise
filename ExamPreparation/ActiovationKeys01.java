package ExamPreparation;

import java.util.Scanner;

public class ActiovationKeys01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String activationKey= scanner.nextLine();

        String input= scanner.nextLine();
        while(!input.equals("Generate")){
            String[]inputArr=input.split(">>>");
            String order=inputArr[0];

            if(order.equals("Contains")){
                String subInput=inputArr[1];
                if(activationKey.contains(subInput)){
                    System.out.printf("%s contains %s%n",activationKey,subInput);
                }else{
                    System.out.println("Substring not found!");
                }

            }else if(order.equals("Flip")){
                String size=inputArr[1];
                int firstIndex=Integer.parseInt(inputArr[2]);
                int lastIndex=Integer.parseInt(inputArr[3]);
                if(size.equals("Upper")){
                    String substring=activationKey.substring(firstIndex,lastIndex);
                    String newSubstring=substring.toUpperCase();
                   activationKey= activationKey.replaceAll(substring,newSubstring);

                    System.out.println(activationKey);



                }else{
                    String substring=activationKey.substring(firstIndex,lastIndex);
                    String newSubstring=substring.toLowerCase();
                   activationKey= activationKey.replaceAll(substring,newSubstring);

                    System.out.println(activationKey);

                }

            }else if(order.equals("Slice")){
                int firstIndex=Integer.parseInt(inputArr[1]);
                int lastIndex=Integer.parseInt(inputArr[2]);
                String substring=activationKey.substring(firstIndex,lastIndex);


                activationKey=activationKey.replaceAll(substring,"");

                System.out.println(activationKey);


            }





            input= scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",activationKey);
    }
}
