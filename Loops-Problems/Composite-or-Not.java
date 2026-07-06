//WAP to check if a given number is Composite or not
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
            for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("Number is Composite");
                break;
            }
        }
    }
}
