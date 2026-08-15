//Print the pattern Alphabate G
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if((i==1 && j!=1) || (j==1 && i!=1 && i!=n) || (i==n && j!=1) || (j==n && i!=2) 
               || (j==n-1 && i!=2 && i!=4)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
