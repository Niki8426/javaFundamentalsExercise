package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p06Students2 {

    public static class Studentmod {
        private String firstName;
        private String secondName;
        private int age;
        private String homeTown;

        public Studentmod(String firstName, String secondName, int age, String homeTown) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Studentmod> studentList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] arrStudentData = input.split("\\s+");
            String firstName = arrStudentData[0];
            String lastName = arrStudentData[1];
            int age = Integer.parseInt(arrStudentData[2]);
            String town = arrStudentData[3];

            Studentmod currentStudent = new Studentmod(firstName, lastName, age, town);




            if(isStudentExists(studentList,firstName,lastName)){
                currentStudent.setFirstName(firstName);
                currentStudent.setSecondName(lastName);
                currentStudent.setAge(age);
                currentStudent.setHomeTown(town);



            }else{
                studentList.add(currentStudent);
            }



            input = scanner.nextLine();
        }

        String inputCity = scanner.nextLine();

        for (Studentmod item : studentList) {

            if (item.getHomeTown().equals(inputCity)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getSecondName(), item.getAge());
            }


        }


    }

    static boolean isStudentExists(List<Studentmod> studentList, String firstName, String lastName) {
        for (Studentmod item : studentList) {
            if (item.getFirstName().equals(firstName) && item.getSecondName().equals(lastName)) {


                return true;
            }

        }
        return false;
    }
}






