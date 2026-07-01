//Take integer input and tell if its magnitude is smaller than 69 or not.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int magnitude;
        if(n<0){
            magnitude=-n;
        }else{
            magnitude=n;
        }
        if(magnitude<69){
            System.out.println("Magnitude is smaller than 69");
        }else{
            System.out.println("Magnitude is not smaller than 69");
        }
    }
}
