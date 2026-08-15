//Print the pattern Alphabate B(Type-2)
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if((i==1 && j!=n) || (j==1) || (j==n && i!=1 && i!=3 && i!=n) 
               || (i==3 && j!=n) || (i==n && j!=n)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
