// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int i=0;
        int n=arr.length;
        int j=n-1;
        
        if(n==3) return arr[1];
        
        while(i<j){
            int mid=(i+j)/2;
            
            if(arr[mid]>arr[mid+1]){
                 j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return arr[i];
    }
}