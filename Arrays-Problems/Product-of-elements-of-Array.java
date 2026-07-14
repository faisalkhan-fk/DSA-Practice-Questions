//Product of the elements of the Array
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int product=1;
        System.out.print("Enter the Elements of the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            product*=arr[i];
        }
        System.out.println("Product of the Elements is: "+product);
    }
}
