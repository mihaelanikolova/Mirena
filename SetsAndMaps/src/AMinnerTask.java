import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinnerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        String resource = "";
        Integer number;


                while (!(resource = scanner.nextLine()).equals("stop")) {//GETTING THE resource RIGHT FROM HERE
                    number = Integer.parseInt(scanner.nextLine());//GETTING THE NUMBER OF THE resource

                    if (!map.containsKey(resource)) {//IF THERE ISN'T (!) A resource IN THE map...
                        map.put(resource, number);//...ADD THE resource WITH IT'S CURRENT number
                    } else {//IF THERE IS ALREADY THE SAME resource IN THE map...
                        map.put(resource, (map.get(resource) + number));//...ADD THE resource, GET IT'S CURRENT NUMBER + ADD IT TO THE NEW ONE
                    }
                }

                for (Map.Entry<String, Integer> mapValues : map.entrySet()) {//PRINTING THE OUTPUT
                    System.out.printf("%s -> %s\n", mapValues.getKey(), mapValues.getValue());
                }

    }
}
