//Calculate Volume of Sphere

import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Radius: ");
      double r=sc.nextDouble();
      double volume=(4.0/3.0)*3.14*r*r*r;
      System.out.println("Volume of a Sphere is: "+volume);
    }
}
