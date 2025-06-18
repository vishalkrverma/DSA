class Solution {
    
    static boolean isPalindrome(String s,int i,int j){
       
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> result=new ArrayList<>();
         
        backtrack(s,0,new ArrayList<>(),result);
        return result;
    }
    
    void backtrack(String s,int start,ArrayList<String> curr, ArrayList<ArrayList<String>> result){
        if(start==s.length()){
          result.add(new ArrayList<>(curr));
          return;
        } 
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                curr.add(s.substring(start,end+1));
                backtrack(s,end+1,curr,result);
                curr.remove(curr.size()-1);
            }
        }
    }
}
