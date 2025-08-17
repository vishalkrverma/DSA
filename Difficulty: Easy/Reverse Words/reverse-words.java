class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split("\\.");
        StringBuilder res = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            if (!parts[i].isEmpty()) {
                res.append(parts[i]);
                res.append(".");
            }
        }

        // Remove trailing dot if present
        if (res.length() > 0 && res.charAt(res.length() - 1) == '.') {
            res.setLength(res.length() - 1);
        }

        return res.toString();
    }
}
