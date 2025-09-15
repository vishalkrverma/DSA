class solution {
    static String LongestPalindromeSubString(String s) {
        // code here
        
       if(s==null || s.length()==0) return "";
       
       StringBuilder sb=new StringBuilder();
       sb.append("^");
       for(int i=0;i<s.length();i++){
           sb.append("#").append(s.charAt(i));
       }
       sb.append("#$");
       String processed=sb.toString();
       
       int n=processed.length();
       int[] lengthArray=new int[n];
       int center=0, right=0;
       
       for(int i=1;i<n-1;i++){
           int mirror=2*center-i;
           
           if(i<right){
               lengthArray[i]=Math.min(right-i,lengthArray[mirror]);
           }
           
           while(processed.charAt(i+lengthArray[i]+1)==processed.charAt(i-lengthArray[i]-1)){
               lengthArray[i]++;
           }
           
           if(i+lengthArray[i]>right){
               center=i;
               right=i+lengthArray[i];
           }
       }
       int maxLen=0;
       int centerIndex=0;
       for(int i=1;i<n-1;i++){
           if(lengthArray[i]>maxLen){
               maxLen=lengthArray[i];
               centerIndex=i;
           }
       }
       
       int start=(centerIndex-maxLen)/2;
       return s.substring(start,start+maxLen);
       
    }
}