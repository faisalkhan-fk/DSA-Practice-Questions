//‘a’ raise to the power ‘b’
import java.util.*;
    public class Main{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=sc.nextInt();
        System.out.print("Enter the Power: ");
        int b=sc.nextInt();
        int p=1;
        for(int i=1;i<=b;i++){
            p*=a;
        }
        System.out.print(a +" raise to the power "+b+" is: "+p);
    }
}
