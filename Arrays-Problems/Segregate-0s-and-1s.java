//Write a program to Segregate 0s and 1s
public class Main{
    public static void main(String[] args){
        int[] arr={1,1,0,1,0,0,1,0,1};
       int numberofZeros=0;
        int numberofOnes=0;
        for(int ele : arr){
            if(ele==0){
               numberofZeros++; 
            }else{
                numberofOnes++;
            }
        }
        for (int i = 0; i < numberofZeros; i++) {
            arr[i] = 0;
        }

        for (int i = numberofZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
