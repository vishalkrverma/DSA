class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int water = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (water >= plants[i]) {
                // Water the plant and step forward
                water -= plants[i];
                steps++;
            } else {
                steps += 2 * i;
                water = capacity - plants[i];
                steps++;
            }
        }

        return steps;
    }
}
