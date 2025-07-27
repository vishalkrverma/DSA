class Solution {

    public String encode(String s[]) {
       
   StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            res.append(s[i]);
            if (i != s.length - 1) {
                res.append("."); // don't add '.' after the last element
            }
        }

        return res.toString();
    }
    public String[] decode(String s) {
        // Escape '.' as it's a regex special character
        return s.split("\\.");
    }
}