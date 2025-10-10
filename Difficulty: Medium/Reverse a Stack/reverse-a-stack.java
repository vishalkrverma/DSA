class Solution {
    
    public static void insertAtBottom(int temp,Stack<Integer> st){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        
        int top=st.pop();
        
        insertAtBottom(temp,st);
        
        st.push(top);
    }
    
    
    public static void reverseStack(Stack<Integer> st) {
        
        if(st.isEmpty()) return;
        
        int temp=st.pop();
        
        reverseStack(st);
        
        insertAtBottom(temp,st);
        
    }
}
