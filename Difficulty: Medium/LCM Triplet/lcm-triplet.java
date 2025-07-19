class Solution {
    int lcmTriplets(int n) {
    if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 6;

        int res = 0;
        if (n % 2 != 0) {
            // Odd n → best case: n, n-1, n-2
            res = lcm(lcm(n, n - 1), n - 2);
        } 
        else {
            // Even n → check both (n, n-1, n-3) and (n-1, n-2, n-3)
            int l1 = lcm(lcm(n, n - 1), n - 3);
            int l2 = lcm(lcm(n - 1, n - 2), n - 3);
            res = Math.max(l1, l2);
        }

        return res;
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}