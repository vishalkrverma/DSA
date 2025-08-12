class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int left=0;
        for(int i=0;i<arr.length;i++){
            
            if(left==(sum-left-arr[i]))
                return i;
            left+=arr[i];
        }
        return -1;
    }
}
