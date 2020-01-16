import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int countToPush = parameters[0];
        int elementsToPop = parameters[1];
        int lookupElement = parameters[2];

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

         Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                 .limit(countToPush)
                 .forEach(numbers::push);

        for (int i = elementsToPop; i >0 ; i--) {
            numbers.pop();

        }


        if (numbers.contains(lookupElement)){
            System.out.println("true");
        }else {
            if (numbers.size()==0){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(numbers));
            }
        }





    }
}
