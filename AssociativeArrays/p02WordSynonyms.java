package AssociativeArrays;

import java.util.*;

public class p02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,ArrayList<String>> synonymsMap=new LinkedHashMap<>();


        for (int i = 1; i <=n ; i++) {
            String word= scanner.nextLine();
            String synonyms= scanner.nextLine();
           if(!synonymsMap.containsKey(word)){
               synonymsMap.put(word, new ArrayList<>());
           }
           synonymsMap.get(word).add(synonyms);



        }


        for (Map.Entry<String, ArrayList<String>> entry : synonymsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }


    }
}
