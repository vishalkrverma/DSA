// User function Template for Java

class Solution {
    
    private static int getMax(int[] arr){
        int max=arr[0];
        
        for(int num:arr){
            max=Math.max(num,max);
        }
        return max;
    }
    
    
    
    private static  void countingSortByDigit(int[] arr,int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        
        
        for(int i=0;i<n;i++){
            int digit=(arr[i]/exp)%10;
            count[digit]++;
        }
        
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        
        for(int i=n-1;i>=0;i--){
            int digit=(arr[i]/exp)%10;
            output[count[digit]-1]=arr[i];
            count[digit]--;
        }
        
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    
    static void radixSort(int arr[], int n) {
        int max=getMax(arr);
        
        for(int i=1;max/i>0;i*=10){
            countingSortByDigit(arr,i);
        }
    }
}
