import java.util.*;
public class Freq {
    public static void main(String args[]){
        int[] arr = {1,2,2,3,4,5,4,6,4,7,5};
        int maxSize = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            maxSize = Math.max(maxSize,arr[i]);
        }
        int[] freq = new int[maxSize + 1];
        int idx = 0;
        for(int i = 0 ; i  < arr.length; i++){
            idx = arr[i];
            freq[idx]++;
            idx++;
        }
        for(int i = 0 ; i < freq.length; i++){
            System.out.println("{" + i +" -> "+ freq[i] +"}");
        }
    }
}
