class Solution {
    public long subarrayXor(int arr[], int k) {
        
        int xor=0;
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            int need=xor^k;
            
            
            if(map.containsKey(need)){
              count+=map.get(need);
            }
        
                map.put(xor,map.getOrDefault(xor,0)+1);
            
        }
        return count;
    }
}