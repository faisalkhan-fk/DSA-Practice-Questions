//Array Two Sum Problem

public class Main{
    public static void main(String[] args){
        int[] arr={1,5,7,-3,4};
        int target=2;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                 if (arr[i] + arr[j] == target) {
                    flag = true;
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            System.out.print("Target achieved");
        }else{
            System.out.println("Target not achieved");
        }
    }
}
