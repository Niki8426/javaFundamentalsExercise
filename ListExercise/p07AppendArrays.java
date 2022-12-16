package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());


        Collections.reverse(input);//ревърсва
        List<String> strList = Arrays.stream(input.toString().split("")).collect(Collectors.toList());




        System.out.println(strList.toString().replace("[", "").replace("]", "")
              .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }


}




