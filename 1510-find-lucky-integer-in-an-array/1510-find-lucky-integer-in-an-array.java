class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int[] temp=new int[501];

        for(int i:arr){
            temp[i]++;
        }
       for(int i=500;i>0;i--){
        if(temp[i]==i){
            return temp[i];
        }
       }
       return -1;
    }
}