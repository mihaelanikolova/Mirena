import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            if(line.length ==3){
                String brand = line[0];
                String model = line[1];
                int horsePower = Integer.parseInt(line[2]);
                Car car = new Car(brand,model,horsePower);
                System.out.println(car.toString());
            }else if (line.length == 1){
                String brand = line[0];
                Car car = new Car(brand);
                System.out.println(car);
            }






        }






    }
}
