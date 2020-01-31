import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeFiles {
    public static void main(String[] args) throws IOException {
        String pathOne ="C:\\Users\\user\\IdeaProjects\\StreamsFilesDirectoriesExercise\\Exercises Resources\\inputOne.txt";
        String pathTwo = "C:\\Users\\user\\IdeaProjects\\StreamsFilesDirectoriesExercise\\Exercises Resources\\inputTwo.txt";
        Scanner scanner = new Scanner(new File(pathOne));
        PrintWriter writer = new PrintWriter("MergeOutput.txt");

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.append(line).append(System.lineSeparator());


        }
        scanner = new Scanner(new File(pathTwo));

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.append(line).append(System.lineSeparator());
        }
        writer.close();
        
        
    }
}
