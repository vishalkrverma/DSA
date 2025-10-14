class Solution {
    public String removeKdig(String s, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            
            st.push(c);
        }

        // If k > 0, remove from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build the result
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Return result
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
