//lettcode problem no:1385
public class DistanceValueBw2Array {
    public static void main(String[] args) {

        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        int n = arr1.length;
        int m = arr2.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isValid = true;

            for (int j = 0; j < m; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        System.out.println(count);
    }
}
