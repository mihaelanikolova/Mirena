import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int degrees = Integer.parseInt(input.substring(input.indexOf('(') + 1, input.indexOf(')')));
        List<String> list = new ArrayList<>();
        List<String> secondList = new ArrayList<>();
        int maxSize = 0;

        while (!"END".equals(input = scanner.nextLine())) {

            if (input.length() > maxSize) {
                maxSize = input.length();

            }
            list.add(input);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < maxSize) {
                StringBuilder word = new StringBuilder(list.get(i));
                while (word.length() < maxSize) {
                    word.append(" ");

                }
                secondList.add(word.toString());
            } else {
                secondList.add(list.get(i));
            }

        }

        if (degrees == 180 || degrees % 360 == 180) {
            Collections.reverse(secondList);
            for (int i = 0; i < secondList.size(); i++) {
                StringBuilder word = new StringBuilder(secondList.get(i));
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.println();
            }
        }
        if (degrees == 0 || degrees % 360 == 0) {
            for (String s : secondList) {
                System.out.println(s);
            }
        }

        if (degrees == 90 || degrees %360 == 90){
            Collections.reverse(secondList);

            for (int i = 0; i <maxSize ; i++) {
                for (int j = 0; j <secondList.size() ; j++) {
                    System.out.print(secondList.get(j).charAt(i));
                }
                System.out.println();
            }
        }
        if (degrees == 270 || degrees % 360 == 270){
            for (int i = maxSize-1; i >=0 ; i--) {
                for (int j = 0; j <secondList.size() ; j++) {
                    System.out.print(secondList.get(j).charAt(i));
                }
                System.out.println();
            }
        }

    }
}

