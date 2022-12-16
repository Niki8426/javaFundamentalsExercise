package Lists_Lection;

import java.util.*;
import java.util.stream.Collectors;

public class p06ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        List<String> inputLIst= new ArrayList<>();
        for (int i = 0; i <num ; i++) {
            String product= scanner.nextLine();

            inputLIst.add(product);

        }
        Collections.sort(inputLIst);
        for (int i = 0; i < inputLIst.size() ; i++) {
            System.out.println(i+1+"."+inputLIst.get(i));

        }


    }
}
