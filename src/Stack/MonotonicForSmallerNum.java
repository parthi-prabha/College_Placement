package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MonotonicForSmallerNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = new int[a];
        Stack<Integer> s1 = new Stack<>();
        for (int i = a - 1; i >= 0; i--) {
            while(!s1.isEmpty() && s1.peek() >= arr[i]){
                s1.pop();
            }

            if (s1.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = s1.peek();
            }
            s1.push(arr[i]);
        }
        for (int i = 0; i < a; i++) {
            System.out.println(ans[i]);
        }
    }
}
