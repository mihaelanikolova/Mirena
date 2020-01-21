import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix  = new int[size][size];
        int counter = 1;

        if (pattern.equals("A")){
            for (int col = 0; col < matrix[0].length ; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            }
        }else {
            for (int col = 0; col < matrix[0].length ; col++) {
                if (col%2 ==0 ){
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = counter++;
                    }
                }else {
                    for (int row = matrix.length-1; row >=0 ; row--) {
                        matrix[row][col]=counter++;
                    }
                }

            }

        }



        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
