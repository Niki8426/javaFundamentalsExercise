package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p05Students {

    public static class Student{
        private String firstName;
        private String secondName;
        private int age;
        private String homeTown;

        public Student(String firstName,String secondName,int age,String homeTown){
            this.firstName=firstName;
            this.secondName=secondName;
            this.age=age;
            this.homeTown=homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        List<Student> studentList=new ArrayList<>();

        while(!input.equals("end")){
            String[] inputArr=input.split(" ");
            Student newStudent=new Student(inputArr[0],inputArr[1],Integer.parseInt(inputArr[2]),inputArr[3]);
            studentList.add(newStudent);

            input= scanner.nextLine();
        }

     String   inputCity= scanner.nextLine();

        for (Student item:studentList) {
            if(item.getHomeTown().equals(inputCity)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getSecondName(),item.getAge());
            }



        }



    }
}
