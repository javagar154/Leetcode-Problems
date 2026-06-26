package SlidingWindowsProblems;


public class GrumpyBookstoreOwner {
    public static void main(String[] args) {

        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;

        int n = customers.length;

        // Already satisfied customers
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        // First window
        int windowSum = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                windowSum += customers[i];
            }
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = minutes; i < n; i++) {

            // Add incoming element
            if (grumpy[i] == 1) {
                windowSum += customers[i];
            }

            // Remove outgoing element
            if (grumpy[i - minutes] == 1) {
                windowSum -= customers[i - minutes];
            }

            maxSum = Math.max(maxSum, windowSum);
        }

        int result = sum + maxSum;
        System.out.println(result);
    }
}
