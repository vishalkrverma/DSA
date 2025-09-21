class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]<=nums[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return nums[j];
    }
}