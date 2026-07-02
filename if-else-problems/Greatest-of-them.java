//Take 3 positive integers input and print the greatest of them.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c=sc.nextInt();
        if(a>b){
          if(a>c){
              System.out.println(a);
          }else{
              System.out.println(c);
          } 
        }else{
             if(b>c){
                 System.out.println(b);
             }else{
                 System.out.println(c);
             } 
        }
    }
}
