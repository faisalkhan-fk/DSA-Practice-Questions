//Find the Maxmimum From Four given Input Integer from User
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("Maximum is: "+Math.max((Math.max(a,b)),(Math.max(c,d))));
    }
}
