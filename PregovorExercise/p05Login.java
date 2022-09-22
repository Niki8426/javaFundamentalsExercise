package PregovorExercise;

import java.util.Scanner;



public class p05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username= scanner.nextLine();
         String password="";
         int counter=0;

        for (int i = username.length()-1; i >=0 ; i--) {
            char currentSymbol= username.charAt(i);
            password+=currentSymbol;


        }

        String enteredPassword=scanner.nextLine();
        while(!enteredPassword.equals(password)){
            counter++;
            if(counter>=4){
                System.out.printf("User %s blocked!",username );
                break;
            }

            System.out.println("Incorrect password. Try again.");

            enteredPassword= scanner.nextLine();








        }

        if(enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",username );
        }

    }
}
