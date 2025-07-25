class Solution {
    public int maxCircularSum(int[] arr) {
        int n = arr.length;

        int total = arr[0];
        int currentMax = arr[0], maxSum = arr[0];
        int currentMin = arr[0], minSum = arr[0];

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            total += num;

            // Max subarray sum (Kadane’s)
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Min subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        // If all elements are negative, return max element (no wrap-around possible)
        if (total == minSum) {
            return maxSum;
        }

        // Return the best between non-wrapped and wrapped subarray
        return Math.max(maxSum, total - minSum);
    }
}
