import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr  = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Rotated Array after k steps");
        rotate(arr, k);
        for(int i = 0 ; i  < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // sc.close();
    }
    public static void rotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
