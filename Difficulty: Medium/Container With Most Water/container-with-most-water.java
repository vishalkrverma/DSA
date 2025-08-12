class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int max=0;
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int curr=Math.min(arr[i],arr[j])*(j-i);
            max=Math.max(curr,max);
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}