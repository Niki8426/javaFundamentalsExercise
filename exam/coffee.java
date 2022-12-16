package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String[] arr=scanner.nextLine().split(" ");
            if(arr[0].equals("Include")){
                coffeeList.add(arr[1]);

            }else if(arr[0].equals("Remove")){

                if(arr[1].equals("first")){
                    int num=Integer.parseInt(arr[2]);
                    for (int j = 0; j <num; j++) {
                        coffeeList.remove(0);

                    }

                }else if(arr[1].equals("last")){
                    int num=Integer.parseInt(arr[2]);
                    for (int j =0; j<=num ; j++) {
                        coffeeList.remove(coffeeList.size()-1);

                    }

                }



            } else if (arr[0].equals("Prefer")) {
                int num1=Integer.parseInt(arr[1]);
                int num2=Integer.parseInt(arr[2]);
                if(num1<= coffeeList.size()&&num2<= coffeeList.size()){
                    String num3=coffeeList.get(num1);
                    String num4=coffeeList.get(num2);
                    coffeeList.set(num1,num4);
                    coffeeList.set(num2,num3);
                }



            }else if(arr[0].equals("Reverse")){
                Collections.reverse(coffeeList);

            }

        }

        System.out.println("Coffees:");
        for (String item:coffeeList) {
            System.out.print(item+" ");

        }

    }
}
