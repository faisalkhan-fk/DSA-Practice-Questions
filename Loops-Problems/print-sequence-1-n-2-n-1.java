/*Take ‘n’ as input from user and print the following sequence..
1
n
2
n-1
3
n-2
… */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1, j = n; i <= n && j >= 1; i++, j--) {
            System.out.println(i);
            System.out.println(j);
        }
    }
}
