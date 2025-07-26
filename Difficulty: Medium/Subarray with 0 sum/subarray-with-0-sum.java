class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int sum=0;
        
        Set<Integer> set=new HashSet<>();
        set.add(sum);
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(set.contains(sum))return true;
            set.add(sum);
        }
        return false;
    }
}