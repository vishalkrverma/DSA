class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int idx=-1;
        int i=0;
        int j=arr.length-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr[mid]<=x){
                idx=mid;
                i=mid+1;
            }
            else{
               j=mid-1;
            }
        }
        return idx;
    }
}
