//Calculate Total surface area of a cuboid 
import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the length: ");
      double l=sc.nextDouble();
      System.out.print("Enter the breadth: ");
      double b=sc.nextDouble();
      System.out.print("Enter the Height: ");
      double h=sc.nextDouble();
      double tsa=2*(l*b+b*h+l*h);
      System.out.println("Total Surface Area of Cubiod: "+tsa);
    }
}
