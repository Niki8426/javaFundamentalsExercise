package ObjectAndClassesExercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String name;
        String id;
        int age;
        List<PersonData> personDataList=new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" ");
            name = inputArr[0];
            id = inputArr[1];
            age = Integer.parseInt(inputArr[2]);
            PersonData person=new PersonData(name,id,age);
            personDataList.add(person);


            input = scanner.nextLine();
        }

        personDataList.sort(Comparator.comparing(PersonData::getAge));

        for (PersonData element:personDataList) {
            System.out.println(element);

        }


    }
}
