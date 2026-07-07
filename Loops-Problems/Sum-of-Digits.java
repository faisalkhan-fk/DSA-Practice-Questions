// Print sum of digits of a number
import java.util.*;
    public class Main{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        if(n<0) n=-n;
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.print("Sum of Digits: "+sum);
    }
}
