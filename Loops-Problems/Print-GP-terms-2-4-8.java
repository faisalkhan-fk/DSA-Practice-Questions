//Display this GP - 1,2,4,8.. upto ‘n’ terms
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the Number of term: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a = 1;
        int r = 2;

        for (int i=1;i<=n;i++) {
            System.out.print(a + " ");
            a*=r;
        }
    }
}
