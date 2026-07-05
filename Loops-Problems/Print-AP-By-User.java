//Print AP by taking Input From User First term, Number of term, Common Difference
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of term: ");
        int n=sc.nextInt();
        System.out.print("Enter the First term: ");
        int a=sc.nextInt();
        System.out.print("Enter the Common Difference: ");
        int d=sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.print(a+" ");
        a+=d;
        }
    }
}
