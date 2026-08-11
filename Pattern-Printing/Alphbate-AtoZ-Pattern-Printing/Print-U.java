//Print the pattern Alphabate U
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if (j==1 || i==n || j==n){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
