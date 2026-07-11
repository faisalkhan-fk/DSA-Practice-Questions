//Swap Two given Number
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b=sc.nextInt();
        System.out.println(a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}
