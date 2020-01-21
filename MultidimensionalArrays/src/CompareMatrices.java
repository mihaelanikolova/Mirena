import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][]  firstMatrix = new int[dimensions[0]][dimensions[1]];

        for (int row = 0; row < firstMatrix.length; row++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            firstMatrix[row] = new int[inputData.length];

            for (int col = 0; col <inputData.length ; col++) {
                int number = Integer.parseInt(inputData[col]);
                firstMatrix[row][col] = number;
            }

        }

         int[] secondDimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] secondMatrix = new int[secondDimensions[0]][secondDimensions[1]];

        for (int row = 0; row < secondMatrix.length; row++) {
            String[] inputData = scanner.nextLine().split("\\s+");
            secondMatrix[row] = new int[inputData.length];

            for (int col = 0; col <inputData.length ; col++) {
                int number = Integer.parseInt(inputData[col]);
                secondMatrix[row][col] = number;
            }

        }

       if (dimensions[0] != secondDimensions[0]){
           System.out.println("not equal");
           return;
       }

       boolean areEqual = true;

       for (int row = 0; row < firstMatrix.length ; row ++){
           boolean areArraysNotEqual = firstMatrix[row].length != secondMatrix[row].length;

           if (areArraysNotEqual){
               System.out.println("not equal");
               return;
           }

           for (int col = 0; col < firstMatrix[row].length; col++) {
               int firstValue = firstMatrix[row][col];
               int secondValue = secondMatrix[row][col];

               if (firstValue != secondValue){
                   System.out.println("not equal");
                   return;
               }


           }
       }
       if (areEqual){
           System.out.println("equal");
       }
    }
}
