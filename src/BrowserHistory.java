import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();


        String line = scanner.nextLine();


        while (!line.equals("Home")) {
            if (!line.equals("back")) {
                browser.push(line);
                System.out.println(line);
            }else {
                if (browser.size()>1){
                    browser.pop();
                    System.out.println(browser.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            }




            line = scanner.nextLine();
        }
    }
}

