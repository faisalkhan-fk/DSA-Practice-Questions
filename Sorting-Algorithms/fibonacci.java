//find count of fibonacci Series
import java.util.*;

public class Main {

    static int count = 0;

    static int fibonacci(int n) {
        count++;

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
        System.out.println("Count is: " + count);
    }
}
//Output
// n	5	10	15	20	25
// Recursive	19	276	3177	35400	392809

