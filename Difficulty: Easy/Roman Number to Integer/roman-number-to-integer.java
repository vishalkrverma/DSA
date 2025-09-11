class Solution {
    public int romanToDecimal(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int total = map.get(s.charAt(n - 1)); // Start with last numeral

        for (int i = n - 2; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (curr < next) {
                total -= curr;
            } else {
                total += curr;
            }
        }

        return total;
    }
}
