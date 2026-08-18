//Selection Sort Code and find out total count

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

        for (int i = 1; i < size; i++) {
            count++;

            int key = arr[i];
            count++;

            int j = i - 1;
            count++;

            while (j >= 0 && arr[j] > key) {
                count++;

                arr[j + 1] = arr[j];
                count++;

                j--;
                count++;
            }

            count++;

            arr[j + 1] = key;
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

// Output
// Enter array size: 5
// Enter array elements:
// 1 2 3 4 5
// Sorted array is: 1 2 3 4 5 
// Count is: 20

