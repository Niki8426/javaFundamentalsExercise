package ObjectAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());
        String[]inputArr=input.split(", ");

        Articles articles=new Articles(inputArr[0],inputArr[1],inputArr[2]);


        for (int i = 1; i <=n ; i++) {
            input= scanner.nextLine();
            String[]inputArr1=input.split(": ");
            String checker=inputArr1[0];
            if(checker.contains("Edit")){
                articles.edit(inputArr1[1]);

            }else if(checker.contains("ChangeAuthor")){
                articles.changeAuthor(inputArr1[1]);

            }else if(checker.contains("Rename")){
                articles.rename(inputArr1[1]);

            }


        }
        System.out.println(articles);
    }
}
