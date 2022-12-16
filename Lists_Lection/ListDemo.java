package Lists_Lection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   List<Integer> num=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());





        }



    }

