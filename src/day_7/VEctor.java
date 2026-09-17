package day_7;

import java.util.Vector;

public class VEctor {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        for (int i = 1; i <= 41; i++) {
            arr.add(i);
            System.out.println(i + " " + arr.capacity());
        }
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        arr.set(2, 100);
        System.out.println(arr.elementAt(2));
        System.out.println(arr);
        System.out.println(arr.isEmpty());
    }
}
