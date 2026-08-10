//Print the pattern Alphabate J
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n;j++){
               if(j==3 || (i==4 && j!=2 && j!=4 && j!=5) || (i==1 && j!=1 && j!=n) || (i==n && j!=n-1 && j!=n)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
