class Solution {
    public void nextPermutation(int[] nums) {
    int i = nums.length - 2;

    // Find the first decreasing element from the end
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }
    if (i >= 0) {
        int j = nums.length - 1;
        // Find element just larger than nums[i]
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
    }
    // Reverse from i+1 to end to get next permutation
    reverse(nums, i + 1, nums.length - 1);
}
private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
}
private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        swap(nums, start++, end--);
    }
  }
}
