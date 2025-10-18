class Solution {
    public void reverseQueue(Queue<Integer> q) {
       
       Stack<Integer> st= new Stack<>();
       
       while(!q.isEmpty()){
           st.push(q.poll());
       }
       while(!st.isEmpty()){
           q.offer(st.pop());
       }
        
    }
}