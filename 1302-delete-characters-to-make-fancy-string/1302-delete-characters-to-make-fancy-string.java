class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;

        StringBuilder result = new StringBuilder();
        int count = 1;

        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);

            if (curr == prev) {
                count++;
            }
             else {
                count = 1; // reset count on different char
            }

            if (count < 3) {
                result.append(curr);
            }
        }

        return result.toString();
    }
}
