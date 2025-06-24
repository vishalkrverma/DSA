class Solution {
    public static String maxSubseq(String s, int k) {
        // code here
        int n=s.length();
        Deque<Character> dq=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(!dq.isEmpty() && ch> dq.peekLast() && k>0){
                dq.pollLast();
                k--;
            }
            dq.addLast(ch);
        }
        while(k-->0){
            dq.pollLast();
        }
        StringBuilder sb=new StringBuilder();
        for(Character c:dq){
            sb.append(c);
        }
        return sb.toString();
    }
}