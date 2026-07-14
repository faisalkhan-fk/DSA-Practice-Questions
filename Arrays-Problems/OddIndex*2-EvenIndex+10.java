// Multiply odd indexed elements by 2 and add 10 to even indexed elements
import java.util.*;
public class Main{
    public static void main(String[] args){
       int[] arr={12,14,33,43,36};
       for(int i=0;i<arr.length;i++){
           if(i%2!=0){
               arr[i]*=2;
           }else{
               arr[i]+=10;
           }
       }
       change(arr);
    }
    public static void change(int[] arr){
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
    }
}
