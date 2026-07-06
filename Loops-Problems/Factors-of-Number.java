//Factors of a given number
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
            System.out.println("Factors of "+n+" are: ");
            for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
             if(i!=n/i){
              System.out.println(n/i);
            }
        }
    }
}
}
