package FINAL_EXAM;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Map<String,String>nameTitleMap=new LinkedHashMap<>();

        int n=Integer.parseInt(scanner.nextLine());
        String regex="\\|(?<name>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern=Pattern.compile(regex);

        for (int i = 1; i <=n ; i++) {
            String input= scanner.nextLine();
            Matcher matcher= pattern.matcher(input);
            if(matcher.find()) {



                    String name = matcher.group("name");
                    String title = matcher.group("title");

                System.out.printf("%s, The %s%n",name,title);
                System.out.printf(">> Strength: %d%n",name.length());
                System.out.printf(">> Armor: %d%n",title.length());



            }else{
                System.out.println("Access denied!");
            }

        }


    }
}
