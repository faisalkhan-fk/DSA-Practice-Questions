//Print the pattern Alphabate Y
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if((i==j || j==n+1-i) && i <= n/2 + 1 || (j==3 && i!=1 && i!=2)){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
