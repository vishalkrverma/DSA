// User function Template for Java

class Solution {
    public String excelColumn(int n) {

     
       StringBuilder sb=new StringBuilder();
       while(n>0){
           n--;
           int remainder = n % 26;
           sb.append((char) ('A' + remainder));
           n /= 26;
       }
       return sb.reverse().toString();
    }
}