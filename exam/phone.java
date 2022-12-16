package exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phones= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input= scanner.nextLine();
        while(!input.equals("End")){
            String[]arr=input.split(" - ");
            String[]secondArr;

            if(arr[0].equals("Add")){
                if(phones.contains(arr[1])){

                }else{
                    phones.add(arr[1]);
                }



            }else if(arr[0].equals("Remove")){
                if(phones.contains(arr[1])){
                    phones.remove(arr[1]);


                }

            }else if(arr[0].equals("Bonus phone")){
                if(phones.contains(":")){
                    secondArr=arr[1].split(":");
                    if(phones.contains(secondArr[0])){

                        phones.add(phones.indexOf(secondArr[0])+1,secondArr[1]);
                    }



                }

            }else if(arr[0].equals("Last")){
                if(phones.contains(arr[1])){
                    phones.indexOf(arr[1]);
                    String ghostString=arr[1];
                    phones.remove(phones.indexOf(arr[1]));
                    phones.add(ghostString);
                }

            }
               input= scanner.nextLine();
        }
        for (String item:phones) {
            System.out.print(item);

        }

    }
}
