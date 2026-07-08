/*Print the given pattern
Alphabet Square 4
a a a a
B B B B
c c c c
D D D D*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i%2!=0){
                   System.out.print((char)(i + 96) + " ");
               }else{
                System.out.print((char)(i + 64) + " ");
               }
            }
            System.out.println();
        }
    }
}
