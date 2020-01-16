import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int elementsToAdd = parameters[0];
        int elementsToRemove = parameters[1];
        int lookupNumber = parameters[2];

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).limit(elementsToAdd).forEach(numbers::offer);


        for (int i = 0; i < elementsToRemove; i++) {
            numbers.poll();

        }


        if (numbers.contains(lookupNumber)){
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
