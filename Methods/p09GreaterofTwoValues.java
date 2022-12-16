package Methods;

import java.util.Scanner;

public class p09GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        if(input.equals("int")){
            int num1=Integer.parseInt(scanner.nextLine());
            int num2=Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(num1,num2));
        }else if(input.equals("char")){
            String g=scanner.nextLine();
            char a=g.charAt(0);
            String d= scanner.nextLine();
            char b=d.charAt(0);
            System.out.println(getMax(a,b));
        }else if(input.equals("string")){
            String a= scanner.nextLine();
            String b= scanner.nextLine();

            System.out.println(getMax(a,b));
        }




    }
     static int getMax(int n1, int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }

    }

     static char getMax(char ch1,char ch2){
        if(ch1>ch2){
            return ch1;
        }
        else{
            return ch2;
        }
     }

     static String getMax(String one, String two){
        if(one.compareTo(two)>0){
            return one;

        }else{
            return two;
        }


     }

}
