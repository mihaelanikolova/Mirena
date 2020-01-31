import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        TreeMap<Character,Integer> charactersWithOccurrences = new TreeMap<>();

        for (char symbol : input.toCharArray()) {
            charactersWithOccurrences.putIfAbsent(symbol,0);
            charactersWithOccurrences.put(symbol,charactersWithOccurrences.get(symbol) +1);

        }

        System.out.println(charactersWithOccurrences.entrySet()
                .stream()
                .map(e -> String.format("%c: %d time/s", e.getKey(), e.getValue()))
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
