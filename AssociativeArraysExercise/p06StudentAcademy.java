package AssociativeArraysExercise;

import java.util.*;

public class p06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();



        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);

        }

        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrade = entry.getValue();
            double averageGrade = getAverageGrade(listGrade); //средна оценка
            if (averageGrade >= 4.50) {
                averageGradeStudents.put(studentName, averageGrade);
            }

        }

        //отпечатваме мапа averageGradeStudents

        for (Map.Entry<String, Double> entry : averageGradeStudents.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }


    }

    private static double getAverageGrade(List<Double> listGrades) {

        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades += grade;

        }
        return sumGrades / listGrades.size();

    }
}
