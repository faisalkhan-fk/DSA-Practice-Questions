//Print the pattern Alphabate Q
public class Main{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=n+1;j++){
                if((j==1 && i!=1 && i!=n+1 && i!=n) || 
                (j==n && i!=6 && i!=1 && i!=n) 
                || (i==1 && j!=1 && j!=n && i!=6 && j!=n+1) 
                || (i==n && j!=1 && j!=n+1) || (i>=n/2+1 && i==j && i<=n+1)
                ||(j==n && i!=1 && i!=n && i!=n+1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
