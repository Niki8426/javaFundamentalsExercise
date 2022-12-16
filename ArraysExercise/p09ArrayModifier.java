package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command= scanner.nextLine();
        while(!command.equals("end")){


            if(command.contains("swap")){
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2= Integer.parseInt(command.split(" ")[2]);
                int element1=numbers[index1];
                int element2=numbers[index2];
                numbers[index1]=element2;
                numbers[index2]=element1;

            }else if(command.contains("multiply")){

                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2= Integer.parseInt(command.split(" ")[2]);
                int element1=numbers[index1];
                int element2=numbers[index2];

                int product=element1*element2;
                numbers[index1]=product;



            }else if(command.equals("decrease")){
                for (int i = 0; i <= numbers.length-1 ; i++) {
                    numbers[i]--;

                }

            }



            command= scanner.nextLine();
        }

        //отпечатваме : ", "
        for (int index = 0; index <= numbers.length-1 ; index++) {
            int currentNumber=numbers[index];
            if(index!=numbers.length-1){
                //не сме на последното число
                System.out.print(currentNumber+", ");
            }else{
                //намираме се на последното число
                System.out.print(currentNumber);
            }

        }
    }
}
