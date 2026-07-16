//Print the second Maximum element in the array
public class Main{
    public static void main(String[] args){
        int[] arr={3,5,10,10,8,6,7};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
             max=arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]>Smax && arr[j]!=max){
                Smax=arr[j];
            }
        }
        System.out.print(Smax);
    }
}
