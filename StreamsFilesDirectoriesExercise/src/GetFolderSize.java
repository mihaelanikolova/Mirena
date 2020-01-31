import java.io.File;
import java.io.IOException;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {

        String pathOne = "C:\\Users\\user\\IdeaProjects\\StreamsFilesDirectoriesExercise\\Exercises Resources";
        File file = new File(pathOne);

        long size = 0;

        for (File innerFile : file.listFiles()) {
            size += innerFile.length();
        }
        System.out.println(String.format("Folder size: " +size));

    }
}
