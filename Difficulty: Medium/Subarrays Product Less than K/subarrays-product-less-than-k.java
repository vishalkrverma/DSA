// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        
       long prod=1;
       int left=0;
       long count=0;
       
       for(int right=0;right<n;right++){
           prod*=arr[right];
           
           while(prod>=k && left<=right){
               prod/=arr[left++];
           }
           count+=(right-left+1);
       }
       return count;
    }
}