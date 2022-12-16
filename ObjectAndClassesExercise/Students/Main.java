package ObjectAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Student> studentList=new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String input= scanner.nextLine();
            String firstName=input.split(" ")[0];
            String lastName=input.split(" ")[1];
            double grade=Double.parseDouble(input.split(" ")[2]);
            Student student=new Student(firstName,lastName,grade);
            studentList.add(student);

        }
       studentList.sort(Comparator.comparing(Student::getGrade).reversed()); //сравняване на обекти по оценка на студента

        for (Student element:studentList) {
            System.out.println(element);// елемент ми е обекта
        }



    }
}
