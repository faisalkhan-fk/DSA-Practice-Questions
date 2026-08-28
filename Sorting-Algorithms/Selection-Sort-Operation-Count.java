//Selection-Sort-Operation-Count
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size - 1; i++) {
            count++;

            int min = i;
            count++;

            for (int j = i + 1; j < size; j++) {
                count++;

                if (arr[j] < arr[min]) {
                    min = j;
                    count++;
                }

                count++;
            }

            count++;

            if (min != i) {
                count++;

                int temp = arr[i];
                count++;

                arr[i] = arr[min];
                count++;

                arr[min] = temp;
                count++;
            }

            count++;
        }

        System.out.print("Sorted array is: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Count is: " + count);
    }
}

// Output:
// n	5	10	15	20	25
// Best Case	36	126	266	456	696
// Average Case	53	167	343	548	834
// Worst Case	50	171	350	596	900
