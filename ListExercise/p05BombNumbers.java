package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data[1]);
        int sum=0;

        while(elements.contains(bombNumber)){
            int elementIndex=elements.indexOf(bombNumber);
            int left=Math.max(0,elementIndex-power);
            int right=Math.min(elementIndex+power,elements.size()-1);

            for(int i=right;i>=left;i--){
                elements.remove(i);
            }

        }
        for (int item:elements) {

          sum+=item;
            System.out.print(sum);
        }

    }
}
