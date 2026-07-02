// If cost price and selling price of an item is input through the keyboard, write a program to determine whether 
//the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss 
//he incurred.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();
        
        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        if (sp>cp) {
            System.out.println("Profit");
            int profit=sp-cp;
            System.out.println("Loss is: "+profit);
        } else if(cp>sp){
            int loss=cp-cp;
            System.out.println("Loss");
            System.out.println("Profit is: "+loss);
        }else if(cp==sp){
            System.out.println("No profit No loss");
        }
    }
}
