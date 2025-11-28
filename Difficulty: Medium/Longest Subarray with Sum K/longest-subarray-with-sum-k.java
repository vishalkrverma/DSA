// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int sum=0;
        int maxLength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLength=i+1;
            }
            if(map.containsKey(sum-k)){
                maxLength=Math.max(maxLength,i-map.get(sum-k));
            }
            map.putIfAbsent(sum,i);
        }
        return maxLength;
    }
}
