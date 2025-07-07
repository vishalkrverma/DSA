class Solution {
    public int minAddToMakeValid(String s) {
    Stack<Character> stack = new Stack<>();
        int count = 0; // Tracks unmatched closing brackets

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c); // Push opening bracket
            } else {   
                if (stack.isEmpty()) {
                    count++; // No matching '(', so increment unmatched count
                } else {
                    stack.pop(); // Match found, pop from stack
                }
            }
        }
        // Remaining unmatched '(' + unmatched ')'
        return count + stack.size();
    }
}