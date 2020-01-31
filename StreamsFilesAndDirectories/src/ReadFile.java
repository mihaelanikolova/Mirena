import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "04. Java-Advanced-Streams-Files-and-Directories-Resources/input.txt";
        String output = "output.txt";

        List<String>  allLines = Files.lines(Path.of(path))
                .sorted()
                .collect(Collectors.toList());

        Files.write(Path.of(output),allLines);





    }
}


