package lastExamExercise;

import java.util.*;

public class heroes03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        Map<String, Integer> hpMap = new LinkedHashMap<>();
        Map<String, Integer> mpMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            String name = text.split(" ")[0];
            int hpPoint = Integer.parseInt(text.split(" ")[1]);
            int mpPoint = Integer.parseInt(text.split(" ")[2]);


            if (hpPoint <= 100) {
                hpMap.put(name, hpPoint);


            }

            if (mpPoint <= 200) {
                mpMap.put(name, mpPoint);


            }
            String input = scanner.nextLine();


            while (!input.contains("End")) {

                String command = input.split("\\s+-\\s+")[0];


                if (input.contains("CastSpell")) {
                    String heroname = input.split("\\s+-\\s+")[1];
                    int mpNeeded = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    String spell = input.split("\\s+-\\s+")[3];
                    int currentMp = mpMap.get(heroname);
                    if (currentMp >= mpNeeded) {
                        int mpleft = currentMp - mpNeeded;

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroname, spell, mpleft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroname, spell);
                    }


                } else if (input.contains("TakeDamage")) {
                    String heroname = input.split("\\s+-\\s+")[1];
                    int damage = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    String atacker = input.split("\\s+-\\s+")[3];

                    int currentHP = hpMap.get(heroname);
                    currentHP -= damage;
                    if (currentHP > 0) {

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroname, damage, atacker, currentHP);
                        hpMap.put(heroname, currentHP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroname, atacker);
                        hpMap.remove(heroname);
                        mpMap.remove(heroname);
                    }


                } else if (input.contains("Recharge")) {
                    String heroname = input.split("\\s+-\\s+")[1];
                    int amount = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    int currentMP = hpMap.get(heroname);
                    currentMP += amount;

                    if (currentMP > 200) {

                        currentMP = 200;
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroname, currentMP - mpMap.get(heroname));
                    mpMap.put(heroname, currentMP);

                } else if (input.contains("Heal")) {

                    String heroname = input.split("\\s+-\\s+")[1];
                    int amount = Integer.parseInt(input.split("\\s+-\\s+")[2]);
                    int currentHP = hpMap.get(heroname);
                    currentHP += amount;

                    if (currentHP > 100) {
                        currentHP = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroname, currentHP - hpMap.get(heroname));
                    hpMap.put(heroname, currentHP);

                }


                input = scanner.nextLine();
            }

            hpMap.entrySet().forEach(entry -> {
                String heroName = entry.getKey();
                System.out.println(heroName);
                System.out.println("HP: " + entry.getValue());
                System.out.println("MP: " + hpMap.get(heroName));
            });
        }
    }
}
