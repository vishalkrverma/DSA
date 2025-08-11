class Solution {
    public int search(int arr[], int x) {
        // code here
        int cnt=0;
        for(int num:arr){
            if(num==x) return cnt;
            cnt++;
        }
        return -1;
    }
}
