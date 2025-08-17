class Solution {
    boolean metaStrings(String S1, String S2) {
        if (S1.length() != S2.length()) return false;
        if (S1.equals(S2)) return false; // Strings must not be equal

        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                diff.add(i);
                if (diff.size() > 2) return false;
            }
        }

        if (diff.size() != 2) return false;

        // Check if swapping the two mismatched characters makes the strings equal
        int i = diff.get(0), j = diff.get(1);
        return S1.charAt(i) == S2.charAt(j) && S1.charAt(j) == S2.charAt(i);
    }
}
