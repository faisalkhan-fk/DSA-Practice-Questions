//Write a program to wave the array (for example-int[] arr={2,5,4,3,6,7,8}; --> 3 2 5 4 7 6 8)
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={2,5,4,3,6,7,8};
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
           int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
