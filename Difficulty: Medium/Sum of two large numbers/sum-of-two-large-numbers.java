// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        if(s1.length()<s2.length()){
            String temp=s1;
            s1=s2;
            s2=temp;
        }
    // Swapping done to make the S1 largest number
    
    StringBuilder result=new StringBuilder();
    int carry=0;
    
    int n1=s1.length();
    int n2=s2.length();
    
    int diff=n1-n2;
    
    for(int i=n2-1;i>=0;i--){
        int sum=(s1.charAt(i+diff)-'0')+(s2.charAt(i)-'0')+carry;
        
        result.append(sum%10);
        carry=sum/10;
    }
    for(int i=diff-1;i>=0;i--){
        int sum=(s1.charAt(i)-'0')+carry;
        result.append(sum%10);
        carry=sum/10;
    }
    if(carry>0){
        result.append(carry);
    }
    String finalResult = result.reverse().toString().replaceFirst("^0+", "");
    if (finalResult.isEmpty()) return "0";
    return finalResult;

        
    }
}