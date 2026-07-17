//Write a program to Rotate an Array.
public class Main{
    public static void main(String[] args){
        int[] arr={2,4,3,6,7,9,5};
        int n=arr.length;
        int d=3;
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
}
