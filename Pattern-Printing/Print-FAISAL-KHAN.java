//Printing the Pattern FAISAL KHAN
public class Main{
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
               if(i==1 || j==1 || i==3){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
           for(int j=1;j<=2*n+1;j++){
               if((j==n+1-i) || (i==3 && j!=1 && j!=2 && j<8) || j==i+4){
                   System.out.print("*");
              }else{
                   System.out.print(" ");
               }
            }
           for(int j=1;j<=n;j++){
               if(j==3 || (i==1 && j!=1 && j!=n) || (i==n && j!=1 && j!=n)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
             for(int j=1;j<=n;j++){
               if(i==1 || i==n || i==3 || (j==1 && i!=n-1) || (j==n && i!=2)){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
          for(int j=1;j<=2*n+1;j++){
               if((j==n+1-i) || (i==3 && j!=1 && j!=2 && j<8) || j==i+4){
                   System.out.print("*");
              }else{
                   System.out.print(" ");
               }
            }
             for(int j=1;j<=4;j++){
               if((j==1) || i==n){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            for(int j=1;j<=4;j++){
               if((i==3)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
           for(int j=1;j<=n;j++){
                if(j==2 || 
                   (i<=n/2+1 && i+j==n+1) || 
                   (i>=n/2+1 && i==j)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=n;j++){
               if(j==1 || j==n || i==3){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
           for(int j=1;j<=2*n+1;j++){
               if((j==n+1-i) || (i==3 && j!=1 && j!=2 && j<8) || j==i+4){
                   System.out.print("*");
              }else{
                   System.out.print(" ");
               }
            }
            for(int j=1;j<=n;j++){
               if((j==1) || j==n || i==j){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}
