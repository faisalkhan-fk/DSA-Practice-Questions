//Print the pattern Alphabate D (Type-2)
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
               if((i==1 && j!=4) || j==1 || (i==n && j!=4) || (j==4 && i!=1 && i!=n)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
