//Print Pattern X
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Column: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.print("Please Enter Odd Number: ");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || j==n+1-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
