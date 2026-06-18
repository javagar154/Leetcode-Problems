
import java.util.*;

public class MaximumEnemyForts  {

    public static int captureForts(int[] forts) {

        int max = 0;
        int last = -1;   // Stores the index of the last non-zero element

        for (int i = 0; i < forts.length; i++) {

            // Skip enemy forts
            if (forts[i] == 0) {
                continue;
            }

            // If previous non-zero exists and both are opposite
            if (last != -1 && forts[last] != forts[i]) {
                max = Math.max(max, i - last - 1);
            }

            // Update last non-zero index
            last = i;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] forts = new int[n];

        // Input array elements
        System.out.println("Enter array elements (-1, 0, 1):");
        for (int i = 0; i < n; i++) {
            forts[i] = sc.nextInt();
        }

        // Function call
        int ans = captureForts(forts);

        // Output
        System.out.println("Maximum Enemy Forts Captured: " + ans);

        sc.close();
    }
}
