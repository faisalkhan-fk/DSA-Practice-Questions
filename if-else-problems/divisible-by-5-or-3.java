//Take positive integer input and
print:
//__Riya_______ if number is divisible by 5
//___Banu______ if number is divisible by 3
//___Apurva______ if number is divisible by 5 & 3 both
//___Isha______ if number is not divisible by 5 or 3
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("Apurva");
        }else if(n%5==0){
            System.out.println("Riya");
        }else if(n%3==0){
            System.out.println("Banu");
        }else{
            System.out.println("Isha");
        }
    }
}
