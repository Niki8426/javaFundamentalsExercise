package Lists_Lection;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.#");

        List<Double> numbersList=Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i <numbersList.size() ; i++) {
            if(i== numbersList.size()-1){
                break;
            }

            double currentNum=numbersList.get(i);
            double secondCurrentNum=numbersList.get(i+1);
            if(currentNum==secondCurrentNum){

                numbersList.set(i, currentNum+secondCurrentNum);
                numbersList.remove(i+1);
                i=-1;
            }

        }
        for (double element:numbersList) {
            System.out.print(df.format(element)+" ");

        }

    }
}


