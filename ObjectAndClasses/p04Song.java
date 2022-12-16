package ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04Song {

    static class Songs {
        private String typeList;
        private String name;
        private String time;

        public Songs(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;


        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getTime() {
            return this.time;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Songs> listSong = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");
            Songs currentSong = new Songs(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSong.add(currentSong);


        }

        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Songs item : listSong) {
                System.out.println(item.getName());

            }
        } else {
            for (Songs item : listSong) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }

            }
        }
    }
}
