package Lists_Lection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList=new ArrayList<>();
         int minSize=Math.min(firstList.size(), secondList.size());

        for (int i = 0; i <minSize ; i++) {
            int first=firstList.get(i);
            int second=secondList.get(i);

            resultList.add(first);
            resultList.add(second);

        }
        if(firstList.size()> secondList.size()){
            resultList.addAll(firstList.subList(minSize, firstList.size()));

        }else if(secondList.size()> firstList.size()){
            resultList.addAll(secondList.subList(minSize, secondList.size()));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));







    }
}




