package day_2;

import java.util.Scanner;

class Amicable_number {
    public static void main() {
        Scanner in = new  Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= n1/2 ; i++) {
            if(n1 % i == 0){
                sum1 += i;
            }
        }
        if(sum1 == n2){
            for (int i = 1; i <= n2/2 ; i++) {
                if(n2 % i == 0){
                    sum2 += i;
                }
            }
        }
        if(sum2 == n1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
