import java.util.*;

public class ReverseString {
    public static void main(String args[]) {
        String str = "i love programing"; // i evol gnimargorp
        System.out.println(reverse(str));
    }

    public static String reverse(String s) {
        if (s == null || s.length() == 0)
            return s;
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            arr[i] = reverseWord(str);
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();

    }

    public static String reverseWord(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            sb.setCharAt(i, ch2);
            sb.setCharAt(j, ch1);
            i++;
            j--;
        }
        return sb.toString();
    }
}
