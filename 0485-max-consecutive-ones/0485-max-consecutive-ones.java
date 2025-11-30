class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max=0;
        int cnt=0;

        for(int num:nums){
            if(num==1){
                cnt++;
            max=Math.max(cnt,max);
            }
            else{
                cnt=0;
            }
        }
        return max;
    }
}