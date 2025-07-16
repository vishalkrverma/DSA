class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && map.get(st.peek())<=map.get(arr[i])){
               st.pop();
           }
           res[i]=st.isEmpty()?-1:st.peek();
           st.push(arr[i]);
        }
        for(int val:res) al.add(val);
        return al;
    }
}