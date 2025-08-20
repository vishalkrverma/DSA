class Sol {

    private static long sumOfDigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static long numberCount(long N, long K) {
        long count = 0;

        for (long x = 1; x <= N; x++) {
            if ((x - sumOfDigits(x)) >= K) {
                count++;
            }
        }

        return count;
    }
}
