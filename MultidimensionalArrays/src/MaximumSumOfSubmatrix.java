import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {

            String[] input = scanner.nextLine().split(", ");
            for (int col = 0; col < input.length; col++) {

                int number = Integer.parseInt(input[col]);
                matrix[row][col] = number;
            }
        }
        int bestSum = Integer.MIN_VALUE;
        int sum = 0;
        int resultRow=0;
        int resultCol=0;

        for (int row = 0; row < matrix.length - 1; row++)
            for (int col = 0; col < matrix[row].length - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    resultRow= row;
                    resultCol = col;

                }
            }


        for (int row = resultRow; row < resultRow +2; row++) {
            for (int col = resultCol; col < resultCol +2 ; col++) {

                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);

    }
}
