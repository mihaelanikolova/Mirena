import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,String> phoneBook = new HashMap<>();

        while (!"search".equals(input)){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];
            phoneBook.putIfAbsent(name,number);
            phoneBook.put(name,number);
            input = scanner.nextLine();

        }

        String searchName =scanner.nextLine();
        while (!"stop".equals(searchName)){
            if (phoneBook.containsKey(searchName)){
                String num= phoneBook.get(searchName);
                System.out.println(String.format("%s -> %s",searchName,num));
            }else {
                System.out.println(String.format("Contact %s does not exist.",searchName));
            }
            searchName = scanner.nextLine();
        }
    }
}
