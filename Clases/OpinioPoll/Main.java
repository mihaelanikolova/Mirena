import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll> persons = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            OpinionPoll person = new OpinionPoll(name, age);

            if (person.getAge() > 30) {
                persons.add(person);
            }
        }

        persons.stream()
                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .forEach(p ->{
                    System.out.printf("%s - %d%n",p.getName(),p.getAge());
                });



    }
}
