//Given a point (x, y), write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 
//4th Quadrant, on the x-axis, y-axis or at the origin.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Point lies in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in the 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in the 3rd Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in the 4th Quadrant.");
        } else if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin.");
        } else if (x == 0) {
            System.out.println("Point lies on the Y-axis.");
        } else {
            System.out.println("Point lies on the X-axis.");
        }

        sc.close();
    }
}
