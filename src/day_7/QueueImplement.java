package day_7;
import java.util.*;

public class QueueImplement {
    public static void main(String[] args) {
        Queue<Integer> arr = new LinkedList<>();
        arr.add(45);
        arr.add(85);
        arr.add(89);
        System.out.println(arr.peek());
        System.out.println(arr.element());
        System.out.println(arr);
        System.out.println(arr.remove());
        System.out.println(arr);
        System.out.println(arr.poll());
        System.out.println(arr.remove());
        System.out.println(arr.poll());
        System.out.println(arr);
        System.out.println(arr.element());
    }
}
