


class Solution {
    public int[] printKClosest(int[] arr, int k, int x) {
        List<int[]> list = new ArrayList<>();

        for (int num : arr) {
            if (num == x) continue;
            list.add(new int[]{Math.abs(num - x), -num}); // use -num to prioritize larger number in case of tie
        }

        Collections.sort(list, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]); // smaller distance first
            return Integer.compare(a[1], b[1]); // larger number first (because we negated it)
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = -list.get(i)[1]; // revert the negative value
        }

        return res;
    }
}


