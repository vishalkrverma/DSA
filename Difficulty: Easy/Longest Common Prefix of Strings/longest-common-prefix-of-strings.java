// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        
        String ans="";
        
        String curr=arr[0];
        String last=arr[arr.length-1];
        
        int i=0, j=0;
        int n=curr.length();
        
        while(i<n){
            if(curr.charAt(i)!=last.charAt(i)){
                break;
        }
          ans+=curr.charAt(i);
          i++;
        }
       return ans;
    }
}