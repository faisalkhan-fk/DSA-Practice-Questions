//Print the pattern Alphabate I
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n;j++){
               if(j==3 || (i==1 && j!=1 && j!=n) || (i==n && j!=1 && j!=n)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
