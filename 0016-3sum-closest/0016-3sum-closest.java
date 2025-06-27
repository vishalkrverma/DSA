import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        // Initialize the closest sum to a large value
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int currentSum = nums[i] + nums[j] + nums[k];

                // Update closest sum if the current one is closer to target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                // Move pointers
                if (currentSum < target) {
                    j++; // Try to increase the sum
                } else if (currentSum > target) {
                    k--; // Try to decrease the sum
                } else {
                   
                    return target;
                }
            }
        }

        return closestSum;
    }
}
