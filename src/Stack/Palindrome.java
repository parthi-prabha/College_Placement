package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> s1 = new Stack<>();
        String s = in.next();
        for (int i = 0; i <= s.length() / 2; i++) {
            s1.push(s.charAt(i));
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if(s.charAt(i) != s1.pop()) {
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
