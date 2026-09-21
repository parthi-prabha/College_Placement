package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<String> q1 = new LinkedList<>();
        q1.add("1");
        for (int i = 1; i <= n; i++) {
            String ans = q1.remove();
            System.out.println(ans);

            q1.add(ans + "0");
            q1.add(ans + "1");
        }
    }
}
