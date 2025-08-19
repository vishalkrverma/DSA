// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int cnt=0;
        for(int i:arr){
            if(i==0) cnt++;
        }
        return cnt;
    }
}
