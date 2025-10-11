// User function Template for Java

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        ArrayList<Integer> al=new ArrayList<>();
        int cnt=0;
        
        for(char ch:str.toCharArray()){
            if(ch=='('){
                cnt++;
                st.push(cnt);
                al.add(cnt);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    
                al.add(st.pop());
                }
            }
        }
        return al;
    }
};