package TextProcessingExercise;

        import java.util.Scanner;

public class CaesarCipher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        char[] charArr=input.toCharArray();

        for (int i = 0; i < charArr.length ; i++) {
            int num=charArr[i];

            sb.append((char)(num+3));

        }
        System.out.println(sb.toString());
    }
}
