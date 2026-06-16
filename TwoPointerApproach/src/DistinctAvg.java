import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctAvg {
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Double> set = new HashSet<>();

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            set.add(avg);

            left++;
            right--;
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 0, 3, 5};

        int result = distinctAverages(nums);

        System.out.println("Distinct Averages Count: " + result);
    }
}