import java.util.*;
public class Fibonaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n; i++){
            System.out.print(fibonaaci(i) + " ");
        }
       
    }
    public static int fibonaaci(int n){
        if(n == 0)return 0;
        if(n == 1) return 1;
        int num1 = fibonaaci(n-1);
        int num2 = fibonaaci(n-2);
        return num1 + num2;
    }

}

