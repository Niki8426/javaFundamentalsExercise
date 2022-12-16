package Lists_Lection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sizeList= numList.size();
        for (int i = 0; i <sizeList/2; i++) {
            numList.set(i, numList.get(i)+numList.get(numList.size()-1));
            numList.remove(numList.size()-1);

        }
        for (int item:numList) {
            System.out.print(item+" ");
        }

    }
}
