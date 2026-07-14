// Print the minimum element in the array
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Elements of the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
             min=arr[i];   
            }
        }
        System.out.println("Minimum of the Elements is: "+min);
    }
}
