class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n<=1) return n;

        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int num:nums) set.add(num);

        for(int num:set){
            // SABSE CHHOTA NUMBER LE RHE HAI....
            if(!set.contains(num-1)){
                int curr=1;
                int curNum=num;

                while(set.contains(curNum)){
                    curr++;
                    curNum++;
                }
                max=Math.max(max,curr);
            }
        }
        return max-1;
    }
}