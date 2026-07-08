//Print the given pattern by taking Input from User
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int row=sc.nextInt();
        System.out.print("Enter the Number of Column: ");
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
