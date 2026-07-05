// Print the table of n.Take n from User
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
        System.out.print(i*n+" ");
        }
    }
}
