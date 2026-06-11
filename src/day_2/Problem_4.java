package day_2;

import java.util.Arrays;

public class Problem_4 {
    public static void main(String[] args) {
        int[] num = { 1, 2};
        int[] num1 = {4, 3};
        Solution ob = new Solution();
        double ans = ob.findMedianSortedArrays(num, num1);
        System.out.println(ans);
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int id = 0;

        for(int val : nums1){
            arr[id++] = val;
        }

        for(int val : nums2){
            arr[id++] = val;
        }

        Arrays.sort(arr);
        int n = arr.length;
        if(n % 2 == 0){
            double sum = arr[n/2] + arr[n/2-1];
            return (sum)/2;
        }
        return arr[n/2];
    }
}