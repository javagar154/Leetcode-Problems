package SlidingWindowsProblems;


import java.util.*;

public class RadiusKAvgSubArray {
    public static void main(String[] args) {

        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;

        int n = nums.length;
        long sum = 0;
        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            if (i - k >= 0 && i + k < n) {

                sum = 0;

                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }

                long Avg = sum / (2 * k + 1);
                nums1[i] = (int) Avg;
            } else {
                nums1[i] = -1;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
