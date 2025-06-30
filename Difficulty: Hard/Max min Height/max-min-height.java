import java.util.*;

class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
        int n = arr.length;
        int low = Arrays.stream(arr).min().getAsInt();
        int high = Arrays.stream(arr).max().getAsInt() + k;
        int result = low;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canReach(arr, k, w, mid)) {
                result = mid;
                low = mid + 1; // Try a higher minimum height
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private boolean canReach(int[] arr, int k, int w, int target) {
        int n = arr.length;
        int[] water = new int[n + 1]; // Difference array
        int sum = 0;
        int used = 0;

        for (int i = 0; i < n; i++) {
            sum += water[i]; // Current added water at index i
            int currHeight = arr[i] + sum;
            if (currHeight < target) {
                int need = target - currHeight;
                used += need;
                if (used > k) return false;
                sum += need;
                if (i + w < water.length) {
                    water[i + w] -= need; // Remove the effect after w
                }
            }
        }
        return true;
    }
}
