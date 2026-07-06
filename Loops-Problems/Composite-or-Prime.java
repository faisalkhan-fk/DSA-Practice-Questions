//WAP to check if a given number is Composite or Prime
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        boolean flag=true;
        int n=sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
            }
            if(n==1){
                System.out.println("Neither Composite nor Prime");
            }
            else if(flag==false){
                System.out.println("Composite Number");
            }else{
                System.out.println("Number is Prime");
            }
    }
}
