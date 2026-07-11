//Solve the problem of Permutation and Combination Using Mathod()-
import java.util.*;
public class Main{
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
           f*=i; 
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        
        int ncr=fact(n)/(fact(r)*fact(n-r));
        int npr=fact(n)/fact(n-r);
        System.out.println("nCr is: "+ncr+" "+"&"+" nPr is: "+npr);
    }
}
