// Matrix Multiplication – Classical-Counting Operation
import java.util.*;

public class Main {

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] A = new int[n + 1][n + 1];
        int[][] B = new int[n + 1][n + 1];
        int[][] C = new int[n + 1][n + 1];

        System.out.println("Enter Matrix A:");
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                B[i][j] = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                C[i][j] = 0;

                for (int k = 1; k <= n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                    count++;
                }
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        System.out.println("Count is: " + count);
    }
}
