//Reverse Array 
public class Main{
    public static void main(String[] args){
        int[] arr={3,5,10,10,8,6,7};
        int n=arr.length;
        int i=0 ,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
