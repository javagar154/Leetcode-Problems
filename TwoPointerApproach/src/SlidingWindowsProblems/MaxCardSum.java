package SlidingWindowsProblems;
public class MaxCardSum {
    public static void main(String[] args) {

        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int n = cardPoints.length;
        int windowSum = 0;

        // Sum of first k cards
        for (int i = 0; i < k; i++) {
            windowSum += cardPoints[i];
        }

        int maxSum = windowSum;
        int right = n - 1;

        // Replace left cards with right cards one by one
        for (int j = k - 1; j >= 0; j--) {
            windowSum -= cardPoints[j];
            windowSum += cardPoints[right];

            maxSum = Math.max(maxSum, windowSum);

            right--;
        }

        System.out.println("Maximum Score = " + maxSum);
    }
}
