class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> set:map.entrySet())
        {
            int val=set.getValue();
            if(val>n/2){
                return set.getKey();
            }
        }
        return -1;
    }
}