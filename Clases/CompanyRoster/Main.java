import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new HashMap();


        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];

            Employee employee;

            if (line.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (line.length == 6) {
                employee = new Employee(name, salary, position, department, line[4], Integer.parseInt(line[5]));
            } else {
                try {
                    int age = Integer.parseInt(line[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException ex) {
                    employee = new Employee(name, salary, position, department, line[4]);
                }
            }
            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);
        }


        Department maxDepartment = departments
                .entrySet()
                .stream()
                .max(Comparator.comparing(f -> f.getValue().getAvgSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: "+maxDepartment.getName());

        maxDepartment.getEmployees()
                .stream()
                .sorted((f,s) -> Double.compare(s.getSalary(), f.getSalary()))
                .forEach(System.out::println);
    }
}

