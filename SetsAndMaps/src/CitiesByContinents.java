import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CitiesByContinents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String,List<String>>> town = new LinkedHashMap<>();

        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <size ; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            town.putIfAbsent(continent, new LinkedHashMap<>());
            town.get(continent).putIfAbsent(country, new ArrayList<>());
            town.get(continent).get(country).add(city);


        }


        for (Map.Entry<String, Map<String, List<String>>> entry : town.entrySet()) {
            System.out.println(entry.getKey()+":");
            for (Map.Entry<String, List<String>> country : entry.getValue().entrySet()) {
                System.out.println("  " + country.getKey()+" -> "+ String.join(", ",country.getValue()) );

            }
        }
        }
    }

