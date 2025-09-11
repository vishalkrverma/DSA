class Solution {
    ArrayList<String> generateCode(int n) {
        ArrayList<String> result = new ArrayList<>();
        int total = 1 << n;

        char[] binary = new char[n];

        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            // Build the binary string manually using the same char array
            for (int j = n - 1; j >= 0; j--) {
                binary[j] = (char) ((gray & 1) + '0');
                gray >>= 1;
            }
            // Create string only once per result
            result.add(new String(binary));
        }

        return result;
    }
}
