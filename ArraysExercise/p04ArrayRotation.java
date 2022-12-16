package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());


        int point = 0;
        for (int k = 1; k <= n; k++) {

            point = array[0];
            for (int i = 0; i < array.length - 1; i++) {


                array[i] = point;

                array[i] = array[i + 1];



            }
            array[array.length - 1] = point;

        }
        for (int element : array) {
            System.out.print(element + " ");

        }

    }
}
