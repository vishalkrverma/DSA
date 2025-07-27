class Solution {
    public boolean isPalindrome(String s) {
       //  static boolean sentencePalindrome(String s) { 
        if(s.isEmpty())        
        return true;     
    String str = s.toLowerCase();
    str = str.replaceAll("[^a-zA-Z0-9]", "");  
    StringBuilder revstr = new StringBuilder(str); 
    revstr.reverse(); 
    String rstr = revstr.toString(); 
      
    if(str.equals(rstr))//if string and reversed string both are equal return true 
        return true; 
      
    return false;               //else return false 
      

      
    }
}