//Write a program to find Missing in Array.
public class Main{
    public static void main(String[] args){
        int[] arr={2,0,1,3,4,5,7,8};
        long n=arr.length;
        long sum=n*(n+1)/2;
        long arraySum=0;
        for(int ele : arr){
            arraySum+=ele;
        }
        int result= (int)(sum-arraySum);
        System.out.print(result);
    }
}
