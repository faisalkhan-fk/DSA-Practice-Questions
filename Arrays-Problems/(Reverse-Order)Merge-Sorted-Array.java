//Write a program to merge two areays in reverse order

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
        int i=a.length-1, j=b.length-1,k=c.length-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                c[k--]=a[i--];
            }else{
                c[k--]=b[j--];
            }
            if(i==a.length){
               while(j<b.length)
                c[k--]=b[j--];
            }  
            }
            while (i >= 0) {
            c[k--] = a[i--];
        }

        while (j >= 0) {
            c[k--] = b[j--];
        } 
        }
}
