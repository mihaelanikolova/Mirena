import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        System.out.println(rows);
        System.out.println(cols);

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(", ");

            for (int col = 0; col < input.length; col++) {
                int number = Integer.parseInt(input[col]);
                matrix[row][col] = number;
                sum += number;

            }

        }

        System.out.println(sum);


        
    }
}
