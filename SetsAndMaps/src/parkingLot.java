import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> parking = new LinkedHashSet<>();


        while (!input.equals("END")){
            String[] tokens = input.split(", ");
            if (tokens[0].equals("IN")){
                parking.add(tokens[1]);
            }else if (tokens[0].equals("OUT")){
                parking.remove(tokens[1]);
            }

            input = scanner.nextLine();
        }

        for (String s : parking) {
            System.out.println(s);
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }

    }
}
