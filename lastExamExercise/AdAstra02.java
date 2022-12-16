package lastExamExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        String regex="([#\\|])(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        List<String>nameList=new ArrayList<>();
        List<String>dateList=new ArrayList<>();
        List<String> caloriesList=new ArrayList<>();
        int totalCalories=0;


        while(matcher.find()){
            String name= matcher.group("name");
            String date=matcher.group("date");
            String foodEnergie=matcher.group("calories");

            caloriesList.add(foodEnergie);
            nameList.add(name);
            dateList.add(date);

            int calories=Integer.parseInt(foodEnergie);
            totalCalories+=calories;

        }
        int foodexiest=totalCalories/2000;

        System.out.printf("You have food to last you for: %d days!%n",foodexiest);

        for (int i = 0; i < nameList.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",nameList.get(i),dateList.get(i),caloriesList.get(i));

        }



    }
}
