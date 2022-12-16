package ListExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());

        double hay = Double.parseDouble(scanner.nextLine());

        double cover = Double.parseDouble(scanner.nextLine());

        double pigWeight=Double.parseDouble(scanner.nextLine());

        food=food*1000;
        hay=hay*1000;
        cover=cover*1000;
        pigWeight=pigWeight*1000;
        boolean isTrue=false;

        DecimalFormat df=new DecimalFormat("0.##");


        for (int i = 1; i <= 30; i++) {

            while(!(food < 0 || hay < 0 || cover < 0)) {


                food = food - 300;

                if (i % 2 == 0) {
                    hay = hay - (0.05 * food);
                }
                if (i % 3 == 0) {
                    cover = cover - ( pigWeight/3);
                }

            }
              if(food < 0 || hay < 0 || cover < 0) {

                  isTrue = true;
                  break;
              }



        }
        if(isTrue){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food/1000, hay/1000, cover/1000);
        }

    }
}
