package SlidingWindowsProblems;


import java.util.*;

public class GreaterThanThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int maxSum = 0;
        int windowSum = 0;
        int avg;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;
        avg = maxSum / k;

        if (avg >= threshold) {
            count++;
        }

        // Sliding window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = windowSum;
            avg = maxSum / k;

            if (avg >= threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k and threshold
        int k = sc.nextInt();
        int threshold = sc.nextInt();

        // Function call
        int result = numOfSubarrays(arr, k, threshold);

        // Output
        System.out.println(result);

        sc.close();
    }
}
