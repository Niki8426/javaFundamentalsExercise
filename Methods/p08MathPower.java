package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1=Double.parseDouble(scanner.nextLine());
        double number2=Double.parseDouble(scanner.nextLine());
        DecimalFormat df=new DecimalFormat("0.#####");


        double result=raised(number1,number2);
        System.out.println(df.format(result));



    }
    public static double  raised(double n1, double n2){
double result=1;
        for (int i = 1; i <=n2 ; i++) {

            result=result*n1;
        }
        return result;
    }

}
