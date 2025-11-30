class Solution {

    void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int zero=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,zero,nums);
                zero++;
                mid++;
            }
           else if(nums[mid]==1) mid++;

            else {
                swap(mid,high,nums);
                high--;
            }
        }
    }
}