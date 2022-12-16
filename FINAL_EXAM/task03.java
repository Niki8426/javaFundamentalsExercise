package FINAL_EXAM;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regexAdd = "Add: (?<name>[A-Za-z]+)-(?<food>\\d{1,})-(?<area>[A-Za-z]+)";
        String regexFeed = "Feed: (?<name>[A-Za-z]+)-(?<food>\\d{1,})";
       List<String>nameList=new ArrayList<>();
       List<Integer>foodList=new ArrayList<>();
       List<String>areaList=new ArrayList<>();
       int counter=0;


        while (!input.equals("EndDay")) {
            if (input.contains("Add:")) {
                Pattern pattern = Pattern.compile(regexAdd);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    String name = matcher.group("name");
                    String food = matcher.group("food");
                    String area = matcher.group("area");
                   nameList.add(name);
                   foodList.add(Integer.parseInt(food));
                   areaList.add(area);


                }

            } else {
                Pattern pattern = Pattern.compile(regexFeed);
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    String name = matcher.group("name");
                    String food1 = matcher.group("food");
                    int food = Integer.parseInt(food1);
                    for (int i = 0; i < nameList.size() ; i++) {
                        String name1=nameList.get(i);
                        if(name.equals(name1)){
                            int listFood=foodList.get(i);
                            if(food-listFood<=0){
                                nameList.remove(i);
                                foodList.remove(i);
                                areaList.remove(i);
                            }
                            
                        }

                    }



                }

            }

        }


        for (int i = 0; i < areaList.size() ; i++) {
            String area= areaList.get(i);
            if(i+1<= areaList.size()-1) {
                String area1 = areaList.get(i + 1);
                if(area.equals(area1)){
                    counter++;
                }

            }

            
        }
        System.out.println("Animals:");
        for (int i = 0; i < nameList.size() ; i++) {
            System.out.printf("%s -> %d%n",nameList.get(i),foodList.get(i));

            
        }
        System.out.println("Areas with hungry animals:");
        for (int i = 0; i <=counter ; i++) {
            System.out.printf(" {area_name}: {number_of_hungry_animals}",areaList.get(i),nameList.size());

        }



    }
}
