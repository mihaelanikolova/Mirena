import java.io.*;

import java.util.Arrays;
import java.util.Scanner;

public class SumLines {
    public static int[] counts = new int[3];
    public static void main(String[] args) throws IOException {
        String path = "Exercises Resources/input.txt";
        Scanner scanner = new Scanner(new File(path));
       PrintWriter writer = new PrintWriter(new File("output.txt"));



        String vowelsSymbols = "aeiou";
        String punctuationSymbols = "!,.?";



        while (scanner.hasNext()){
            String line = scanner.nextLine();
            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            String currentString = String.valueOf(symbol);
                            if (vowelsSymbols.contains(currentString)){
                                counts[0]++;
                            }else if (punctuationSymbols.contains(currentString)){
                                counts[2]++;
                            }else {
                                counts[1]++;
                            }
                        }
                    });
        }




      writer.write(String.format("Vowels: %d%n",counts[0]));
      writer.write(String.format("Consonants: %d%n",counts[1]));
      writer.write(String.format("Punctuation: %d%n",counts[2]));


      writer.close();











        }

    }

