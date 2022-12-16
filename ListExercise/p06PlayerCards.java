package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p06PlayerCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int firstCounter=0;
        int secondCounter=0;

        while(firstPlayer.size()!=0&& secondPlayer.size()!=0) {
            int firstCard= firstPlayer.get(0);
            int secondCard= secondPlayer.get(0);

            if(firstCard==0||secondCard==0){
                break;
            }



            if (firstCard > secondCard) {
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
                firstPlayer.remove(0);
                secondPlayer.remove(0);


            }else if(firstCard<secondCard){
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            }else if(firstCard==secondCard){
                firstPlayer.remove(0);
                secondPlayer.remove(0);



            }

        }
        int firstSum=0;
        int secondSum=0;
        for (int item:firstPlayer) {
            firstSum+=item;

        }

        for (int item:secondPlayer) {
            secondSum+=item;

        }
        if (firstSum>secondSum){
            System.out.printf("First player wins! Sum: %d",firstSum);

        }else if(secondSum>firstSum){
            System.out.printf("Second player wins! Sum: %d",secondSum);

        }


    }
}
