// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int k = 0;
        for (int num : pos) arr[k++] = num;
        for (int num : neg) arr[k++] = num;
    }
}
