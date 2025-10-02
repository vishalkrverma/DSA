class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            // Exchange once at current cost
            empty -= numExchange;
            totalDrunk += 1;
            empty += 1; // You drink the new bottle, get 1 more empty
            numExchange += 1; // Cost increases
        }

        return totalDrunk;
    }
}
