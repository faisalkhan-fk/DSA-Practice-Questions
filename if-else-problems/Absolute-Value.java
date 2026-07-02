//Take integer input and print the absolute value(Magnitude) of that integer
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the Number: ");
	    int n=sc.nextInt();
	    if(n<0){
	        System.out.println("Absolute Value of Number: "+-n);
	    }else{
	        System.out.println("Absolute Value of Number: "+n);
	    }
	}
}
