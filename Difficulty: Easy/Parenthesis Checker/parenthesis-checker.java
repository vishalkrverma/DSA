class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }
            else if(s.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
            }
            else if(s.charAt(i)==']' && st.peek()=='['){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        return st.isEmpty();
    }
}
