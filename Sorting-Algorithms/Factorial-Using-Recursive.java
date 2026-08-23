//Factorial Using Recursive Method Algorithm:

import java.util.*;
public class Main {
    static long count = 0;

    static long factorial(int n) {
        count++;

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = factorial(n);

        System.out.println("Factorial is: " + fact);
        System.out.println("Count is: " + count);
    }
}

// Output
// Input	3	4	5	6	7
// Iterative	6	8	10	12	14
// Recursive	4	5	6	7	8

