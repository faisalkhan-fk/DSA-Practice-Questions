//Print the pattern Alphabate R
public class Main{
    public static void main(String[] arg){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
               if (j == 1 ||
                    i == 1 ||
                    i == 3 ||
                    (j == 4 && i != 4 && i != 5) ||
                    (i >= 4 && j == i - 2)){
                   System.out.print("* ");
              }else{
                   System.out.print("  ");
               }
            }
            
            System.out.println();
        }
    }
}
