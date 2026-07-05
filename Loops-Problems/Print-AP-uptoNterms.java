//Display this AP - 2,5,8,11.. upto ‘n’ terms
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=2;i<=3*n-1;i+=3){
        System.out.print(i+" ");
        }
    }
}
