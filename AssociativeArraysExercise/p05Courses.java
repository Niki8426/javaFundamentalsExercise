package AssociativeArraysExercise;

import java.util.*;

public class p05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        String course="";
        String name="";

        Map<String, List<String>>courseMap=new LinkedHashMap<>();


        while(!input.contains("end")){
            String[]inputArr=input.split(" : ");
             course=inputArr[0];
             name=inputArr[1];

             if(!courseMap.containsKey(course)){

                 courseMap.put(course,new ArrayList<>());

             }
             courseMap.get(course).add(name);





            input= scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            List<String> mapList=entry.getValue();
            System.out.printf("%s: %d%n",entry.getKey(),mapList.size());
            for (String item:mapList) {

                System.out.printf("-- %s%n",item);

                
            }
        }

    }
}
