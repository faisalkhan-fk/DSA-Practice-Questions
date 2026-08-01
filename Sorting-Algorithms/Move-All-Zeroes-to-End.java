//Move All Zeroes to End

import java.util.*;
public class Main{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={0,6,2,0,5,2,0,-2,0,9};
         int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            if(i!=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
       }
       print(arr);
    }
}
