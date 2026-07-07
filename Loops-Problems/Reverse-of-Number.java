//Reverse of a number
import java.util.*;
    public class Main{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        int reverse=0;
        while(n!=0){
            reverse*=10;
            reverse+=(n%10);
            n/=10;
        }
        System.out.print("Reverse of a Number is: "+reverse);
    }
}
