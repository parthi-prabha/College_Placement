package day_6;

import java.util.Arrays;
import java.util.Scanner;

public class Finding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int x = arr[1] - arr[0];
        int y = arr[2] - arr[1];
        int diff = Math.min(x, y);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i + 1] - arr[i] > diff){
                System.out.println(arr[i] + diff);
                break;
            }
        }
    }
}
