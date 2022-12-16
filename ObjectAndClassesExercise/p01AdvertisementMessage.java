package ObjectAndClassesExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        String phrases="Excellent product., Such a great product., I always use that product., Best product of its category., Exceptional product., I can’t live without this product.";
        String[] phrasesArr=phrases.split(", ");

       String event="Now I feel good., I have succeeded with this product., Makes miracles. I am happy of the results!, I cannot believe but now I feel awesome., Try it yourself, I am very satisfied., I feel great!";
       List<String> eventList= Arrays.stream(event.split(", ")).collect(Collectors.toList());
        String halfevent=eventList.get(4)+", "+eventList.get(5);
        eventList.set(4,halfevent);
        eventList.remove(5);

        String authors="Diana, Petya, Stella, Elena, Katya, Iva, Annie, Eva";
        String[] authorsArr=authors.split(", ");

        String cities="Burgas, Sofia, Plovdiv, Varna, Ruse";
        String[]citiesArr=cities.split(", ");

        Random rnd=new Random();

        for (int i = 0; i <n ; i++) {

            System.out.printf("%s %s %s – %s%n",phrasesArr[rnd.nextInt(phrasesArr.length)],eventList.get(rnd.nextInt(eventList.size())),authorsArr[rnd.nextInt(authorsArr.length)],citiesArr[rnd.nextInt(citiesArr.length)]);

        }

        System.out.println("");
    }
}
