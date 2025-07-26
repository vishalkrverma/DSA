class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0, cnt=0;

        Map<Integer,Integer> map=new HashMap<>();
         
        int n=nums.length;
        map.put(0,1);
        for(int num:nums){
           sum+=num;
           int rem=((sum%k)+k)%k;
           cnt+=map.getOrDefault(rem,0);
           map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}