package queue;
/*rotate the queue using stack only and don't use extra space*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseUStackQueue {
    static void reverse(Queue<Integer> q, int rev){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < rev; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        int limit = q.size() - rev;
        for (int i = 0; i < limit; i++) {
            int data = q.remove();
            q.add(data);
        }
        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(in.nextInt());
        }
        int rev = in.nextInt();
        reverse(q, rev);
    }
}
