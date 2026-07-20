//Write a program to Segregate-0s-1s-and-2s
public class Main{
    public static void main(String[] args){
        int[] arr={1,1,0,1,0,0,2,1,2,2,0,1,2};
       int numberofZeros=0;
        int numberofOnes=0;
        int numberofTwos=0;
        for(int ele : arr){
            if(ele==0){
               numberofZeros++; 
            }else if(ele==1){
                numberofOnes++;
            }else{
                numberofTwos++;
            }
        }
        for (int i = 0; i < numberofZeros; i++) {
            arr[i] = 0;
        }

        for (int i = numberofZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = numberofZeros + numberofOnes; i < arr.length; i++) {
            arr[i] = 2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
