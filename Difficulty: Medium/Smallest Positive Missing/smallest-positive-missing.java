class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int miss=1;
        Arrays.sort(arr);
        
        for(int num:arr){
            if(num==miss){
                miss++;
            }
        }
        return miss;
    }
}
