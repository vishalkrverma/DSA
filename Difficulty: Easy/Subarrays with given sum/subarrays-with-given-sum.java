class Solution {
    public static int subArraySum(int[] arr, int k) {
        
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        
        map.put(0,1);
        int cnt=0;
        int n=arr.length;
        
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            }
            else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        return cnt;
    }
}
