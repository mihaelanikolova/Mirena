import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int[][] matrix = new int[n][n];

            for (int row = 0; row < matrix.length; row++) {
                String[] input = scanner.nextLine().split(" ");

                for (int col = 0; col < input.length; col++) {
                    matrix[row][col] = Integer.parseInt(input[col]);
                }
            }


            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][i] + " ");

            }
            System.out.println();

            for (int i = 0; i < n; i++) {
                System.out.print(matrix[n - (i + 1)][i] + " ");
            }


        }
    }
