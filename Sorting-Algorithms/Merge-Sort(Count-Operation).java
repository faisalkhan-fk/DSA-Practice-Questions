//Merge Sort analyze the Best Case, Average Case, and Worst Case time complexities, 
//and plot a graph of Input Size versus Operation Count.

import java.util.*;

public class Main {

    static int count = 0;

    static void mergeSort(int[] arr, int low, int high) {

        count++;

        if (low < high) {

            int mid = (low + high) / 2;
            count++;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        count += 2;

        for (int i = 1; i <= n1; i++) {
            left[i] = arr[low + i - 1];
            count++;
        }

        for (int j = 1; j <= n2; j++) {
            right[j] = arr[mid + j];
            count++;
        }

        int i = 1;
        int j = 1;
        int k = low;

        count += 3;

        while (i <= n1 && j <= n2) {

            count++;

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                count += 2;
            } else {
                arr[k] = right[j];
                j++;
                count += 2;
            }

            k++;
            count++;
        }

        while (i <= n1) {
            arr[k] = left[i];
            i++;
            k++;
            count += 3;
        }

        while (j <= n2) {
            arr[k] = right[j];
            j++;
            k++;
            count += 3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // arr[0] is unused
        int[] arr = new int[size + 1];

        System.out.println("Enter array elements:");

        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 1, size);

        System.out.print("Sorted array is: ");

        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Count is: " + count);
    }
}

// Output
// Array Size	5	10	15	20	25
// Best Case	88	228	380	553	729
// Average Case	89	232	394	571	757
// Worst Case	86	224	377	545	719
