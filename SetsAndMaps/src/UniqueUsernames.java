import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> userNames = new LinkedHashSet<>();

        while (n-- >0){
            String userName = scanner.nextLine();
            userNames.add(userName);
        }


        for (String userName : userNames) {
            System.out.println(userName);
        }

    }
}
