package day_7;

import java.util.Stack;

public class STack {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        System.out.println(arr.peek());
        arr.push(23);
        arr.push(87);
        arr.push(78);
        System.out.println(arr.peek());
        System.out.println(arr);
        System.out.println(arr.pop());
    }
}
