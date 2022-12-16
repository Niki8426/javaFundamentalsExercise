package ObjectAndClassesExercise.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String[] input= scanner.nextLine().split(" ");
            String name=input[0];
            int age=Integer.parseInt(input[1]);
            Person person= new Person(name,age);
            if(person.getAge()>30){
                System.out.println(person);
            }

        }
    }
}
