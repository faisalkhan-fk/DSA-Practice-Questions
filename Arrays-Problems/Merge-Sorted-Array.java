//Write a program to merge a shorted Array
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] a={1,2,4,6,7,9};
        int[] b={3,5,6,8};
        int[] c=new int[a.length+b.length];
        for(int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();
        merge(c,b,a);
        for(int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] c,int[] b,int[] a){
        int i=0, j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
            if(i==a.length){
               while(j<b.length)
                c[k++]=b[j++];
            }  
            }
            if(j==b.length){
               while(i<a.length)
                c[k++]=a[i++];
            }  
        }
}
