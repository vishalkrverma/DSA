# DSA
# Indexes of Subarray Sum DSA Problem 
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target){ 
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        int j=0;  
       for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           while(sum>target){
               sum-=arr[j];
               j++;
           }
           if(sum==target){
               al.add(j+1);
               al.add(i+1);
              return al;
           }
       }
       al.add(-1);
       return al;
    }
}
