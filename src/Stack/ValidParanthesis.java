package Stack;

import java.util.Scanner;
import java.util.Stack;



public class ValidParanthesis {

    static boolean valid(String s){
        Stack<Character> s1 = new Stack<>();
         for(char ch : s.toCharArray()){
             if(ch == '{' || ch == '(' || ch == '['){
                 s1.push(ch);
             }else if (ch == '}' || ch == ')' || ch == ']'){
                 if(s1.isEmpty()){
                     return false;
                 }
                 char top = s1.pop();
                 if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                     return false;
                 }
             }
         }
         return s1.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(valid(s));
    }
}
