
import java.util.Arrays;

class Solution {
    public int minimumCoins(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        
        // Prefix sum for quick removal sum computation
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        long minRemoval = Long.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int low = arr[i];
            int high = low + k;

            // Find the rightmost index j where arr[j] <= high
            int j = upperBound(arr, high); // exclusive

            // Coins to remove from [0..i-1]
            long removeLeft = prefixSum[i];

            // Coins to remove from [j..n-1]
            long removeRight = prefixSum[n] - prefixSum[j] - (long)(n - j) * high;

            long totalRemove = removeLeft + removeRight;
            minRemoval = Math.min(minRemoval, totalRemove);
        }
        
        return (int)minRemoval;
    }

    // Custom upperBound: first index where arr[i] > key
    private int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

