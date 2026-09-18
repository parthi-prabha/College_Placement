package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            s1.push(in.nextInt());
        }
        System.out.println("Original : ");
        for(int item : s1){
            System.out.print(item + " ");
        }
        for (int i = 0; i < 5; i++) {
            int data = s1.pop();
            s2.push(data);
        }
        System.out.println();
        System.out.println("Reversed : ");
        for(int item : s2){
            System.out.print(item + " ");
        }
    }
}
