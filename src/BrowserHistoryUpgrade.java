import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> browserUpgrade = new ArrayDeque<>();


        String line = scanner.nextLine();


        while (!line.equals("Home")) {
            if (!line.equals("back")&& !line.equals("forward")) {
                browser.push(line);
                System.out.println(line);
                browserUpgrade.clear();

            } else if (line.equals("back")) {
                if (browser.size() > 1) {
                    String element = browser.pop();
                    browserUpgrade.addFirst(element);
                    System.out.println(browser.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if (line.equals("forward")) {
                if (browserUpgrade.size()>0){
                    String element = browserUpgrade.poll();
                    browser.push(element);
                    System.out.println(element);
                }else {
                    System.out.println("no next URLs");
                }


            }


            line = scanner.nextLine();
        }
    }

}
