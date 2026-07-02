// Calculate area of Circle

import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Radius: ");
      double r=sc.nextDouble();
      double area=3.14*r*r;
      System.out.println("Area of a Circle is: "+area);
    }
}
