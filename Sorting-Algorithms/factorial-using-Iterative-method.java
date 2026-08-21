//factorial using iterative method to find operation count
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            count++;
        }

        System.out.println("Factorial is: " + fact);
        System.out.println("Count is: " + count);
    }
}
//Output
// Enter a number: 5
// Factorial is: 120
// Count is: 5
