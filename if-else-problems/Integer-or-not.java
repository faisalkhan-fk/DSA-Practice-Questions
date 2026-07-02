// Take real number input and check if it is an integer or not.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double n = sc.nextDouble();

        if (n == (int) n) {
            System.out.println("It is an Integer.");
        } else {
            System.out.println("It is NOT an Integer.");
        }
    }
}
