package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        char[]textArr=text.toCharArray();
        Map<Character,Integer> symbolCount=new LinkedHashMap<>();
        for (char symbol :textArr) {
            if(symbol==' '){
                continue;
            }
             if(!symbolCount.containsKey(symbol)){
                 symbolCount.put(symbol,1);
             }else{
                 int currentCount=symbolCount.get(symbol);// tekushtiq broi na sreshtaniqta
                 symbolCount.put(symbol,currentCount+1);

             }

        }

        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }


    }
}
