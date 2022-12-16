package RegularExpressionExercise;

import java.sql.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> nameList = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        Map<String, Integer> mapRacerList = new LinkedHashMap<>();
        List<String> matcherNameList = new ArrayList<>();


        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        input = scanner.nextLine();

        while (!input.contains("end of race")) {

            Matcher matcherName = patternName.matcher(input);
            Matcher matcherDistance = patternDistance.matcher(input);
            List<String> sbnameList = new ArrayList<>();
            List<String> sbDistanceList = new ArrayList<>();
            int totalDistance = 0;


            while (matcherName.find()) {

                sbnameList.add(matcherName.group());

            }

            while (matcherDistance.find()) {
                sbDistanceList.add(matcherDistance.group());
            }
            int n = sbDistanceList.size();

            int[] distanceArr = new int[n];
            for (int i = 0; i <= sbDistanceList.size() - 1; i++) {
                distanceArr[i] = Integer.parseInt(sbDistanceList.get(i) + "");

            }
            for (int element : distanceArr) {
                totalDistance += element;

            }

            for (String element : nameList) {// обхождаме листа с имена
                if (element.contains(String.join("", sbnameList))) {


                    if (mapRacerList.isEmpty()) {
                        mapRacerList.put(element, totalDistance);
                    } else {
                        if (mapRacerList.containsKey(element)) {
                            int value = 0;
                            value = mapRacerList.get(element);
                            mapRacerList.put(element, value + totalDistance);
                        } else {
                            mapRacerList.put(element, totalDistance);
                        }

                    }


                }
            }

            input = scanner.nextLine();
        }
        List<String>top3names=mapRacerList.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(entry->entry.getKey())
                .collect(Collectors.toList());
        System.out.println("1st place: "+top3names.get(0));
        System.out.println("2nd place: "+top3names.get(1));
        System.out.println("3rd place: "+top3names.get(2));






    }
        

}

