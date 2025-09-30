class Solution {
    public boolean findTriplet(int[] arr) {
        int n=arr.length;
        
        Set<Integer> set=new HashSet<>();
        
        for(int num:arr){
            set.add(num);
        }
        
    Arrays.sort(arr);
    
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(set.contains(arr[i]+arr[j])) return true;
        }
    }
    return false;
    }
}