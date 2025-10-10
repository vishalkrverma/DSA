class Solution {
    
    static void insertAtBottom(int temp,Stack<Integer> st){
        if(st.isEmpty() || st.peek()<temp){
            st.push(temp);
            return;
        }
        int top=st.pop();
        
        insertAtBottom(temp,st);
        st.push(top);
    }
    
    
    public void sortStack(Stack<Integer> st) {
       
       if(st.isEmpty()) return;
      
       int temp=st.pop();
       
       sortStack(st);
       
       insertAtBottom(temp,st);
    }
}