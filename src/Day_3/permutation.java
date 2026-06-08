package Day_3;

import java.util.Scanner;

public class permutation {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0, ind = 0, max = 0;//42713
        for (int i = 0; i < n; i++) {
            sum += arr[i];//7
            ind += i;//2
            for (int j = i + 1; j < n; j++) {
                if(sum + arr[j] <= val){//8<=10
                    sum += arr[j];//8
                    ind += j;//5
                }
            }
            if(max < ind){
                max = ind;
            }
            sum = 0;
            ind = 0;
        }
        System.out.println(max);
    }
}
