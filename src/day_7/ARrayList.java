package day_7;
import java.util.*;

public class ARrayList {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();
        arr.add("hello");
        arr.add("hi");
        arr.addFirst("All");
        arr.addLast("Thank you");
        for(String v : arr){
            System.out.print(v + "-> ");
        }
        System.out.println();
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.getFirst());


    }
}
