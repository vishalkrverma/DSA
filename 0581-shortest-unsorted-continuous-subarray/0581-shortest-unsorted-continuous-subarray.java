class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int n=nums.length;
        int[] dummy=Arrays.copyOf(nums,n);

        Arrays.sort(dummy);

        int i=0;
        int j=n-1;

        while(i<n && nums[i]==dummy[i]){
          i++;
        }
        while(j>=0 && nums[j]==dummy[j]){
            j--;
        }
        return i>j ? 0 : j-i+1;
    }
}