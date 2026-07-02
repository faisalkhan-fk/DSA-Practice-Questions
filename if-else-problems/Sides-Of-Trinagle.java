//Take 3 positive integers input and tell if they can be the sides of a triangle or not.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Side: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Side: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd Side: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("The given sides can form a Triangle.");
        } else {
            System.out.println("The given sides cannot form a Triangle.");
        }
    }
}
