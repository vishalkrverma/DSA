class Solution {
    public String largestOddNumber(String nums) {
        
      int j=nums.length()-1;

       while(j>=0){
        int num=nums.charAt(j)-'0';
        if(num%2==1){
            return nums.substring(0,j+1);
        }
        j--;
       }
     return "";
    }
}