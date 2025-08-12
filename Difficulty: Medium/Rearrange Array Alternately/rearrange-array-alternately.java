class Solution {
    public void rearrange(int arr[]) {
        
        Arrays.sort(arr);
        // code here
        int n=arr.length;
    
        int minIdx=0;
        int maxElem=arr[n-1]+1;
        int maxIdx=n-1;
        
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxIdx]%maxElem)*maxElem;
                maxIdx--;
            }
            else{
                arr[i]=arr[i]+(arr[minIdx]%maxElem)*maxElem;
                minIdx++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/maxElem;
        }
    }
}
