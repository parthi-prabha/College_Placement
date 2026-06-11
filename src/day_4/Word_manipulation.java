package day_4;

import java.util.Scanner;

public class Word_manipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        palindrome(s);
//        string_adder(s);
//        palindrome2(s);
        pattern_inverse1(s);
    }


    static void palindrome(String s){
//        StringBuffer s1 = new StringBuffer(s);
        int n = s.length();
        String temp = "";
        for (int i = n - 1; i >= 0 ; i--) {
            temp += s.charAt(i);
        }
        if(s.equals(temp)){
            System.out.println(true);
        }else{
            System.out.println(-1);
        }
    }

    static void string_adder(String s){
        String[] arr = s.split(" ");
        StringBuffer w = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 3){
                w.append(arr[i]);
            }
        }
        System.out.println(w);
    }

    static void palindrome2(String s){
        int left = 0;
        int right = s.length() - 1;
        boolean flag = true;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }

        if(flag){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static void pattern(String s){
        String temp = "";
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0){
                ch = s.charAt(i);
            }
            if(i % 2 == 1){
                int n = Integer.parseInt(String.valueOf(s.charAt(i)));
                for (int j = 0; j < n; j++) {
                    temp += ch;
                }
            }
        }
        System.out.println(temp);
    }

    static void pattern_with_sb(String s){
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i < s.length(); i += 2) {
            int x = s.charAt(i + 1) - '0';
            while (x > 0){
                s1.append(s.charAt(i));
                x--;
            }
        }
        System.out.println(s1);
    }

    static void pattern_inverse(String s){
        StringBuffer s1 = new StringBuffer();
        int count = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(ch == s.charAt(i)){
                count++;
            }else{
                s1.append(ch).append(count);
                ch = s.charAt(i);
                count = 1;
            }
        }
        s1.append(ch).append(count);
        System.out.println(s1);
    }

    static void pattern_inverse1(String s){
        StringBuffer s1 = new StringBuffer();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == s.charAt(i)){
                count++;
            }else{
                s1.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        s1.append(s.charAt(s.length() - 1)).append(count);
        System.out.println(s1);
    }

}
