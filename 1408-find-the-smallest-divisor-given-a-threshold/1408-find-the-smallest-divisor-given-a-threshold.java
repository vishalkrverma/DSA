class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int left = 1; // minimum divisor
        int right = Integer.MIN_VALUE; // maximum divisor is the largest number in nums
        // Find the maximum value in the array to set the upper bound for the binary search
        for (int num : nums) {
            right = Math.max(right, num);
        }
        // Binary search to find the smallest divisor
        while (left < right) {
            int mid = left + (right - left) / 2; // Middle value of the current range
            if (sum(nums, mid) <= threshold) {
                right = mid; // Try a smaller divisor
            } else {
                left = mid + 1; // Increase the divisor
            }
        }
        // When left == right, we've found the smallest divisor
        return left;
    }
     private int sum(int[] nums, int divisor) {
        int total = 0;
        for (int num : nums) {
            total += (num + divisor - 1) / divisor; // This is a trick to calculate ceil(num / divisor)
        }
        return total;
     }
}