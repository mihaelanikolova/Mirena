import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        String text = "";

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < commandsCount; i++)
        {
            String[] line = scanner.nextLine().split("\\s+");

            int command = Integer.parseInt(line[0]);

            switch (command)
            {
                case 1:
                    String charactersForAdd = line[1];
                    text += charactersForAdd;
                    stack.push(text);;
                    break;
                case 2:
                    int charsForErase = Integer.parseInt(line[1]);
                    text = text.substring(0, text.length() - charsForErase);
                    stack.push(text);
                    break;
                case 3:
                    int index = Integer.parseInt(line[1]);
                    System.out.println(text.charAt(index-1));
                    break;
                case 4:
                    stack.pop();
                    if (stack.size() > 0)
                    {
                        text = stack.peek();
                    }
                    else
                    {
                        text = "";
                    }
                    break;
            }
        }

    }
}
