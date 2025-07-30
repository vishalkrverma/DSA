class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        
        int cnt=0;
        int sum=0;
        map.put(0,1);
        int n=arr.length;
        
        for(int num:arr){
            sum+=num;
            if(map.containsKey(sum-k)){
               cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}