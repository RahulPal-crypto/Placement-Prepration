import java.util.*;

public class Contiguos  {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int[] arr  = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }  
        largestArraySum(arr);
    }
    public static void largestArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for(int i = 0; i <arr.length; i++){
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
            if(currSum < 0){
                currSum = 0;
                tempStart = i + 1;
            }
        }
        for(int i = start ; i<= end ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
