public class MoveZeroTO{
    public static void main(String args[]){
        int[] arr = {0,1,0,2,3,4,5};
        int idx = 0;
        for(int num : arr){
            if(num != 0){
                arr[idx] = num;
                idx++;
            }
        }
        while(idx < arr.length){
            arr[idx] = 0;
            idx++;
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}