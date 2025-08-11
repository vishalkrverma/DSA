// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        // code here
        int n=arr.length;
        int diff=0;
        if(n==2) diff=arr[1]-arr[0];
        if(n>2){
        if(arr[0]>arr[1]){
         diff=Math.max((arr[1]-arr[0]),arr[2]-arr[1]);
        }
        else{
           diff=Math.min((arr[1]-arr[0]),arr[2]-arr[1]);
        }
    }
        for(int i=1;i<n;i++){
            if((arr[i]-arr[i-1])!=diff){
                return arr[i-1]+diff;
            }
        }
        return arr[n-1]+diff;
    }
}
