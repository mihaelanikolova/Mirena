import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());
        int cycle = 1;


        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size()>1){
            for (int i = 1; i <n ; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            }else {
                System.out.println("Removed " + queue.poll());
            }

            cycle++;
        }

        System.out.println("Last is " + queue.poll());


    }

    private static boolean isPrime(int n) {
        boolean primeCheck = true;
        if (n ==0 || n==1){
            primeCheck = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0){
                    primeCheck = false;
                }
            }
        }
        return primeCheck;
    }
}
