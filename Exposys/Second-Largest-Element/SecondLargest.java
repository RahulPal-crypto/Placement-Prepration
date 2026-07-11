import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        int secondLargest = secondLargest(arr);
        System.out.println(secondLargest);
    }
    public static int secondLargest(int[] arr){
        int largest =Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secLargest =largest;
                largest = num;
            }
            else if(num > secLargest && num != largest){
                secLargest = num;
            }
        }
        return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
    }
}
