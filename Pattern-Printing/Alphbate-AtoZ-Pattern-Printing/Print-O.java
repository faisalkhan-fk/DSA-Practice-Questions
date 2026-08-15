//Print the pattern Alphabate O
public class Main{
    public static void main(String[] arg){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
               if((j==1 && i!=1 && i!=n) || (j==4 && i!=1 && i!=n) 
               || (i==1 && j!=1 && j!=4) 
               || (i==n && j!=1 && j!=4)){
                   System.out.print("* ");
              }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
