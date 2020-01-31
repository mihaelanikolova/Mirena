import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String brand = line[0];
            String model = line[1];
            int horsePower = Integer.parseInt(line[2]);
            Car car = new Car();

            car.setBrand(brand) ;
            car.setModel(model);
            car.setHorsePower(horsePower);


            System.out.println(car);
        }






    }
}
