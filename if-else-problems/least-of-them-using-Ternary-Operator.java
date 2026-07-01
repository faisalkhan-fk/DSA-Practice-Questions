//Take 3 positive integers input and print the least of them Using Ternary Operator

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
        int min= (a<b) ? ((a<b)?a:c):((b<c)?b:c);
        System.out.println(min);
    }
}
