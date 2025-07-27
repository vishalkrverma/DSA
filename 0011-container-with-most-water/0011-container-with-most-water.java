class Solution {
    public int maxArea(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int i=0;
        int j=n-1;

        while(i<j){
            int curr=(j-i)*Math.min(nums[j],nums[i]);
            max=Math.max(curr,max);

            if(nums[j]<nums[i]) j--;
            else{
             i++;
            } 
        }
        return max;
    }
}