import java.util.*;
import java.util.stream.Collectors;

public class Plants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int days = 0;

        for (int i = 0; i <plants.length ; i++) {
            stack.push(plants[i]);
        }

        for (int i = 1; i <plants.length ; i++) {

            if (plants[i]> plants[i-1]){
                stack.pop();
            }
        }



    }
}

