class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        
        int[] res=new int[n];
        int k=0;
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[k++]=-1;
            }
            else{
                res[k++]=st.peek();
            }
            st.push(arr[i]);
        }  
        return res;
    }
}
