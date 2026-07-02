//Take positive integer input and tell if it is a four digit number or not.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("It is a four digit number");
        }else{
            System.out.println("It is not a four digit number");
        }
    }
}
