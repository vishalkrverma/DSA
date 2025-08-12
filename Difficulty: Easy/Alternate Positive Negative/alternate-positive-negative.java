class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0)
                posList.add(num);
            else
                negList.add(num);
        }

        int i = 0, pos = 0, neg = 0;

        // Fill alternately from posList and negList
        while (pos < posList.size() && neg < negList.size()) {
            arr.set(i++, posList.get(pos++));
            arr.set(i++, negList.get(neg++));
        }

        // Fill remaining elements from posList (if any)
        while (pos < posList.size()) {
            arr.set(i++, posList.get(pos++));
        }

        // Fill remaining elements from negList (if any)
        while (neg < negList.size()) {
            arr.set(i++, negList.get(neg++));
        }
    }
}
