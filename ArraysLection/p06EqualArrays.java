package ArraysLection;

import java.util.Arrays;
import java.util.Scanner;

public class p06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first= scanner.nextLine();
        String second= scanner.nextLine();
        int sum=0;
        int index=0;
        boolean isTrue=true;
        
        int[]firstArr= Arrays.stream(first.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[]secondArr=Arrays.stream(second.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <firstArr.length ; i++) {
            if(firstArr[i]==secondArr[i]){
                sum+=firstArr[i];
                isTrue=true;


            }else{
                index=i;
                isTrue=false;
                System.out.printf("Arrays are not identical. Found difference at %d index.",index);
                break;

            }
            
        }
        if(isTrue) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
        
    }
}
