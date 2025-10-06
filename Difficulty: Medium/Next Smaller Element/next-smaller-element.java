class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                al.add(-1);
            }
            else{
                al.add(st.peek());
            }
            st.push(arr[i]);
        }
         Collections.reverse(al);
         return al;
    }
}