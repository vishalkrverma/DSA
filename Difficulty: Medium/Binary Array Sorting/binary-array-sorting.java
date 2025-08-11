class Solution {
    public void binSort(int[] arr) {
        // code here
        int n=arr.length;
        
        int ones=0;
        for(int num:arr){
            if(num==1) ones++;
        }
        int z=n-ones;
        int k=0;
        while(z>0){
            arr[k++]=0;
            z--;
        }
        while(ones>0){
            arr[k++]=1;
            ones--;
        }
    }
}
