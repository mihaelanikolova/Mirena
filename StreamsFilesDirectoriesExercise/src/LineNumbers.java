import java.io.*;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\user\\IdeaProjects\\StreamsFilesDirectoriesExercise\\Exercises Resources\\inputLineNumbers.txt";
        String outputPath = "C:\\Users\\user\\IdeaProjects\\StreamsFilesDirectoriesExercise\\output.txt";

        Scanner scanner = new Scanner(new File(path));
        PrintWriter writer = new PrintWriter(outputPath);
        int counter = 1;

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.println(counter+". "+line);
            counter++;
        }

        writer.close();



    }
}
