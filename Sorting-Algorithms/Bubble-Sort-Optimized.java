//Bubble Sort optimized Code and find out total count
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array element: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int count =0;

        for(int i =0;i<size-1;i++){
            boolean swapped = false;
            count++;
            for(int j = 0;j<size-1-i;j++){
                count++;
                if(arr[j] >arr[j+1]){

                    int temp = arr[j];
                    count++;
                    arr[j] = arr[j+1];
                    count++;
                    arr[j+1] = temp;
                    count++;

                    swapped = true;
                }
                count++;

                }
            if(!swapped){
                break;

            }
            count++;
        }
        System.out.print("Sorted array is: ");

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("Count is: "+count);
    }
}

// Output-
// Enter array size: 5
// Enter array element: 
// 1 2 3 4 5
// Sorted array is: 1 2 3 4 5 Count is: 9
