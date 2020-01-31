import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String [] tokens = line.split("\\s+");
            studentsAndGrades.putIfAbsent(tokens[0],new ArrayList<>());
            studentsAndGrades.get(tokens[0]).add(Double.parseDouble(tokens[1]));

        }
        studentsAndGrades.forEach((k,v) -> {
            String allGrades = v.stream()
                    .map(g -> String.format("%.2f",g))
                    .collect(Collectors.joining(" "));
            double average = v.stream().mapToDouble(e->e).average().orElse(0);
            System.out.println(
                    String.format("%s -> %s (avg: %.2f)",k,allGrades,average));
        });
    }
}
