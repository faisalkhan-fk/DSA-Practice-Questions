/*Print the given pattern
* * * * * * *
* # # # # # *
* # # # # # *
* # # # # # *
* * * * * * *             */

//Time complexity-O(m*n)
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int m=sc.nextInt();
        System.out.print("Enter the Column: ");
        int n=sc.nextInt();
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==m || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
