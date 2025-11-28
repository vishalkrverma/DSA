class Solution {
    int maxLength(int nums[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        int maxLength=0;
        // map.put(sum,);
        
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            
            if(sum==0){
                maxLength=i+1;
            }
            
            if(map.containsKey(sum)){
             maxLength=Math.max(maxLength,i-map.get(sum));               
        }
        else{
            map.put(sum,i);
        }
      }
        return maxLength;
    }
}