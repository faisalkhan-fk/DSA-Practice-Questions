// Search Element in Array

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target=sc.nextInt();
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean flag=false; //flag false means targest Element does not exists in Array
        System.out.print("Enter the Elements of the Array: ");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();  
        }
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                flag=true; //flag true means Element exists in Array
                break;
            }
        }
       if(flag){    //yaha pe (flag==true;) bhi likh sakte the
           System.out.println("Target exists in Array");
       }else{
           System.out.println("Target does not exists in Array");
       }
    }
}
