class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int n=arr.length;
        
        int res[]=new int[2];
        int k=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            if(map.get(arr[i])==2){
                res[k++]=arr[i];
            }
        }
        return res;
    }
}